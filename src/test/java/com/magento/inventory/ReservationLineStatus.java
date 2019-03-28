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
public final class ReservationLineStatus {
  /**
   * The sku of the product
   */
  public final String sku;

  /**
   * Quantity of items reserved
   */
  public final Integer quantity;

  /**
   * Indicator of stock availablility at the moment of the reservation
   */
  public final Boolean inStock;

  @JsonCreator
  public ReservationLineStatus(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "in_stock", required = true) final Boolean inStock) {
    this.sku = sku;
    this.quantity = quantity;
    this.inStock = inStock;
  }
}
