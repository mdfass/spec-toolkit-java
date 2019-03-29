package com.magento.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Custom Attribute
 */
public final class CustomAttribute {
  /**
   * Name of the attribute
   */
  @JsonProperty(
      value = "name",
      required = true
  )
  public final String name;

  /**
   * Value of the attribute
   */
  @JsonProperty(
      value = "value",
      required = true
  )
  public final String value;

  @JsonCreator
  public CustomAttribute(@JsonProperty(value = "name", required = true) final String name,
      @JsonProperty(value = "value", required = true) final String value) {
    this.name = name;
    this.value = value;
  }
}
