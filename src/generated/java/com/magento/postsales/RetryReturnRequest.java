package com.magento.postsales;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Retry a return request for all product items to be returned
 */
public final class RetryReturnRequest {
  /**
   * RMA code of the return (empty for blind returns)
   */
  @JsonProperty(
      value = "rma",
      required = true
  )
  public final String rma;

  @JsonCreator
  public RetryReturnRequest(@JsonProperty(value = "rma", required = true) final String rma) {
    this.rma = rma;
  }
}
