package com.power.doc.usecase.rest.pojo.value;

import lombok.Data;


/**
 * 测试示例值对象
 * @author zongzi
 */
@Data
public class BarValue {

	/**
	 * TODO #036 此处携带JSON的关键字符会影响生成的response-example和request-body
	 * @mock "this is my mock string with "{"fooString":"123"} \" "
	 */
	String barString;

	/**
	 * TODO #016 这个地方的mock示例值，如果类型不对，也能正常渲染结果
	 * @mock 123a
	 */
	int barInt;

	/**
	 * 这里没有使用@mock注解，则交由smart-doc自动生成示例值
	 */
	long barLong;
}
