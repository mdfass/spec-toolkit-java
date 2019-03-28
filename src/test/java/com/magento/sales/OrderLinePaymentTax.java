package com.magento.sales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Taxes on the payment
 */
public final class OrderLinePaymentTax {
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
  public OrderLinePaymentTax(@JsonProperty(value = "type", required = true) final String type,
      @JsonProperty(value = "amount", required = true) final Integer amount,
      @JsonProperty(value = "rate", required = true) final Integer rate) {
    this.type = type;
    this.amount = amount;
    this.rate = rate;
  }
}
