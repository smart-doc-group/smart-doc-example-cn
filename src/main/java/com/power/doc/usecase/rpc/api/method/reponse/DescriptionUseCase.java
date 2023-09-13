package com.power.doc.usecase.rpc.api.method.reponse;


import java.util.List;
import java.util.Map;


import com.power.doc.usecase.rest.pojo.result.FooResult;
import com.power.doc.usecase.rest.pojo.type.FooEnum;
import com.power.doc.usecase.rpc.api.pojo.description.FooDescription;

/**
 * RPC.Method.Response.Description Usecase
 * @author zongzi
 * @dubbo
 */
public interface DescriptionUseCase {


	/**
	 * Return Self-Definition
	 * @apiNote 返回值的Description来源于对象属性注释
	 * @return 示例描述对象
	 */
	FooDescription selfDefinition();


	/**
	 * Return Lists
	 * @apiNote 返回值为列表时的参数描述
	 * @return 示例描述对象
	 */
	List<FooDescription> returnListObjects();


	/**
	 * Return Maps
	 * @apiNote 当返回值是Map时，出现mapKey字样，并且描述内容来源于Map&lt;K,V&gt;中V的类注释。
	 * @return 示例参数描述
	 */
	Map<String, FooDescription> returnMaps();

	/**
	 * Return Map<String,String>
	 * @apiNote 当返回值是Map&lt;String,String&gt;,出现mapKey字样，并且Description被固定为<code>A map key</code>
	 * @return 示例参数描述
	 */
	Map<String, String> returnMaps2();

	/**
	 * Return Map With Enum
	 * @apiNote TODO 0x13 当返回Map中的Value为枚举对象时，Description一栏中没有给出枚举值内容
	 * @return 示例参数描述
	 */
	Map<String, FooEnum> returnEnumMap();


	/**
	 * Return Self Generic Type
	 * @apiNote 当返回自定义的泛型封装对象时，注解来源于两者的属性上注解
	 * @return
	 */
	FooResult<FooDescription> returnSelfGenericType();
}

