package com.power.doc.usecase.rest.api.meta;


import com.power.doc.usecase.rest.api.query.parameter.QueryParameterTypeUseCase;
import lombok.Data;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Content-Type
 * @author zongzi
 */
@RestController
@RequestMapping("/meta/content-type")
public class ContentTypeUseCase {

	/**
	 * Json Format With @RequestBody
	 * @apiNote 使用@RequestBody时，Content-Type为 application/json
	 * TODO #002 只支持 application/json 、application/x-www-form-urlencoded 两种形式的Content-Type
	 * @param foo 任意参数
	 */
	@GetMapping("/application/json")
	public void fooJson(@RequestBody Foo foo) {

	}

	/**
	 * x-www-form-urlencoded
	 * @apiNote 参数中不使用任何注解时，Content-Type为 application/x-www-form-urlencoded
	 * @param foo 任意参数
	 */
	@GetMapping("/application/www")
	public void booFormUrlEncoded(Foo foo) {

	}

	/**
	 * x-www-form-urlencoded With @RequestParam
	 * @apiNote 参数中使用@RequestParam时，Content-Type为 application/x-www-form-urlencoded
	 * @param foo 任意参数
	 */
	@GetMapping(value = "application/www/request-param")
	public void fooFormUrlEncodedWithRequestParam(@RequestParam("foo") Foo foo) {

	}

	/**
	 * Json Format First
	 * @apiNote 同时使用@RequestBody，@RequestParam时, Content-Type为 application/json
	 * 于此同时，文档中只会出现Body-parameters。
	 * TODO #001 Query-Parameters 这一项却被删除了, 而Query-Parameters中的 字段说明被拼接在了Body-parameters中。其他的Query-Parameters的性质请查看 {@link QueryParameterTypeUseCase}
	 * @param foo 任意参数
	 * @param bar 任意参数
	 * @param id  id
	 * @author zongzi
	 */
	@GetMapping(value = "application/json/request-body/{id}")
	public void fooJsonWithRequestParamAndRequestBody(@RequestParam("foo") Foo foo, @RequestBody Bar bar, @PathVariable("id") Integer id) {

	}

	/**
	 * Specify The Content-Type Using Consumes Property
	 * @apiNote TODO #051 使用consumes字段尝试更改接口的Content-Type不会奏效，这个字段似乎只和方法入参的声明方式有关。
	 * @param bar 测试对象
	 */
	@PostMapping(value = "/application/specify-the-content-type",consumes = {MediaType.TEXT_HTML_VALUE})
	public void fooConsumerProperty(Bar bar){

	}
}

@Data
class Foo {
	private String foo;
}

@Data
class Bar {
	private String bar;
	private Integer barLong;
}