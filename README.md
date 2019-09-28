ApplicationPower smart-doc接口文档自动生成工具测试代码。

**注：** 本项目基本框架代码由application-power自动生成。想要体验者欢迎到https://github.com/shalousun/ApplicationPower
或者https://gitee.com/sunyurepository/ApplicationPower浏览详情。

# Generating HTML documentation
The Smart-doc tool is capable of generating HTML5 format REST API documentation.
You can use HtmlApiDocBuilder to generate HTML5 documentation.

**Usage**

```
@Test
public void testBuilderControllersApi() {
    ApiConfig config = new ApiConfig();
    config.setServerUrl("http://localhost:8080");
    //If the strict mode is set to true, Smart-doc forces that the public method in each interface in the code has a comment.
    config.setStrict(true);
    //When AllInOne is set to true, the document generation of all interfaces is merged into a Markdown or AsciiDoc document,
    // and the error code list is output to the bottom of the document.
    config.setAllInOne(true);
    //Set the api document output path.
    config.setOutPath(DocGlobalConstants.HTML_DOC_OUT_PATH);
    // If you do not configure PackageFilters, it matches all controllers by default.
    // Configure multiple controller paths to be separated by commas
    config.setPackageFilters("com.power.doc.controller");
    //Set the request header, if there is no request header, you don't need to set it.
    config.setRequestHeaders(
            ApiReqHeader.header().setName("access_token").setType("string")
                    .setDesc("Basic auth credentials").setRequired(true).setSince("v1.1.0"),
            ApiReqHeader.header().setName("user_uuid").setType("string").setDesc("User Uuid key")
    );

    //Output a list of error codes in the project, using for example:
    List<ApiErrorCode> errorCodeList = new ArrayList<>();
    for (ErrorCodeEnum codeEnum : ErrorCodeEnum.values()) {
        ApiErrorCode errorCode = new ApiErrorCode();
        errorCode.setValue(codeEnum.getCode()).setDesc(codeEnum.getDesc());
        errorCodeList.add(errorCode);
    }
    //not necessary
    config.setErrorCodes(errorCodeList);

    //Set the document change record,
    //it is not necessary to have the document change record take effect only when setAllInOne is set to true.
    config.setRevisionLogs(
            RevisionLog.getLog().setRevisionTime("2018/12/15").setAuthor("chen").setRemarks("test").setStatus("create").setVersion("V1.0"),
            RevisionLog.getLog().setRevisionTime("2018/12/16").setAuthor("chen2").setRemarks("test2").setStatus("update").setVersion("V2.0")
    );

    long start = System.currentTimeMillis();
    //Generating HTML documentation
    HtmlApiDocBuilder.builderControllersApi(config);
    
    long end = System.currentTimeMillis();
    DateTimeUtil.printRunTime(end, start);
}
```
Open the file src/main/resources/static/doc/api.html in your browser to see the generated HTML file.
You can also start the Spring Boot service and then go directly to 
http://localhost:8080/doc/api.html to view the documentation.
# Generating AsciiDoc documentation
If you want to generate REST API documentation in AsciiDoc format. 
You can generate it using the AdocDocBuilder of the Smart-doc tool.

**Usage**

```
@Test
public void testBuilderControllersApi() {
    ApiConfig config = new ApiConfig();
    config.setServerUrl("http://localhost:8080");
    //If the strict mode is set to true, Smart-doc forces that the public method in each interface in the code has a comment.
    config.setStrict(true);
    //When AllInOne is set to true, the document generation of all interfaces is merged into a Markdown or AsciiDoc document,
    // and the error code list is output to the bottom of the document.
    config.setAllInOne(true);
    //Set the api document output path.
    config.setOutPath("d:\\md");
    // If you do not configure PackageFilters, it matches all controllers by default.
    // Configure multiple controller paths to be separated by commas
    config.setPackageFilters("com.power.doc.controller");
    //Set the request header, if there is no request header, you don't need to set it.
    config.setRequestHeaders(
            ApiReqHeader.header().setName("access_token").setType("string")
                    .setDesc("Basic auth credentials").setRequired(true).setSince("v1.1.0"),
            ApiReqHeader.header().setName("user_uuid").setType("string").setDesc("User Uuid key")
    );

    //Output a list of error codes in the project, using for example:
    List<ApiErrorCode> errorCodeList = new ArrayList<>();
    for (ErrorCodeEnum codeEnum : ErrorCodeEnum.values()) {
        ApiErrorCode errorCode = new ApiErrorCode();
        errorCode.setValue(codeEnum.getCode()).setDesc(codeEnum.getDesc());
        errorCodeList.add(errorCode);
    }
    //not necessary
    config.setErrorCodes(errorCodeList);

    //Set the document change record,
    //it is not necessary to have the document change record take effect only when setAllInOne is set to true.
    config.setRevisionLogs(
            RevisionLog.getLog().setRevisionTime("2018/12/15").setAuthor("chen").setRemarks("test").setStatus("create").setVersion("V1.0"),
            RevisionLog.getLog().setRevisionTime("2018/12/16").setAuthor("chen2").setRemarks("test2").setStatus("update").setVersion("V2.0")
    );

    long start = System.currentTimeMillis();
    //Generating AsciiDoc
    AdocDocBuilder.builderControllersApi(config);
    
    long end = System.currentTimeMillis();
    DateTimeUtil.printRunTime(end, start);
}
```
## AsciiDoc to HTML 
You could convert AsciiDoc to HTML5 using the Asciidoctor Maven Plugin. The following will demonstrates how to convert AsciiDoc 
to HTML5 using the Asciidoctor Maven plugin.

### First:
Custom properties or variables are useful to keep your Maven pom.xml file more easy to read and maintain.
Therefore, I recommend placing the Asciidoctor Maven Plugin related property variables in the Maven pom.xml file.

**Example:**
```
<properties>
    <asciidoctor.input.directory>${project.basedir}/src/docs/asciidoc</asciidoctor.input.directory>
    <generated.asciidoc.directory>${project.build.directory}/asciidoc/generated</generated.asciidoc.directory>
    <asciidoctor.html.output.directory>${project.build.directory}/asciidoc/html</asciidoctor.html.output.directory>
    <asciidoctor.pdf.output.directory>${project.build.directory}/asciidoc/pdf</asciidoctor.pdf.output.directory>
</properties>
```
### Second
Add Asciidoctor Maven Plugin in your Maven pom.xml.

```
<!-- Run the generated asciidoc through Asciidoctor to generate
                other documentation types, such as PDFs or HTML5 -->
<plugin>
    <groupId>org.asciidoctor</groupId>
    <artifactId>asciidoctor-maven-plugin</artifactId>
    <version>1.5.6</version>
    <!-- Include Asciidoctor PDF for pdf generation -->
    <dependencies>
        <dependency>
            <groupId>org.asciidoctor</groupId>
            <artifactId>asciidoctorj-pdf</artifactId>
            <version>1.5.0-beta.5</version>
        </dependency>
        <dependency>
            <groupId>org.jruby</groupId>
            <artifactId>jruby-complete</artifactId>
            <version>9.2.8.0</version>
        </dependency>
    </dependencies>
    <!-- Configure generic document generation settings -->
    <configuration>
        <sourceDirectory>${asciidoctor.input.directory}</sourceDirectory>
        <sourceDocumentName>index.adoc</sourceDocumentName>
        <attributes>
            <doctype>book</doctype>
            <toc>left</toc>
            <toclevels>3</toclevels>
            <numbered></numbered>
            <hardbreaks></hardbreaks>
            <sectlinks></sectlinks>
            <sectanchors></sectanchors>
            <generated>${generated.asciidoc.directory}</generated>
        </attributes>
    </configuration>
    <!-- Since each execution can only handle one backend, run
         separate executions for each desired output type -->
    <executions>
        <execution>
            <id>output-html</id>
            <phase>process-resources</phase>
            <goals>
                <goal>process-asciidoc</goal>
            </goals>
            <configuration>
                <backend>html5</backend>
                <outputDirectory>${asciidoctor.html.output.directory}</outputDirectory>
            </configuration>
        </execution>
    </executions>
</plugin>
```
### Third
Convert the AsciiDoc to HTML5 by invoking the `process-resources` goal (configured as the default goal):
```
$ mvn process-resources
```
Open the file target/asciidoc/html/index.html in your browser to see the generated HTML file.