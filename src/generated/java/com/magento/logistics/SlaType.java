package com.magento.logistics;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum SlaType {
  LATEST_PICK_TIME("latest_pick_time"),

  LATEST_PACK_TIME("latest_pack_time"),

  LATEST_SHIPPING_TIME("latest_shipping_time"),

  EARLIEST_PICK_TIME("earliest_pick_time");

  @JsonValue
  private String value;

  private SlaType(final String value) {
    this.value = value;
  }
}
