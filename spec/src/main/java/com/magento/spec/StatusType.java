package com.magento.spec;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum StatusType {

  PUBLIC("public"), PRIVATE("private"), DRAFT("draft"), BETA("beta"), DEPRECATED("deprecated");

  public String value;

  private StatusType(final String value) {
    this.value = value;
  }

  private static final Map<String, StatusType> ENUM_MAP;

  // Build an immutable map of String name to enum pairs.
  // Any Map impl can be used.

  static {
    Map<String, StatusType> map = new ConcurrentHashMap<>();
    for (StatusType instance : StatusType.values()) {
      map.put(instance.value, instance);
    }
    ENUM_MAP = Collections.unmodifiableMap(map);
  }

  public static StatusType get(String name) {
    return ENUM_MAP.get(name);
  }
}
