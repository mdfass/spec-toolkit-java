package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;

/**
 * Aggregate Stock History For a Sku
 */
public final class AggregateStockHistory {
  /**
   * The aggregate identifier which this stock belongs to
   */
  @JsonProperty(
      value = "aggregate_id",
      required = false
  )
  public final String aggregateId;

  /**
   * The sku of the product
   */
  @JsonProperty(
      value = "sku",
      required = false
  )
  public final String sku;

  /**
   * Date of the stock update
   */
  @JsonProperty(
      value = "date",
      required = false
  )
  public final ZonedDateTime date;

  /**
   * Reason of the stock update
   */
  @JsonProperty(
      value = "reason",
      required = false
  )
  public final String reason;

  /**
   * Quantity
   */
  @JsonProperty(
      value = "quantity",
      required = false
  )
  public final Integer quantity;

  /**
   * Unlimited
   */
  @JsonProperty(
      value = "unlimited",
      required = false
  )
  public final Boolean unlimited;

  @JsonCreator
  public AggregateStockHistory(
      @JsonProperty(value = "aggregate_id", required = false) final String aggregateId,
      @JsonProperty(value = "sku", required = false) final String sku,
      @JsonProperty(value = "date", required = false) final ZonedDateTime date,
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
