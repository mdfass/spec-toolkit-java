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
  public final String costGross;

  /**
   * Cost Net
   */
  public final String costNet;

  /**
   * Cost Vat
   */
  public final String costVat;

  /**
   * Vat Rate
   */
  public final String vatRate;

  /**
   * Vat detail
   */
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
