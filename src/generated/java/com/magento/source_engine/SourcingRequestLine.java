package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Sourcing Request Line
 */
public final class SourcingRequestLine {
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
   * Product Type
   */
  @JsonProperty(
      value = "product_type",
      required = true
  )
  public final String productType;

  /**
   * Order Line External ID of the parent Line
   */
  @JsonProperty(
      value = "parent_line_id",
      required = false
  )
  public final String parentLineId;

  /**
   * Number of allocation attempts of this Line
   */
  @JsonProperty(
      value = "allocation_attempts",
      required = false
  )
  public final Integer allocationAttempts;

  /**
   * Source ID for lines already Hard Allocated
   */
  @JsonProperty(
      value = "source_id",
      required = false
  )
  public final String sourceId;

  /**
   * Declined Sources for a Sourcing Line
   */
  @JsonProperty(
      value = "declined_sources",
      required = false
  )
  public final List<String> declinedSources;

  /**
   * Custom Attributes
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  /**
   * Note: if no stock is available in this defined source, the order line will remain in backorder. If an order is a ISPU, this field will be used only when Ship To Store is enabled to force the source that will be providing the stock to the final collection point
   * Identifier that will force the source to be used when sourcing the order
   */
  @JsonProperty(
      value = "source_location",
      required = false
  )
  public final String sourceLocation;

  /**
   * Identifier that the customer selected as a collection point
   */
  @JsonProperty(
      value = "pickup_location",
      required = false
  )
  public final String pickupLocation;

  /**
   * The quantity of the sourcing request
   */
  @JsonProperty(
      value = "quantity",
      required = true
  )
  public final Integer quantity;

  /**
   * Promise delivery date of the line
   */
  @JsonProperty(
      value = "promise_delivery_date",
      required = false
  )
  public final ZonedDateTime promiseDeliveryDate;

  @JsonCreator
  public SourcingRequestLine(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "product_type", required = true) final String productType,
      @JsonProperty(value = "parent_line_id", required = false) final String parentLineId,
      @JsonProperty(value = "allocation_attempts", required = false) final Integer allocationAttempts,
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "declined_sources", required = false) final List<String> declinedSources,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes,
      @JsonProperty(value = "source_location", required = false) final String sourceLocation,
      @JsonProperty(value = "pickup_location", required = false) final String pickupLocation,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "promise_delivery_date", required = false) final ZonedDateTime promiseDeliveryDate) {
    this.id = id;
    this.lineNumber = lineNumber;
    this.sku = sku;
    this.productType = productType;
    this.parentLineId = parentLineId;
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
