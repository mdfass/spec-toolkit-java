POC of generating java beans annotated with jackson so that serialization from and to https://github.com/magento-mcom/shared-services-internal works.

There are 2 modules: 
* generator contains the code that can translate from shared-services-internal xmls into java source. It uses dom4j for the xml parsing and javapoet for generating the java classes. The classes are annotated with jackson to bind to and from json.
* spec contains the actual call to the generation process, a test for the generated classes and packaging into a jar.

The xmls from shared-services-internal are downloaded from github at build time. To do so, you need a github oauth token and export it in your environment:

```
export GITHUB_TOKEN=_the_token_
```

The code is generated by simply running `mvn clean install`
