package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.String;

/**
 * Source Configuration
 */
public final class SourceConfigurations {
  /**
   * If the source is active or not
   */
  @JsonProperty(
      value = "active",
      required = false
  )
  public final Boolean active;

  /**
   * Capabilities the source offers
   */
  @JsonProperty(
      value = "capabilities",
      required = false
  )
  public final SourceCapabilities capabilities;

  /**
   * Integration name
   */
  @JsonProperty(
      value = "integration_name",
      required = false
  )
  public final String integrationName;

  /**
   * Enable SFS capability for this source
   */
  @JsonProperty(
      value = "ship_from_store",
      required = false
  )
  public final Boolean shipFromStore;

  @JsonCreator
  public SourceConfigurations(
      @JsonProperty(value = "active", required = false) final Boolean active,
      @JsonProperty(value = "capabilities", required = false) final SourceCapabilities capabilities,
      @JsonProperty(value = "integration_name", required = false) final String integrationName,
      @JsonProperty(value = "ship_from_store", required = false) final Boolean shipFromStore) {
    this.active = active;
    this.capabilities = capabilities;
    this.integrationName = integrationName;
    this.shipFromStore = shipFromStore;
  }
}
