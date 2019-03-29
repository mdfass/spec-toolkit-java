package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 *
 *                 Quantity of items from a given Sku that will be reserved
 *             
 * Sku and Quantity
 */
public final class ReservationLine {
  /**
   * The sku of the product
   */
  @JsonProperty(
      value = "sku",
      required = true
  )
  public final String sku;

  /**
   * Quantity of items to reserve
   */
  @JsonProperty(
      value = "quantity",
      required = true
  )
  public final Integer quantity;

  @JsonCreator
  public ReservationLine(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity) {
    this.sku = sku;
    this.quantity = quantity;
  }
}
