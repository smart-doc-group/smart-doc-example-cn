package com.power.doc.usecase.rest.api.headers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Request Headers
 * @author zongzi
 */
@RestController
@RequestMapping("/headers")
public class RequestHeadersUseCase {


	/**
	 * Global Headers
	 * @apiNote 如果需要添加公共Headers，可以在<b>smart-doc.json</b>
	 * 中添加如下配置
	 * <code>
	 *     "requestHeaders": [ //设置请求头，没有需求可以不设置
	 *         {
	 *             "name": "global-header", //请求头名称
	 *             "type": "string", //请求头类型
	 *             "desc": "公共请求头", //请求头描述信息
	 *             "value": "any value", //不设置默认null
	 *             "required": false, //是否必须
	 *             "since": "-" //什么版本添加的改请求头
	 *         }
	 *     ]
	 * </code>
	 * 本目录下(Request Headers)的所有请求都会携带上方所声明的Header。
	 * @author zongzi
	 */
	@GetMapping("/set-global-headers")
	public void foo() {

	}

	/**
	 * Specific Header
	 * @apiNote 如果需要根据特定请求路径添加特定请求头，可以在<b>smart-doc.json</b>的requestHeaders属性中
	 * 添加`pathPatterns`属性,并匹配当前API的Path，如下：
	 * <code>
	 *     "requestHeaders": [ //设置请求头，没有需求可以不设置
	 *         {
	 *             "name": "specific-header", //请求头名称
	 *             "type": "string", //请求头类型
	 *             "desc": "特定请求头", //请求头描述信息
	 *             "value": "any value", //不设置默认null
	 *             "required": false, //是否必须
	 *             "since": "-" //什么版本添加的改请求头
	 *             "pathPatterns": "/headers/set-specific-header"
	 *         }
	 *     ]
	 * </code>
	 */
	@GetMapping("/set-specific-header")
	public void bar() {

	}

	/**
	 * Exclude Header
	 * @apiNote 如果想要屏蔽某个请求头，可以在<b>smart-doc.json</b>的requestHeaders属性中
	 * 添加`excludePathPatterns`属性,并匹配当前API的Path, 如下例子，
	 * 将在/headers/set-exclude-header路径上屏蔽前面设置的global-header:
	 *
	 * <code>
	 * 	      "requestHeaders": [ //设置请求头，没有需求可以不设置
	 *             {
	 * 	              "name": "global-header", //请求头名称
	 * 	              "type": "string", //请求头类型
	 * 	              "desc": "公共请求头", //请求头描述信息
	 * 	              "value": "any value", //不设置默认null
	 * 	              "required": false, //是否必须
	 * 	              "since": "-" //什么版本添加的改请求头
	 * 	              "excludePathPatterns":"/headers/set-exclude-header"
	 *              }
	 * 	      ]
	 * </code>
	 *
	 */
	@GetMapping("/set-exclude-header")
	public void koo() {

	}


	/**
	 * Claim Header At Method Level
	 * @apiNote 可以在方法注解上单独声明Header,使用headers属性
	 * TODO #051 在此处Headers中声明的Accept字段,无法影响最终的渲染结果中Content-Type字段
	 */
	@GetMapping(value = "/special-method-header", headers = {"fooKey=123","Accept=application/json"})
	public void laa() {

	}
}
