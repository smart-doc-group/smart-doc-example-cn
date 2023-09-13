package com.power.doc.usecase.rpc.api.meta;

/**
 * RPC.Meta.Author Usecase
 * @author zongzi
 * @dubbo
 */
public interface AuthorUseCase {

	/**
	 * Default Author
	 * @apiNote 默认的Service作者是空，可以通过@author指定
	 */
	void defaultAuthorIsNull();


	/**
	 * Method Author Is Not Available
	 * @apiNote 在方法上声明的@author是不会被渲染的
	 * @author zongzi-1
	 */
	void methodVersionIsNotAvailable();
}
