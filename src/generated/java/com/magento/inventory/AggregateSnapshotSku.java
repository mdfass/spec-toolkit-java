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

  /**
   * Inflight Backorders
   */
  @JsonProperty(
      value = "inflight_backorders",
      required = false
  )
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
