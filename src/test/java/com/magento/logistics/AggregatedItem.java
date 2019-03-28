package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * Aggregated quantity
 */
public final class AggregatedItem {
  /**
   * ID of aggregated items
   */
  public final String aggregatedLineId;

  /**
   * Product sku
   */
  public final String sku;

  /**
   * Quantity of aggregated items
   */
  public final Integer quantity;

  /**
   * Reference to the order lines from requested shipment
   */
  public final List<Integer> orderLines;

  @JsonCreator
  public AggregatedItem(
      @JsonProperty(value = "aggregated_line_id", required = true) final String aggregatedLineId,
      @JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "order_lines", required = true) final List<Integer> orderLines) {
    this.aggregatedLineId = aggregatedLineId;
    this.sku = sku;
    this.quantity = quantity;
    this.orderLines = orderLines;
  }
}
