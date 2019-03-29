package com.magento.catalog;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Price of a product including amount and currency
 * Price of a product including amount and currency
 */
public final class ProductPrice {
  /**
   * Currency
   */
  @JsonProperty(
      value = "currency",
      required = true
  )
  public final String currency;

  /**
   * Price amount
   */
  @JsonProperty(
      value = "amount",
      required = true
  )
  public final Integer amount;

  @JsonCreator
  public ProductPrice(@JsonProperty(value = "currency", required = true) final String currency,
      @JsonProperty(value = "amount", required = true) final Integer amount) {
    this.currency = currency;
    this.amount = amount;
  }
}
