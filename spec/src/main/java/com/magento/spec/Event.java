package com.magento.spec;

import org.apache.commons.text.CaseUtils;
import java.util.Arrays;
import java.util.LinkedList;

public abstract class Event {

  public static Class<? extends Event> fromMethod(String method) {
    LinkedList<String> parts = new LinkedList<>(Arrays.asList(method.split("\\.")));
    parts.addFirst("com");
    parts.addLast(CaseUtils.toCamelCase(parts.removeLast(), true, new char[] {'_'}));
    String className = String.join(".", parts.toArray(new CharSequence[] {}));
    try {
      return Class.forName(className).asSubclass(Event.class);
    } catch (ClassNotFoundException cnfe) {
      throw new IllegalStateException(cnfe);
    }
  }

  public abstract StatusType getStatus();

}
