package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Payment VAT detail
 */
public final class RefundPaymentVatDetail {
  /**
   * Vat type
   */
  public final String type;

  /**
   * Vat amount
   */
  public final String amount;

  /**
   * Vat rate
   */
  public final String rate;

  @JsonCreator
  public RefundPaymentVatDetail(@JsonProperty(value = "type", required = false) final String type,
      @JsonProperty(value = "amount", required = false) final String amount,
      @JsonProperty(value = "rate", required = false) final String rate) {
    this.type = type;
    this.amount = amount;
    this.rate = rate;
  }
}
