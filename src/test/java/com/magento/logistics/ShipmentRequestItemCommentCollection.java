package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Shipment request item comment collection
 */
public final class ShipmentRequestItemCommentCollection {
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
   * Matching shipment request item comments
   */
  public final List<ShipmentRequestItemComment> items;

  @JsonCreator
  public ShipmentRequestItemCommentCollection(
      @JsonProperty(value = "offset", required = false) final Integer offset,
      @JsonProperty(value = "size", required = false) final Integer size,
      @JsonProperty(value = "total", required = false) final Integer total,
      @JsonProperty(value = "items", required = false) final List<ShipmentRequestItemComment> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
