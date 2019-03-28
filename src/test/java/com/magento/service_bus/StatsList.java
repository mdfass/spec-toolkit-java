package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Stats list
 */
public final class StatsList {
  /**
   * Application stats list
   */
  public final List<AppMetrics> stats;

  @JsonCreator
  public StatsList(@JsonProperty(value = "stats", required = false) final List<AppMetrics> stats) {
    this.stats = stats;
  }
}
