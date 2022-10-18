package com.power.doc.usecase.rest.pojo.required;

import lombok.Data;

/**
 * 测试必填字段
 * @author zongzi
 */
@Data
public class FooRequired {
	/**
	 * 测试字符,必填
	 * @required
	 *
	 */
	String fooString;

	Integer fooInteger;
}
