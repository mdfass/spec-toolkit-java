package com.magento.spec.generator;

import com.fasterxml.jackson.annotation.JsonValue;
import com.magento.spec.model.EnumType;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import org.apache.commons.text.CaseUtils;
import java.util.List;
import javax.lang.model.element.Modifier;

public class EnumGenerator extends TypeGenerator {


  public EnumGenerator(String generatedJavaPath) {
    super(generatedJavaPath);
  }

  public void generateEnum(EnumType et) {
    generateEnum(et.moduleName, et.structName, et.enumValues);
  }

  private void generateEnum(String moduleName, String structName, List<String> enumValues) {
    String typeName = CaseUtils.toCamelCase(structName, true, new char[] {'_'});
    TypeSpec.Builder enumBuilder = TypeSpec.enumBuilder(typeName).addModifiers(Modifier.PUBLIC);

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

    writeType(moduleName, enumSpec);
  }
}
