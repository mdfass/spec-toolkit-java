package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * An item in a pick-list
 */
public final class PickListItem {
  /**
   * Pick-list line number
   */
  public final Integer lineNumber;

  /**
   * SKU identifier of the item
   */
  public final String sku;

  /**
   * Item Option ID
   */
  public final String itemOptionId;

  /**
   * Pick-list item/sku status
   */
  public final String status;

  /**
   * Status reason selected, used mainly when declining the picking
   */
  public final String statusReason;

  /**
   * Name of the product
   */
  public final String productName;

  /**
   * Custom attributes with relevant item information
   */
  public final List<CustomAttribute> customAttributes;

  /**
   * Package information
   */
  public final Package packageJava;

  @JsonCreator
  public PickListItem(
      @JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "item_option_id", required = true) final String itemOptionId,
      @JsonProperty(value = "status", required = true) final String status,
      @JsonProperty(value = "status_reason", required = false) final String statusReason,
      @JsonProperty(value = "product_name", required = true) final String productName,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes,
      @JsonProperty(value = "package", required = false) final Package packageJava) {
    this.lineNumber = lineNumber;
    this.sku = sku;
    this.itemOptionId = itemOptionId;
    this.status = status;
    this.statusReason = statusReason;
    this.productName = productName;
    this.customAttributes = customAttributes;
    this.packageJava = packageJava;
  }
}
