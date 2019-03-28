package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Force Sourcing Line
 */
public final class ForceSourcingLine {
  /**
   * Order Line ID
   */
  public final String id;

  /**
   * Order Line Number
   */
  public final Integer lineNumber;

  /**
   * SKU of the Item
   */
  public final String sku;

  /**
   * Source ID assigned to the forced Sourcing Line
   */
  public final String sourceId;

  /**
   * Number of allocation attempts of this Line
   */
  public final Integer allocationAttempts;

  /**
   * Reason for the force sourcing
   */
  public final String reason;

  /**
   * The quantity of the force sourcing
   */
  public final Integer quantity;

  @JsonCreator
  public ForceSourcingLine(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "allocation_attempts", required = false) final Integer allocationAttempts,
      @JsonProperty(value = "reason", required = false) final String reason,
      @JsonProperty(value = "quantity", required = true) final Integer quantity) {
    this.id = id;
    this.lineNumber = lineNumber;
    this.sku = sku;
    this.sourceId = sourceId;
    this.allocationAttempts = allocationAttempts;
    this.reason = reason;
    this.quantity = quantity;
  }
}
