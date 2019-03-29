package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Return Update Collection
 */
public final class ReturnUpdateCollection {
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
   * Matching return updates
   */
  @JsonProperty(
      value = "items",
      required = false
  )
  public final List<ReturnUpdate> items;

  @JsonCreator
  public ReturnUpdateCollection(
      @JsonProperty(value = "offset", required = false) final Integer offset,
      @JsonProperty(value = "size", required = false) final Integer size,
      @JsonProperty(value = "total", required = false) final Integer total,
      @JsonProperty(value = "items", required = false) final List<ReturnUpdate> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
