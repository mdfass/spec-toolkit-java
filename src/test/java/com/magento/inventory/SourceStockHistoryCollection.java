package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Array of source stock history with offset, size and total items
 * Source stock history collection for Search History result
 */
public final class SourceStockHistoryCollection {
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
  public final List<SourceStockHistory> items;

  @JsonCreator
  public SourceStockHistoryCollection(
      @JsonProperty(value = "offset", required = true) final Integer offset,
      @JsonProperty(value = "size", required = true) final Integer size,
      @JsonProperty(value = "total", required = true) final Integer total,
      @JsonProperty(value = "items", required = true) final List<SourceStockHistory> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
