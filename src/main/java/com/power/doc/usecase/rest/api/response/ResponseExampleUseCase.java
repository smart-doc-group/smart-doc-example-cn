package com.power.doc.usecase.rest.api.response;

import com.power.doc.usecase.rest.pojo.required.BarJsr303;
import com.power.doc.usecase.rest.pojo.value.BarValue;
import com.power.doc.usecase.rest.pojo.value.FooValue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Response Example
 * @author zongzi
 */
@RestController
@RequestMapping("/response/response-example")
public class ResponseExampleUseCase {
	/**
	 * Return With Default Auto Mock
	 * @apiNote 在默认情况下smart-doc可以根据参数的类型为你生成示例值
	 * 注意：
	 * 1、TODO #021 下方Response-example一栏中的"fooByte"示例值为字符串，存在问题
	 * 2、TODO #022 下方Response-example一栏中的"fooCharInBox"示例值为字符串，存在问题
	 * 3、TODO #023 下方Response-example一栏中的"fooEnumMap"示例值的Key为MapKey，是否存在问题？
	 * @param foo 测试对象
	 */
	@GetMapping("/return-with-default_mock")
	public FooValue defaultMock() {
		return null;
	}

	/**
	 * Return Type With @mock Tag
	 * @apiNote 也可以使用@mock来自己指定示例值（通过在属性上使用@mock)字段,如下所示
	 * <code>
	 * class BarValue{
	 * //@mock "this is my mock string with "{"fooString":"123"} \" "
	 * String barString;
	 * //@mock 123a
	 * int barInt;
	 * //这里没有使用@mock注解，则交由smart-doc自动生成示例值
	 * 	long barLong;
	 * }
	 * </code>
	 */
	@GetMapping("/return-self-type-with-manual-mock")
	public BarValue manualMock() {
		return null;
	}


	/**
	 * Return Type Use JSR-303
	 * @apiNote 使用JSR-303的注解无法影响示例值的产生逻辑。
	 * @return BarJsr303
	 */
	@GetMapping("/example-with-jsr-303")
	public BarJsr303 exampleWithJsr303() {
		return null;
	}
}
