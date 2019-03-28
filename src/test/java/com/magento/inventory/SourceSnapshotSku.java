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
   * Quantity of reserved stock in the source
   */
  public final Integer inflight;

  @JsonCreator
  public SourceSnapshotSku(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "unlimited", required = false) final Boolean unlimited,
      @JsonProperty(value = "inflight", required = false) final Integer inflight) {
    this.sku = sku;
    this.quantity = quantity;
    this.unlimited = unlimited;
    this.inflight = inflight;
  }
}
