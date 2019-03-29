package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 *
 *                 Quantity of items from a given Sku that will be allocated
 *             
 * Sku and Quantity
 */
public final class AllocationLine {
  /**
   * The sku of the product
   */
  @JsonProperty(
      value = "sku",
      required = true
  )
  public final String sku;

  /**
   * Quantity of items to allocate
   */
  @JsonProperty(
      value = "quantity",
      required = true
  )
  public final Integer quantity;

  /**
   * Reason of item to allocate
   */
  @JsonProperty(
      value = "reason",
      required = true
  )
  public final String reason;

  @JsonCreator
  public AllocationLine(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "reason", required = true) final String reason) {
    this.sku = sku;
    this.quantity = quantity;
    this.reason = reason;
  }
}
