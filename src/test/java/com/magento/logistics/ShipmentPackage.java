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
  public final String id;

  /**
   * Carrier who will deliver the package
   */
  public final String carrier;

  /**
   * Tracking number of the package
   */
  public final String trackingNumber;

  /**
   * Tracking link of the package
   */
  public final String trackingLink;

  /**
   * Tracking comment of the package
   */
  public final String trackingComment;

  /**
   * Items in the package
   */
  public final List<ShipmentPackageItem> items;

  /**
   * Custom attributes of package
   */
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public ShipmentPackage(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "carrier", required = false) final String carrier,
      @JsonProperty(value = "tracking_number", required = false) final String trackingNumber,
      @JsonProperty(value = "tracking_link", required = false) final String trackingLink,
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
