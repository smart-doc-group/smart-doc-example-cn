package com.power.doc.usecase.rest.api.response;

import com.power.doc.usecase.rest.pojo.parameter.FooJsonParameterName;
import com.power.doc.usecase.rest.pojo.parameter.FooParameterName;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Response Filed Name
 * @author zongzi
 */
@RestController
@RequestMapping("/response/field-name")
public class ResponseFieldNameUseCase {
	/**
	 * Ignore Some Parameter(Use @ignore)
	 * @apiNote 使用@ignore字段可以在生成的Body-Parameter字段中忽略一些字段，
	 * 举例说明：声明一个对象Foo
	 * <code>
	 * class Foo{
	 *      //  此字段应该被正常渲染
	 *     String fooStringNotIgnore;
	 *
	 *      //此字段会在最后的渲染结果中被忽略
	 * 	    //@ignore
	 *      String fooStringToIgnore;
	 *
	 * }
	 * </code>
	 * 并在方法上返回
	 * TODO #032 在Response-example中，产生了被忽略值的示例，和Response-fields中的表现不一致
	 * @return FooParameterName 示例对象
	 */
	@PostMapping("/use-ignore")
	public FooParameterName fooUseIgnore() {
		return null;
	}

	/**
	 * Use Jackson Annotations
	 * @apiNote 使用 com.fasterxml.jackson.annotation 下的注解
	 * `@JsonProperty / `@JsonProperty / `@JsonIgnore /`@JsonIgnoreType进行用例展示
	 * <pre>
	 * `@JsonIgnoreProperties({"fooClassStringToIgnore"})
	 * class Foo{
	 *       //此字段
	 *       `@JsonProperty("fooString")
	 *        String fooStringWithJsonAnnotation;
	 *
	 *    	 `@JsonIgnore
	 *    	 String fooStringToIgnore;
	 *
	 * 		 //在Class上声明被忽略的成员变量
	 * 	     String fooClassStringToIgnore;
	 *
	 * 		 //使用@JsonIgnoreType声明的类型
	 * 		 Bar bar;
	 *   }
	 * `@JsonIgnoreType
	 * `@Data
	 * class Bar {
	 * 		String barString;
	 * }
	 * </pre>
	 * TODO #033 JsonIgnoreType似乎没有起作用，查看下方的Response-fields, bar字段还是正常显示了
	 * @return  FooJsonParameterName 使用了一些jackson的注解对象
	 *
	 */
	@PostMapping("/use-jackson-annotation")
	public FooJsonParameterName fooUseFastJsonAnnotation() {
		return null;
	}
}
