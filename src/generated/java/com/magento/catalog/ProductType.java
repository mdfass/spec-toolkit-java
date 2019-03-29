package com.magento.catalog;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum ProductType {
  BUNDLE("bundle"),

  CONFIGURABLE("configurable"),

  DOWNLOADABLE("downloadable"),

  GROUPED("grouped"),

  SIMPLE("simple"),

  VIRTUAL("virtual"),

  SERVICE("service"),

  SHIPPING("shipping");

  @JsonValue
  private String value;

  private ProductType(final String value) {
    this.value = value;
  }
}
