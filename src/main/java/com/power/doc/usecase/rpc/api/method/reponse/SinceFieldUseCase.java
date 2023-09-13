package com.power.doc.usecase.rpc.api.method.reponse;

import com.power.doc.usecase.rpc.api.pojo.since.RpcFooSince;

/**
 * RPC.Method.Response.Since Usecase
 * @dubbo
 * @author zongzi
 *
 */
public interface SinceFieldUseCase {


	/**
	 * Use @since
	 * @apiNote 可以在类的属性注释中使用@since注解来表明开始的版本
	 *
	 * @return
	 */
	RpcFooSince useSinceTagAtMethod();
}
