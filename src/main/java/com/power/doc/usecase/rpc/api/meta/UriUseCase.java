package com.power.doc.usecase.rpc.api.meta;

/**
 * RPC.Meta.URI Usecase
 * @dubbo
 * @author zongzi
 */
interface UriUseCase {

	/**
	 * URI Come From Interface's ClassPath
	 * @apiNote TODO 0x00 接口元数据中的URI来源于标注了@dubbo注解的类路径，但是会多带上http信息（因为smart-doc.json)中的配置。
	 */
	void uriComeFromInterfaceClassPath();

	/**
	 * RPC.Meta.URI(Inner Interface) Usecase
	 * @dubbo
	 */
	interface FooInnerRpc{
		/**
		 * URI Come From Interface's ClassPath
		 * @apiNote 即使是内部类，也会同样按照包路径+类名 生成接口级的文档
		 */
		void foo();
	}
}


