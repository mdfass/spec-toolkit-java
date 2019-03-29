package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.ZonedDateTime;

/**
 * A specific status update made during the processing of a sourcing request
 */
public final class SourcingStatusEntry {
  /**
   * The time when the entry was made
   */
  @JsonProperty(
      value = "timestamp",
      required = true
  )
  public final ZonedDateTime timestamp;

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
  @JsonProperty(
      value = "status_moniker",
      required = false
  )
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
  @JsonProperty(
      value = "state",
      required = false
  )
  public final String state;

  /**
   * The entry type
   */
  @JsonProperty(
      value = "type",
      required = false
  )
  public final String type;

  @JsonCreator
  public SourcingStatusEntry(
      @JsonProperty(value = "timestamp", required = true) final ZonedDateTime timestamp,
      @JsonProperty(value = "status_moniker", required = false) final String statusMoniker,
      @JsonProperty(value = "state", required = false) final String state,
      @JsonProperty(value = "type", required = false) final String type) {
    this.timestamp = timestamp;
    this.statusMoniker = statusMoniker;
    this.state = state;
    this.type = type;
  }
}
