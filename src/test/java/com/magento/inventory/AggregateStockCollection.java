package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Array of aggregate stock with offset, size and total items
 * Aggregate stock collection for Search result
 */
public final class AggregateStockCollection {
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
  public final List<AggregateStock> items;

  @JsonCreator
  public AggregateStockCollection(
      @JsonProperty(value = "offset", required = true) final Integer offset,
      @JsonProperty(value = "size", required = true) final Integer size,
      @JsonProperty(value = "total", required = true) final Integer total,
      @JsonProperty(value = "items", required = true) final List<AggregateStock> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
