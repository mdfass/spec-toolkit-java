package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Specific method and its associated metrics
 */
public final class MethodMetrics {
  /**
   * Name of the method
   */
  @JsonProperty(
      value = "method",
      required = true
  )
  public final String method;

  /**
   * Associated metrics
   */
  @JsonProperty(
      value = "metrics",
      required = true
  )
  public final List<Metric> metrics;

  @JsonCreator
  public MethodMetrics(@JsonProperty(value = "method", required = true) final String method,
      @JsonProperty(value = "metrics", required = true) final List<Metric> metrics) {
    this.method = method;
    this.metrics = metrics;
  }
}
