package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PaymentEventStatus {
  PENDING("PENDING"),

  REQUESTED("REQUESTED"),

  SUCCESS("SUCCESS");

  @JsonValue
  private String value;

  private PaymentEventStatus(final String value) {
    this.value = value;
  }
}
