package com.magento.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Warning being reported
 */
public final class Warning {
  /**
   * Warning message recorded
   */
  public final String message;

  @JsonCreator
  public Warning(@JsonProperty(value = "message", required = true) final String message) {
    this.message = message;
  }
}
