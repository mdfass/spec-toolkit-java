package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;

/**
 * Aggregate Stock History For a Sku
 */
public final class AggregateStockHistory {
  /**
   * The aggregate identifier which this stock belongs to
   */
  public final String aggregateId;

  /**
   * The sku of the product
   */
  public final String sku;

  /**
   * Date of the stock update
   */
  public final LocalDateTime date;

  /**
   * Reason of the stock update
   */
  public final String reason;

  /**
   * Quantity
   */
  public final Integer quantity;

  /**
   * Unlimited
   */
  public final Boolean unlimited;

  @JsonCreator
  public AggregateStockHistory(
      @JsonProperty(value = "aggregate_id", required = false) final String aggregateId,
      @JsonProperty(value = "sku", required = false) final String sku,
      @JsonProperty(value = "date", required = false) final LocalDateTime date,
      @JsonProperty(value = "reason", required = false) final String reason,
      @JsonProperty(value = "quantity", required = false) final Integer quantity,
      @JsonProperty(value = "unlimited", required = false) final Boolean unlimited) {
    this.aggregateId = aggregateId;
    this.sku = sku;
    this.date = date;
    this.reason = reason;
    this.quantity = quantity;
    this.unlimited = unlimited;
  }
}
