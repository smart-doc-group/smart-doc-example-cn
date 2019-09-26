ApplicationPower smart-doc接口文档自动生成工具测试代码。

**注：** 本项目基本框架代码由application-power自动生成。想要体验者欢迎到https://github.com/shalousun/ApplicationPower
或者https://gitee.com/sunyurepository/ApplicationPower浏览详情。

# 访问api文档
可以通过启动本项目，通过访问`http://localhost:8080/doc/api.html`来常看
smart-doc根据源码生成的静态html文档。本功能待1.7版本发布后使用。

# 使用asciidoc生成html

```
mvn asciidoctor:process-asciidoc
mvn generate-resources
```
