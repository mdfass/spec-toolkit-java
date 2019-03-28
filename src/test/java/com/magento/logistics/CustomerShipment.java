package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Represents a shipment of one or several items
 */
public final class CustomerShipment {
  /**
   * Reference to the shipment [*deprecated*]
   */
  public final String shipmentId;

  /**
   * Reference to the shipment request
   */
  public final String shipmentRequestId;

  /**
   * Store from the order
   */
  public final String storeId;

  /**
   * Reference to the order
   */
  public final String orderId;

  /**
   * ID of the source where the order is sourced
   */
  public final String sourceId;

  /**
   * Shipping method
   */
  public final String method;

  /**
   * Date of the shipment
   */
  public final LocalDateTime shipmentDate;

  /**
   * List of items
   */
  public final List<Item> items;

  /**
   * List of packages in the shipment
   */
  public final List<Package> packages;

  /**
   * Address where the items will be shipped
   */
  public final Address address;

  @JsonCreator
  public CustomerShipment(
      @JsonProperty(value = "shipment_id", required = false) final String shipmentId,
      @JsonProperty(value = "shipment_request_id", required = false) final String shipmentRequestId,
      @JsonProperty(value = "store_id", required = true) final String storeId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "method", required = true) final String method,
      @JsonProperty(value = "shipment_date", required = false) final LocalDateTime shipmentDate,
      @JsonProperty(value = "items", required = true) final List<Item> items,
      @JsonProperty(value = "packages", required = true) final List<Package> packages,
      @JsonProperty(value = "address", required = false) final Address address) {
    this.shipmentId = shipmentId;
    this.shipmentRequestId = shipmentRequestId;
    this.storeId = storeId;
    this.orderId = orderId;
    this.sourceId = sourceId;
    this.method = method;
    this.shipmentDate = shipmentDate;
    this.items = items;
    this.packages = packages;
    this.address = address;
  }
}
