package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

/**
 *
 *                 Aggregated stock represents available stock to sell in a certain channel
 *             
 * Aggregated stock
 */
public final class AggregateStock {
  /**
   * The aggregate identifier which this stock belongs to
   */
  @JsonProperty(
      value = "aggregate_id",
      required = true
  )
  public final String aggregateId;

  /**
   * The sku of the product
   */
  @JsonProperty(
      value = "sku",
      required = true
  )
  public final String sku;

  /**
   * The units of the product available
   */
  @JsonProperty(
      value = "quantity",
      required = true
  )
  public final Integer quantity;

  /**
   * A flag to mark if the product it's in stock or not, independently of the number of
   *                         units available
   *                     
   * If the product is in stock or not
   */
  @JsonProperty(
      value = "in_stock",
      required = false
  )
  public final Boolean inStock;

  /**
   * The number of units available that we don't want to take into consideration when
   *                         selling online, as an internal buffer for avoiding possible oversells
   *                     
   * Number of units that we don't take into consideration
   */
  @JsonProperty(
      value = "safety_stock",
      required = false
  )
  public final Integer safetyStock;

  /**
   * This sku has unlimited stock in this aggregate (quantity is ignored)
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

  /**
   * Quantity of the items which are in inflight because of Backordered Orders
   */
  @JsonProperty(
      value = "inflight_backorders",
      required = false
  )
  public final Integer inflightBackorders;

  @JsonCreator
  public AggregateStock(
      @JsonProperty(value = "aggregate_id", required = true) final String aggregateId,
      @JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "in_stock", required = false) final Boolean inStock,
      @JsonProperty(value = "safety_stock", required = false) final Integer safetyStock,
      @JsonProperty(value = "unlimited", required = false) final Boolean unlimited,
      @JsonProperty(value = "inflight", required = false) final Integer inflight,
      @JsonProperty(value = "inflight_backorders", required = false) final Integer inflightBackorders) {
    this.aggregateId = aggregateId;
    this.sku = sku;
    this.quantity = quantity;
    this.inStock = inStock;
    this.safetyStock = safetyStock;
    this.unlimited = unlimited;
    this.inflight = inflight;
    this.inflightBackorders = inflightBackorders;
  }
}
