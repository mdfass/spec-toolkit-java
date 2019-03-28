package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;

/**
 * Allocation Queue Entry
 */
public final class AllocationQueueEntry {
  /**
   * Order ID
   */
  public final String orderId;

  /**
   * Status of the entry in the allocation queue
   */
  public final String status;

  /**
   * Who created the entry
   */
  public final String createdBy;

  /**
   * When the entry was created
   */
  public final LocalDateTime createdAt;

  /**
   * Who modified the entry last
   */
  public final String modifiedBy;

  /**
   * When the entry was modified last
   */
  public final LocalDateTime modifiedAt;

  @JsonCreator
  public AllocationQueueEntry(
      @JsonProperty(value = "order_id", required = true) final String orderId,
      @JsonProperty(value = "status", required = true) final String status,
      @JsonProperty(value = "created_by", required = false) final String createdBy,
      @JsonProperty(value = "created_at", required = false) final LocalDateTime createdAt,
      @JsonProperty(value = "modified_by", required = false) final String modifiedBy,
      @JsonProperty(value = "modified_at", required = false) final LocalDateTime modifiedAt) {
    this.orderId = orderId;
    this.status = status;
    this.createdBy = createdBy;
    this.createdAt = createdAt;
    this.modifiedBy = modifiedBy;
    this.modifiedAt = modifiedAt;
  }
}
