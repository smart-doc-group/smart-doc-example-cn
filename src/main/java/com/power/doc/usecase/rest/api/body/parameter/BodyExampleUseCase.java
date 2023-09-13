package com.power.doc.usecase.rest.api.body.parameter;

import com.power.doc.usecase.rest.pojo.value.BarValue;
import com.power.doc.usecase.rest.pojo.value.FooValue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Body Example
 * @author zongzi
 */
@RestController
@RequestMapping("/query/body/parameter/body-example")
public class BodyExampleUseCase {
	/**
	 * Default Auto Mock
	 * @apiNote 在默认情况下smart-doc可以根据参数的类型为你生成示例值
	 * 注意：
	 * 1、TODO #021 下方Request-body一栏中的"fooByte"示例值为字符串，存在问题
	 * 2、TODO #022 下方Request-body一栏中的"fooCharInBox"示例值为字符串，存在问题
	 * 3、TODO #023 下方Request-body一栏中的"fooEnumMap"示例值的Key为字符串，存在问题
	 * @param foo 测试对象
	 */
	@GetMapping("/default_mock")
	public void defaultMock(@RequestBody FooValue foo) {

	}

	/**
	 * Manual With @mock
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
	 * 注意：
	 * 1. 如果想查看JSR-303标准中的注解对示例值生成的影响，请查看{@link BodyParameterRequiredUseCase}
	 */
	@GetMapping("/manual-mock")
	public void manualMock(@RequestBody BarValue bar) {

	}

}
