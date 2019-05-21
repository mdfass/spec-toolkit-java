package com.magento;

import com.magento.spec.generator.BeanGenerator;
import com.magento.spec.generator.EnumGenerator;
import com.magento.spec.parser.SpecParser;
import org.apache.commons.text.CaseUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Processor {

  private String definitionsPath;

  private final BeanGenerator bg;
  private final EnumGenerator eg;


  private Processor(String definitionsPath, String generatedJavaPath) {
    this.definitionsPath = definitionsPath;
    bg = new BeanGenerator(generatedJavaPath);
    eg = new EnumGenerator(generatedJavaPath);
  }

  public static void main(String[] args) throws IOException {
    new Processor(args[0], args[1]).process();
  }

  public void process() throws IOException {
    Files.walk(Paths.get(definitionsPath)).filter(f -> f.toString().endsWith(".xml"))
        .forEach(f -> process(f));
  }

  private void process(Path p) {
    try {
      SpecParser sp = new SpecParser();
      sp.readModules(parse(p).getRootElement());
      sp.getBeans().forEach(bt -> bg.generateBean(bt));
      sp.getEvents().entrySet()
          .forEach(e -> System.out.printf("%s, com.%s.%s\n", e.getKey(), e.getValue().moduleName,
              CaseUtils.toCamelCase(e.getValue().structName, true, new char[] {'_'})));
      sp.getEvents().values().forEach(bt -> bg.generateEvent(bt));
      sp.getEnums().forEach(et -> eg.generateEnum(et));
    } catch (DocumentException de) {
      throw new IllegalStateException("Error parsing definitions", de);
    }
  }

  private Document parse(Path p) throws DocumentException {
    SAXReader reader = new SAXReader();
    Document document = reader.read(p.toFile());
    return document;
  }

}
