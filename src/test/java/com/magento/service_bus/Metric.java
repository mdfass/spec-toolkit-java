package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Metric and its value
 */
public final class Metric {
  /**
   * Name of the metric
   */
  public final String name;

  /**
   * Value of the metric
   */
  public final String value;

  @JsonCreator
  public Metric(@JsonProperty(value = "name", required = true) final String name,
      @JsonProperty(value = "value", required = true) final String value) {
    this.name = name;
    this.value = value;
  }
}
