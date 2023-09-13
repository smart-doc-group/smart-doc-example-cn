package com.power.doc.usecase.rpc.api.meta;

/**
 * RPC.Meta.Version Usecase
 * @author zongzi
 * @dubbo
 * @version <a href="https://smart-doc-group.github.io/#/zh-cn/dubbo/dubbo">2.5.3</a>
 */
public interface VersionUseCase {

	/**
	 * Use @version
	 * @apiNote 可以使用@version来指定整个Dubbo Service的版本，不指定时，此项为空
	 */
	void versionTagUse();

	/**
	 * When Use Multiple Versions
	 * @apiNote 使用多个@version来指定dubbo，同时又包含继承关系，只会有最后一个version会生效，查看RPC.Meta.Version Inherit Use Case章节，
	 * 可以在@version字段使用html代码。
	 *
	 *
	 */
	void multipleVersion();
}


/**
 * RPC.Meta.Version Inherit Usecase
 * @dubbo
 * @author zongzi
 * @version <a href="https://smart-doc-group.github.io/#/zh-cn/dubbo/dubbo">1.2.2</a>
 */
interface VersionInheritUseCase extends VersionUseCase {

}