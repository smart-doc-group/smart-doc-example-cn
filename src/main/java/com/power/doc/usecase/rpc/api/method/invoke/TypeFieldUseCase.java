package com.power.doc.usecase.rpc.api.method.invoke;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;

import com.power.doc.usecase.rest.pojo.type.BarEnum;
import com.power.doc.usecase.rest.pojo.type.BarType;
import com.power.doc.usecase.rest.pojo.type.FooCircleDependency;
import com.power.doc.usecase.rest.pojo.type.FooEnum;
import com.power.doc.usecase.rpc.api.pojo.type.RpcFooType;

/**
 * RPC.Method.Invoke.Type Usecase
 * @dubbo
 * @author zongzi
 */
public interface TypeFieldUseCase {

	/**
	 * Use Basic Type
	 * @apiNote 测试基本类型
	 * @param fooByte
	 * @param fooShor
	 * @param fooInt
	 * @param fooLong
	 * @param fooBool
	 * @param fooChar
	 * @param fooDouble
	 * @param fooFlot
	 */
	void useBasicTypes(byte fooByte, short fooShor, int fooInt, long fooLong, boolean fooBool, char fooChar, double fooDouble, float fooFlot);

	/**
	 * Use Box Basic Type
	 * @apiNote 测试基本对象的包装类型
	 * @param fooByte 测试Byte
	 * @param fooShort 测试Short
	 * @param fooInt 测试Integer
	 * @param fooLong 测试Long对象
	 * @param fooBool 测试Boolean对象
	 * @param fooChar 测试Character
	 * @param fooDouble 测试Double
	 * @param fooFloat 测试Float
	 * @param fooDate 测试日期对象
	 * @param fooBigDecimal 测试Decimal对象
	 * @param fooString 测试字符串对象
	 * @param fooEnum  测试枚举对象
	 */
	void useBasicTypesBox(Byte fooByte, Short fooShort, Integer fooInt, Long fooLong, Boolean fooBool, Character fooChar, Double fooDouble, Float fooFloat,
			Date fooDate, BigDecimal fooBigDecimal,String fooString,FooEnum fooEnum);



	/**
	 * Use Self-Definition Type
	 * @apiNote 使用自定义类型
	 * @param fooType 自定义测试字段
	 */
	void selfDefinitionType(RpcFooType fooType);

	/**
	 * Use Optional Api
	 * @apiNote 使用Optional-API 作为入参的场景
	 * @param fooOptional 使用Optional-API
	 */
	void useOptionalApi(Optional<Integer> fooOptional);
	/**
	 * Use Circle Dependence Type
	 * @apiNote 使用自定义的循环依赖乐行
	 * @param fooCircleDependency 自定义的循环依赖对象
	 *
	 */
	void circleDependencyType(FooCircleDependency fooCircleDependency);



	/**
	 * Use Array Types
	 * @apiNote 使用<code>BarType[] bars</code><code>BarType... bars2</code>作为入参时的类型渲染<br>
	 * TODO 0x02 使用...作入参传递时，Invoke-parameters的Type类型和单独传递时无法区分
	 * @param barString 测试字符串列表
	 * @param bars 测试对象列表
	 * @param bars2 测试对象列表
	 *
	 */
	void arrayTypes(String[] barString, BarType[] bars, BarType... bars2);

	/**
	 * Use Array Enums Types
	 * @apiNote 使用<code>BarEnum[] barEnums,BarEnum... barEnums2</code>作为入参时的类型渲染<br>
	 * TODO 0x07 BarEnum[] 类型的参数被直接忽略
	 * @param barEnums 测试枚举对象列表
	 * @param barEnums2 测试枚举对象列表
	 *
	 */
	void arrayTypes(BarEnum[] barEnums, BarEnum... barEnums2);


	/**
	 * Use Collection Types(List)
	 * @apiNote 使用基本对象类型的集合做为入参时
	 * @param fooString
	 * @param fooBytes
	 * @param fooShorts
	 * @param fooInts
	 * @param fooLong
	 * @param fooEnums TODO 0x0B当时用List<enum>时，参数被忽略
	 * @param fooDate
	 *
	 */

	void useCollection(List<Byte> fooBytes,List<Short> fooShorts,List<Integer> fooInts, List<Long> fooLong,List<FooEnum> fooEnums,List<Date> fooDate,List<String> fooString);

	/**
	 * Use Collection Types(Set)
	 * @param fooBytes
	 * @param fooShorts
	 * @param fooInts
	 * @param fooLong
	 * @param fooEnums TODO 0x0C当时用List<enum>时，参数被忽略
	 * @param fooDate
	 * @param fooString
	 */
	void useCollection(Set<Byte> fooBytes,Set<Short> fooShorts,Set<Integer> fooInts, Set<Long> fooLong,Set<FooEnum> fooEnums,Set<Date> fooDate,Set<String> fooString);

	/**
	 * Use Collection Types(Self-Definition)
	 * @apiNote TODO 0x03 使用集合对象作为入参时，与单独传递对象时无法区分<br>
	 * TODO 0x06 Set<enum>形式的参数在方法签名中被直接忽略
	 * @param barSet 测试对象集合
	 * @param barList 测试对象列表
	 * @param barHashSet 测试对象集合
	 * @param barArrayList 测试对象列表
	 * @param barEnumSet 测试枚举对象集合
	 */

	void collectionTypes(Set<BarType> barSet, List<BarType> barList, HashSet<BarType> barHashSet, ArrayList<BarType> barArrayList, Set<BarEnum> barEnumSet);

	/**
	 * Use Map Types
	 * @apiNote TODO 0x05 使用Map作为入参对象时的问题列表
	 * <u>
	 *  <ol>strMap返回的参数名被忽略，description中返回String类型</ol>
	 *  <ol>barMap字段的Type类型问题</ol>
	 *  <ol>如果Map的key不是String，在渲染的文档中无法显示</ol>
	 *  <ol>enumMap被直接忽略</ol>
	 * </u>
	 * @param strMap Map<String,String>
	 * @param barMap Map<String BarType>
	 * @param enumBarMap Map<FooEnum,BarType>
	 * @param enumMap Map<FooEnum,BarEnum>
	 */
	void mapTypes(Map<String, String> strMap, Map<String, BarType> barMap, Map<FooEnum, BarType> enumBarMap, Map<FooEnum, BarEnum> enumMap);
}

