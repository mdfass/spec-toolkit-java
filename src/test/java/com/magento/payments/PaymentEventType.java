package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PaymentEventType {
  VALIDATE_AUTH("VALIDATE_AUTH"),

  CAPTURE("CAPTURE");

  @JsonValue
  private String value;

  private PaymentEventType(final String value) {
    this.value = value;
  }
}
