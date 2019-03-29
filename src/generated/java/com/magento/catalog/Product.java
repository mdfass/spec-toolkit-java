package com.magento.catalog;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.magento.common.CustomAttribute;
import java.lang.Boolean;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 *
 *                 Product represents the simplest physical or virtual item which can be bought by the customer.
 *                 Product data normally includes a few static fields and a batch of dynamically managed attributes to
 *                 store system information (e.g. is_searchable, ean, country_of_origin etc) and information shown
 *                 to the customer (e.g. long_description, color, or ssd_storage_size etc).
 *             
 * Product
 */
public final class Product {
  /**
   * Unique Identifier
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Type of product (Simple, Configurable, Virtual...)
   */
  @JsonProperty(
      value = "type",
      required = true
  )
  public final ProductType type;

  /**
   * Stock Keeping Unit of the product
   */
  @JsonProperty(
      value = "sku",
      required = true
  )
  public final String sku;

  /**
   * Sets the price as adjustable
   */
  @JsonProperty(
      value = "price_adjustable",
      required = false
  )
  public final Boolean priceAdjustable;

  /**
   *
   *                         Name of the product meant to identify the product in a more human friendly way
   *
   *                         Example:
   *
   *                         ```
   *                         "name": [
   *                             {"locale": "en_US", "channel": "mobile", "value": "T-Shirt"},
   *                             {"locale": "es_ES", "channel": "mobile", "value": "Camiseta"}
   *                         ]
   *                         ```
   *                     
   * Name of the product
   */
  @JsonProperty(
      value = "name",
      required = false
  )
  public final List<LocalizedName> name;

  /**
   *
   *                         Standard prices of the product.
   *                     
   * Price of the product
   */
  @JsonProperty(
      value = "price",
      required = false
  )
  public final ProductPrice price;

  /**
   *
   *                         The status is only used for the purpose of defining the safety stock at the aggregate level. Each status can have a different safety threshold. Important: the statuses needs to be provided in uppercase.
   *                     
   * Status of the product (ACTIVE, INACTIVE, EOL, OUTLET)
   */
  @JsonProperty(
      value = "status",
      required = true
  )
  public final String status;

  /**
   * Date of creation of the product
   */
  @JsonProperty(
      value = "created_at",
      required = false
  )
  public final ZonedDateTime createdAt;

  /**
   * Date of the last modification of the product
   */
  @JsonProperty(
      value = "modified_at",
      required = false
  )
  public final ZonedDateTime modifiedAt;

  /**
   *
   *                         An array of products skus corresponding to this product configurations (children)
   *                     
   * If this is a configurable product a list of children (products) skus
   */
  @JsonProperty(
      value = "children_skus",
      required = false
  )
  public final List<String> childrenSkus;

  /**
   * Custom Attributes
   */
  @JsonProperty(
      value = "custom_attributes",
      required = false
  )
  public final List<CustomAttribute> customAttributes;

  @JsonCreator
  public Product(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "type", required = true) final ProductType type,
      @JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "price_adjustable", required = false) final Boolean priceAdjustable,
      @JsonProperty(value = "name", required = false) final List<LocalizedName> name,
      @JsonProperty(value = "price", required = false) final ProductPrice price,
      @JsonProperty(value = "status", required = true) final String status,
      @JsonProperty(value = "created_at", required = false) final ZonedDateTime createdAt,
      @JsonProperty(value = "modified_at", required = false) final ZonedDateTime modifiedAt,
      @JsonProperty(value = "children_skus", required = false) final List<String> childrenSkus,
      @JsonProperty(value = "custom_attributes", required = false) final List<CustomAttribute> customAttributes) {
    this.id = id;
    this.type = type;
    this.sku = sku;
    this.priceAdjustable = priceAdjustable;
    this.name = name;
    this.price = price;
    this.status = status;
    this.createdAt = createdAt;
    this.modifiedAt = modifiedAt;
    this.childrenSkus = childrenSkus;
    this.customAttributes = customAttributes;
  }
}
