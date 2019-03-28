package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * An endpoint
 */
public final class RemoteEndpoint {
  /**
   * Unique identifier
   */
  public final String id;

  /**
   * Endpoint Peer-to-Peer URL
   */
  public final String peerUrl;

  /**
   * URL for synchronous requests
   */
  public final String remoteUrl;

  /**
   * URL for asynchronous requests
   */
  public final String delegateUrl;

  /**
   * Implemented Service Contracts
   */
  public final List<String> contracts;

  /**
   * List of events the service is subscribed to
   */
  public final List<String> subscribes;

  /**
   * Additional labels
   */
  public final Map<String, String> labels;

  @JsonCreator
  public RemoteEndpoint(@JsonProperty(value = "id", required = false) final String id,
      @JsonProperty(value = "peer_url", required = false) final String peerUrl,
      @JsonProperty(value = "remote_url", required = false) final String remoteUrl,
      @JsonProperty(value = "delegate_url", required = false) final String delegateUrl,
      @JsonProperty(value = "contracts", required = false) final List<String> contracts,
      @JsonProperty(value = "subscribes", required = false) final List<String> subscribes,
      @JsonProperty(value = "labels", required = false) final Map<String, String> labels) {
    this.id = id;
    this.peerUrl = peerUrl;
    this.remoteUrl = remoteUrl;
    this.delegateUrl = delegateUrl;
    this.contracts = contracts;
    this.subscribes = subscribes;
    this.labels = labels;
  }
}
