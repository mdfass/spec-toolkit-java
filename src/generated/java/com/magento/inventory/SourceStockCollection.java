package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Array of source stock with offset, size and total items
 * Source stock collection for Search result
 */
public final class SourceStockCollection {
  /**
   * The offset of the search
   */
  @JsonProperty(
      value = "offset",
      required = true
  )
  public final Integer offset;

  /**
   * The size of the searched chunk returned
   */
  @JsonProperty(
      value = "size",
      required = true
  )
  public final Integer size;

  /**
   * Number of total items that search result has
   */
  @JsonProperty(
      value = "total",
      required = true
  )
  public final Integer total;

  /**
   * The items found by search query
   */
  @JsonProperty(
      value = "items",
      required = true
  )
  public final List<SourceStock> items;

  @JsonCreator
  public SourceStockCollection(
      @JsonProperty(value = "offset", required = true) final Integer offset,
      @JsonProperty(value = "size", required = true) final Integer size,
      @JsonProperty(value = "total", required = true) final Integer total,
      @JsonProperty(value = "items", required = true) final List<SourceStock> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
