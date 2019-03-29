package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 *
 *                 Snapshot represents an array of SKUs with their quantities captured at certain moment of time.
 *             
 * Aggregate Snapshot
 */
public final class AggregateSnapshot {
  /**
   * The identifier of the aggregate node which owns the stock quantities
   */
  @JsonProperty(
      value = "aggregate_id",
      required = true
  )
  public final String aggregateId;

  /**
   * Snapshot Mode (FULL, NONZERO, DELTA)
   */
  @JsonProperty(
      value = "mode",
      required = true
  )
  public final SnapshotMode mode;

  /**
   * Date and time when snapshot was created
   */
  @JsonProperty(
      value = "created_on",
      required = true
  )
  public final ZonedDateTime createdOn;

  /**
   * Array of SKUs in snapshot
   */
  @JsonProperty(
      value = "stock",
      required = true
  )
  public final List<AggregateSnapshotSku> stock;

  @JsonCreator
  public AggregateSnapshot(
      @JsonProperty(value = "aggregate_id", required = true) final String aggregateId,
      @JsonProperty(value = "mode", required = true) final SnapshotMode mode,
      @JsonProperty(value = "created_on", required = true) final ZonedDateTime createdOn,
      @JsonProperty(value = "stock", required = true) final List<AggregateSnapshotSku> stock) {
    this.aggregateId = aggregateId;
    this.mode = mode;
    this.createdOn = createdOn;
    this.stock = stock;
  }
}
