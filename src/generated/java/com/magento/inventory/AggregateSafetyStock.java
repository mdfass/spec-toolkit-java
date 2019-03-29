package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 *
 *                 Aggregate safety stock represents the number of units available that we don't want to take into
 *                 consideration when selling online, as an internal buffer for avoiding possible oversells.
 *             
 * Aggregate Safety Stock
 */
public final class AggregateSafetyStock {
  /**
   * Aggregate unique identifier
   */
  @JsonProperty(
      value = "aggregate_id",
      required = true
  )
  public final String aggregateId;

  /**
   * Number of units that we don't take into consideration for this aggregate
   */
  @JsonProperty(
      value = "quantity",
      required = true
  )
  public final Integer quantity;

  /**
   * Safety stock type (active, outlet, end-of-life).
   */
  @JsonProperty(
      value = "type",
      required = true
  )
  public final SafetyStockType type;

  @JsonCreator
  public AggregateSafetyStock(
      @JsonProperty(value = "aggregate_id", required = true) final String aggregateId,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "type", required = true) final SafetyStockType type) {
    this.aggregateId = aggregateId;
    this.quantity = quantity;
    this.type = type;
  }
}
