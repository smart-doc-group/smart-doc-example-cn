package com.power.doc.usecase.rest.api.meta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * URL
 * @author zongzi
 */
@RestController
@RequestMapping("/meta/url/")
public class UrlUseCase {

	/**
	 * Base URL
	 * @apiNote 生成一个普通Restful的链接
	 */
	@GetMapping("base")
	public void baseUrl() {
	}

	/**
	 * URL With Path Variable
	 * @apiNote 生成一个含有路径参数的链接
	 * @param foo 任意参数
	 */
	@GetMapping("/base/{foo}")
	public void urlWithVariable(@PathVariable("foo")Integer foo){

	}


	/**
	 * Claim Multiple URL At Same Time
	 * @apiNote 一次性声明多个链接
	 */
	@GetMapping(value = {"multiple/url-1","multiple/url-2"})
	public void multipleUrls(){

	}

}