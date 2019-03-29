package com.magento.catalog;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Name for particular channel and locale
 * Localized name
 */
public final class LocalizedName {
  /**
   * Name
   */
  @JsonProperty(
      value = "value",
      required = true
  )
  public final String value;

  /**
   * Channel
   */
  @JsonProperty(
      value = "channel",
      required = false
  )
  public final String channel;

  /**
   * Locale
   */
  @JsonProperty(
      value = "locale",
      required = false
  )
  public final String locale;

  @JsonCreator
  public LocalizedName(@JsonProperty(value = "value", required = true) final String value,
      @JsonProperty(value = "channel", required = false) final String channel,
      @JsonProperty(value = "locale", required = false) final String locale) {
    this.value = value;
    this.channel = channel;
    this.locale = locale;
  }
}
