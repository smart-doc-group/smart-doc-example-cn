# 注意：window环境下先安装MinGW，idea中Makefile Support插件
# Makefile 命令开头必须为tab键

# 生成html文档
html-doc:
	mvn -X smart-doc:html -Dfile.encoding=UTF-8

# one-api https://oneapi.app/usage
one-api:
	oneapi analysis -p ./ -o ./target/doc/
