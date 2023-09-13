package com.power.doc.usecase.rest.api.response;

import java.util.List;
import java.util.Map;

import com.power.doc.usecase.rest.pojo.result.BarResult;
import com.power.doc.usecase.rest.pojo.result.FooResult;
import com.power.doc.usecase.rest.pojo.type.BarType;
import com.power.doc.usecase.rest.pojo.type.FooCircleDependency;
import com.power.doc.usecase.rest.pojo.type.FooType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Type Field
 * @author zongzi
 */
@RestController
@RequestMapping("/response/type-field")
public class ResponseTypeFieldUseCase {
	/**
	 * Return Basic Type
	 * @apiNote 返回基本类型
	 * <pre>
	 *     `@GetMapping("/return-basic-type")
	 *     public Integer fooReturnBasicType(){};
	 * </pre>
	 * TODO #034 返回基础类型时，没有Response-fields字段了,和Response-example的表现不一致
	 * @return Integer id
	 */
	@GetMapping("/return-basic-type")
	public Integer fooReturnBasicType() {
		return null;
	}

	/**
	 * Return Self-Definition Type
	 * @apiNote 自定义类型, 可以直接在参数列表中声明，代码如下
	 * <code>
	 *     `@GetMapping("/return-sel-definition-type")`
	 *      public void fooReturnSelfDefinitionType(){}
	 * </code>
	 *
	 * @return FooType 测试自定义对象
	 */
	@GetMapping("/return-sel-definition-type")
	public FooType fooReturnSelfDefinitionType() {
		return null;
	}

	/**
	 * Return Dependency Type
	 * @apiNote 返回 Foo对象，foo的成员变量有bar，bar的成员变量有foo
	 *
	 * @return FooCircleDependency 测试对象
	 */
	@GetMapping("/return-circle-dependency-type")
	public FooCircleDependency fooReturnCircleDependency() {
		return null;
	}


	/**
	 * Return Integers[]
	 * @apiNote 声明基础类型数组作为返回对象
	 * TODO ?002 返回的对象是Array, 但是Type显示为int32, 是否需要改为Array？或者在Description进行说明, 下面的三个用例的情况基本相同
	 * @return Integer[] 测试ID列表
	 */
	@GetMapping("/return-basic-type-array")
	public Integer[] fooReturnArrayBasicType() {
		return null;
	}

	/**
	 * Return Boo[]
	 * @apiNote 声明对象数组作为返回对象
	 * @return BarType[] 测试对象数组
	 */
	@GetMapping("return-object-array")
	public BarType[] fooReturnArrayObjects() {
		return null;
	}


	/**
	 * Return List<Bar>
	 * @apiNote 使用泛型声明作为返回对象
	 * @param List<BarType> 测试对象列表
	 */
	@GetMapping("return-type-list")
	public List<BarType> fooReturnTypeList() {
		return null;
	}

	/**
	 * Return List<FooCircleDependency>
	 * @apiNote 使用泛型声明作为返回对象
	 * @param List<BarType> 测试对象列表
	 */
	@GetMapping("return-type-list")
	public List<FooCircleDependency> fooReturnCircleDependencyTypeList() {
		return null;
	}

	/**
	 * Return List<Map<String,Bar>>
	 * @apiNote 使用泛型声明作为返回对象
	 * @param List<BarType> 测试对象列表
	 */
	@GetMapping("return-map-type-list")
	public List<Map<String, BarType>> fooReturnMapStringTypeList() {
		return null;
	}

	/**
	 * Return Map<String,String>
	 * @apiNote 使用Map<String, String>作为返回对象
	 * TODO ?004 对比下方的Map<String,Bar>的返回类型，似乎Type字段应该支持 map<string,string> 等类似的描述？
	 * @return Map<String, String>  测试对象列表
	 */
	@GetMapping("return-map-string-string")
	public Map<String, String> fooReturnStringTypeMap() {
		return null;
	}

	/**
	 * Return Map<String,Bar>
	 * @apiNote 使用Map<String, Bar>作为返回对象
	 * @return Map<String, BarType> 返回对象类型
	 */
	@GetMapping("return-map-string-self-type")
	public Map<String, BarType> fooReturnGenericTypeMap() {
		return null;
	}

	/**
	 * Return Map<String,List<Bar>>
	 * @apiNote 使用Map<String, List < Bar>>作为返回对象
	 * @return Map<String, List < Bar>> 返回对象类型
	 */
	@GetMapping("return-map-string-list-self-type")
	public Map<String, List<BarType>> fooReturnMapListSelfType() {
		return null;
	}

	/**
	 * Return Result<Bar>
	 * @return FooResult<BarType>
	 */
	@GetMapping
	public FooResult<BarType> fooReturnGenericResult() {
		return null;
	}

	/**
	 * Return Result<Integer>
	 * @return FooResult<BarType>
	 */
	@GetMapping
	public FooResult<Integer> fooReturnGenericBasicTypeResult() {
		return null;
	}

	/**
	 * Return Result<List<Integer>>
	 * @return FooResult<BarType>
	 */
	@GetMapping
	public FooResult<List<Integer>> fooReturnGenericListBasicTypeResult() {
		return null;
	}

	/**
	 * Return Result<List<Bar>>
	 * @return FooResult<BarType>
	 */
	@GetMapping
	public FooResult<List<BarType>> fooReturnGenericListSelfTypeResult() {
		return null;
	}

	/**
	 * Return Result<Foo,Bar>
	 * @return
	 */
	@GetMapping
	public BarResult<FooType, BarType> fooReturnGenericType2() {
		return null;
	}
}

