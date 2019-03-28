package com.magento.inventory;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum SnapshotMode {
  DELTA("DELTA"),

  FULL("FULL"),

  NONZERO("NONZERO");

  @JsonValue
  private String value;

  private SnapshotMode(final String value) {
    this.value = value;
  }
}
