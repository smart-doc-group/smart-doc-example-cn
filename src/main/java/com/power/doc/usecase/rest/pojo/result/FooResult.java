package com.power.doc.usecase.rest.pojo.result;

import lombok.Data;

/**
 * 泛型返回对象
 * @author zongzi
 * @param <T>
 */
@Data
public class FooResult<T> {

	/**
	 * 编码
	 */
	String code;
	/**
	 * ID
	 */
	String traceId;
	/**
	 * 数据
	 */
	T data;
	/**
	 * 描述
	 */
	String message;
}
