package com.power.doc.usecase.rest.api.body.parameter;

import java.util.List;
import java.util.Map;

import com.power.doc.usecase.rest.pojo.type.BarType;
import com.power.doc.usecase.rest.pojo.type.FooCircleDependency;
import com.power.doc.usecase.rest.pojo.type.FooType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Type Field
 * @author zongzi
 */
@RestController
@RequestMapping("/query/body/parameter/type-field")
public class BodyParameterTypeUseCase {

	/**
	 * Claim Self-Definition Type
	 * @apiNote 声明自定义简单对象

	 * @param fooType 测试对象
	 */
	@PostMapping("/self-definition-type")
	public void foo(@RequestBody FooType fooType) {

	}

	/**
	 * Claim Circle Dependency
	 * @apiNote 声明循环依赖对象
	 * @param fooCircleDependency 循环依赖对象
	 */
	@PostMapping("/circle-dependency")
	public void fooCircleDependency(@RequestBody FooCircleDependency fooCircleDependency) {

	}


	/**
	 * Claim Foo[]
	 * @apiNote 使用Foo[]作为入参
	 * @param foos 自定义对象数组
	 */
	@PostMapping("/array-type")
	public void fooArray(@RequestBody FooType[] foos) {

	}

	/**
	 * Claim Foo...
	 * @apiNote 使用Foo...作为入参
	 * @param foos 自定义对象数组
	 */
	@PostMapping("/array-types")
	public void fooArrays(@RequestBody FooType... foos) {

	}

	/**
	 *
	 * Claim List<Foo>
	 * @apiNote 使用List<Foo>作为入参
	 * @param foos 对象列表
	 */
	@PostMapping("/list-type")
	public void fooListType(@RequestBody List<FooType> foos) {

	}

	/**
	 * Claim Map<String, Foo>
	 * @apiNote 使用Map<String, Foo>类型作为入参
	 * @param fooMap fooMap
	 */
	@PostMapping("/map-type")
	public void fooMapType(@RequestBody Map<String, FooType> fooMap) {

	}

	/**
	 * Claim List<Map<String,Foo>>
	 * @apiNote 使用List<Map<String,Foo>>类型作为入参
	 * @param fooMaps fooMaps
	 */
	@PostMapping("/list-map-type")
	public void foodListMapType(@RequestBody List<Map<String, FooType>> fooMaps) {

	}

	/**
	 * Claim With @PathVariable & @RequestBody
	 * @apiNote 同时使用@PathVariable 和 @RequestBody 两个注解
	 * @param foodId 测试ID
	 * @param bar    测试自定义对象
	 */
	@PostMapping("use-both-path-variable-and-request-body/{id}")
	public void fooAnnotationWithPathVariableAndRequestBody(@PathVariable("id") Integer foodId,@RequestBody BarType bar){

	}

	/**
	 * (❎)Claim Map<String,?>
	 * @apiNote 反模式(不推荐)，声明Map<String,?> 与声明 Map<String,Object>相同
	 * @param fooMap fooMap
	 */
	@PostMapping("/map-generic-type")
	public void fooMapGeneric(@RequestBody Map<String, ?> fooMap) {

	}

	/**
	 * (❎)Claim T Generic Type
	 * @apiNote 反模式(不推荐)，声明 T t 作为入参，与声明Object相同，
	 * @param t t
	 */
	@PostMapping("list-t-generic")
	public <T> void foodG(@RequestBody T t) {

	}

	/**
	 * (❎)Claim List<? extends Foo>
	 * @apiNote 反模式(不推荐)，声明List<? extends Foo>与声明List<Object>相同，List<?> 同理
	 * @param foos foos
	 */
	@PostMapping("/list-generic-type-extends")
	public void fooListGenericExtends(@RequestBody List<? extends FooType> foos) {

	}


}
