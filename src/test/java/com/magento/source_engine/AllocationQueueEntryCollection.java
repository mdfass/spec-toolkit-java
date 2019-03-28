package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Allocation Queue Entry Collection
 */
public final class AllocationQueueEntryCollection {
  /**
   * Search result offset
   */
  public final Integer offset;

  /**
   * Max number of entries
   */
  public final Integer size;

  /**
   * Total number of records matching search query
   */
  public final Integer total;

  /**
   * Matching allocation queue entries
   */
  public final List<AllocationQueueEntry> items;

  @JsonCreator
  public AllocationQueueEntryCollection(
      @JsonProperty(value = "offset", required = false) final Integer offset,
      @JsonProperty(value = "size", required = false) final Integer size,
      @JsonProperty(value = "total", required = false) final Integer total,
      @JsonProperty(value = "items", required = false) final List<AllocationQueueEntry> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
