package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import com.magento.common.Price;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Line of an order
 */
public final class OrderLine {
  /**
   * Identifier of the line
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Number of the line in sequential order
   */
  @JsonProperty(
      value = "line_number",
      required = true
  )
  public final Integer lineNumber;

  /**
   * Number of the original line to which it refers to
   */
  @JsonProperty(
      value = "original_line_number",
      required = false
  )
  public final Integer originalLineNumber;

  /**
   * Type of the product
   */
  @JsonProperty(
      value = "product_type",
      required = true
  )
  public final String productType;

  /**
   * SKU identifier of the item
   */
  @JsonProperty(
      value = "sku",
      required = true
  )
  public final String sku;

  /**
   * Quantity of similar lines of the order
   */
  @JsonProperty(
      value = "quantity",
      required = false
  )
  public final Integer quantity;

  /**
   * Name of the product
   */
  @JsonProperty(
      value = "product_name",
      required = false
  )
  public final String productName;

  /**
   * Link to the parent line for bundles and services
   */
  @JsonProperty(
      value = "parent_line_id",
      required = false
  )
  public final String parentLineId;

  /**
   * Parent line number
   */
  @JsonProperty(
      value = "parent_line_number",
      required = false
  )
  public final Integer parentLineNumber;

  /**
   * Points to shipping item line number only for shippable items
   * Link to shipping line item
   */
  @JsonProperty(
      value = "shipping_line_number",
      required = false
  )
  public final Integer shippingLineNumber;

  /**
   * URL of the image associated to the product
   */
  @JsonProperty(
      value = "image_url",
      required = false
  )
  public final String imageUrl;

  /**
   * URL of the product
   */
  @JsonProperty(
      value = "product_url",
      required = false
  )
  public final String productUrl;

  /**
   * [*deprecated*]
   */
  @JsonProperty(
      value = "source_id",
      required = false
  )
  public final String sourceId;

  /**
   * Reference of the address where the product will be sent
   */
  @JsonProperty(
      value = "shipping_address_reference",
      required = true
  )
  public final String shippingAddressReference;

  /**
   * Identifier of the associated payment for the item
   */
  @JsonProperty(
      value = "payment_reference",
      required = true
  )
  public final String paymentReference;

  /**
   * Expected date an item will be available
   */
  @JsonProperty(
      value = "pre_order_street_date",
      required = false
  )
  public final ZonedDateTime preOrderStreetDate;

  /**
   * Pricing information of the line
   */
  @JsonProperty(
      value = "amount",
      required = true
  )
  public final Price amount;

  /**
   * Payment information of the line
   */
  @JsonProperty(
      value = "payments",
      required = false
  )
  public final List<OrderLinePayment> payments;

  /**
   * Status of the line
   */
  @JsonProperty(
      value = "status",
      required = false
  )
  public final String status;

  /**
   * Status reason of the line
   */
  @JsonProperty(
      value = "status_reason",
      required = false
  )
  public final String statusReason;

  /**
   * When the status changed for the order line
   */
  @JsonProperty(
      value = "status_date",
      required = false
  )
  public final ZonedDateTime statusDate;

  /**
   * The promised date to deliver item
   */
  @JsonProperty(
      value = "promise_delivery_date",
      required = false
  )
  public final ZonedDateTime promiseDeliveryDate;

  /**
   * Define if price review is mandatory or not
   */
  @JsonProperty(
      value = "mandatory_price_review",
      required = false
  )
  public final Boolean mandatoryPriceReview;

  /**
   * Information about promotions
   */
  @JsonProperty(
      value = "promotions_info",
      required = false
  )
  public final OrderLinePromotionInformation promotionsInfo;

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
   * Number of total successful source allocations. Each time a line is resourced this number will increase
   * Number of total successful source allocations
   */
  @JsonProperty(
      value = "total_source_allocations",
      required = false
  )
  public final Integer totalSourceAllocations;

  @JsonCreator
  public OrderLine(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "line_number", required = true) final Integer lineNumber,
      @JsonProperty(value = "original_line_number", required = false) final Integer originalLineNumber,
      @JsonProperty(value = "product_type", required = true) final String productType,
      @JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = false) final Integer quantity,
      @JsonProperty(value = "product_name", required = false) final String productName,
      @JsonProperty(value = "parent_line_id", required = false) final String parentLineId,
      @JsonProperty(value = "parent_line_number", required = false) final Integer parentLineNumber,
      @JsonProperty(value = "shipping_line_number", required = false) final Integer shippingLineNumber,
      @JsonProperty(value = "image_url", required = false) final String imageUrl,
      @JsonProperty(value = "product_url", required = false) final String productUrl,
      @JsonProperty(value = "source_id", required = false) final String sourceId,
      @JsonProperty(value = "shipping_address_reference", required = true) final String shippingAddressReference,
      @JsonProperty(value = "payment_reference", required = true) final String paymentReference,
      @JsonProperty(value = "pre_order_street_date", required = false) final ZonedDateTime preOrderStreetDate,
      @JsonProperty(value = "amount", required = true) final Price amount,
      @JsonProperty(value = "payments", required = false) final List<OrderLinePayment> payments,
      @JsonProperty(value = "status", required = false) final String status,
      @JsonProperty(value = "status_reason", required = false) final String statusReason,
      @JsonProperty(value = "status_date", required = false) final ZonedDateTime statusDate,
      @JsonProperty(value = "promise_delivery_date", required = false) final ZonedDateTime promiseDeliveryDate,
      @JsonProperty(value = "mandatory_price_review", required = false) final Boolean mandatoryPriceReview,
      @JsonProperty(value = "promotions_info", required = false) final OrderLinePromotionInformation promotionsInfo,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes,
      @JsonProperty(value = "source_location", required = false) final String sourceLocation,
      @JsonProperty(value = "pickup_location", required = false) final String pickupLocation,
      @JsonProperty(value = "total_source_allocations", required = false) final Integer totalSourceAllocations) {
    this.id = id;
    this.lineNumber = lineNumber;
    this.originalLineNumber = originalLineNumber;
    this.productType = productType;
    this.sku = sku;
    this.quantity = quantity;
    this.productName = productName;
    this.parentLineId = parentLineId;
    this.parentLineNumber = parentLineNumber;
    this.shippingLineNumber = shippingLineNumber;
    this.imageUrl = imageUrl;
    this.productUrl = productUrl;
    this.sourceId = sourceId;
    this.shippingAddressReference = shippingAddressReference;
    this.paymentReference = paymentReference;
    this.preOrderStreetDate = preOrderStreetDate;
    this.amount = amount;
    this.payments = payments;
    this.status = status;
    this.statusReason = statusReason;
    this.statusDate = statusDate;
    this.promiseDeliveryDate = promiseDeliveryDate;
    this.mandatoryPriceReview = mandatoryPriceReview;
    this.promotionsInfo = promotionsInfo;
    this.customAttributes = customAttributes;
    this.sourceLocation = sourceLocation;
    this.pickupLocation = pickupLocation;
    this.totalSourceAllocations = totalSourceAllocations;
  }
}
