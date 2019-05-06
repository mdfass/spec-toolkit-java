package com.magento.spec.generator;

import com.magento.spec.model.BeanType;
import com.magento.spec.model.Property;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class BeanGeneratorTest {

  private BeanGenerator bg = new BeanGenerator(null);

  @Test
  public void wrongPrimitiveType() {
    BeanType bt = new BeanType("moduleName", "structName", null, null, false,
        Arrays.asList(new Property[] {new Property("propertyName",
            "a primitive type that does not exist", null, null, false)}));

    IllegalStateException thrown =
        Assertions.assertThrows(IllegalStateException.class, () -> bg.generateBean(bt));

    Assertions.assertTrue(thrown.getMessage().contains("primitive"));
  }

  @Test
  public void wrongAggregateType() {
    BeanType bt = new BeanType("moduleName", "structName", null, null, false,
        Arrays.asList(new Property[] {new Property("propertyName",
            "an aggregate type that does not exist[]", null, null, false)}));

    IllegalStateException thrown =
        Assertions.assertThrows(IllegalStateException.class, () -> bg.generateBean(bt));

    Assertions.assertTrue(thrown.getMessage().contains("collection"));
  }

}
