package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;

/**
 * A specific status update made during the processing of a sourcing request
 */
public final class SourcingStatusEntry {
  /**
   * The time when the entry was made
   */
  public final LocalDateTime timestamp;

  /**
   *
   *                         An enumerated status entry - indicating the processing step involved.
   *                         This value is tied closely to the structure of Sorcerer and may not
   *                         be valuable externally (see 'state').
   *                     
   *
   *                         The status name/monikier
   *                     
   */
  public final String statusMoniker;

  /**
   *
   *                         An enumerated "external" state associated with this entry.
   *                         This a state value that's more understandable to the "outside" world.
   *                         One of the following values: RECEIVED, QUEUED, CANCELLED, PROCESSING,
   *                         RESPONDED, ERROR, UNKNOWN
   *                     
   *
   *                         The external state
   *                     
   */
  public final String state;

  /**
   * The entry type
   */
  public final String type;

  @JsonCreator
  public SourcingStatusEntry(
      @JsonProperty(value = "timestamp", required = true) final LocalDateTime timestamp,
      @JsonProperty(value = "status_moniker", required = false) final String statusMoniker,
      @JsonProperty(value = "state", required = false) final String state,
      @JsonProperty(value = "type", required = false) final String type) {
    this.timestamp = timestamp;
    this.statusMoniker = statusMoniker;
    this.state = state;
    this.type = type;
  }
}
