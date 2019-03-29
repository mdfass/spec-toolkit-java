package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

/**
 *
 *                 Source and quantity
 *             
 * Source and quantity
 */
public final class SourceQuantity {
  /**
   * Quantity
   */
  @JsonProperty(
      value = "quantity",
      required = true
  )
  public final Integer quantity;

  /**
   * The identifier of the source node which owns the stock quantities
   */
  @JsonProperty(
      value = "source_id",
      required = true
  )
  public final String sourceId;

  /**
   * The name of the source which owns the stock quantities
   */
  @JsonProperty(
      value = "source_name",
      required = false
  )
  public final String sourceName;

  /**
   * This sku has unlimited stock (quantity is ignored)
   */
  @JsonProperty(
      value = "unlimited",
      required = false
  )
  public final Boolean unlimited;

  @JsonCreator
  public SourceQuantity(@JsonProperty(value = "quantity", required = true) final Integer quantity,
      @JsonProperty(value = "source_id", required = true) final String sourceId,
      @JsonProperty(value = "source_name", required = false) final String sourceName,
      @JsonProperty(value = "unlimited", required = false) final Boolean unlimited) {
    this.quantity = quantity;
    this.sourceId = sourceId;
    this.sourceName = sourceName;
    this.unlimited = unlimited;
  }
}
