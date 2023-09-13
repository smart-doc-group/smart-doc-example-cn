package com.power.doc.usecase.rpc.api.method.reponse;

import java.util.List;
import java.util.Map;


/**
 * RPC.Method.Response.Field Usecase
 * @dubbo
 * @author zongzi
 */
public interface FieldNameUseCase {

	/**
	 * Return Map<String,String>
	 * @apiNote TODO 0x19 同时使用 Map<String, String>时，入参形式和上一个相同，无法区分，只能通过Definition区分。
	 * @param foo 测试对象
	 * @return
	 */
	Map<String, String> returnStringMap(Map<String, String> foo);

	/**
	 * Return Map<String,List<String>>
	 * @apiNote TODO 0x18 同时使用 Map<String, List<String>>时，Invoke-Parameters和Response-fields的展示逻辑不同。
	 * @param foo 测试对象
	 * @return
	 */
	Map<String, List<String>> returnStringWithListString(Map<String, List<String>> foo);

	/**
	 * Return List<Map<String, String>>
	 * @param foo 测试对象
	 * @return
	 */
	List<Map<String, String>> returnStringWithListString(List<Map<String, String>> foo);
}
