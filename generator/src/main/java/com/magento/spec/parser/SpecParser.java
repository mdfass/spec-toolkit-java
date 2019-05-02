package com.magento.spec.parser;

import com.magento.spec.model.BeanType;
import com.magento.spec.model.EnumType;
import com.magento.spec.model.Property;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SpecParser {
  private final String PACKAGE_PREFIX = "com.";

  private List<BeanType> beans = new ArrayList<>();
  private List<EnumType> enums = new ArrayList<>();

  public void readModules(Element rootElement) throws DocumentException {
    beans.clear();
    enums.clear();
    for (Iterator<Element> it = rootElement.elementIterator("module"); it.hasNext();) {
      Element moduleElement = it.next();
      readStructs(moduleElement);
      readEnums(moduleElement);
      readServices(moduleElement);
    }
  }

  private Set<String> services = new HashSet<>();
  private Set<String> queries = new HashSet<>();
  private Set<String> commands = new HashSet<>();
  private Set<String> events = new HashSet<>();

  private void readServices(Element moduleElement) throws DocumentException {
    String moduleName = moduleElement.attribute("name").getValue();
    for (Iterator<Element> it = moduleElement.elementIterator("service"); it.hasNext();) {
      Element serviceElement = it.next();
      String serviceName = serviceElement.attribute("name").getValue();
      String scopedServiceName = String.format("%s.%s", moduleName, serviceName);
      services.add(scopedServiceName);
      readQueries(serviceElement, scopedServiceName);
      readCommands(serviceElement, scopedServiceName);
      readEvents(serviceElement, scopedServiceName);
    }
  }

  private void readEvents(Element serviceElement, String scopedServiceName)
      throws DocumentException {
    String packageName = PACKAGE_PREFIX + serviceElement.attribute("name").getValue();

    for (Iterator<Element> it = serviceElement.elementIterator("event"); it.hasNext();) {
      Element eventElement = it.next();
      String eventName = eventElement.attribute("name").getValue();
      String summary = eventElement.elementText("summary");
      String description = eventElement.elementText("description");
      boolean extensible = Boolean.valueOf(eventElement.elementText("extensible"));
      List<Property> arguments = readArguments(eventElement.element("arguments"));
      beans.add(new BeanType(packageName, eventName, summary, description, extensible, arguments));

    }
  }

  private void readCommands(Element serviceElement, String scopedServiceName)
      throws DocumentException {
    for (Iterator<Element> it = serviceElement.elementIterator("command"); it.hasNext();) {
      Element commandElement = it.next();
      String commandName = commandElement.attribute("name").getValue();
      List<Property> arguments = readArguments(commandElement.element("arguments"));
      commands.add(String.format("%s.%s(%s)", scopedServiceName, commandName,
          Arrays.toString(arguments.toArray())));
    }
  }

  private void readQueries(Element serviceElement, String scopedServiceName)
      throws DocumentException {
    for (Iterator<Element> it = serviceElement.elementIterator("query"); it.hasNext();) {
      Element queryElement = it.next();
      String queryName = queryElement.attribute("name").getValue();
      List<Property> arguments = readArguments(queryElement.element("arguments"));
      queries.add(String.format("%s.%s(%s)", scopedServiceName, queryName,
          Arrays.toString(arguments.toArray())));
    }
  }

  private void readStructs(Element moduleElement) throws DocumentException {
    String packageName = PACKAGE_PREFIX + moduleElement.attribute("name").getValue();
    for (Iterator<Element> it = moduleElement.elementIterator("struct"); it.hasNext();) {
      Element structElement = it.next();
      String structName = structElement.attribute("name").getValue();
      String summary = structElement.elementText("summary");
      String description = structElement.elementText("description");
      boolean extensible = Boolean.valueOf(structElement.elementText("extensible"));
      List<Property> properties = readProperties(structElement.element("properties"));
      beans
          .add(new BeanType(packageName, structName, summary, description, extensible, properties));
    }
  }

  private List<Property> readProperties(Element propertiesElement) throws DocumentException {
    List<Property> sps = new ArrayList<>();
    for (Iterator<Element> it = propertiesElement.elementIterator("property"); it.hasNext();) {
      sps.add(readProperty(it.next()));
    }
    return sps;
  }

  private Property readProperty(Element propertyElement) {
    String propertyName = propertyElement.attribute("name").getValue();
    String type = propertyElement.elementText("type");
    String summary = propertyElement.elementText("summary");
    String description = propertyElement.elementText("description");
    boolean required = Boolean.valueOf(propertyElement.elementText("required"));
    return new Property(propertyName, type, summary, description, required);
  }

  private List<Property> readArguments(Element argumentsElement) throws DocumentException {
    List<Property> sps = new ArrayList<>();
    for (Iterator<Element> it = argumentsElement.elementIterator("argument"); it.hasNext();) {
      sps.add(readProperty(it.next()));
    }
    return sps;
  }

  private void readEnums(Element moduleElement) throws DocumentException {
    String packageName = PACKAGE_PREFIX + moduleElement.attribute("name").getValue();
    for (Iterator<Element> it = moduleElement.elementIterator("enum"); it.hasNext();) {
      Element enumElement = it.next();
      String enumName = enumElement.attribute("name").getValue();
      List<String> enumValues = readEnumValues(enumElement);
      enums.add(new EnumType(packageName, enumName, enumValues));
    }
  }

  private List<String> readEnumValues(Element enumElement) {
    List<String> values = new ArrayList<>();
    for (Iterator<Element> vit = enumElement.elementIterator("value"); vit.hasNext();) {
      Element valueElement = vit.next();
      values.add(valueElement.getText());
    }
    return values;
  }

  public List<BeanType> getBeans() {
    return beans;
  }

  public List<EnumType> getEnums() {
    return enums;
  }
}
