package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Pair of SKU and Quantity
 * An entry in source adjustment
 */
public final class SourceAdjustmentSku {
  /**
   * SKU
   */
  public final String sku;

  /**
   *
   *                         You can increase it (e.g. 5) or decrease it by adding a minus before
   *                         the number (e.g. -5)
   *                     
   * Quantity that that is being adjusting by.
   */
  public final Integer quantity;

  @JsonCreator
  public SourceAdjustmentSku(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity) {
    this.sku = sku;
    this.quantity = quantity;
  }
}
