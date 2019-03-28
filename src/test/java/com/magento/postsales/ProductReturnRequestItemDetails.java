package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Details of product return request items
 */
public final class ProductReturnRequestItemDetails {
  /**
   * Code of the reason
   */
  public final String reason;

  /**
   * Description of the reason
   */
  public final String reasonDescription;

  /**
   * SKU of the item
   */
  public final String sku;

  /**
   * Client SKU of the item
   */
  public final String clientSku;

  /**
   * Name of the selected option
   */
  public final String optionName;

  @JsonCreator
  public ProductReturnRequestItemDetails(
      @JsonProperty(value = "reason", required = true) final String reason,
      @JsonProperty(value = "reason_description", required = true) final String reasonDescription,
      @JsonProperty(value = "sku", required = false) final String sku,
      @JsonProperty(value = "client_sku", required = false) final String clientSku,
      @JsonProperty(value = "option_name", required = false) final String optionName) {
    this.reason = reason;
    this.reasonDescription = reasonDescription;
    this.sku = sku;
    this.clientSku = clientSku;
    this.optionName = optionName;
  }
}
