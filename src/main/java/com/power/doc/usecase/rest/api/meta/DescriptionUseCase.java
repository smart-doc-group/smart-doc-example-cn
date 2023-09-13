package com.power.doc.usecase.rest.api.meta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description(@apiNote)
 * @author zongzi
 *
 */
@RestController
@RequestMapping("/meta/description")
public class DescriptionUseCase {

	/**
	 * Description Default
	 *
	 */
	@GetMapping("default")
	public void foo() {

	}

	/**
	 * Description With @apiNote
	 *
	 * @apiNote 使用@apiNote字段可以单独进行接口说明, @apiNote只能在方法层面的注解上生效，
	 * <pre>
	 *     public class Foo{
	 *         private String fooString;
	 *     }
	 *
	 * </pre>
	 * <u>
	 *     <li>a</li>
	 *     <li>b</li>
	 * </u>
	 * <a href="https://smart-doc-group.github.io/#/zh-cn/"> this is a link to smart-doc's doc</a>
	 * TODO #004 如上所示，如果@apiNote，中含有html代码，则无法渲染。
	 *
	 */
	@GetMapping("/api-note")
	public void bar() {

	}
}
