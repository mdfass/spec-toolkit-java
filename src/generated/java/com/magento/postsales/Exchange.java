package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Represents an exchange
 */
public final class Exchange {
  /**
   * Store ID of original order
   */
  @JsonProperty(
      value = "sales_channel_id",
      required = true
  )
  public final String salesChannelId;

  /**
   * ID of original order
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * New ID for the exchange
   */
  @JsonProperty(
      value = "new_order_id",
      required = false
  )
  public final String newOrderId;

  /**
   * New shipping method
   */
  @JsonProperty(
      value = "new_shipping_method",
      required = false
  )
  public final String newShippingMethod;

  /**
   * New shipping address
   */
  @JsonProperty(
      value = "new_shipping_address",
      required = false
  )
  public final ShippingAddress newShippingAddress;

  /**
   * Exchange lines
   */
  @JsonProperty(
      value = "lines",
      required = true
  )
  public final List<ExchangeLine> lines;

  /**
   * User that initiated the exchanges
   */
  @JsonProperty(
      value = "user",
      required = false
  )
  public final String user;

  @JsonCreator
  public Exchange(
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "new_order_id", required = false) final String newOrderId,
      @JsonProperty(value = "new_shipping_method", required = false) final String newShippingMethod,
      @JsonProperty(value = "new_shipping_address", required = false) final ShippingAddress newShippingAddress,
      @JsonProperty(value = "lines", required = true) final List<ExchangeLine> lines,
      @JsonProperty(value = "user", required = false) final String user) {
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.newOrderId = newOrderId;
    this.newShippingMethod = newShippingMethod;
    this.newShippingAddress = newShippingAddress;
    this.lines = lines;
    this.user = user;
  }
}
