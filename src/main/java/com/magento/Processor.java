package com.magento;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.MethodSpec.Builder;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import org.apache.commons.text.CaseUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.lang.model.element.Modifier;

public class Processor {

  public static void main(String[] args) throws IOException {
    new Processor().process();
  }

  public void process() throws IOException {
    Files.walk(Paths.get("src/main/resources/shared-services-internal"))
        .filter(f -> f.toString().endsWith(".xml")).forEach(f -> process(f));

    System.out.println(types);
    System.out.println(aggregateTypes);
    System.out.println(complexTypes);
  }

  private void process(Path p) {
    try {
      readModules(parse(p).getRootElement());
    } catch (DocumentException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private Document parse(Path p) throws DocumentException {
    SAXReader reader = new SAXReader();
    Document document = reader.read(p.toFile());
    return document;
  }


  private void readModules(Element rootElement) throws DocumentException {
    for (Iterator<Element> it = rootElement.elementIterator("module"); it.hasNext();) {
      Element moduleElement = it.next();
      readStructs(moduleElement);
      readEnums(moduleElement);
    }
  }


  private void readStructs(Element moduleElement) throws DocumentException {
    String moduleName = "com." + moduleElement.attribute("name").getValue();
    for (Iterator<Element> it = moduleElement.elementIterator("struct"); it.hasNext();) {
      Element structElement = it.next();
      String structName = structElement.attribute("name").getValue();
      String summary = structElement.elementText("summary");
      String description = structElement.elementText("description");
      boolean extensible = Boolean.valueOf(structElement.elementText("extensible"));
      List<StructProperty> properties = readProperties(structElement.element("properties"));
      generateBean(moduleName, structName, summary, description, extensible, properties);
    }
  }


  private List<StructProperty> readProperties(Element propertiesElement) throws DocumentException {
    List<StructProperty> sps = new ArrayList<>();
    for (Iterator<Element> it = propertiesElement.elementIterator("property"); it.hasNext();) {
      Element propertyElement = it.next();
      String propertyName = propertyElement.attribute("name").getValue();
      String type = propertyElement.elementText("type");
      String summary = propertyElement.elementText("summary");
      String description = propertyElement.elementText("description");
      boolean required = Boolean.valueOf(propertyElement.elementText("required"));
      sps.add(new StructProperty(propertyName, type, summary, description, required));
    }
    return sps;
  }

  private void readEnums(Element moduleElement) throws DocumentException {
    String moduleName = "com." + moduleElement.attribute("name").getValue();
    for (Iterator<Element> it = moduleElement.elementIterator("enum"); it.hasNext();) {
      Element enumElement = it.next();
      String enumName = enumElement.attribute("name").getValue();
      generateEnum(moduleName, enumName, readEnumValues(enumElement));
    }
  }

  private List<String> readEnumValues(Element enumElement) {
    List<String> values = new ArrayList<>();
    for (Iterator<Element> vit = enumElement.elementIterator("value"); vit.hasNext();) {
      Element valueElement = vit.next();
      values.add(valueElement.getText());
    }
    return values;
  }

  private void generateBean(String moduleName, String structName, String summary,
      String description, boolean extensible, List<StructProperty> properties) {
    String typeName = CaseUtils.toCamelCase(structName, true, new char[] {'_'});

    // build fields
    List<FieldSpec> fieldSpecs = new ArrayList<>();
    for (StructProperty property : properties) {
      String propertyName = CaseUtils.toCamelCase(property.propertyName, false, new char[] {'_'});
      fieldSpecs.add(FieldSpec
          .builder(optionalIfNecessary(property), propertyName, Modifier.PUBLIC, Modifier.FINAL)
          .addAnnotation(AnnotationSpec.builder(JsonProperty.class)
              .addMember("value", "$S", property.originalPropertyName)
              .addMember("required", "$L", property.required).build())
          .addJavadoc(getJavadoc(property.summary, property.description)).build());
    }

    // build constructor parameters
    List<ParameterSpec> parameterSpecs = new ArrayList<>();
    for (StructProperty property : properties) {
      String propertyName = CaseUtils.toCamelCase(property.propertyName, false, new char[] {'_'});
      parameterSpecs
          .add(ParameterSpec.builder(fromString(property.type), propertyName, Modifier.FINAL)
              .addAnnotation(AnnotationSpec.builder(JsonProperty.class)
                  .addMember("value", "$S", property.originalPropertyName)
                  .addMember("required", "$L", property.required).build())
              .build());
    }
    Builder contructorBuilder = MethodSpec.constructorBuilder().addModifiers(Modifier.PUBLIC)
        .addParameters(parameterSpecs).addAnnotation(JsonCreator.class);

    // build field initializations in constructor body
    for (StructProperty property : properties) {
      String propertyName = CaseUtils.toCamelCase(property.propertyName, false, new char[] {'_'});
      if (property.required) {
        contructorBuilder.addCode("this.$L = $L;\n", propertyName, propertyName);
      } else {
        contructorBuilder.addCode("this.$L = Optional.ofNullable($L);\n", propertyName,
            propertyName);
      }
    }
    MethodSpec constructor = contructorBuilder.build();

    // TODO if extensible do not add FINAL
    TypeSpec type = TypeSpec.classBuilder(typeName).addModifiers(Modifier.PUBLIC, Modifier.FINAL)
        .addFields(fieldSpecs).addMethod(constructor).addJavadoc(getJavadoc(summary, description))
        .build();

    JavaFile javaFile = JavaFile.builder(moduleName, type).build();

    System.out.println(
        String.format("****** %s.%s ******", javaFile.packageName, javaFile.typeSpec.name));
    try {
      javaFile.writeTo(Paths.get("target/generated-sources/java"));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private void generateEnum(String moduleName, String structName, List<String> enumValues) {
    String typeName = CaseUtils.toCamelCase(structName, true, new char[] {'_'});
    com.squareup.javapoet.TypeSpec.Builder enumBuilder =
        TypeSpec.enumBuilder(typeName).addModifiers(Modifier.PUBLIC);

    // enum constants with a string parameter builder of the json value.
    for (String enumValue : enumValues) {
      String enumDeclaration = enumValue.replaceAll("-", "_").toUpperCase();
      enumBuilder.addEnumConstant(enumDeclaration,
          TypeSpec.anonymousClassBuilder("$S", enumValue).build());
    }

    // field to hold the json String value.
    FieldSpec valueSpec = FieldSpec.builder(String.class, "value", Modifier.PRIVATE)
        .addAnnotation(JsonValue.class).build();

    // builder to initialize the value field
    MethodSpec constructorSpec = MethodSpec.constructorBuilder().addModifiers(Modifier.PRIVATE)
        .addParameter(String.class, "value", Modifier.FINAL).addCode("this.value = value;\n")
        .build();

    TypeSpec enumSpec = enumBuilder.addMethod(constructorSpec).addField(valueSpec).build();

    JavaFile javaFile = JavaFile.builder(moduleName, enumSpec).build();

    System.out.println(
        String.format("****** %s.%s ******", javaFile.packageName, javaFile.typeSpec.name));
    try {
      javaFile.writeTo(Paths.get("target/generated-sources/java"));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private String getJavadoc(String summary, String description) {
    StringBuilder sb = new StringBuilder();
    if (description != null) {
      sb.append(description).append('\n');
    }
    if (summary != null) {
      sb.append(summary).append('\n');
    }
    return sb.toString();
  }

  private Set<String> types = new HashSet<>();
  private Set<String> complexTypes = new HashSet<>();
  private Set<String> aggregateTypes = new HashSet<>();

  private TypeName optionalIfNecessary(StructProperty sp) {
    TypeName typeName = fromString(sp.type);
    if (!sp.required) {
      typeName = ParameterizedTypeName.get(ClassName.get(Optional.class), typeName);
    }
    return typeName;
  }

  private TypeName fromString(String type) {
    if (type.contains("[")) {
      int startBracket = type.indexOf('[');
      int endBracket = type.lastIndexOf(']');
      String aggregateType = type.substring(0, startBracket);
      String innerType = type.substring(startBracket + 1, endBracket);
      ParameterizedTypeName ptnName = null;
      if (isKeyValue(aggregateType)) {
        ptnName = ParameterizedTypeName.get(resolveAggregate(aggregateType),
            TypeName.get(String.class), fromString(innerType));
      } else {
        ptnName = ParameterizedTypeName.get(resolveAggregate(aggregateType), fromString(innerType));
      }
      aggregateTypes.add(aggregateType);
      return ptnName;
    } else if (type.contains(".")) {
      int splitIndex = type.lastIndexOf('.');
      String packageName = "com." + type.substring(0, splitIndex);
      String simpleName = type.substring(splitIndex + 1);
      String typeName = CaseUtils.toCamelCase(simpleName, true, new char[] {'_'});
      complexTypes.add(packageName + "." + typeName);
      return ClassName.get(packageName, typeName);
    } else {
      types.add(type);
      return TypeName.get(resolvePrimitive(type));
    }
  }

  private ClassName resolveAggregate(String type) {
    switch (type) {
      case "array":
        return ClassName.get(List.class);
      case "map":
        return ClassName.get(Map.class);
      default:
        return ClassName.get(Collection.class);
    }
  }

  private boolean isKeyValue(String type) {
    return "map".equals(type);
  }

  private Type resolvePrimitive(String type) {
    switch (type) {
      // TODO: determine how time zones are used to pick the proper type.
      case "date":
        return LocalDate.class;
      case "datetime":
        return ZonedDateTime.class;
      case "boolean":
        return Boolean.class;
      case "string":
        return String.class;
      case "integer":
        return Integer.class;
      case "float":
        return Integer.class;
      default:
        return Void.class;
    }
  }
}
