package com.magento;

import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class TestProcessor {

  @Test
  public void testEventParse() throws IOException {
    Processor.main(new String[] {"src/test/resources/definitions", "target/generated"});

    String[] events = new String[] {"CustomerShipmentDone.java", "LinePriceAdjusted.java",
        "LinesReceived.java", "LinesShipped.java", "Reported.java"};


    Arrays.stream(events).forEach(e -> Assert
        .assertTrue(Files.exists(Paths.get("target/generated/com/fulfillment_management", e))));
  }
}
