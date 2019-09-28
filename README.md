ApplicationPower smart-doc接口文档自动生成工具测试代码。

**注：** 本项目基本框架代码由application-power自动生成。想要体验者欢迎到https://github.com/shalousun/ApplicationPower
或者https://gitee.com/sunyurepository/ApplicationPower浏览详情。

# 访问api文档
可以通过启动本项目，通过访问`http://localhost:8080/doc/api.html`来常看
smart-doc根据源码生成的静态html文档。本功能待1.7版本发布后使用。

## AsciiDoc to HTML 
The Smart-doc tool can generate AsciiDoc documentation, So you can convert AsciiDoc to HTML5 
using the Asciidoctor Maven Plugin. The following will demonstrates how to convert AsciiDoc 
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