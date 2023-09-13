package com.power.doc.usecase.rpc.api.pojo.description;

import lombok.Data;

/**
 * 参数描述示例对象
 * @author zongzi
 */
@Data
public class FooDescription {

	/**
	 * 属性参数描述1<br>
	 * <pre>
	 *     System.out.println("Smart-Doc");
	 * </pre>
	 *
	 */
	String fooStr;


	/**
	 * 属性参数描述2<br>
	 * 但是包含HTML标签，因此需要在编写注释时进行转义。
	 * 1. List<a>
	 * 2. <b> This is a Tag:b </b>
	 */
	String barStr;
}
