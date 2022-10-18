package com.power.doc.usecase.rpc.api.method.reponse;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;

import com.power.doc.usecase.rest.pojo.result.FooResult;
import com.power.doc.usecase.rest.pojo.type.FooEnum;
import com.power.doc.usecase.rpc.api.pojo.type.RpcFooType;

/**
 * RPC.Method.Response.Type Usecase
 * @author zongzi
 * @dubbo
 */
public interface TypeFieldUseCase {


	/**
	 * Return Basic Type
	 * @apiNote TODO 0x0F 当返回简单类型时，Response-fields一栏未被展示
	 * @return Integer 测试返回简单类型的描述
	 */
	Integer returnBasicType();

	/**
	 * Return Basic Type Array
	 * @apiNote TODO 0x17 返回简单类型的列表，Definition一栏展示错误
	 * @return 示例描述对象
	 */
	Integer[] returnBasicTypeArray();
	/**
	 * Return Basic Type List
	 * @apiNote TODO 0x16 返回简单类型的列表，Response-fields一栏未被展示
	 * @return 示例描述对象
	 */
	List<Integer> returnBasicTypeList();
	/**
	 * Return Basic Type Lists
	 * @apiNote TODO 0x10 返回简单类型集合，Response-fields一栏未被展示
	 * @return 示例描述对象
	 */
	Set<Integer> returnBasicTypeSet();

	/**
	 * Return String Map
	 * @return
	 */
	Map<String,String> returnStringMap();
	/**
	 * Return Basic Type With Generic
	 * @apiNote TODO 0x17 使用泛型封装Integer时，返回的type为int32,而不是像其他一样是包装类型的全路径
	 * @return
	 */
	FooResult<Integer> returnBasicTypeWithGeneric();


	/**
	 * Return Basic Type List With Generic
	 * @return
	 */
	FooResult<List<Integer>> returnBasicTypeListWithGeneric();


	/**
	 * Return Basic Type List Map With Generic
	 * @return
	 */
	FooResult<List<Map<String,Integer>>> returnBasicTypeListMapWithGeneric();


	/**
	 * Return Basic Type  Map  List With Generic
	 * @return
	 */
	FooResult<Map<String,List<Integer>>> returnBasicTypeMapListWithGeneric();
	/**
	 * Return Enum
	 * @apiNote TODO 0x11 返回枚举对象时，Response-fields一栏未被展示
	 * @return 示例描述对象
	 */
	FooEnum returnEnum();

	/**
	 * Return Enum Array
	 * @return
	 */
	FooEnum[] returnEnumArray();

	/**
	 * Return Enum List
	 * @apiNote TODO 0x12 返回枚举对象列表时，Response-fields一栏未被展示
	 * @return 示例描述对象
	 */
	List<FooEnum> returnEnumList();

	/**
	 * Return Enums Set
	 * @apiNote TODO 0x14 返回枚举对象集合时，Response-fields一栏未被展示
	 * @return 示例返回类型
	 */
	Set<FooEnum> returnEnumSet();

	/**
	 * Return Enum Map
	 * @apiNote TODO 0x16 返回枚举的Map时，没有展示枚举的相信信息
	 * @return
	 */
	Map<String,FooEnum> returnEnumMap();
	/**
	 * Return Enum With Generic Type
	 * @apiNote TODO 0x15 使用泛型返回枚举对象是, Data的Type类型是 object,没有展示泛型内容
	 * @return
	 */
	FooResult<FooEnum> returnEnumWithGeneric();

	/**
	 * Return Self-Definition Type
	 * @apiNote 返回自定义对象列表
	 * @return 示例测试对象
	 */
	RpcFooType returnSelfDefinition();

	/**
	 * Return Foo Array
	 * @return
	 */
	RpcFooType[] returnFooTypeArray();

	/**
	 * Return Foo List
	 * @return
	 */
	List<RpcFooType> returnFooTypeList();

	/**
	 * Return Foo Set
	 * @return
	 */
	Set<RpcFooType> returnFooTypeSet();

	/**
	 * Return Foo Map
	 * @return
	 */
	Map<String,RpcFooType> returnFooTypeMap();
	/**
	 * Return Foo With Generic
	 * @return
	 */
	FooResult<RpcFooType> returnFooTypeWithGeneric();


	/**
	 * Return Foo List With Generic
	 * @return
	 */
	FooResult<List<RpcFooType>> returnFooTypeListWithGeneric();

}
