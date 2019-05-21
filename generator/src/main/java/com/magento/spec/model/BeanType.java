package com.magento.spec.model;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class BeanType {
  public String moduleName;
  public String structName;
  public String summary;
  public String description;
  public boolean extensible;
  public List<Property> properties;
  public Optional<String> status;

  public BeanType(String moduleName, String structName, String summary, String description,
      boolean extensible, List<Property> properties, String status) {
    this.moduleName = moduleName;
    this.structName = structName;
    this.summary = summary;
    this.description = description;
    this.extensible = extensible;
    this.properties = Collections.unmodifiableList(properties);
    this.status = Optional.ofNullable(status);
  }

  public BeanType(String moduleName, String structName, String summary, String description,
      boolean extensible, List<Property> properties) {
    this(moduleName, structName, summary, description, extensible, properties, null);
  }
}
