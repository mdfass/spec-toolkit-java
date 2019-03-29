package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * Sourcing Response Line
 */
public final class SourcingResponseLine {
  /**
   * Order Line ID
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Order Line Number
   */
  @JsonProperty(
      value = "line_number",
      required = true
  )
  public final Integer lineNumber;

  /**
   * SKU of the Item
   */
  @JsonProperty(
      value = "sku",
      required = true
  )
  public final String sku;

  /**
   * Source ID assigned to the Sourcing Line
   */
  @JsonProperty(
      value = "source_id",
      required = false
  )
  public final String sourceId;

  /**
   * Number of allocation attempts of this Line
   */
  @JsonProperty(
      value = "allocation_attempts",
      required = false
  )
  public final Integer allocationAttempts;

  /**
   * Reason for the sourcing result
   */
  @JsonProperty(
      value = "reason",
      required = false
  )
  public final String reason;

  /**
   * Status of the sourcing result
   */
  @JsonProperty(
      value = "status",
      required = false
  )
  public final String status;

  /**
   * Custom Attributes
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  /**
   * Quantity sourcing
   */
  @JsonProperty(
      value = "quantity",
      required = true
  )
  public final Integer quantity;

  @JsonCreator
  public SourcingResponseLine(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "allocation_attempts", required = false) final Integer allocationAttempts,
      @JsonProperty(value = "reason", required = false) final String reason,
      @JsonProperty(value = "status", required = false) final String status,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes,
      @JsonProperty(value = "quantity", required = true) final Integer quantity) {
    this.id = id;
    this.lineNumber = lineNumber;
    this.sku = sku;
    this.sourceId = sourceId;
    this.allocationAttempts = allocationAttempts;
    this.reason = reason;
    this.status = status;
    this.customAttributes = customAttributes;
    this.quantity = quantity;
  }
}
