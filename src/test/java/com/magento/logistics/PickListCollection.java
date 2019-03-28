package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Pick list Collection
 */
public final class PickListCollection {
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
   * Matching pick lists
   */
  public final List<PickList> items;

  @JsonCreator
  public PickListCollection(@JsonProperty(value = "offset", required = false) final Integer offset,
      @JsonProperty(value = "size", required = false) final Integer size,
      @JsonProperty(value = "total", required = false) final Integer total,
      @JsonProperty(value = "items", required = false) final List<PickList> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
