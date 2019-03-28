package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

/**
 * Pair of SKU and Quantity
 * An entry in aggregate snapshot
 */
public final class AggregateSnapshotSku {
  /**
   * SKU
   */
  public final String sku;

  /**
   * Quantity
   */
  public final Integer quantity;

  /**
   * This sku has unlimited stock (quantity is ignored)
   */
  public final Boolean unlimited;

  /**
   * Inflight Backorders
   */
  public final Integer inflightBackorders;

  @JsonCreator
  public AggregateSnapshotSku(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "unlimited", required = false) final Boolean unlimited,
      @JsonProperty(value = "inflight_backorders", required = false) final Integer inflightBackorders) {
    this.sku = sku;
    this.quantity = quantity;
    this.unlimited = unlimited;
    this.inflightBackorders = inflightBackorders;
  }
}
