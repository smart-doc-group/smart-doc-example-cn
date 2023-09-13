package com.power.doc.usecase.rpc.api.method.invoke;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.power.doc.usecase.rpc.api.pojo.required.RpcBarJsr303;

/**
 * RPC.Method.Invoke.Required Usecase
 * @dubbo
 * @author zongzi
 */
public interface RequiredUseCase {


	/**
	 * Use JSR-303 Annotation
	 * @apiNote 可以使用@NotNull/@NotEmpty/@NotBlank注解来将参数标识为必传，默认情况下为false（非必传）
	 * @param fooStr 使用@NotNull注解
	 * @param barStr 使用@NotEmpty注解
	 * @param kooStr 使用@NotBlank注解
	 * @param bizStr 未使用注解情况下默认为"非必传"
	 */
	void useJsr303Tag(@NotNull String fooStr, @NotEmpty String barStr, @NotBlank String kooStr,String bizStr);

	/**
	 * Use JSR-303 Inner Class
	 * @apiNote 同样也可以在实体类中标注JSR-303注解的形式影响Required字段
	 * @param rpcBarJsr303 使用了JSR-303注解的实体类
	 */
	void useJsr303TagInnerClass(RpcBarJsr303 rpcBarJsr303);
}
