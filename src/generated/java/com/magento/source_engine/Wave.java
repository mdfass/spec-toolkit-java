package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Entity representing wave
 */
public final class Wave {
  /**
   * id of the wave
   */
  @JsonProperty(
      value = "id",
      required = true
  )
  public final String id;

  /**
   * Date and time the sourcing requests of this wave started executing
   */
  @JsonProperty(
      value = "start_time",
      required = true
  )
  public final ZonedDateTime startTime;

  /**
   * Date and time the sourcing requests of this wave completed executing
   */
  @JsonProperty(
      value = "end_time",
      required = true
  )
  public final ZonedDateTime endTime;

  /**
   * A list of all the sourcing request ids contained within this wave
   */
  @JsonProperty(
      value = "sourcing_request_ids",
      required = true
  )
  public final List<String> sourcingRequestIds;

  @JsonCreator
  public Wave(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "start_time", required = true) final ZonedDateTime startTime,
      @JsonProperty(value = "end_time", required = true) final ZonedDateTime endTime,
      @JsonProperty(value = "sourcing_request_ids", required = true) final List<String> sourcingRequestIds) {
    this.id = id;
    this.startTime = startTime;
    this.endTime = endTime;
    this.sourcingRequestIds = sourcingRequestIds;
  }
}
