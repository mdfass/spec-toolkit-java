package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Details of product return items
 */
public final class ProductReturnItemDetails {
  /**
   * Code of the reason
   */
  public final String reason;

  /**
   * Description of the reason
   */
  public final String reasonDescription;

  /**
   * Condition of the item
   */
  public final String condition;

  @JsonCreator
  public ProductReturnItemDetails(
      @JsonProperty(value = "reason", required = true) final String reason,
      @JsonProperty(value = "reason_description", required = true) final String reasonDescription,
      @JsonProperty(value = "condition", required = false) final String condition) {
    this.reason = reason;
    this.reasonDescription = reasonDescription;
    this.condition = condition;
  }
}
