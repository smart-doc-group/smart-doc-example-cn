package com.power.doc.usecase.rpc.api.method.meta;

/**
 * PRC.Method.Meta.Description Usecase
 * @dubbo
 * @author zongzi
 * @version 2.5.3
 */
public interface DescriptionUseCase {

	/**
	 * Show Method Description
	 * @apiNote 方法上的@apiNote之后的内容会被添加Description这一栏，缺省为空
	 * 在这一栏中的HTML代码会被正常渲染
	 * <u>
	 *    <li>first</li>
	 *    <li>second</li>
	 * </u>
	 * <pre>
	 *     System.out.println("this is a code snippet");
	 * </pre>
	 * <i> This is a Tag:i</i> <br>
	 * <i> 使用Tag:i渲染中文</i> <br>
	 * <i> 使用渲染中文</i> <br>
	 * <b> This is a Tag:b</b> <br>
	 * <b> 使用Tag:b渲染中文</b> <br>
	 * <b> 使用渲染中文</b> <br>
	 * <u> This is a Tag:u</u> <br>
	 * <u> 使用Tag:u渲染中文</u> <br>
	 * <u> 使用渲染中文</u> <br>
	 * <a href="https://smart-doc-group.github.io/#/zh-cn/expand?id=%e8%87%aa%e5%ae%9a%e4%b9%89%e5%bc%80%e5%8f%91%e6%89%a9%e5%b1%95">This a Tag:a </a> <br>
	 * <a href="https://smart-doc-group.github.io/#/zh-cn/expand?id=%e8%87%aa%e5%ae%9a%e4%b9%89%e5%bc%80%e5%8f%91%e6%89%a9%e5%b1%95">使用Tag:a渲染中文 </a> <br>
	 *
	 * TODO 0x0D 以下HTML标签无法渲染
	 */
	void showDescription();


	/**
	 * Use <> AS API Name Or &lt; &gt;
	 * @apiNote <....> <b><<<<<<>>>>>>></b> <code>This is a Code Snippet</code>
	 * TODO 0x04 当代码API的名称中出现<>，或者&lt; &gt;，渲染结果全部被替换为了对应的转义字符，这和HTML模版中的不一致,可读性也下降了
	 *
	 */
	void useHtmlCodeAsMethodComment();



}
