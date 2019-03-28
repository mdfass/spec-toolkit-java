package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Aggregate Stock History Trace
 */
public final class AggregateStockHistoryTrace {
  /**
   * SKU
   */
  public final String sku;

  /**
   * Aggregate ID
   */
  public final String aggregateId;

  /**
   * Date
   */
  public final LocalDateTime date;

  /**
   * Total Quantity
   */
  public final Integer totalQuantity;

  /**
   * Safety Stock
   */
  public final Integer safetyStock;

  /**
   * Soft Inflight
   */
  public final Integer softInflight;

  /**
   * Final Quantity
   */
  public final Integer finalQuantity;

  /**
   * Sources
   */
  public final List<AggregateStockHistoryTraceSource> sources;

  @JsonCreator
  public AggregateStockHistoryTrace(@JsonProperty(value = "sku", required = false) final String sku,
      @JsonProperty(value = "aggregate_id", required = false) final String aggregateId,
      @JsonProperty(value = "date", required = false) final LocalDateTime date,
      @JsonProperty(value = "total_quantity", required = false) final Integer totalQuantity,
      @JsonProperty(value = "safety_stock", required = false) final Integer safetyStock,
      @JsonProperty(value = "soft_inflight", required = false) final Integer softInflight,
      @JsonProperty(value = "final_quantity", required = false) final Integer finalQuantity,
      @JsonProperty(value = "sources", required = false) final List<AggregateStockHistoryTraceSource> sources) {
    this.sku = sku;
    this.aggregateId = aggregateId;
    this.date = date;
    this.totalQuantity = totalQuantity;
    this.safetyStock = safetyStock;
    this.softInflight = softInflight;
    this.finalQuantity = finalQuantity;
    this.sources = sources;
  }
}
