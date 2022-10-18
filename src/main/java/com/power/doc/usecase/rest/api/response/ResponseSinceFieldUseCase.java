package com.power.doc.usecase.rest.api.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Since Field
 * @author zongzi
 */
@RestController
@RequestMapping("/response/since/")
public class ResponseSinceFieldUseCase {


	/**
	 * Usage of  @since tag
	 */
	@GetMapping("usage-of-since-tag")
	public FooSince foo() {
		return null;
	}

}
class FooSince{
	/**
	 * Use case of single @since tag
	 * @since 0.0.0.1
	 */
	String fooString;
	/**
	 * Use case of multiple @since tag
	 * @since 0.0.0.1
	 * @since 0.0.0.2
	 */
	Integer fooInteger;

	/**
	 * Use case of @since with special characters (etc. html,multiple lines)
	 * @since 2022-12-01_11.1.1.1
	 * @since 2022-12-01の11.1.1.1<br>
	 * @since <a href="https://smart-doc-group.github.io/#/zh-cn/">2.5.3</a><br>
	 * @since this is a since tag use
	 * multiple lines
	 * @since @mock @param @ignore @return
	 * @since 123456@qq.com
	 * @since ,,,,,,,,,,
	 */
	Long fooLong;
}