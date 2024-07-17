# Smart-doc Samples
This project contains various code test scenarios developed by the official team of Smart-doc. Since Smart-doc does not require generating documentation during the project's runtime but may only depend on the compilation process, this project might not be able to start and run normally, nor should it be used as a reference for learning Spring Boot.
The various peculiar codes in this project are meant to demonstrate that Smart-doc has the capability to handle complex code derivation and generate documentation.
If other tools can scan the code in this project and generate documentation, they essentially have the ability to address most companies' needs for generating API development documentation.

# Official Recommendation
The official recommendation is to use the plugin approach to integrate with Smart-doc. You can refer to the documentation plugin usage guide.

[Maven Plugin Usage](https://smart-doc-group.github.io/guide/plugins/maven)

# Content of Use Cases
The code involves many tests for code parsing, mainly including:

- Common interface return cases
- Parameter JSR303 validation, including standard validation and group validation
- Examples of pagination handling with Jpa and Mybatis-plus popular in China
- Various settings for request headers
# Significance
These are various interface writing examples collected by Smart-doc since its open-source release in 2018. It is through the refinement of these various examples that Smart-doc has become a leader in Java API documentation tools in China, earning excellent user feedback.