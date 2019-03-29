package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * A package in shipments
 */
public final class Package {
  /**
   * ID of the package
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Some physical details of the package
   */
  @JsonProperty(
      value = "details",
      required = false
  )
  public final PackageDetail details;

  /**
   * References to order_line_numbers which were packed in the package
   */
  @JsonProperty(
      value = "items",
      required = true
  )
  public final List<Integer> items;

  /**
   * Reference to aggregated items shipped
   */
  @JsonProperty(
      value = "aggregated_items",
      required = false
  )
  public final List<AggregatedItem> aggregatedItems;

  /**
   * Carrier who will deliver the package
   */
  @JsonProperty(
      value = "carrier",
      required = false
  )
  public final String carrier;

  /**
   * Tracking number of the package
   */
  @JsonProperty(
      value = "tracking_number",
      required = false
  )
  public final String trackingNumber;

  /**
   * Tracking link of the package
   */
  @JsonProperty(
      value = "tracking_link",
      required = false
  )
  public final String trackingLink;

  /**
   * Tracking comment of the package
   */
  @JsonProperty(
      value = "tracking_comment",
      required = false
  )
  public final String trackingComment;

  /**
   * Link to be use to print the shipping label
   */
  @JsonProperty(
      value = "shipping_label_link",
      required = false
  )
  public final String shippingLabelLink;

  /**
   * Custom attributes of package
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public Package(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "details", required = false) final PackageDetail details,
      @JsonProperty(value = "items", required = true) final List<Integer> items,
      @JsonProperty(value = "aggregated_items", required = false) final List<AggregatedItem> aggregatedItems,
      @JsonProperty(value = "carrier", required = false) final String carrier,
      @JsonProperty(value = "tracking_number", required = false) final String trackingNumber,
      @JsonProperty(value = "tracking_link", required = false) final String trackingLink,
      @JsonProperty(value = "tracking_comment", required = false) final String trackingComment,
      @JsonProperty(value = "shipping_label_link", required = false) final String shippingLabelLink,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.id = id;
    this.details = details;
    this.items = items;
    this.aggregatedItems = aggregatedItems;
    this.carrier = carrier;
    this.trackingNumber = trackingNumber;
    this.trackingLink = trackingLink;
    this.trackingComment = trackingComment;
    this.shippingLabelLink = shippingLabelLink;
    this.customAttributes = customAttributes;
  }
}
