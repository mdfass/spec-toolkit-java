package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Promotion applied to the order
 */
public final class OrderLinePromotion {
  /**
   * Code of the promotion
   */
  @JsonProperty(
      value = "code",
      required = true
  )
  public final String code;

  /**
   * Name of the promotion
   */
  @JsonProperty(
      value = "name",
      required = true
  )
  public final String name;

  /**
   * Quantity of the promotion discount
   */
  @JsonProperty(
      value = "discount",
      required = true
  )
  public final Integer discount;

  /**
   * Percentage of the promotion discount
   */
  @JsonProperty(
      value = "percentage",
      required = true
  )
  public final Integer percentage;

  @JsonCreator
  public OrderLinePromotion(@JsonProperty(value = "code", required = true) final String code,
      @JsonProperty(value = "name", required = true) final String name,
      @JsonProperty(value = "discount", required = true) final Integer discount,
      @JsonProperty(value = "percentage", required = true) final Integer percentage) {
    this.code = code;
    this.name = name;
    this.discount = discount;
    this.percentage = percentage;
  }
}
