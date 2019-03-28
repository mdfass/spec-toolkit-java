package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

/**
 *
 *                 The Source Stock represent a real stock quantity by SKU in a certain source node (ie: warehouse,
 *                 fullfillment center etc..)
 *             
 * Source Stock
 */
public final class SourceStock {
  /**
   * The sku of the product
   */
  public final String sku;

  /**
   * The quantity units of the product available
   */
  public final Integer quantity;

  /**
   * The identifier of the source node which owns the stock quantities
   */
  public final String sourceId;

  /**
   * The name of the source which owns the stock quantities
   */
  public final String sourceName;

  /**
   * The type of stock (GOOD, DAMAGED, REPAIRED ...)
   */
  public final String type;

  /**
   * This sku has unlimited stock in this source (quantity is ignored)
   */
  public final Boolean unlimited;

  /**
   * Quantity of the items which are in inflight (only for searching purposes)
   */
  public final Integer inflight;

  @JsonCreator
  public SourceStock(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "source_name", required = false) final String sourceName,
      @JsonProperty(value = "type", required = false) final String type,
      @JsonProperty(value = "unlimited", required = false) final Boolean unlimited,
      @JsonProperty(value = "inflight", required = false) final Integer inflight) {
    this.sku = sku;
    this.quantity = quantity;
    this.sourceId = sourceId;
    this.sourceName = sourceName;
    this.type = type;
    this.unlimited = unlimited;
    this.inflight = inflight;
  }
}
