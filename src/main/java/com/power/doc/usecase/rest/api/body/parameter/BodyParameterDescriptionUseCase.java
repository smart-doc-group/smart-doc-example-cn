package com.power.doc.usecase.rest.api.body.parameter;

import com.power.doc.usecase.rest.pojo.description.BarDescription;
import com.power.doc.usecase.rest.pojo.description.FooDescription;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description Field
 * @author zongzi
 */
@RestController
@RequestMapping("/query/body/parameter/description")
public class BodyParameterDescriptionUseCase {

	/**
	 * Simple Parameter
	 * @apiNote 当传入简单的形式参数时，可以在@param中进行参数说明
	 * @param fooId 测试foodId参数说明
	 */
	@GetMapping("/simple-int")
	public void foo(@RequestBody Integer fooId) {

	}

	/**
	 * Self-Definition Type
	 * @apiNote 如果方法的入参是个自定义对象，可以在对象的成员变量上添加注释，进行说明
	 * 注意:
	 * 方法参数是自定义对象的场景下，在方法上@param中的参数声明在渲染文档中会失效
	 * @param foo 此处会在渲染结果中失效
	 */
	@GetMapping("/self-definition-type")
	public void bar(@RequestBody  FooDescription foo) {

	}


	/**
	 * Special Character
	 * @apiNote 一些描述中的特殊字符
	 * @param bar 测试对象
	 */
	@GetMapping("/special-characters")
	public void koo(@RequestBody BarDescription bar){

	}
}
