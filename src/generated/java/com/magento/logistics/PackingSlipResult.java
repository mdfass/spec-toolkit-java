package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Packing slip
 */
public final class PackingSlipResult {
  /**
   * Url of the generated document
   */
  @JsonProperty(
      value = "url",
      required = true
  )
  public final String url;

  @JsonCreator
  public PackingSlipResult(@JsonProperty(value = "url", required = true) final String url) {
    this.url = url;
  }
}
