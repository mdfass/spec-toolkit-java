package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * Shipping Line Creation
 */
public final class ShippingLineCreation {
  /**
   * The sales channel for the order
   */
  @JsonProperty(
      value = "sales_channel_id",
      required = true
  )
  public final String salesChannelId;

  /**
   * Order identifier
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * User
   */
  @JsonProperty(
      value = "user",
      required = true
  )
  public final String user;

  /**
   * Line numbers to modify
   */
  @JsonProperty(
      value = "line_numbers",
      required = true
  )
  public final List<Integer> lineNumbers;

  /**
   * Shipping Method SKU
   */
  @JsonProperty(
      value = "shipping_method",
      required = true
  )
  public final String shippingMethod;

  /**
   * New shipping address
   */
  @JsonProperty(
      value = "shipping_address",
      required = true
  )
  public final ShippingAddress shippingAddress;

  @JsonCreator
  public ShippingLineCreation(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "line_numbers", required = true) final List<Integer> lineNumbers,
      @JsonProperty(value = "shipping_method", required = true) final String shippingMethod,
      @JsonProperty(value = "shipping_address", required = true) final ShippingAddress shippingAddress) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.user = user;
    this.lineNumbers = lineNumbers;
    this.shippingMethod = shippingMethod;
    this.shippingAddress = shippingAddress;
  }
}
