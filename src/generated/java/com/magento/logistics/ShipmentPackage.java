package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.String;
import java.util.List;

/**
 * A package in shipments
 */
public final class ShipmentPackage {
  /**
   * ID of the package
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Carrier who will deliver the package
   */
  @JsonProperty(
      value = "carrier",
      required = true
  )
  public final String carrier;

  /**
   * Tracking number of the package
   */
  @JsonProperty(
      value = "tracking_number",
      required = true
  )
  public final String trackingNumber;

  /**
   * Tracking link of the package
   */
  @JsonProperty(
      value = "tracking_link",
      required = true
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
   * Items in the package
   */
  @JsonProperty(
      value = "items",
      required = true
  )
  public final List<ShipmentPackageItem> items;

  /**
   * Custom attributes of package
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public ShipmentPackage(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "carrier", required = true) final String carrier,
      @JsonProperty(value = "tracking_number", required = true) final String trackingNumber,
      @JsonProperty(value = "tracking_link", required = true) final String trackingLink,
      @JsonProperty(value = "tracking_comment", required = false) final String trackingComment,
      @JsonProperty(value = "items", required = true) final List<ShipmentPackageItem> items,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.id = id;
    this.carrier = carrier;
    this.trackingNumber = trackingNumber;
    this.trackingLink = trackingLink;
    this.trackingComment = trackingComment;
    this.items = items;
    this.customAttributes = customAttributes;
  }
}
