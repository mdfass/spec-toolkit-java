package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 *
 *                 Stock Aggregate represent a group of stock quantities by SKU which are aggregated by some criteria
 *             
 * Stock Aggregate
 */
public final class Aggregate {
  /**
   * Unique identifier
   */
  public final String id;

  /**
   * Human friendly name
   */
  public final String name;

  /**
   * ID of the related sources
   */
  public final List<String> sources;

  @JsonCreator
  public Aggregate(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "name", required = true) final String name,
      @JsonProperty(value = "sources", required = false) final List<String> sources) {
    this.id = id;
    this.name = name;
    this.sources = sources;
  }
}
