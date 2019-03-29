package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Customer that placed the order
 */
public final class OrderCustomer {
  /**
   * Identifier of the customer
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Type of customer
   */
  @JsonProperty(
      value = "type",
      required = false
  )
  public final String type;

  /**
   * Segment of customer
   */
  @JsonProperty(
      value = "segment",
      required = false
  )
  public final String segment;

  @JsonCreator
  public OrderCustomer(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "type", required = false) final String type,
      @JsonProperty(value = "segment", required = false) final String segment) {
    this.id = id;
    this.type = type;
    this.segment = segment;
  }
}
