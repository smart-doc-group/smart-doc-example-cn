package com.power.doc.usecase.rest.pojo.parameter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 使用com.fasterxml.jackson.annotation注解的返回结果
 * @author zongzi
 */
@Data
@JsonIgnoreProperties({"fooClassStringToIgnore"})
public class FooJsonParameterName {
	/**
	 * 此处对象中声明的参数名是：fooStringWithJsonAnnotation,
	 * 但是使用了 @JsonProperty("fooString") 将参数名更新为fooString
	 */
	@JsonProperty("fooString")
	String fooStringWithJsonAnnotation;

	@JsonIgnore
	String fooStringToIgnore;

	/**
	 * 在Class上声明被忽略的成员变量
	 */
	String fooClassStringToIgnore;

	/**
	 * 使用@JsonIgnoreType声明的类型,应该被忽略
	 */
	BarJsonParameterName bar;
}
