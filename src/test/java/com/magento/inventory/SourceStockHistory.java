package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;

/**
 * Source Stock History
 */
public final class SourceStockHistory {
  /**
   * Source ID
   */
  public final String sourceId;

  /**
   * SKU
   */
  public final String sku;

  /**
   * Quantity
   */
  public final Integer quantity;

  /**
   * Unlimited
   */
  public final Boolean unlimited;

  /**
   * Stock Change
   */
  public final String stockChange;

  /**
   * Inflight
   */
  public final Integer inflight;

  /**
   * Event Date
   */
  public final LocalDateTime eventDate;

  /**
   * Event Type
   */
  public final String eventType;

  @JsonCreator
  public SourceStockHistory(
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "sku", required = false) final String sku,
      @JsonProperty(value = "quantity", required = false) final Integer quantity,
      @JsonProperty(value = "unlimited", required = false) final Boolean unlimited,
      @JsonProperty(value = "stock_change", required = false) final String stockChange,
      @JsonProperty(value = "inflight", required = false) final Integer inflight,
      @JsonProperty(value = "event_date", required = false) final LocalDateTime eventDate,
      @JsonProperty(value = "event_type", required = false) final String eventType) {
    this.sourceId = sourceId;
    this.sku = sku;
    this.quantity = quantity;
    this.unlimited = unlimited;
    this.stockChange = stockChange;
    this.inflight = inflight;
    this.eventDate = eventDate;
    this.eventType = eventType;
  }
}
