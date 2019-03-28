package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import java.lang.String;
import java.util.List;

/**
 * Represents a shipment of one or several items
 */
public final class Shipment {
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
   * Method that identify the type of shipment that has been done
   */
  public final String method;

  /**
   * List of items in the shipment
   */
  public final List<ShipmentItem> items;

  /**
   * List of packages in the shipment
   */
  public final List<ShipmentPackage> packages;

  /**
   * Address where the items will be shipped
   */
  public final Address address;

  @JsonCreator
  public Shipment(@JsonProperty(value = "store_id", required = true) final String storeId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "method", required = false) final String method,
      @JsonProperty(value = "items", required = true) final List<ShipmentItem> items,
      @JsonProperty(value = "packages", required = true) final List<ShipmentPackage> packages,
      @JsonProperty(value = "address", required = false) final Address address) {
    this.storeId = storeId;
    this.orderId = orderId;
    this.sourceId = sourceId;
    this.method = method;
    this.items = items;
    this.packages = packages;
    this.address = address;
  }
}
