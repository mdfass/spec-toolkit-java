package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PaymentEventExceptionSubType {
  UNRESPONSIVE("UNRESPONSIVE"),

  FAIL("FAIL");

  @JsonValue
  private String value;

  private PaymentEventExceptionSubType(final String value) {
    this.value = value;
  }
}
