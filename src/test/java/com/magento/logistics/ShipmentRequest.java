package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Shipment request
 */
public final class ShipmentRequest {
  /**
   * ID of shipment request
   */
  public final String id;

  /**
   * Identifier of the order
   */
  public final String orderId;

  /**
   * Identifier of the source
   */
  public final String sourceId;

  /**
   * Identifier of the customer
   */
  public final String customerId;

  /**
   * Store from where the order comes from
   */
  public final String store;

  /**
   * Language of the order
   */
  public final String language;

  /**
   * Country in which the order is paying taxes
   */
  public final String vatCountry;

  /**
   * Channel in which the order was placed
   */
  public final String origin;

  /**
   * Date in which the order was placed
   */
  public final LocalDateTime originDate;

  /**
   * Date in which the shipment request was created
   */
  public final LocalDateTime createdAt;

  /**
   * Shipment request status
   */
  public final String status;

  /**
   * List of items
   */
  public final List<Item> items;

  /**
   * Associated addresses to the shipment request
   */
  public final List<Address> addresses;

  /**
   * Shipping address
   */
  public final Address shippingAddress;

  /**
   * Billing address
   */
  public final Address billingAddress;

  /**
   * When the status changed for the shipment request
   */
  public final LocalDateTime statusDate;

  @JsonCreator
  public ShipmentRequest(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "customer_id", required = false) final String customerId,
      @JsonProperty(value = "store", required = true) final String store,
      @JsonProperty(value = "language", required = false) final String language,
      @JsonProperty(value = "vat_country", required = true) final String vatCountry,
      @JsonProperty(value = "origin", required = true) final String origin,
      @JsonProperty(value = "origin_date", required = true) final LocalDateTime originDate,
      @JsonProperty(value = "created_at", required = false) final LocalDateTime createdAt,
      @JsonProperty(value = "status", required = true) final String status,
      @JsonProperty(value = "items", required = true) final List<Item> items,
      @JsonProperty(value = "addresses", required = true) final List<Address> addresses,
      @JsonProperty(value = "shipping_address", required = false) final Address shippingAddress,
      @JsonProperty(value = "billing_address", required = false) final Address billingAddress,
      @JsonProperty(value = "status_date", required = false) final LocalDateTime statusDate) {
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
