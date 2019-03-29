package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Aggregate Stock History Trace
 */
public final class AggregateStockHistoryTrace {
  /**
   * SKU
   */
  @JsonProperty(
      value = "sku",
      required = false
  )
  public final String sku;

  /**
   * Aggregate ID
   */
  @JsonProperty(
      value = "aggregate_id",
      required = false
  )
  public final String aggregateId;

  /**
   * Date
   */
  @JsonProperty(
      value = "date",
      required = false
  )
  public final ZonedDateTime date;

  /**
   * Total Quantity
   */
  @JsonProperty(
      value = "total_quantity",
      required = false
  )
  public final Integer totalQuantity;

  /**
   * Safety Stock
   */
  @JsonProperty(
      value = "safety_stock",
      required = false
  )
  public final Integer safetyStock;

  /**
   * Soft Inflight
   */
  @JsonProperty(
      value = "soft_inflight",
      required = false
  )
  public final Integer softInflight;

  /**
   * Final Quantity
   */
  @JsonProperty(
      value = "final_quantity",
      required = false
  )
  public final Integer finalQuantity;

  /**
   * Sources
   */
  @JsonProperty(
      value = "sources",
      required = false
  )
  public final List<AggregateStockHistoryTraceSource> sources;

  @JsonCreator
  public AggregateStockHistoryTrace(@JsonProperty(value = "sku", required = false) final String sku,
      @JsonProperty(value = "aggregate_id", required = false) final String aggregateId,
      @JsonProperty(value = "date", required = false) final ZonedDateTime date,
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
