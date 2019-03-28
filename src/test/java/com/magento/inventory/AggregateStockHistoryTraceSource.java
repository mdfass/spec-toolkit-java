package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Aggregate Stock History Trace Source
 */
public final class AggregateStockHistoryTraceSource {
  /**
   * Source ID
   */
  public final String sourceId;

  /**
   * Quantity
   */
  public final Integer quantity;

  /**
   * Safety Stock
   */
  public final Integer safetyStock;

  /**
   * Inflight
   */
  public final Integer inflight;

  /**
   * Final Quantity
   */
  public final Integer finalQuantity;

  @JsonCreator
  public AggregateStockHistoryTraceSource(
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "quantity", required = false) final Integer quantity,
      @JsonProperty(value = "safety_stock", required = false) final Integer safetyStock,
      @JsonProperty(value = "inflight", required = false) final Integer inflight,
      @JsonProperty(value = "final_quantity", required = false) final Integer finalQuantity) {
    this.sourceId = sourceId;
    this.quantity = quantity;
    this.safetyStock = safetyStock;
    this.inflight = inflight;
    this.finalQuantity = finalQuantity;
  }
}
