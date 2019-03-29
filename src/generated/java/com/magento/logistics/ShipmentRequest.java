package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Shipment request
 */
public final class ShipmentRequest {
  /**
   * ID of shipment request
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Identifier of the order
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * Identifier of the source
   */
  @JsonProperty(
      value = "source_id",
      required = false
  )
  public final String sourceId;

  /**
   * Identifier of the customer
   */
  @JsonProperty(
      value = "customer_id",
      required = false
  )
  public final String customerId;

  /**
   * Store from where the order comes from
   */
  @JsonProperty(
      value = "store",
      required = true
  )
  public final String store;

  /**
   * Language of the order
   */
  @JsonProperty(
      value = "language",
      required = false
  )
  public final String language;

  /**
   * Country in which the order is paying taxes
   */
  @JsonProperty(
      value = "vat_country",
      required = true
  )
  public final String vatCountry;

  /**
   * Channel in which the order was placed
   */
  @JsonProperty(
      value = "origin",
      required = true
  )
  public final String origin;

  /**
   * Date in which the order was placed
   */
  @JsonProperty(
      value = "origin_date",
      required = true
  )
  public final ZonedDateTime originDate;

  /**
   * Date in which the shipment request was created
   */
  @JsonProperty(
      value = "created_at",
      required = false
  )
  public final ZonedDateTime createdAt;

  /**
   * Shipment request status
   */
  @JsonProperty(
      value = "status",
      required = true
  )
  public final String status;

  /**
   * List of items
   */
  @JsonProperty(
      value = "items",
      required = true
  )
  public final List<Item> items;

  /**
   * Associated addresses to the shipment request
   */
  @JsonProperty(
      value = "addresses",
      required = true
  )
  public final List<Address> addresses;

  /**
   * Shipping address
   */
  @JsonProperty(
      value = "shipping_address",
      required = false
  )
  public final Address shippingAddress;

  /**
   * Billing address
   */
  @JsonProperty(
      value = "billing_address",
      required = false
  )
  public final Address billingAddress;

  /**
   * When the status changed for the shipment request
   */
  @JsonProperty(
      value = "status_date",
      required = false
  )
  public final ZonedDateTime statusDate;

  @JsonCreator
  public ShipmentRequest(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "customer_id", required = false) final String customerId,
      @JsonProperty(value = "store", required = true) final String store,
      @JsonProperty(value = "language", required = false) final String language,
      @JsonProperty(value = "vat_country", required = true) final String vatCountry,
      @JsonProperty(value = "origin", required = true) final String origin,
      @JsonProperty(value = "origin_date", required = true) final ZonedDateTime originDate,
      @JsonProperty(value = "created_at", required = false) final ZonedDateTime createdAt,
      @JsonProperty(value = "status", required = true) final String status,
      @JsonProperty(value = "items", required = true) final List<Item> items,
      @JsonProperty(value = "addresses", required = true) final List<Address> addresses,
      @JsonProperty(value = "shipping_address", required = false) final Address shippingAddress,
      @JsonProperty(value = "billing_address", required = false) final Address billingAddress,
      @JsonProperty(value = "status_date", required = false) final ZonedDateTime statusDate) {
    this.id = id;
    this.orderId = orderId;
    this.sourceId = sourceId;
    this.customerId = customerId;
    this.store = store;
    this.language = language;
    this.vatCountry = vatCountry;
    this.origin = origin;
    this.originDate = originDate;
    this.createdAt = createdAt;
    this.status = status;
    this.items = items;
    this.addresses = addresses;
    this.shippingAddress = shippingAddress;
    this.billingAddress = billingAddress;
    this.statusDate = statusDate;
  }
}
