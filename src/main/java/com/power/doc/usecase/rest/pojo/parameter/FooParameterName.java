package com.power.doc.usecase.rest.pojo.parameter;

import lombok.Data;

@Data
public class FooParameterName {

	/**
	 * 此字段应该被正常渲染
	 */
	String fooStringNotIgnore;
	/**
	 * 此字段会在最后的渲染结果中被忽略
	 * @ignore
	 */
	String fooStringToIgnore;

}
