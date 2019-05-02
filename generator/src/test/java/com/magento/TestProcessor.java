package com.magento;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class TestProcessor {
  @Rule
  public TemporaryFolder tempFolder = new TemporaryFolder(new File("target"));

  @Test
  public void testEventParse() throws IOException {
    File target = tempFolder.getRoot();
    Processor.main(new String[] {"src/test/resources/definitions", target.getAbsolutePath()});

    String[] events = new String[] {"CustomerShipmentDone.java", "LinePriceAdjusted.java",
        "LinesReceived.java", "LinesShipped.java", "Reported.java"};

    Arrays.stream(events).forEach(e -> Assert.assertTrue(
        Files.exists(Paths.get(target.getAbsolutePath() + "/com/fulfillment_management", e))));
  }

}
