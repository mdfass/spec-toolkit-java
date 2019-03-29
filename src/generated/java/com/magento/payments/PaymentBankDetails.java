package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;

/**
 * Payment Bank details
 */
public final class PaymentBankDetails {
  /**
   * Account holder name
   */
  @JsonProperty(
      value = "account_holder_name",
      required = false
  )
  public final String accountHolderName;

  /**
   * IBAN (International Bank Account Number)
   */
  @JsonProperty(
      value = "iban",
      required = false
  )
  public final String iban;

  /**
   * Security indicator
   */
  @JsonProperty(
      value = "security_indicator",
      required = false
  )
  public final Integer securityIndicator;

  @JsonCreator
  public PaymentBankDetails(
      @JsonProperty(value = "account_holder_name", required = false) final String accountHolderName,
      @JsonProperty(value = "iban", required = false) final String iban,
      @JsonProperty(value = "security_indicator", required = false) final Integer securityIndicator) {
    this.accountHolderName = accountHolderName;
    this.iban = iban;
    this.securityIndicator = securityIndicator;
  }
}
