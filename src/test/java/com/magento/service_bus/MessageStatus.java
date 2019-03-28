package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum MessageStatus {
  DELIVERING("delivering"),

  SUCCESS("success"),

  ERROR("error"),

  FAILURE("failure");

  @JsonValue
  private String value;

  private MessageStatus(final String value) {
    this.value = value;
  }
}
