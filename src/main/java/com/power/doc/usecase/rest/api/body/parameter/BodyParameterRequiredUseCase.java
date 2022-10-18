package com.power.doc.usecase.rest.api.body.parameter;

import com.power.doc.usecase.rest.pojo.required.BarJsr303;
import com.power.doc.usecase.rest.pojo.required.FooRequired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Required Field
 * @author zongzi
 */
@RestController
@RequestMapping("/query/body/parameter/required-field")
public class BodyParameterRequiredUseCase {
	/**
	 * Use @required(Not Recommend)
	 * @apiNote 可以在成员属性上添加@required注解表明参数必填，不推荐使用,查看链接
	 * <a href="https://smart-doc-group.github.io/#/zh-cn/start/javadoc?id=_22-required%e4%bd%bf%e7%94%a8%e4%b8%8d%e6%8e%a8%e8%8d%90"></a>
	 * @param foo 测试对象
	 */
	@GetMapping("/use-required-set")
	public void foo(@RequestBody FooRequired foo) {
	}

	/**
	 * Use JSR-303
	 * @apiNote 使用JSR-303中的标准中的注解进行用例说明，用例内容不仅仅包括Required字段，也包括Value字段和Description字段
	 * 注意：
	 * 1、Required 字段的变化只取决于三个注解: @NotNull @NotBlank @NotEmpty , 只有标识了这三个注解之一的字段会被标识为Required = True
	 * 2、TODO #019 这里列举了所有JSR-303注解对文档生成的影响，查看示例对象{@link BarJsr303}或者下方参数列表。
	 * @param barJsr303 测试实体
	 */
	@GetMapping("use-jsr-303")
	public void bar(@RequestBody BarJsr303 barJsr303) {
	}
}
