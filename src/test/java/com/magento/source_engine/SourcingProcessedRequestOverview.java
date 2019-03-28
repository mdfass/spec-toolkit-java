package com.magento.source_engine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.time.LocalDateTime;

/**
 *
 *                 Contains abbreviated request information appropiate for an overview of
 *                 all the processed requests attached to a processed order.
 *             
 * Overview data on a processed request
 */
public final class SourcingProcessedRequestOverview {
  /**
   * Request UUID
   */
  public final String uuid;

  /**
   *
   *                       The current processing state of the request. One of the following values:
   *                       RECEIVED, QUEUED, CANCELLED, PROCESSING, RESPONDED, ERROR, UNKNOWN
   *                     
   * The state of the request
   */
  public final String state;

  /**
   * The date/time of request receipt
   */
  public final LocalDateTime receivedOn;

  @JsonCreator
  public SourcingProcessedRequestOverview(
      @JsonProperty(value = "uuid", required = true) final String uuid,
      @JsonProperty(value = "state", required = true) final String state,
      @JsonProperty(value = "received_on", required = true) final LocalDateTime receivedOn) {
    this.uuid = uuid;
    this.state = state;
    this.receivedOn = receivedOn;
  }
}
