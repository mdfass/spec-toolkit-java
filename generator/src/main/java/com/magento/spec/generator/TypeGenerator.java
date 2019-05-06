package com.magento.spec.generator;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import java.io.IOException;
import java.nio.file.Paths;

public abstract class TypeGenerator {
  private String generatedJavaPath;

  public TypeGenerator(String generatedJavaPath) {
    this.generatedJavaPath = generatedJavaPath;
  }

  protected void writeType(String moduleName, TypeSpec typeSpec) {

    JavaFile javaFile = JavaFile.builder(moduleName, typeSpec).build();

    System.out.println(
        String.format("****** %s.%s ******", javaFile.packageName, javaFile.typeSpec.name));
    try {
      javaFile.writeTo(Paths.get(generatedJavaPath));
    } catch (IOException ioe) {
      throw new IllegalStateException("Cannot write generated type", ioe);
    }
  }
}
