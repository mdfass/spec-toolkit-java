package com.magento.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Payment Card details
 */
public final class PaymentCardDetails {
  /**
   * Card bin (Bank Identification Number)
   */
  @JsonProperty(
      value = "bin",
      required = false
  )
  public final String bin;

  /**
   * Last four digits of the credit card
   */
  @JsonProperty(
      value = "last_four_digits",
      required = false
  )
  public final String lastFourDigits;

  /**
   * Expiration year of the credit card
   */
  @JsonProperty(
      value = "expiration_year",
      required = false
  )
  public final String expirationYear;

  /**
   * Expiration month of the credit card
   */
  @JsonProperty(
      value = "expiration_month",
      required = false
  )
  public final String expirationMonth;

  /**
   * Authorization code of the transaction
   */
  @JsonProperty(
      value = "authorization_code",
      required = false
  )
  public final String authorizationCode;

  /**
   * Avs (Address Verification System) response code
   */
  @JsonProperty(
      value = "avs_response_code",
      required = false
  )
  public final String avsResponseCode;

  /**
   * Cvv (Card Verification Value) response code
   */
  @JsonProperty(
      value = "cvv_response_code",
      required = false
  )
  public final String cvvResponseCode;

  @JsonCreator
  public PaymentCardDetails(@JsonProperty(value = "bin", required = false) final String bin,
      @JsonProperty(value = "last_four_digits", required = false) final String lastFourDigits,
      @JsonProperty(value = "expiration_year", required = false) final String expirationYear,
      @JsonProperty(value = "expiration_month", required = false) final String expirationMonth,
      @JsonProperty(value = "authorization_code", required = false) final String authorizationCode,
      @JsonProperty(value = "avs_response_code", required = false) final String avsResponseCode,
      @JsonProperty(value = "cvv_response_code", required = false) final String cvvResponseCode) {
    this.bin = bin;
    this.lastFourDigits = lastFourDigits;
    this.expirationYear = expirationYear;
    this.expirationMonth = expirationMonth;
    this.authorizationCode = authorizationCode;
    this.avsResponseCode = avsResponseCode;
    this.cvvResponseCode = cvvResponseCode;
  }
}
