package com.magento;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.magento.logistics.ShipmentRequest;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BindTest {

  @Test
  public void bind() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JavaTimeModule javaTimeModule = new JavaTimeModule();
    javaTimeModule.addDeserializer(LocalDateTime.class,
        new LocalDateTimeDeserializer(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    javaTimeModule.addSerializer(LocalDateTime.class,
        new LocalDateTimeSerializer(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    mapper.registerModule(javaTimeModule);
    // ObjectMapper om = new ObjectMapper();
    mapper.readValue(new File("src/test/resources/shipment_request.json"), ShipmentRequest.class);
  }
}
