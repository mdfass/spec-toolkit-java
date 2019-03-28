package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.Address;
import java.lang.String;
import java.util.List;

/**
 * Source
 */
public final class Source {
  /**
   * Unique identifier for the source node
   */
  public final String id;

  /**
   * Human friendly name
   */
  public final String name;

  /**
   * Types for this source
   */
  public final String type;

  /**
   * Timezone where source operates (eq. "UTC", "America/New_York" or "Europe/Madrid")
   * Timezone
   */
  public final String timezone;

  /**
   * Configurations of the source
   */
  public final SourceConfigurations configurations;

  /**
   * Address of the source
   */
  public final Address address;

  /**
   * List of Stock Aggregate ids associated to the source
   */
  public final List<String> aggregateIds;

  @JsonCreator
  public Source(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "name", required = true) final String name,
      @JsonProperty(value = "type", required = true) final String type,
      @JsonProperty(value = "timezone", required = false) final String timezone,
      @JsonProperty(value = "configurations", required = false) final SourceConfigurations configurations,
      @JsonProperty(value = "address", required = true) final Address address,
      @JsonProperty(value = "aggregate_ids", required = false) final List<String> aggregateIds) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.timezone = timezone;
    this.configurations = configurations;
    this.address = address;
    this.aggregateIds = aggregateIds;
  }
}
