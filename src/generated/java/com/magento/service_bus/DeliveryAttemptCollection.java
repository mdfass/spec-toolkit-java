package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Delivery Attempt collection
 */
public final class DeliveryAttemptCollection {
  /**
   * Offset
   */
  @JsonProperty(
      value = "offset",
      required = false
  )
  public final Integer offset;

  /**
   * Size
   */
  @JsonProperty(
      value = "size",
      required = false
  )
  public final Integer size;

  /**
   * Total
   */
  @JsonProperty(
      value = "total",
      required = false
  )
  public final Integer total;

  /**
   * Items
   */
  @JsonProperty(
      value = "items",
      required = false
  )
  public final List<DeliveryAttempt> items;

  @JsonCreator
  public DeliveryAttemptCollection(
      @JsonProperty(value = "offset", required = false) final Integer offset,
      @JsonProperty(value = "size", required = false) final Integer size,
      @JsonProperty(value = "total", required = false) final Integer total,
      @JsonProperty(value = "items", required = false) final List<DeliveryAttempt> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
