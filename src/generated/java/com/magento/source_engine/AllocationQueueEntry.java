package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.ZonedDateTime;

/**
 * Allocation Queue Entry
 */
public final class AllocationQueueEntry {
  /**
   * Order ID
   */
  @JsonProperty(
      value = "order_id",
      required = true
  )
  public final String orderId;

  /**
   * Status of the entry in the allocation queue
   */
  @JsonProperty(
      value = "status",
      required = true
  )
  public final String status;

  /**
   * Who created the entry
   */
  @JsonProperty(
      value = "created_by",
      required = false
  )
  public final String createdBy;

  /**
   * When the entry was created
   */
  @JsonProperty(
      value = "created_at",
      required = false
  )
  public final ZonedDateTime createdAt;

  /**
   * Who modified the entry last
   */
  @JsonProperty(
      value = "modified_by",
      required = false
  )
  public final String modifiedBy;

  /**
   * When the entry was modified last
   */
  @JsonProperty(
      value = "modified_at",
      required = false
  )
  public final ZonedDateTime modifiedAt;

  @JsonCreator
  public AllocationQueueEntry(
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "status", required = true) final String status,
      @JsonProperty(value = "created_by", required = false) final String createdBy,
      @JsonProperty(value = "created_at", required = false) final ZonedDateTime createdAt,
      @JsonProperty(value = "modified_by", required = false) final String modifiedBy,
      @JsonProperty(value = "modified_at", required = false) final ZonedDateTime modifiedAt) {
    this.orderId = orderId;
    this.status = status;
    this.createdBy = createdBy;
    this.createdAt = createdAt;
    this.modifiedBy = modifiedBy;
    this.modifiedAt = modifiedAt;
  }
}
