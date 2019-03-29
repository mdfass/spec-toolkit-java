POC of generating java beans annotated with jackson so that serialization from and to https://github.com/magento-mcom/shared-services-internal works.

Currently copied the xmls from shared-services-internal (tag 1.0.3) into src/main/resources

Run com.magento.Processor to generate the java source from the xmls. Generated java appears in target/generated-sources/java

Keep in mind this is POC, the build is NOT very solid as dealing with code generation seriously interferes with default maven behaviour. Once we have proper CI/CD and dependency management we can get the proper shared-services-internal, we can split source code generation and output in order to have a jar with the generated code.