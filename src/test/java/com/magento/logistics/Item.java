package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import com.magento.common.Price;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Item details
 */
public final class Item {
  /**
   * ID of the order line
   */
  public final String orderLineId;

  /**
   * Order line Number
   */
  public final Integer orderLineNumber;

  /**
   * Item type (physical, service, shipping)
   */
  public final String itemType;

  /**
   * Item sku
   */
  public final String sku;

  /**
   * Item name
   */
  public final String name;

  /**
   *
   *                         Note that this custom details cannot be updated with lines_change_status messages
   *                     
   * Custom details with relevant item information
   */
  public final List<CustomAttribute> customDetails;

  /**
   * Item image URL
   */
  public final String imageUrl;

  /**
   * Product page URL
   */
  public final String productUrl;

  /**
   * Line price information
   */
  public final Price orderLinePrice;

  /**
   * Line promotion information
   */
  public final OrderLinePromotionInformation orderLinePromotionsInfo;

  /**
   * For services like giftwrap or engraving to relate to another line
   */
  public final Integer parentOrderLineNumber;

  /**
   * Status for the specified line
   */
  public final String status;

  /**
   * Current status reason
   */
  public final String statusReason;

  /**
   * Date of the status change
   */
  public final LocalDateTime statusDate;

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
      @JsonProperty(value = "status_date", required = false) final LocalDateTime statusDate) {
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
