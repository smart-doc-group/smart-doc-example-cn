package com.power.doc.usecase.rest.pojo.description;

import lombok.Data;

/**
 * 特殊字符测试
 * @author zongzi
 */
@Data
public class BarDescription {
	/**
	 * `!@#$%^&*()_~{}[]\;':",./<>?</>
	 * (*´▽｀)ノノ
	 * (灬ꈍ ꈍ灬)
	 * 🤺
	 * 😂
	 * の
	 */
	String barString;

	/**
	 * &nbsp;&lt; &gt;
	 * <a>ccccccc</a>
	 *
	 * <p>这是一个段落</p>
	 * <code>      System.out.println("this are some code")  </code>
	 *
	 * {@code System.out.println("this is a code snippet use @code ")
	 * <br>
	 * <pre>
	 *     public class Foo {
	 *         private String fooString;
	 *     }
	 * </pre>
	 * <u>
	 *     <li>aaa</li>
	 *     <li>bbb</li>
	 * </u>
	 * `<String,Bo>`
	 * <a href="https://smart-doc-group.github.io/#/zh-cn/"> this is a link to smart-doc's doc</a>
	 * TODO #014 如果代码中的注释使用`Map&lt_;String,Bar&gt_;`则生成的HTML文档中所有其他地方的< 会变成&lt;(即进行转义),如果是类成员变量上的HTML代码，也可以在结果中正常渲染
	 */
	int barInt;
}
