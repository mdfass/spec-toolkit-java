package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import com.magento.common.Price;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Item details
 */
public final class Item {
  /**
   * ID of the order line
   */
  @JsonProperty(
      value = "order_line_id",
      required = true
  )
  public final String orderLineId;

  /**
   * Order line Number
   */
  @JsonProperty(
      value = "order_line_number",
      required = true
  )
  public final Integer orderLineNumber;

  /**
   * Item type (physical, service, shipping)
   */
  @JsonProperty(
      value = "item_type",
      required = false
  )
  public final String itemType;

  /**
   * Item sku
   */
  @JsonProperty(
      value = "sku",
      required = false
  )
  public final String sku;

  /**
   * Item name
   */
  @JsonProperty(
      value = "name",
      required = false
  )
  public final String name;

  /**
   *
   *                         Note that this custom details cannot be updated with lines_change_status messages
   *                     
   * Custom details with relevant item information
   */
  @JsonProperty(
      value = "custom_details",
      required = false
  )
  public final List<CustomAttribute> customDetails;

  /**
   * Item image URL
   */
  @JsonProperty(
      value = "image_url",
      required = false
  )
  public final String imageUrl;

  /**
   * Product page URL
   */
  @JsonProperty(
      value = "product_url",
      required = false
  )
  public final String productUrl;

  /**
   * Line price information
   */
  @JsonProperty(
      value = "order_line_price",
      required = false
  )
  public final Price orderLinePrice;

  /**
   * Line promotion information
   */
  @JsonProperty(
      value = "order_line_promotions_info",
      required = false
  )
  public final OrderLinePromotionInformation orderLinePromotionsInfo;

  /**
   * For services like giftwrap or engraving to relate to another line
   */
  @JsonProperty(
      value = "parent_order_line_number",
      required = false
  )
  public final Integer parentOrderLineNumber;

  /**
   * Status for the specified line
   */
  @JsonProperty(
      value = "status",
      required = false
  )
  public final String status;

  /**
   * Current status reason
   */
  @JsonProperty(
      value = "status_reason",
      required = false
  )
  public final String statusReason;

  /**
   * Date of the status change
   */
  @JsonProperty(
      value = "status_date",
      required = false
  )
  public final ZonedDateTime statusDate;

  @JsonCreator
  public Item(@JsonProperty(value = "order_line_id", required = true) final String orderLineId,
      @JsonProperty(value = "order_line_number", required = true) final Integer orderLineNumber,
      @JsonProperty(value = "item_type", required = false) final String itemType,
      @JsonProperty(value = "sku", required = false) final String sku,
      @JsonProperty(value = "name", required = false) final String name,
      @JsonProperty(value = "custom_details", required = false) final List<CustomAttribute> customDetails,
      @JsonProperty(value = "image_url", required = false) final String imageUrl,
      @JsonProperty(value = "product_url", required = false) final String productUrl,
      @JsonProperty(value = "order_line_price", required = false) final Price orderLinePrice,
      @JsonProperty(value = "order_line_promotions_info", required = false) final OrderLinePromotionInformation orderLinePromotionsInfo,
      @JsonProperty(value = "parent_order_line_number", required = false) final Integer parentOrderLineNumber,
      @JsonProperty(value = "status", required = false) final String status,
      @JsonProperty(value = "status_reason", required = false) final String statusReason,
      @JsonProperty(value = "status_date", required = false) final ZonedDateTime statusDate) {
    this.orderLineId = orderLineId;
    this.orderLineNumber = orderLineNumber;
    this.itemType = itemType;
    this.sku = sku;
    this.name = name;
    this.customDetails = customDetails;
    this.imageUrl = imageUrl;
    this.productUrl = productUrl;
    this.orderLinePrice = orderLinePrice;
    this.orderLinePromotionsInfo = orderLinePromotionsInfo;
    this.parentOrderLineNumber = parentOrderLineNumber;
    this.status = status;
    this.statusReason = statusReason;
    this.statusDate = statusDate;
  }
}
