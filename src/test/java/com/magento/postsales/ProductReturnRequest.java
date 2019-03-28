package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Represents a product return request of one or several item
 */
public final class ProductReturnRequest {
  /**
   * Reference to the order
   */
  public final String orderId;

  /**
   * ID of the source where the order is sourced
   */
  public final String sourceId;

  /**
   * RMA code of the product return
   */
  public final String rma;

  /**
   * List of items in the product return request
   */
  public final List<ProductReturnRequestItem> items;

  @JsonCreator
  public ProductReturnRequest(
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "rma", required = false) final String rma,
      @JsonProperty(value = "items", required = true) final List<ProductReturnRequestItem> items) {
    this.orderId = orderId;
    this.sourceId = sourceId;
    this.rma = rma;
    this.items = items;
  }
}
