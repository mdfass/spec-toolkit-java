package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Entity representing wave
 */
public final class Wave {
  /**
   * id of the wave
   */
  public final String id;

  /**
   * Date and time the sourcing requests of this wave started executing
   */
  public final LocalDateTime startTime;

  /**
   * Date and time the sourcing requests of this wave completed executing
   */
  public final LocalDateTime endTime;

  /**
   * A list of all the sourcing request ids contained within this wave
   */
  public final List<String> sourcingRequestIds;

  @JsonCreator
  public Wave(@JsonProperty(value = "id", required = true) final String id,
      @JsonProperty(value = "start_time", required = true) final LocalDateTime startTime,
      @JsonProperty(value = "end_time", required = true) final LocalDateTime endTime,
      @JsonProperty(value = "sourcing_request_ids", required = true) final List<String> sourcingRequestIds) {
    this.id = id;
    this.startTime = startTime;
    this.endTime = endTime;
    this.sourcingRequestIds = sourcingRequestIds;
  }
}
