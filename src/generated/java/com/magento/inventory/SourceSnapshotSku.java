package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

/**
 * Pair of SKU and Quantity
 * An entry in source snapshot
 */
public final class SourceSnapshotSku {
  /**
   * SKU
   */
  @JsonProperty(
      value = "sku",
      required = true
  )
  public final String sku;

  /**
   * Quantity
   */
  @JsonProperty(
      value = "quantity",
      required = true
  )
  public final Integer quantity;

  /**
   * This sku has unlimited stock (quantity is ignored)
   */
  @JsonProperty(
      value = "unlimited",
      required = false
  )
  public final Boolean unlimited;

  @JsonCreator
  public SourceSnapshotSku(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "unlimited", required = false) final Boolean unlimited) {
    this.sku = sku;
    this.quantity = quantity;
    this.unlimited = unlimited;
  }
}
