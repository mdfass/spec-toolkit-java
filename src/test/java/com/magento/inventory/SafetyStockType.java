package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum SafetyStockType {
  ACTIVE("active"),

  OUTLET("outlet"),

  END_OF_LIFE("end-of-life");

  @JsonValue
  private String value;

  private SafetyStockType(final String value) {
    this.value = value;
  }
}
