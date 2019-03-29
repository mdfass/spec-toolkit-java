package com.magento.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
 * Pricing information of the line
 */
public final class Price {
  /**
   * Net amount of the line
   */
  @JsonProperty(
      value = "net_amount",
      required = true
  )
  public final Integer netAmount;

  /**
   * Gross amount of the line
   */
  @JsonProperty(
      value = "gross_amount",
      required = true
  )
  public final Integer grossAmount;

  /**
   * Total tax amount of the line
   */
  @JsonProperty(
      value = "tax_amount",
      required = true
  )
  public final Integer taxAmount;

  /**
   * Total tax rate
   */
  @JsonProperty(
      value = "tax_rate",
      required = true
  )
  public final Integer taxRate;

  /**
   * Detailed list of taxes applied to the line
   */
  @JsonProperty(
      value = "taxes",
      required = true
  )
  public final List<PriceTax> taxes;

  /**
   * Currency of the amount of the line
   */
  @JsonProperty(
      value = "currency",
      required = true
  )
  public final String currency;

  @JsonCreator
  public Price(@JsonProperty(value = "net_amount", required = true) final Integer netAmount,
      @JsonProperty(value = "gross_amount", required = true) final Integer grossAmount,
      @JsonProperty(value = "tax_amount", required = true) final Integer taxAmount,
      @JsonProperty(value = "tax_rate", required = true) final Integer taxRate,
      @JsonProperty(value = "taxes", required = true) final List<PriceTax> taxes,
      @JsonProperty(value = "currency", required = true) final String currency) {
    this.netAmount = netAmount;
    this.grossAmount = grossAmount;
    this.taxAmount = taxAmount;
    this.taxRate = taxRate;
    this.taxes = taxes;
    this.currency = currency;
  }
}
