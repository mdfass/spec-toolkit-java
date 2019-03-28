package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Aggregate Stock History Collection
 */
public final class AggregateStockHistoryCollection {
  /**
   * The offset of the search
   */
  public final Integer offset;

  /**
   * The size of the searched chunk returned
   */
  public final Integer size;

  /**
   * Number of total items that search result has
   */
  public final Integer total;

  /**
   * The items found by search query
   */
  public final List<AggregateStockHistory> items;

  @JsonCreator
  public AggregateStockHistoryCollection(
      @JsonProperty(value = "offset", required = true) final Integer offset,
      @JsonProperty(value = "size", required = true) final Integer size,
      @JsonProperty(value = "total", required = true) final Integer total,
      @JsonProperty(value = "items", required = true) final List<AggregateStockHistory> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
