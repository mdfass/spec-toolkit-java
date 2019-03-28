package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Sales Channel
 */
public final class SalesChannel {
  /**
   * The identifier of the sales channel
   */
  public final String id;

  /**
   * Sales channel name.
   */
  public final String name;

  /**
   * ID of the aggregate
   */
  public final String aggregateId;

  @JsonCreator
  public SalesChannel(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "name", required = true) final String name,
      @JsonProperty(value = "aggregate_id", required = false) final String aggregateId) {
    this.id = id;
    this.name = name;
    this.aggregateId = aggregateId;
  }
}
