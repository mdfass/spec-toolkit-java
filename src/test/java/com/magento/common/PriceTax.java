package com.magento.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Taxes
 */
public final class PriceTax {
  /**
   * Type of the tax
   */
  public final String type;

  /**
   * Amount of tax
   */
  public final Integer amount;

  /**
   * Tax rate applied
   */
  public final Integer rate;

  @JsonCreator
  public PriceTax(@JsonProperty(value = "type", required = true) final String type,
      @JsonProperty(value = "amount", required = true) final Integer amount,
      @JsonProperty(value = "rate", required = true) final Integer rate) {
    this.type = type;
    this.amount = amount;
    this.rate = rate;
  }
}
