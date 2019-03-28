package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Clonation of a shipping address
 */
public final class ShippingAddressClonation {
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
   * Shipping line number to modify address
   */
  public final Integer shippingLineTo;

  /**
   * Shipping line number to get the address
   */
  public final Integer shippingLineFrom;

  @JsonCreator
  public ShippingAddressClonation(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "user", required = true) final String user,
      @JsonProperty(value = "shipping_line_to", required = true) final Integer shippingLineTo,
      @JsonProperty(value = "shipping_line_from", required = true) final Integer shippingLineFrom) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.user = user;
    this.shippingLineTo = shippingLineTo;
    this.shippingLineFrom = shippingLineFrom;
  }
}
