package com.magento.spec.model;

import java.util.Collections;
import java.util.List;

public class EnumType {
  public String moduleName;
  public String structName;
  public List<String> enumValues;

  public EnumType(String moduleName, String structName, List<String> enumValues) {
    this.moduleName = moduleName;
    this.structName = structName;
    this.enumValues = Collections.unmodifiableList(enumValues);
  }
}
