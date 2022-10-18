package com.power.doc.usecase.rest.api.response;

import java.util.Map;

import com.power.doc.usecase.rest.pojo.description.BarDescription;
import com.power.doc.usecase.rest.pojo.description.FooDescription;
import com.power.doc.usecase.rest.pojo.type.BarType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description Field
 * @author zongzi
 */
@RestController
@RequestMapping("/response/description")
public class ResponseDescriptionUseCase {
	/**
	 * Return Basic Type
	 * @apiNote 如果方法返回的是个简单对象，则没有地方进行说明
	 * @return Integer id
	 */
	@GetMapping("/simple-int")
	public Integer foo() {
		return null;
	}

	/**
	 * Return Self-Definition Type
	 * @apiNote 如果方法的返回对象是个自定义对象，可以在对象的成员变量上添加注释，进行说明
	 * @return  FooDescription
	 */
	@GetMapping("/self-definition-type")
	public FooDescription bar() {
		return null;
	}


	/**
	 * Special Character
	 * @apiNote 一些描述中的特殊字符
	 * @return BarDescription 测试对象
	 */
	@GetMapping("/special-characters")
	public BarDescription koo(){
		return null;
	}

	/**
	 * Return Map<String,String>
	 * @apiNote 使用Map<String, String>作为返回对象
	 * TODO ?003 对比下方的Map<String,Bar>的返回，查看Description字段的差异，此处 "A map key" 是否应该改为类似 "The Vale Type of this field is string"?
	 * @return Map<String, String>  测试对象列表
	 */
	@GetMapping("return-map-string-string")
	public Map<String, String> fooReturnStringTypeMap() {
		return null;
	}

	/**
	 * Return Map<String,Bar>
	 * @apiNote 使用Map<String,Bar>作为返回对象
	 * 注意，此时的Description中mapKey field 字段的描述是对象上的类注释，
	 * @return  Map<String, BarType> 返回对象类型
	 */
	@GetMapping("return-map-string-self-type")
	public  Map<String, BarType> fooReturnGenericTypeMap() {
		return null;
	}
}
