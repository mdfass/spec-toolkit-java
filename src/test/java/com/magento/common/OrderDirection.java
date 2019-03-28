package com.magento.common;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum OrderDirection {
  ASC("ASC"),

  DESC("DESC");

  @JsonValue
  private String value;

  private OrderDirection(final String value) {
    this.value = value;
  }
}
