package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.List;

/**
 * Message collection
 */
public final class MessageCollection {
  /**
   * Offset
   */
  public final Integer offset;

  /**
   * Size
   */
  public final Integer size;

  /**
   * Total
   */
  public final Integer total;

  /**
   * Items
   */
  public final List<Message> items;

  @JsonCreator
  public MessageCollection(@JsonProperty(value = "offset", required = false) final Integer offset,
      @JsonProperty(value = "size", required = false) final Integer size,
      @JsonProperty(value = "total", required = false) final Integer total,
      @JsonProperty(value = "items", required = false) final List<Message> items) {
    this.offset = offset;
    this.size = size;
    this.total = total;
    this.items = items;
  }
}
