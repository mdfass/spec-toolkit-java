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
  @JsonProperty(
      value = "source_id",
      required = false
  )
  public final String sourceId;

  /**
   * Quantity
   */
  @JsonProperty(
      value = "quantity",
      required = false
  )
  public final Integer quantity;

  /**
   * Safety Stock
   */
  @JsonProperty(
      value = "safety_stock",
      required = false
  )
  public final Integer safetyStock;

  /**
   * Inflight
   */
  @JsonProperty(
      value = "inflight",
      required = false
  )
  public final Integer inflight;

  /**
   * Final Quantity
   */
  @JsonProperty(
      value = "final_quantity",
      required = false
  )
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
