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
  public final String value;

  /**
   * Channel
   */
  public final String channel;

  /**
   * Locale
   */
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
