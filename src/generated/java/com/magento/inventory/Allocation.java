package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 *
 *                 Source Stock allocation for given skus.
 *             
 * Source Stock Allocation
 */
public final class Allocation {
  /**
   * Source ID
   */
  @JsonProperty(
      value = "source_id",
      required = true
  )
  public final String sourceId;

  /**
   * Allocation UUID
   */
  @JsonProperty(
      value = "uuid",
      required = true
  )
  public final String uuid;

  /**
   * Allocation Lines
   */
  @JsonProperty(
      value = "lines",
      required = true
  )
  public final List<AllocationLine> lines;

  /**
   * Reason of cancellation
   */
  @JsonProperty(
      value = "reason",
      required = true
  )
  public final String reason;

  /**
   * Reservation UUID
   */
  @JsonProperty(
      value = "reservation_uuid",
      required = false
  )
  public final String reservationUuid;

  /**
   * Aggregate ID
   */
  @JsonProperty(
      value = "aggregate_id",
      required = false
  )
  public final String aggregateId;

  @JsonCreator
  public Allocation(@JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "uuid", required = true) final String uuid,
      @JsonProperty(value = "lines", required = true) final List<AllocationLine> lines,
      @JsonProperty(value = "reason", required = true) final String reason,
      @JsonProperty(value = "reservation_uuid", required = false) final String reservationUuid,
      @JsonProperty(value = "aggregate_id", required = false) final String aggregateId) {
    this.sourceId = sourceId;
    this.uuid = uuid;
    this.lines = lines;
    this.reason = reason;
    this.reservationUuid = reservationUuid;
    this.aggregateId = aggregateId;
  }
}
