package com.power.doc.usecase.rest.pojo.type;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * 循环依赖测试对象
 * @author zongzi
 */
@Data
public class FooCircleDependency {
	/**
	 * foo自身成员变量
	 */
	@NotNull
	String fooString;

	/**
	 * foo 的成员变量为bar
	 */
	BarCircleDependency bar;
}
@Data
class BarCircleDependency {
	/**
	 * Bar的成员变量foo
	 */
	FooCircleDependency foo;

	/**
	 * bar自身成员变量
	 */
	String barString;
}