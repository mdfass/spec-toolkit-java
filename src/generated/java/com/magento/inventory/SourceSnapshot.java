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
 * Source Snapshot
 */
public final class SourceSnapshot {
  /**
   * The identifier of the source node which owns the stock quantities
   */
  @JsonProperty(
      value = "source_id",
      required = true
  )
  public final String sourceId;

  /**
   * Snapshot Mode (FULL, NONZERO, DELTA)
   */
  @JsonProperty(
      value = "mode",
      required = true
  )
  public final SnapshotMode mode;

  /**
   * (only required if expecting to send multiple messages for
   *                         the various sources at the same time).
   *                     
   * Batch information
   */
  @JsonProperty(
      value = "batch",
      required = false
  )
  public final SourceSnapshotBatch batch;

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
  public final List<SourceSnapshotSku> stock;

  @JsonCreator
  public SourceSnapshot(@JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "mode", required = true) final SnapshotMode mode,
      @JsonProperty(value = "batch", required = false) final SourceSnapshotBatch batch,
      @JsonProperty(value = "created_on", required = true) final ZonedDateTime createdOn,
      @JsonProperty(value = "stock", required = true) final List<SourceSnapshotSku> stock) {
    this.sourceId = sourceId;
    this.mode = mode;
    this.batch = batch;
    this.createdOn = createdOn;
    this.stock = stock;
  }
}
