
# 注意：window环境下先安装MinGW，idea中Makefile Support插件
# Makefile 命令开头必须为tab键

# 生成html文档, -DconfigFile需要删除配置pom中的配置才行
html-doc:
	mvn smart-doc:html -DconfigFile=./src/main/resources/smart-doc.json -Dfile.encoding=UTF-8
tree:
	mvn dependency:tree -DoutputFile=tree.txt
	mvn compile -Dfile.encoding=UTF-8 -DSkipTests=true
# one-api https://oneapi.app/usage
one-api:
	oneapi analysis -p ./ -o ./target/doc/

run-torna-mockserver:
	python3 torna_mock_server.py
