package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Aggregate Stock History
 */
public final class AggregateStockHistoryFind {
  /**
   * SKU
   */
  public final String sku;

  /**
   * Aggregate ID
   */
  public final String aggregateId;

  /**
   * Stock
   */
  public final List<AggregateStockHistorySku> stock;

  @JsonCreator
  public AggregateStockHistoryFind(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "aggregate_id", required = true) final String aggregateId,
      @JsonProperty(value = "stock", required = false) final List<AggregateStockHistorySku> stock) {
    this.sku = sku;
    this.aggregateId = aggregateId;
    this.stock = stock;
  }
}
