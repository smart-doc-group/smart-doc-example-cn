# Smart-doc Samples
Smart-doc使用示例，也是Smart-doc的文档生成测试项目
## Generating Markdown documentation
Smart-doc能够通过扫描源代码中的Controller接口生成Markdown格式的接口文档。生成示例如下：

**Usage**

```
@Test
public void testBuilderControllersApi() {
    ApiConfig config = new ApiConfig();
    config.setServerUrl("http://localhost:8080");
    
    //设置为严格模式，Smart-doc将降至要求每个Controller暴露的接口写上标准文档注释
    config.setStrict(true);
    
    //当把AllInOne设置为true时，Smart-doc将会把所有接口生成到一个Markdown、HHTML或者AsciiDoc中
    config.setAllInOne(true);
    
    //Set the api document output path.
    config.setOutPath("d:\\md");
    
    // 设置接口包扫描路径过滤，如果不配置则Smart-doc默认扫描所有的接口类
    // 配置多个报名有英文逗号隔开
    config.setPackageFilters("com.power.doc.controller");
    
    //设置公共请求头.如果不需要请求头，则无需设置
    config.setRequestHeaders(
            ApiReqHeader.header().setName("access_token").setType("string")
                    .setDesc("Basic auth credentials").setRequired(true).setSince("v1.1.0"),
            ApiReqHeader.header().setName("user_uuid").setType("string").setDesc("User Uuid key")
    );

    //设置错误错列表，遍历自己的错误码设置给Smart-doc即可
    List<ApiErrorCode> errorCodeList = new ArrayList<>();
    for (ErrorCodeEnum codeEnum : ErrorCodeEnum.values()) {
        ApiErrorCode errorCode = new ApiErrorCode();
        errorCode.setValue(codeEnum.getCode()).setDesc(codeEnum.getDesc());
        errorCodeList.add(errorCode);
    }
    //不需要显示错误码，则可以设置
    config.setErrorCodes(errorCodeList);

    
    //设置文档变更记录，没有需要可以不设置
    config.setRevisionLogs(
            RevisionLog.getLog().setRevisionTime("2018/12/15").setAuthor("chen").setRemarks("test").setStatus("create").setVersion("V1.0"),
            RevisionLog.getLog().setRevisionTime("2018/12/16").setAuthor("chen2").setRemarks("test2").setStatus("update").setVersion("V2.0")
    );

    long start = System.currentTimeMillis();
    //生成Markdown文件
    ApiDocBuilder.builderControllersApi(config);
    
    long end = System.currentTimeMillis();
    DateTimeUtil.printRunTime(end, start);
}
```
Markdown生成好后你可以自行编辑内容，这里推荐使用Typora(一款很强大的Markdown编辑器)，Typora支持将Markdown转为Html、pdf等
格式的文档。
## Generating HTML documentation
Smart-doc能够直接生成静态HTML5的文档的文档，HTML5格式的文档也有两种类型。一种是基于MD5算法将每个接口的
名称做MD5后生成一个单独的HTML5页面，然后通过点击`api.html`的书签列表通过IFRAME嵌入每个单独的HTML5页面。
另外一种是生成代码是设置allInOne属性将所有接口都生成到一个`index.html`HTML5页面中,页面同样带有书签。
**Usage**

```
@Test
public void testBuilderControllersApi() {
    ApiConfig config = new ApiConfig();
    config.setServerUrl("http://localhost:8080");
    
    //设置为严格模式，Smart-doc将降至要求每个Controller暴露的接口写上标准文档注释
    config.setStrict(true);
    
    //当把AllInOne设置为true时，Smart-doc将会把所有接口生成到一个Markdown、HHTML或者AsciiDoc中
    config.setAllInOne(true);
    
    //HTML5文档，建议直接放到src/main/resources/static/doc下，Smart-doc提供一个配置常量HTML_DOC_OUT_PATH
    config.setOutPath(DocGlobalConstants.HTML_DOC_OUT_PATH);
    
    // 设置接口包扫描路径过滤，如果不配置则Smart-doc默认扫描所有的接口类
    // 配置多个报名有英文逗号隔开
    config.setPackageFilters("com.power.doc.controller");
    
    //设置公共请求头.如果不需要请求头，则无需设置
    config.setRequestHeaders(
            ApiReqHeader.header().setName("access_token").setType("string")
                    .setDesc("Basic auth credentials").setRequired(true).setSince("v1.1.0"),
            ApiReqHeader.header().setName("user_uuid").setType("string").setDesc("User Uuid key")
    );

    //设置错误错列表，遍历自己的错误码设置给Smart-doc即可
    List<ApiErrorCode> errorCodeList = new ArrayList<>();
    for (ErrorCodeEnum codeEnum : ErrorCodeEnum.values()) {
        ApiErrorCode errorCode = new ApiErrorCode();
        errorCode.setValue(codeEnum.getCode()).setDesc(codeEnum.getDesc());
        errorCodeList.add(errorCode);
    }
    //不需要显示错误码，则可以设置
    config.setErrorCodes(errorCodeList);

    
    //设置文档变更记录，没有需要可以不设置
    config.setRevisionLogs(
            RevisionLog.getLog().setRevisionTime("2018/12/15").setAuthor("chen").setRemarks("test").setStatus("create").setVersion("V1.0"),
            RevisionLog.getLog().setRevisionTime("2018/12/16").setAuthor("chen2").setRemarks("test2").setStatus("update").setVersion("V2.0")
    );

    long start = System.currentTimeMillis();
    //生成HTML5文件
    HtmlApiDocBuilder.builderControllersApi(config);
    
    long end = System.currentTimeMillis();
    DateTimeUtil.printRunTime(end, start);
}
```
生成后可以通过浏览器打开`src/main/resources/static/doc/api.html`HTML页面，或者是启动Spring Boot服务访问`http://localhost:8080/doc/api.html`
接口文档，如果采用AllInOne模式生成的文档，则访问`http://localhost:8080/doc/index.html`
## Generating AsciiDoc documentation
AsciiDoc作为一种比Markdown写作拓展更好的文档格式。但是不是专业到要写书的同学可以不考虑使用这种文档。


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
    //store index.adoc within the src/main/docs/asciidoc folder
    config.setOutPath("src/main/docs/asciidoc");
    
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
### AsciiDoc to HTML 
生成完AsciiDoc后你可以使用Asciidoctor Maven Plugin插件将AsciiDoc转化为HTML5格式的文档。转化的HTML5文档带书签。


#### First:
首先在POM中添加Asciidoctor文档转HTML5的一些配置，也方便维护。
**Example:**
```
<properties>
    <asciidoctor.input.directory>${project.basedir}/src/docs/asciidoc</asciidoctor.input.directory>
    <generated.asciidoc.directory>${project.build.directory}/asciidoc/generated</generated.asciidoc.directory>
    <asciidoctor.html.output.directory>${project.build.directory}/asciidoc/html</asciidoctor.html.output.directory>
    <asciidoctor.pdf.output.directory>${project.build.directory}/asciidoc/pdf</asciidoctor.pdf.output.directory>
</properties>
```
#### Second
在pom中添加Add Asciidoctor Maven Plugin插件。


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
#### Third
然后通过调用maven命令执行 `process-resources`:
```
$ mvn process-resources
```
执行成功后可以在`target/asciidoc/html/index.html`下看到生成的HTML5接口文档。
