package com.power.doc.usecase.rpc.api.method.meta;

import javax.validation.constraints.NotNull;

import com.power.doc.usecase.rest.pojo.type.FooType;
import com.power.doc.usecase.rpc.api.pojo.description.FooDescription;

/**
 * RPC.Method.Meta.Definition Usecase
 * @author zongzi
 * @dubbo
 */
public interface DefinitionUseCase {

	/**
	 * Default Method Definition
	 * @apiNote 定义一栏来源于方法的定义。
	 */
	void definitionComeFromMethod();


	/**
	 * Maintain The Param Name
	 * @apiNote 注意：方法参数列表中的参数名也可以在Definition这一栏被维护
	 * @param fooInts 测试字段名称
	 */
	void alsoMaintainTheParamName(@NotNull  Integer fooInt);

	/**
	 * When Use Arrays
	 * @apiNote 当使用<code>(String[] fooStrings,Integer... fooInts</code>传递参数时<br>
	 * TODO 0x08 当时用...作为入参时，Definition中显示的是单个长度，查看:<code>void whenPassArrays(String[] fooStrings, Integer fooInts)</code>
	 * @param fooStrings 测试字符串入参
	 * @param fooInts 测试入参
	 */
	void whenPassArrays(String[] fooStrings,Integer... fooInts);


	/**
	 * Return Arrays
	 * @apiNote TODO 0x15 当返回对象是数组时，Definition将数组标识丢弃了
	 * 此处的方法声明是<code>FooType[] returnArrayObjects();</code>,
	 * 但是展示内容是 <code>FooType returnArrayObjects()</code>
	 * @return 返回对象列表
	 */
	FooType[] returnArrayObjects();

}
