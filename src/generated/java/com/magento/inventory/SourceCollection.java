package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Source Collection
 */
public final class SourceCollection {
  /**
   * Search result offset
   */
  @JsonProperty(
      value = "offset",
      required = false
  )
  public final Integer offset;

  /**
   * Max number of entries
   */
  @JsonProperty(
      value = "size",
      required = false
  )
  public final Integer size;

  /**
   * Total number of records matching search query
   */
  @JsonProperty(
      value = "total",
      required = false
  )
  public final Integer total;

  /**
   * Matching sources
   */
  @JsonProperty(
      value = "items",
      required = false
  )
  public final List<Source> items;

  @JsonCreator
  public SourceCollection(@JsonProperty(value = "offset", required = false) final Integer offset,
      @JsonProperty(value = "size", required = false) final Integer size,
      @JsonProperty(value = "total", required = false) final Integer total,
      @JsonProperty(value = "items", required = false) final List<Source> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
