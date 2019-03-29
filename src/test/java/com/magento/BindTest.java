package com.magento;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.magento.logistics.ShipmentRequest;
import com.magento.service_bus.Message;
import com.magento.service_bus.MessageStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.File;

public class BindTest {
  private static ObjectMapper mapper;

  @BeforeAll
  public static void setup() {
    mapper = new ObjectMapper();
    // in spring spring.jackson.serialization.WRITE_DATES_AS_TIMESTAMPS = false
    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    mapper.registerModule(new JavaTimeModule());
    mapper.registerModule(new Jdk8Module());
  }

  @Test
  public void bind() throws Exception {

    ShipmentRequest sr = mapper.readValue(new File("src/test/resources/shipment_request.json"),
        ShipmentRequest.class);
    System.out.println(mapper.writeValueAsString(sr));
    Assertions.assertEquals("SHIPMENT_REQUEST_ID", sr.id);
    Assertions.assertEquals(0, sr.addresses.size());
    Assertions.assertEquals(1, sr.items.size());
  }

  @Test
  public void bind2() throws Exception {

    ShipmentRequest sr =
        mapper.readValue(new File("src/test/resources/sr.json"), ShipmentRequest.class);
    System.out.println(mapper.writeValueAsString(sr));
    Assertions.assertEquals("SALES-ISPU-MT-2019-03-27T16:31:26Z-01", sr.id);
    Assertions.assertEquals(2, sr.addresses.size());
    Assertions.assertEquals(5, sr.items.size());
  }

  @Test
  public void bind3() throws Exception {
    Message m = new Message("deliveryid", "receivedAt", "endpoint", "method", "params",
        MessageStatus.DELIVERING, "host", "clientIp");

    System.out.println(mapper.writeValueAsString(m));
  }
}
