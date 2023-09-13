package com.power.doc.usecase.rest.api.path.parameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Required Field
 * @author zongzi
 */
@RestController
@RequestMapping("/api/path/required-set")
public class PathRequiredFieldUseCase {

	/**
	 * Set Path Param Not Required
	 * @apiNote 可以通过指定<code>@PathVariable(required = false)</code>来指定一个参数非必传，默认必传。
	 * @param fooStr 不是必传参数
	 * @param barStr 必传参数
	 */
	@GetMapping("/required-annotation/{fooStr}/{fooStr}/{barStr}")
	public void foo(@PathVariable(required = false) String fooStr, @PathVariable(required = true) String barStr) {
	}

}
