package com.power.doc.usecase.rest.api.path.parameter;

import com.power.doc.usecase.rest.pojo.type.FooEnum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Value Field
 * @author zongzi
 */
@RestController
@RequestMapping("/api/path/value/")
public class PathValueFieldUseCase {


	/**
	 * Mock boolean & char & double & float
	 * @param fooBool  测试bool类型的示例值
	 * @param fooChar  测试字符类型的示例值
	 * @param fooDouble 测试double类型的示例值
	 * @param fooFloat 测试float类型的示例值
	 */
	@GetMapping("/value-mock/{fooBool}/{fooChar}/{fooDouble}/{fooFloat}")
	public void foo(@PathVariable boolean fooBool, @PathVariable char fooChar, @PathVariable double fooDouble, @PathVariable float fooFloat) {

	}

	/**
	 * Mock Boolean & Character & Double & Float
	 * @param fooBool  测试Boolean类型的示例值
	 * @param fooChar  测试Character类型的示例值
	 * @param fooDouble 测试Double类型的示例值
	 * @param fooFloat 测试Float类型的示例值
	 */
	@GetMapping("/value-mock-box/{fooBool}/{fooChar}/{fooDouble}/{fooFloat}")
	public void fooBox(@PathVariable Boolean fooBool, @PathVariable Character fooChar, @PathVariable Double fooDouble, @PathVariable Float fooFloat) {

	}

	/**
	 * Mock byte & short & int & long
	 * @param fooByte  测试byte类型的示例值
	 * @param fooShort  测试short类型的示例值
	 * @param fooInt 测试int类型的示例值
	 * @param fooLong 测试long类型的示例值
	 */
	@GetMapping("/value-mock/{fooByte}/{fooShort}/{fooInt}/{fooLong}")
	public void bar(@PathVariable byte fooByte, @PathVariable short fooShort, @PathVariable int fooInt, @PathVariable long fooLong) {

	}

	/**
	 * Mock Byte & Short & Integer & Long
	 * @param fooByte  测试Byte类型的示例值
	 * @param fooShort  测试Short类型的示例值
	 * @param fooInt 测试Integer类型的示例值
	 * @param fooLong 测试Long类型的示例值
	 */
	@GetMapping("/value-mock-box/{fooByte}/{fooShort}/{fooInt}/{fooLong}")
	public void barStringAndEnumBox(@PathVariable Byte fooByte, @PathVariable Short fooShort, @PathVariable Integer fooInt, @PathVariable Long fooLong) {

	}

	/**
	 * Mock String & Enum
	 * @apiNote TODO #042 如果使用枚举类型的话，Description一栏会覆盖自己的参数描述
	 * @param fooStr  测试String类型的示例值
	 * @param fooEnum  测试枚举类型的示例值
	 *
	 */
	@GetMapping("/string-and-enum-mock-box/{fooStr}/{fooEnum}")
	public void barStringAndEnumBox(@PathVariable String fooStr, @PathVariable FooEnum fooEnum) {

	}

}
