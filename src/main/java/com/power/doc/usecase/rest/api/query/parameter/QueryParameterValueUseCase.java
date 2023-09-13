package com.power.doc.usecase.rest.api.query.parameter;

import com.power.doc.usecase.rest.pojo.value.BarValue;
import com.power.doc.usecase.rest.pojo.value.FooValue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Value Field
 * @author zongzi
 */
@RestController
@RequestMapping("/query/parameters/value")
public class QueryParameterValueUseCase {


	/**
	 * Default Auto Mock
	 * @apiNote 在默认情况下smart-doc可以根据参数的类型为你生成示例值
	 * 注意：
	 * TODO #017 查看下方的Curl-Example, fooLongArray的取值和示例值不同,显示的是字符。
	 * TODO #024 查看下方的Curl-Example,fooEnums的取值格式存在异常，
	 * TODO #025 查看下方的Curl-Example,fooEnumMap的取值不存在。
	 * @param foo 测试对象
	 */
	@GetMapping("/default_mock")
	public void defaultMock(FooValue foo) {

	}

	/**
	 * Manual With @mock
	 * @apiNote 也可以使用@mock来自己指定示例值（通过在属性上使用@mock)字段,如下所示
	 * <code>
	 * class BarValue{
	 * //@mock <>;'[]\` & ！@#￥%……&*（）——(*´▽｀)ノノの😂
	 * String barString;
	 * //@mock 123a
	 * int barInt;
	 * //这里没有使用@mock注解，则交由smart-doc自动生成示例值
	 * 	long barLong;
	 * }
	 * </code>
	 * 注意：
	 * 1. TODO #018 在此处使用@mock指定的值，会直接影响Curl-example中的代码生成结果（查看下方Curl-Example)
	 * 2. 如果想查看JSR-303标准中的注解对示例值生成的影响，请查看{@link QueryParameterRequiredUseCase}
	 */
	@GetMapping("/manual-mock")
	public void manualMock(BarValue bar) {

	}
}

