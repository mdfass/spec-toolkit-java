package com.magento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class TestProcessor {

  @Test
  public void testEventParse(@TempDir File tempFolder) throws IOException {
    Processor.main(new String[] {"src/test/resources/definitions", tempFolder.getAbsolutePath()});

    String[] events = new String[] {"TestStruct.java", "ComplexType.java", "TestEnum.java"};

    Arrays.stream(events).forEach(e -> Assertions.assertTrue(
        Files.exists(Paths.get(tempFolder.getAbsolutePath(), "com/magento/codegen/test", e))));
  }

  @Test
  public void cannotWriteTest(@TempDir File tempFolder) throws IOException {
    tempFolder.setWritable(false);
    Assertions.assertThrows(IllegalStateException.class, () -> Processor
        .main(new String[] {"src/test/resources/definitions", tempFolder.getAbsolutePath()}));
  }

  @Test
  public void cannotParseDefinitions(@TempDir File tempFolder) throws IOException {
    tempFolder.setWritable(false);
    Assertions.assertThrows(IllegalStateException.class, () -> Processor
        .main(new String[] {"src/test/resources/bad_definitions", tempFolder.getAbsolutePath()}));
  }

}
