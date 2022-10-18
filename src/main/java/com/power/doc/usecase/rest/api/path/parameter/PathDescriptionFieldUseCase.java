package com.power.doc.usecase.rest.api.path.parameter;

import com.power.doc.usecase.rest.pojo.type.FooEnum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description Field
 *
 * @author zongzi <a href="https://www.baeldung.com/spring-pathvariable">场景来源</a>
 */
@RestController
@RequestMapping("/api/path/description")
public class PathDescriptionFieldUseCase {

	/**
	 * Simple Mapping
	 *
	 * @param fooString 测试字符传参的注解
	 */
	@GetMapping("multiple-path-param/{fooString}")
	public void fooSimpleMapping(@PathVariable("fooString") String fooString) {

	}
	/**
	 * Multiple Path Params
	 * @apiNote 如果类型是Enum时，@param的表述会被枚举的的示例值覆盖 {@link PathValueFieldUseCase#barStringAndEnumBox(String, FooEnum)}
	 * @param fooString 测试字符传参的注解
	 * @param fooInt 测试int传参的注解
	 *
	 */
	@GetMapping("multiple-path-param/{fooString}/{fooInt}")
	public void foo(@PathVariable("fooString") String fooString, @PathVariable("fooInt") Integer fooInt) {



	}
}
