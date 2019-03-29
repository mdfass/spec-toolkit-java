package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;

/**
 * Aggregate Stock History
 */
public final class AggregateStockHistorySku {
  /**
   * Event Date
   */
  @JsonProperty(
      value = "event_date",
      required = false
  )
  public final ZonedDateTime eventDate;

  /**
   * Event Type
   */
  @JsonProperty(
      value = "event_type",
      required = false
  )
  public final String eventType;

  /**
   * Reason
   */
  @JsonProperty(
      value = "reason",
      required = false
  )
  public final String reason;

  /**
   * Description
   */
  @JsonProperty(
      value = "description",
      required = false
  )
  public final String description;

  /**
   * Quantity
   */
  @JsonProperty(
      value = "quantity",
      required = false
  )
  public final Integer quantity;

  /**
   * Adjustment
   */
  @JsonProperty(
      value = "adjustment",
      required = false
  )
  public final Integer adjustment;

  /**
   * Snapshot Quantity
   */
  @JsonProperty(
      value = "snapshot_quantity",
      required = false
  )
  public final Integer snapshotQuantity;

  /**
   * Source ID
   */
  @JsonProperty(
      value = "source_id",
      required = false
  )
  public final String sourceId;

  /**
   * Unlimited
   */
  @JsonProperty(
      value = "unlimited",
      required = false
  )
  public final Boolean unlimited;

  @JsonCreator
  public AggregateStockHistorySku(
      @JsonProperty(value = "event_date", required = false) final ZonedDateTime eventDate,
      @JsonProperty(value = "event_type", required = false) final String eventType,
      @JsonProperty(value = "reason", required = false) final String reason,
      @JsonProperty(value = "description", required = false) final String description,
      @JsonProperty(value = "quantity", required = false) final Integer quantity,
      @JsonProperty(value = "adjustment", required = false) final Integer adjustment,
      @JsonProperty(value = "snapshot_quantity", required = false) final Integer snapshotQuantity,
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "unlimited", required = false) final Boolean unlimited) {
    this.eventDate = eventDate;
    this.eventType = eventType;
    this.reason = reason;
    this.description = description;
    this.quantity = quantity;
    this.adjustment = adjustment;
    this.snapshotQuantity = snapshotQuantity;
    this.sourceId = sourceId;
    this.unlimited = unlimited;
  }
}
