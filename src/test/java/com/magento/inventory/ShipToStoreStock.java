package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 *
 *                 Ship to Store stock
 *             
 * Ship To Store stock
 */
public final class ShipToStoreStock {
  /**
   * SKU
   */
  public final String sku;

  /**
   * Stock of the pickup location
   */
  public final SourceQuantity inLocation;

  /**
   * List of available stocks in other sources
   */
  public final List<SourceQuantity> canProvide;

  @JsonCreator
  public ShipToStoreStock(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "in_location", required = true) final SourceQuantity inLocation,
      @JsonProperty(value = "can_provide", required = true) final List<SourceQuantity> canProvide) {
    this.sku = sku;
    this.inLocation = inLocation;
    this.canProvide = canProvide;
  }
}
