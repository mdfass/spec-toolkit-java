package com.magento.spec.generator;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.spec.model.BeanType;
import com.magento.spec.model.Property;
import com.squareup.javapoet.*;
import com.squareup.javapoet.MethodSpec.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.text.CaseUtils;

import javax.lang.model.element.Modifier;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;
public class BeanGenerator extends TypeGenerator {

  public BeanGenerator(String generatedJavaPath) {
    super(generatedJavaPath);
  }

  public void generateBean(BeanType bt) {
    generateType(ClassName.get("java.lang", "Object"), bt.moduleName, bt.structName, bt.summary,
        bt.description, bt.extensible, bt.properties, Optional.empty());
  }

  public void generateEvent(BeanType bt) {
    generateType(ClassName.get("com.magento.spec", "Event"), bt.moduleName, bt.structName,
        bt.summary, bt.description, bt.extensible, bt.properties, bt.status);
  }

  private void generateType(ClassName superClass, String moduleName, String structName,
      String summary, String description, boolean extensible, List<Property> properties,
      Optional<String> status) {
    String typeName = CaseUtils.toCamelCase(structName, true, new char[] {'_'});

    // build fields
    List<FieldSpec> fieldSpecs = new ArrayList<>();
    for (Property property : properties) {
      String propertyName = CaseUtils.toCamelCase(property.propertyName, false, new char[] {'_'});
      fieldSpecs.add(FieldSpec
          .builder(optionalIfNecessary(property), propertyName, Modifier.PUBLIC, Modifier.FINAL)
          .addAnnotation(AnnotationSpec.builder(JsonProperty.class)
              .addMember("value", "$S", property.originalPropertyName)
              .addMember("required", "$L", property.required).build())
          .addJavadoc(getJavadoc(property.summary, property.description)).build());
    }

    if (status.isPresent()) {
      fieldSpecs.add(FieldSpec
          .builder(ClassName.get("com.magento.spec", "StatusType"), "eventStatus", Modifier.PRIVATE,
              Modifier.STATIC, Modifier.FINAL)
          .initializer("StatusType.get(\"$L\")", status.get()).build());
    }

    // build constructor parameters
    List<ParameterSpec> parameterSpecs = new ArrayList<>();
    for (Property property : properties) {
      String propertyName = CaseUtils.toCamelCase(property.propertyName, false, new char[] {'_'});
      parameterSpecs
          .add(ParameterSpec.builder(fromString(property.type), propertyName, Modifier.FINAL)
              .addAnnotation(AnnotationSpec.builder(JsonProperty.class)
                  .addMember("value", "$S", property.originalPropertyName)
                  .addMember("required", "$L", property.required).build())
              .build());
    }

    Builder constructorBuilder = MethodSpec.constructorBuilder().addModifiers(Modifier.PUBLIC)
        .addParameters(parameterSpecs).addAnnotation(JsonCreator.class);


    // build field initializations in constructor body
    for (Property property : properties) {
      String propertyName = CaseUtils.toCamelCase(property.propertyName, false, new char[] {'_'});
      if (property.required) {
        constructorBuilder.addCode("this.$L = $L;\n", propertyName, propertyName);
      } else {
        constructorBuilder.addCode("this.$L = Optional.ofNullable($L);\n", propertyName,
            propertyName);
      }
    }
    MethodSpec constructor = constructorBuilder.build();

    // TODO if extensible do not add FINAL
    TypeSpec.Builder typeSpecBuilder = TypeSpec.classBuilder(typeName).superclass(superClass)
            .addAnnotation(EqualsAndHashCode.class).addAnnotation(Setter.class).addAnnotation(ToString.class).addAnnotation(Getter.class)
            .addModifiers(Modifier.PUBLIC, Modifier.FINAL).addFields(fieldSpecs).addMethod(constructor)
            .addJavadoc(getJavadoc(summary, description));

    if (status.isPresent()) {
      typeSpecBuilder.addMethod(MethodSpec.methodBuilder("getStatus").addModifiers(Modifier.PUBLIC)
          .returns(ClassName.get("com.magento.spec", "StatusType")).addCode("return eventStatus;\n")
          .build());
    }

    writeType(moduleName, typeSpecBuilder.build());
  }

  private TypeName optionalIfNecessary(Property sp) {
    TypeName typeName = fromString(sp.type);
    if (!sp.required) {
      typeName = ParameterizedTypeName.get(ClassName.get(Optional.class), typeName);
    }
    return typeName;
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
        throw new IllegalStateException(
            "The collection type " + type + " is not supported by spec.");
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
        return Float.class;
      default:
        throw new IllegalStateException(
            "The primitive type " + type + " is not supported by spec.");
    }
  }
}
