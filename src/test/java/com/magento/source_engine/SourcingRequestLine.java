package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Sourcing Request Line
 */
public final class SourcingRequestLine {
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
   * Product Type
   */
  public final String productType;

  /**
   * Order Line External ID of the parent Line
   */
  public final String parentLineId;

  /**
   * Order Line Number of the parent Line
   */
  public final String parentLineNumber;

  /**
   * Number of allocation attempts of this Line
   */
  public final Integer allocationAttempts;

  /**
   * Source ID for lines already Hard Allocated
   */
  public final String sourceId;

  /**
   * Declined Sources for a Sourcing Line
   */
  public final List<String> declinedSources;

  /**
   * Custom Attributes
   */
  public final List<CustomAttribute> customAttributes;

  /**
   * Note: if no stock is available in this defined source, the order line will remain in backorder. If an order is a ISPU, this field will be used only when Ship To Store is enabled to force the source that will be providing the stock to the final collection point
   * Identifier that will force the source to be used when sourcing the order
   */
  public final String sourceLocation;

  /**
   * Identifier that the customer selected as a collection point
   */
  public final String pickupLocation;

  /**
   * The quantity of the sourcing request
   */
  public final Integer quantity;

  /**
   * Promise delivery date of the line
   */
  public final LocalDateTime promiseDeliveryDate;

  @JsonCreator
  public SourcingRequestLine(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "product_type", required = true) final String productType,
      @JsonProperty(value = "parent_line_id", required = false) final String parentLineId,
      @JsonProperty(value = "parent_line_number", required = false) final String parentLineNumber,
      @JsonProperty(value = "allocation_attempts", required = false) final Integer allocationAttempts,
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "declined_sources", required = false) final List<String> declinedSources,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes,
      @JsonProperty(value = "source_location", required = false) final String sourceLocation,
      @JsonProperty(value = "pickup_location", required = false) final String pickupLocation,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "promise_delivery_date", required = false) final LocalDateTime promiseDeliveryDate) {
    this.id = id;
    this.lineNumber = lineNumber;
    this.sku = sku;
    this.productType = productType;
    this.parentLineId = parentLineId;
    this.parentLineNumber = parentLineNumber;
    this.allocationAttempts = allocationAttempts;
    this.sourceId = sourceId;
    this.declinedSources = declinedSources;
    this.customAttributes = customAttributes;
    this.sourceLocation = sourceLocation;
    this.pickupLocation = pickupLocation;
    this.quantity = quantity;
    this.promiseDeliveryDate = promiseDeliveryDate;
  }
}
