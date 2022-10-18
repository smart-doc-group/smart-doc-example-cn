package com.power.doc.usecase.rpc.api.method.invoke;

import java.util.Map;

/**
 * PRC.Method.Invoke.Parameter Usecase
 * @dubbo
 * @author zongzi
 */
public interface ParameterNameUseCase {


	/**
	 * Parameter Name
	 * @apiNote 测试字段名称的渲染效果。TODO 0x09 strMap的字段名称为-, 但是作为返回参数时就没有问题，
	 *
	 * @param strMap 测试数组
	 * @param fooStr 测试字段
	 * @param barStr 数组测试字段
	 */
	void invokeParameterName(Map<String,String> strMap,String fooStr,String... barStr);

}
