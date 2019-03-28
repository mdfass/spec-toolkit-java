package com.magento.service_bus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Discovery list
 */
public final class DiscoveryList {
  /**
   * Registered Endpoints
   */
  public final List<RemoteEndpoint> endpoints;

  @JsonCreator
  public DiscoveryList(
      @JsonProperty(value = "endpoints", required = false) final List<RemoteEndpoint> endpoints) {
    this.endpoints = endpoints;
  }
}
