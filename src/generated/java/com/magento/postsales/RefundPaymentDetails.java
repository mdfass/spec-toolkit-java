package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Payment details
 */
public final class RefundPaymentDetails {
  /**
   * Cost Gross
   */
  @JsonProperty(
      value = "cost_gross",
      required = true
  )
  public final String costGross;

  /**
   * Cost Net
   */
  @JsonProperty(
      value = "cost_net",
      required = false
  )
  public final String costNet;

  /**
   * Cost Vat
   */
  @JsonProperty(
      value = "cost_vat",
      required = false
  )
  public final String costVat;

  /**
   * Vat Rate
   */
  @JsonProperty(
      value = "vat_rate",
      required = false
  )
  public final String vatRate;

  /**
   * Vat detail
   */
  @JsonProperty(
      value = "vat_detail",
      required = false
  )
  public final List<RefundPaymentVatDetail> vatDetail;

  @JsonCreator
  public RefundPaymentDetails(
      @JsonProperty(value = "cost_gross", required = true) final String costGross,
      @JsonProperty(value = "cost_net", required = false) final String costNet,
      @JsonProperty(value = "cost_vat", required = false) final String costVat,
      @JsonProperty(value = "vat_rate", required = false) final String vatRate,
      @JsonProperty(value = "vat_detail", required = false) final List<RefundPaymentVatDetail> vatDetail) {
    this.costGross = costGross;
    this.costNet = costNet;
    this.costVat = costVat;
    this.vatRate = vatRate;
    this.vatDetail = vatDetail;
  }
}
