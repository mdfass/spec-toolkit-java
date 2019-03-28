package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

/**
 *
 *                 Information about the existence or not of stock for a given quantity of a given Sku
 *             
 * Sku, Quantity and stock information
 */
public final class AllocationLineStatus {
  /**
   * The sku of the product
   */
  public final String sku;

  /**
   * Quantity of items
   */
  public final Integer quantity;

  /**
   * Stock status for the given quantity of the given Sku
   */
  public final Boolean inStock;

  @JsonCreator
  public AllocationLineStatus(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "in_stock", required = true) final Boolean inStock) {
    this.sku = sku;
    this.quantity = quantity;
    this.inStock = inStock;
  }
}
