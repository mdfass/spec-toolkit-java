package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;

/**
 * Aggregate Stock History
 */
public final class AggregateStockHistorySku {
  /**
   * Event Date
   */
  public final LocalDateTime eventDate;

  /**
   * Event Type
   */
  public final String eventType;

  /**
   * Reason
   */
  public final String reason;

  /**
   * Description
   */
  public final String description;

  /**
   * Quantity
   */
  public final Integer quantity;

  /**
   * Adjustment
   */
  public final Integer adjustment;

  /**
   * Snapshot Quantity
   */
  public final Integer snapshotQuantity;

  /**
   * Source ID
   */
  public final String sourceId;

  /**
   * Unlimited
   */
  public final Boolean unlimited;

  @JsonCreator
  public AggregateStockHistorySku(
      @JsonProperty(value = "event_date", required = false) final LocalDateTime eventDate,
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
