package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * Represents a product return of one or several items
 */
public final class ProductReturnUpdate {
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
   * RMA number of the product return
   */
  public final String rma;

  /**
   * RMA status of the product return
   */
  public final Status status;

  /**
   * List of items in the shipment
   */
  public final List<ProductReturnItems> items;

  /**
   * Custom attributes at return header level
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public ProductReturnUpdate(
      @JsonProperty(value = "store_id", required = true) final String storeId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "rma", required = false) final String rma,
      @JsonProperty(value = "status", required = false) final Status status,
      @JsonProperty(value = "items", required = true) final List<ProductReturnItems> items,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.storeId = storeId;
    this.orderId = orderId;
    this.sourceId = sourceId;
    this.rma = rma;
    this.status = status;
    this.items = items;
    this.customAttributes = customAttributes;
  }
}
