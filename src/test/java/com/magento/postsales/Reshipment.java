package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Represents an reshipment
 */
public final class Reshipment {
  /**
   * Store ID of original order
   */
  public final String salesChannelId;

  /**
   * ID of original order
   */
  public final String orderId;

  /**
   * New ID for the reshipment
   */
  public final String newOrderId;

  /**
   * New shipping method
   */
  public final String newShippingMethod;

  /**
   * New shipping address
   */
  public final ShippingAddress newShippingAddress;

  /**
   * Reshipment lines
   */
  public final List<ReshipmentLine> lines;

  @JsonCreator
  public Reshipment(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "new_order_id", required = false) final String newOrderId,
      @JsonProperty(value = "new_shipping_method", required = false) final String newShippingMethod,
      @JsonProperty(value = "new_shipping_address", required = false) final ShippingAddress newShippingAddress,
      @JsonProperty(value = "lines", required = true) final List<ReshipmentLine> lines) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.newOrderId = newOrderId;
    this.newShippingMethod = newShippingMethod;
    this.newShippingAddress = newShippingAddress;
    this.lines = lines;
  }
}
