package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * Custom attributes modification
 */
public final class ShippingLineModification {
  /**
   * The sales channel for the order
   */
  public final String salesChannelId;

  /**
   * Order identifier
   */
  public final String orderId;

  /**
   * User
   */
  public final String user;

  /**
   * Line numbers to modify
   */
  public final List<Integer> lineNumbers;

  /**
   * New shipping line number
   */
  public final Integer newShippingLine;

  @JsonCreator
  public ShippingLineModification(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "line_numbers", required = true) final List<Integer> lineNumbers,
      @JsonProperty(value = "new_shipping_line", required = true) final Integer newShippingLine) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.user = user;
    this.lineNumbers = lineNumbers;
    this.newShippingLine = newShippingLine;
  }
}
