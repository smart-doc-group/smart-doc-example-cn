package com.power.doc.usecase.rest.api.meta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author(@author)
 * @author zongzi
 */
@RestController
@RequestMapping("/meta/author")
public class AuthorUseCase {


	/**
	 * `@author` In Default
	 * @apiNote 默认情况下，API.Meta.Author 的取值为类文件上的@author注解所标示的值
	 * TODO #003 在@author字段之后的所有内容都会被拼接上，
	 *
	 */
	@GetMapping("/default")
	public void foo() {

	}

	/**
	 * `@author` At Method Level
	 * @apiNote 如果需要指定单个接口的作者，可以在方法签名上使用@author注解
	 * @author zonzi at method level
	 */
	@GetMapping("/at-method-level")
	public void bar() {

	}
}
