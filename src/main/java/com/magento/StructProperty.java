package com.magento;

import javax.lang.model.SourceVersion;

public class StructProperty {
  public String propertyName;
  public String originalPropertyName;
  public String type;
  public String summary;
  public String description;
  public Boolean required;

  public StructProperty(String propertyName, String type, String summary, String description,
      boolean required) {
    if (!SourceVersion.isName(propertyName)) {
      this.propertyName = propertyName + "_java";
    } else {
      this.propertyName = propertyName;
    }
    this.originalPropertyName = propertyName;
    this.type = type;
    this.summary = summary;
    this.description = description;
    this.required = required;
  }



}
