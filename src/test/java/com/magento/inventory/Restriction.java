package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * The Sources restricted to SKU for sourcing
 * Source Restriction by SKU
 */
public final class Restriction {
  /**
   * The sku of the product
   */
  public final String sku;

  /**
   * Array of sources IDs to restrict the sourcing for the sku
   */
  public final List<String> onlyInSource;

  @JsonCreator
  public Restriction(@JsonProperty(value = "sku", required = true) final String sku,
      @JsonProperty(value = "only_in_source", required = false) final List<String> onlyInSource) {
    this.sku = sku;
    this.onlyInSource = onlyInSource;
  }
}
