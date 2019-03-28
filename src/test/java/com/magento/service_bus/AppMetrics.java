package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;

/**
 * Application and its associated metrics
 */
public final class AppMetrics {
  /**
   * Name of the application
   */
  public final String application;

  /**
   * Associated metrics
   */
  public final List<Metric> metrics;

  /**
   * Per method stats breakdown
   */
  public final List<MethodMetrics> methods;

  @JsonCreator
  public AppMetrics(@JsonProperty(value = "application", required = true) final String application,
      @JsonProperty(value = "metrics", required = true) final List<Metric> metrics,
      @JsonProperty(value = "methods", required = true) final List<MethodMetrics> methods) {
    this.application = application;
    this.metrics = metrics;
    this.methods = methods;
  }
}
