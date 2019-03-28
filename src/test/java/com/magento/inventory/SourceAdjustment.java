package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 *                 Adjustment payload
 *             
 * Source Stock Adjustment
 */
public final class SourceAdjustment {
  /**
   * The identifier of the source node which owns the stock quantities
   */
  public final String sourceId;

  /**
   * Reason for stock adjustment
   */
  public final String reason;

  /**
   * Date and time when adjustment was created
   */
  public final LocalDateTime createdOn;

  /**
   * Array of SKUs in adjustment
   */
  public final List<SourceAdjustmentSku> adjustments;

  @JsonCreator
  public SourceAdjustment(@JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "reason", required = true) final String reason,
      @JsonProperty(value = "created_on", required = true) final LocalDateTime createdOn,
      @JsonProperty(value = "adjustments", required = true) final List<SourceAdjustmentSku> adjustments) {
    this.sourceId = sourceId;
    this.reason = reason;
    this.createdOn = createdOn;
    this.adjustments = adjustments;
  }
}
