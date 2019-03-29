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
  @JsonProperty(
      value = "sku",
      required = true
  )
  public final String sku;

  /**
   * The quantity units of the product available
   */
  @JsonProperty(
      value = "quantity",
      required = true
  )
  public final Integer quantity;

  /**
   * The identifier of the source node which owns the stock quantities
   */
  @JsonProperty(
      value = "source_id",
      required = true
  )
  public final String sourceId;

  /**
   * The name of the source which owns the stock quantities
   */
  @JsonProperty(
      value = "source_name",
      required = false
  )
  public final String sourceName;

  /**
   * The type of stock (GOOD, DAMAGED, REPAIRED ...)
   */
  @JsonProperty(
      value = "type",
      required = false
  )
  public final String type;

  /**
   * This sku has unlimited stock in this source (quantity is ignored)
   */
  @JsonProperty(
      value = "unlimited",
      required = false
  )
  public final Boolean unlimited;

  /**
   * Quantity of the items which are in inflight (only for searching purposes)
   */
  @JsonProperty(
      value = "inflight",
      required = false
  )
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
