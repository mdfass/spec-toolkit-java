package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Payment status
 */
public final class RefundPaymentStatus {
  /**
   * Status code
   */
  @JsonProperty(
      value = "code",
      required = false
  )
  public final String code;

  /**
   * Status name
   */
  @JsonProperty(
      value = "name",
      required = false
  )
  public final String name;

  @JsonCreator
  public RefundPaymentStatus(@JsonProperty(value = "code", required = false) final String code,
      @JsonProperty(value = "name", required = false) final String name) {
    this.code = code;
    this.name = name;
  }
}
