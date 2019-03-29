package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * Configure how this wave should be executed
 */
public final class WaveExecutionRequest {
  /**
   *
   *                         This allows for overriding the time the wave appears to be occurring for SRCRR.
   *                         That is, it doesn't change or schedule the wave to be ran at a different time,
   *                         instead srcrr uses this time when determining which sources are active (regardless of the actual time)
   *
   *                         If not provided, the current time is used.
   *                     
   * overrides the time the wave appears to be executing
   */
  @JsonProperty(
      value = "execution_time",
      required = false
  )
  public final String executionTime;

  /**
   * Overrides config from config-api and enables all sources (less blacklisted ones)
   * Enables all sources
   */
  @JsonProperty(
      value = "enable_all_sources",
      required = false
  )
  public final Boolean enableAllSources;

  /**
   * Source ids that should be included regardless of their configuration
   */
  @JsonProperty(
      value = "included_source_ids",
      required = false
  )
  public final List<String> includedSourceIds;

  /**
   * source ids that should be excluded (this takes priority over all other configuration)
   * Source ids to exclude
   */
  @JsonProperty(
      value = "excluded_source_ids",
      required = false
  )
  public final List<String> excludedSourceIds;

  @JsonCreator
  public WaveExecutionRequest(
      @JsonProperty(value = "execution_time", required = false) final String executionTime,
      @JsonProperty(value = "enable_all_sources", required = false) final Boolean enableAllSources,
      @JsonProperty(value = "included_source_ids", required = false) final List<String> includedSourceIds,
      @JsonProperty(value = "excluded_source_ids", required = false) final List<String> excludedSourceIds) {
    this.executionTime = executionTime;
    this.enableAllSources = enableAllSources;
    this.includedSourceIds = includedSourceIds;
    this.excludedSourceIds = excludedSourceIds;
  }
}
