package com.power.doc.usecase.rest.api.meta;

import java.lang.reflect.Method;

import lombok.Data;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Type
 * @author zongzi
 * @version 2.5.3
 */
@RestController
@RequestMapping("/meta/type")
public class RequestTypeUseCase {

	/**
	 * Get Request
	 * @apiNote 生成Get请求的API文档
	 * @since 2.5.3
	 */
	@GetMapping("/get")
	public void get() {
	}

	/**
	 * Get Request With @PathVariable & @RequestBody & @RequestParam
	 * @apiNote Get请求中使用@PathVariable & @RequestBody & @RequestParam 声明入参
	 * @param id id
	 * @param foo foo
	 */
	@GetMapping("/get/{id}")
	public void getWithPathVariableAndRequestBody(@PathVariable Integer id, @RequestParam String foo, @RequestBody String bar) {

	}

	/**
	 * Post Request
	 * @apiNote 生成Post请求的API文档
	 * @since 2.5.3
	 */
	@PostMapping("/post")
	public void post() {
	}

	/**
	 * Post Request With @PathVariable & @RequestParam (Basic Type)
	 * @apiNote 测试使用Post方法，但是同时使用@RequestParam 和 @PathVariable注解简单对象
	 * TODO #027 此处使用两个基本类型时，错误的产生了Request-body示例，产生的Curl-example不正确，
	 * @param id 测试id
	 * @param foo 测试RequestParam
	 */
	@PostMapping("/post/{id}")
	public void postWithPathVariableAndRequestParam(@PathVariable Integer id, @RequestParam String foo) {

	}

	/**
	 * Post Request With @PathVariable & @RequestParam (Self-Definition Type)
	 * @apiNote 测试使用Post方法，但是同时使用@RequestParam 和 @PathVariable注解自定义类型
	 * TODO #028 使用@RequestParam注解自定义类型时，产生的Curl-example不正确，
	 * @param id 测试id
	 * @param foo 测试RequestParam
	 */
	@PostMapping("/post/self-definition/{id}")
	public void postWithPathVariableAndRequestParamButObject(@PathVariable Integer id, @RequestParam FooRequestType foo) {

	}

	/**
	 * Delete Request
	 * @apiNote 生成Delete请求
	 * @since 2.5.3
	 */
	@DeleteMapping("/delete")
	public void delete() {
	}

	/**
	 * Delete Request With @PathVariable & @RequestParam (Basic Type)
	 * @apiNote 使用Delete方法，但是同时使用@RequestParam 和 @PathVariable注解自定义类型
	 * TODO #029 此处使用两个基本类型时，产生的Curl-example不正确
	 * @since 2.5.3
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id, @RequestParam String foo) {
	}

	/**
	 * Delete Request With @PathVariable & @RequestParam (Self-Definition Type)
	 * @apiNote 使用Delete方法，但是同时使用@RequestParam 和 @PathVariable注解自定义类型
	 * @since 2.5.3
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id, @RequestParam FooRequestType foo) {
	}

	/**
	 * Put Request
	 * @apiNote 测试使用Put方法
	 * @since 2.5.3
	 */
	@PutMapping("/put")
	public void put() {

	}

	/**
	 * Put Request With @PathVariable & @RequestParam (Basic Type)
	 * @apiNote 测试使用Put方法，但是同时使用@RequestParam 和 @PathVariable注解自定义类型
	 * TODO #030 此处使用两个基本类型时，错误的产生了Request-body示例，foo参数的位置在--data中，和下方示例不一致，但是也没有问题
	 * @param id 测试id
	 * @param foo 测试RequestParam
	 */
	@PutMapping("/put/self-definition/{id}")
	public void putWithPathVariableAndRequestParamButObject(@PathVariable Integer id, @RequestParam String foo) {

	}

	/**
	 * Put Request With @PathVariable & @RequestParam (Self-Definition Type)
	 * @apiNote 测试使用Put方法，但是同时使用@RequestParam 和 @PathVariable注解自定义类型
	 * TODO #031 使用@RequestParam注解自定义类型时，产生的Curl-example不正确，多添加了一个foo
	 * @param id 测试id
	 * @param foo 测试RequestParam
	 */
	@PutMapping("/put/self-definition/{id}")
	public void putWithPathVariableAndRequestParamButObject(@PathVariable Integer id, @RequestParam FooRequestType foo) {

	}

	/**
	 * Claim Multiple Request Method At Same Time
	 * @apiNote 实例场景来源
	 * <a href="https://www.baeldung.com/spring-requestmapping#2-requestmapping----multiple-http-request-methods-to-the-same-controller-method">Request
	 * Mapping #6.2. @RequestMapping — Multiple HTTP Request Methods to the Same Controller Method</a>
	 * TODO #050 产生的Curl-example中的-X 参数的值不正确
	 */
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "multiple-methods")
	public void fooMultipleHttpMethod() {

	}
}

@Data
class FooRequestType {
	String fooString;
	Integer fooInteger;
}
