package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum ReasonType {
  PICK_DECLINE("pick-decline"),

  CUSTOMER_DECLINE("customer-decline");

  @JsonValue
  private String value;

  private ReasonType(final String value) {
    this.value = value;
  }
}
