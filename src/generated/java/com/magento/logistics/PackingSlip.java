package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Packing slip
 */
public final class PackingSlip {
  /**
   * ID of the Shipment request
   */
  @JsonProperty(
      value = "shipment_request_id",
      required = false
  )
  public final String shipmentRequestId;

  /**
   * Store from the order
   */
  @JsonProperty(
      value = "sales_channel_id",
      required = true
  )
  public final String salesChannelId;

  /**
   * Reference to the order
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * Date when order was created
   */
  @JsonProperty(
      value = "origin_date",
      required = false
  )
  public final ZonedDateTime originDate;

  /**
   * Language of the order
   */
  @JsonProperty(
      value = "language",
      required = true
  )
  public final String language;

  /**
   * Shipping Method
   */
  @JsonProperty(
      value = "shipping_method",
      required = true
  )
  public final String shippingMethod;

  /**
   * Shipping address
   */
  @JsonProperty(
      value = "shipping_address",
      required = true
  )
  public final Address shippingAddress;

  /**
   * Billing address
   */
  @JsonProperty(
      value = "billing_address",
      required = true
  )
  public final Address billingAddress;

  /**
   * List of items
   */
  @JsonProperty(
      value = "items",
      required = true
  )
  public final List<Item> items;

  @JsonCreator
  public PackingSlip(
      @JsonProperty(value = "shipment_request_id", required = false) final String shipmentRequestId,
      @JsonProperty(value = "sales_channel_id", required = true) final String salesChannelId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "origin_date", required = false) final ZonedDateTime originDate,
      @JsonProperty(value = "language", required = true) final String language,
      @JsonProperty(value = "shipping_method", required = true) final String shippingMethod,
      @JsonProperty(value = "shipping_address", required = true) final Address shippingAddress,
      @JsonProperty(value = "billing_address", required = true) final Address billingAddress,
      @JsonProperty(value = "items", required = true) final List<Item> items) {
    this.shipmentRequestId = shipmentRequestId;
    this.salesChannelId = salesChannelId;
    this.orderId = orderId;
    this.originDate = originDate;
    this.language = language;
    this.shippingMethod = shippingMethod;
    this.shippingAddress = shippingAddress;
    this.billingAddress = billingAddress;
    this.items = items;
  }
}
