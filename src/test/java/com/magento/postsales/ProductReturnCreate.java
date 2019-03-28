package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Represents a product return of one or several items
 */
public final class ProductReturnCreate {
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
   * List of items in the shipment
   */
  public final List<ProductReturnItems> items;

  @JsonCreator
  public ProductReturnCreate(
      @JsonProperty(value = "store_id", required = true) final String storeId,
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "items", required = true) final List<ProductReturnItems> items) {
    this.storeId = storeId;
    this.orderId = orderId;
    this.sourceId = sourceId;
    this.items = items;
  }
}
