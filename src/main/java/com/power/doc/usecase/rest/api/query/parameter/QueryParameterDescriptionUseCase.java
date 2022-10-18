package com.power.doc.usecase.rest.api.query.parameter;

import java.util.List;

import com.power.doc.usecase.rest.pojo.description.BarDescription;
import com.power.doc.usecase.rest.pojo.description.FooDescription;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description Field
 *
 * @author zongzi
 * TODO #020 如果两个类的类名相同，那么生成文档的时候就会忽略后一个类的文档，举例说明，如果把这个类改为DescriptionUseCase,
 * 就会和 {@link com.power.doc.usecase.rest.api.meta.DescriptionUseCase}一致，那么此文档就会被忽略渲染。
 */
@RestController
@RequestMapping("query/parameters/description")
public class QueryParameterDescriptionUseCase {


	/**
	 * Simple Parameter
	 * @apiNote 当传入简单的形式参数时，可以在@param中进行参数说明
	 * @param fooId 测试foodId参数说明
	 */
	@GetMapping("/simple-int")
	public void foo(Integer fooId) {

	}

	/**
	 * Self-Definition Type
	 * @apiNote 如果方法的入参是个自定义对象，可以在对象的成员变量上添加注释，进行说明
	 * 注意:
	 * 方法参数是自定义对象的场景下，在方法上@param中的声明在渲染文档中会失效
	 * @param foo 此处会在渲染结果中失效
	 */
	@GetMapping("/self-definition-type")
	public void bar(FooDescription foo) {

	}


	/**
	 * Special Character
	 * @apiNote 一些描述中的特殊字符
	 * @param bar 测试对象
	 */
	@GetMapping("/special-characters")
	public void koo(BarDescription bar){

	}

	/**
	 * When Use Array Or List
	 * @apiNote 当使用List时，会拼接上列表元素的类型，并添加@since 字段
	 * @param fooStrList 测试字符列表
	 * @param fooStrArray 测试字符列表
	 */
	@GetMapping("/when-use-array-or-list")
	public void laa(List<String> fooStrList,String[] fooStrArray){

	}
}

