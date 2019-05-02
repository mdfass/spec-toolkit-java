package com.magento.spec.model;

import java.util.Collections;
import java.util.List;

public class BeanType {
  public String moduleName;
  public String structName;
  public String summary;
  public String description;
  public boolean extensible;
  public List<Property> properties;

  public BeanType(String moduleName, String structName, String summary, String description,
      boolean extensible, List<Property> properties) {
    this.moduleName = moduleName;
    this.structName = structName;
    this.summary = summary;
    this.description = description;
    this.extensible = extensible;
    this.properties = Collections.unmodifiableList(properties);
  }
}
