package com.power.doc.usecase.rest.api.path.parameter;

import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Type Field
 * @author zongzi
 */
@RestController
@RequestMapping("/api/path/type/")
public class PathTypeFieldUseCase {
	/**
	 * Multiple Path Params With Map<String,String>
	 * @apiNote 测试场景来源 <a href="https://www.baeldung.com/spring-pathvariable">Spring Path Variable</a>
	 * TODO #037 如果使用Map<String,String> 来接收参数，不会显示Path-parameters这一栏, curl-example一栏也不正确，其他所有场景都被此特性覆盖，不用重复测试。
	 * @param pathMap 使用Map接收多参数
	 */
	@GetMapping("multiple-path-param-with-map/{fooString}/{fooInt}")
	public void fooMultipleParamWithMap(@PathVariable Map<String, String> pathMap) {
	}

	/**
	 * Multiple Path Params With Map<String,Object>
	 * @apiNote 测试场景来源 <a href="https://www.baeldung.com/spring-pathvariable">Spring Path Variable</a>
	 * TODO #038 如果使用Map<String,Object> 来接收参数，不会显示Path-parameters这一栏, 显示了Query-Parameters一栏
	 * @param pathObjectMap 使用Map接收多参数
	 */
	@GetMapping("multiple-path-param-with-object-map/{fooString}/{fooInt}")
	public void fooMultipleParamWithObjectMap(@PathVariable Map<String, Object> pathObjectMap) {
	}

	/**
	 * Using java.util.Optional
	 * @apiNote 使用java.util.Optional作为入参，测试场景来源 <a href="https://www.baeldung.com/spring-pathvariable">Spring Path Variable</a>
	 * TODO #039 如果使用Map<String,Object> 来接收参数，不会显示Path-parameters这一栏, 显示了Query-Parameters一栏，是否需要修正？
	 * @param fooInt 使用Optional的Integer
	 */
	@GetMapping("/using-java-util-optional-type/{fooInt}")
	public void fooUsingJavaUtilOptionalType(@PathVariable Optional<Integer> fooInt){

	}



}
