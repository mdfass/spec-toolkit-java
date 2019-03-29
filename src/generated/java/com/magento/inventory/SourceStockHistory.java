package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;

/**
 * Source Stock History
 */
public final class SourceStockHistory {
  /**
   * Source ID
   */
  @JsonProperty(
      value = "source_id",
      required = false
  )
  public final String sourceId;

  /**
   * SKU
   */
  @JsonProperty(
      value = "sku",
      required = false
  )
  public final String sku;

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

  /**
   * Stock Change
   */
  @JsonProperty(
      value = "stock_change",
      required = false
  )
  public final String stockChange;

  /**
   * Inflight
   */
  @JsonProperty(
      value = "inflight",
      required = false
  )
  public final Integer inflight;

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

  @JsonCreator
  public SourceStockHistory(
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "sku", required = false) final String sku,
      @JsonProperty(value = "quantity", required = false) final Integer quantity,
      @JsonProperty(value = "unlimited", required = false) final Boolean unlimited,
      @JsonProperty(value = "stock_change", required = false) final String stockChange,
      @JsonProperty(value = "inflight", required = false) final Integer inflight,
      @JsonProperty(value = "event_date", required = false) final ZonedDateTime eventDate,
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
