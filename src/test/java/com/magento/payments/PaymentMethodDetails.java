package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Payment Specific Information
 */
public final class PaymentMethodDetails {
  /**
   * Payment method
   */
  public final String method;

  /**
   * Payment submethod
   */
  public final String submethod;

  /**
   * Card Details Information
   */
  public final PaymentCardDetails card;

  /**
   * Bank Details Information
   */
  public final PaymentBankDetails bank;

  @JsonCreator
  public PaymentMethodDetails(@JsonProperty(value = "method", required = true) final String method,
      @JsonProperty(value = "submethod", required = true) final String submethod,
      @JsonProperty(value = "card", required = false) final PaymentCardDetails card,
      @JsonProperty(value = "bank", required = false) final PaymentBankDetails bank) {
    this.method = method;
    this.submethod = submethod;
    this.card = card;
    this.bank = bank;
  }
}
