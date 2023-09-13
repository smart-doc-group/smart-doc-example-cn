package com.power.doc.usecase.rest.api.path.parameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Parameter Name
 * @author zongzi
 */
@RestController
@RequestMapping("/api/path/parameter-name")
public class PathParameterNameUseCase {


	/**
	 *
	 * Specifying The Path Variable Name
	 * @apiNote 测试场景来源 <a href="https://www.baeldung.com/spring-pathvariable">Spring Path Variable</a>
	 * @param fooStr 测试参数，路径中为fooString,此处重命名为foo,
	 * @param fooInt 测试参数,和路径中保持一致
	 */
	@GetMapping("specifying-path-name/{fooString}/{fooInt}")
	public void bar(@PathVariable("fooString") String fooStr, @PathVariable Integer fooInt) {

	}

	/**
	 * Path With Regex
	 * @apiNote 测试场景来源 <a href="https://www.baeldung.com/spring-requestmapping">Spring Request Mapping#4.3</a>
	 * TODO #043 在路径中使用正则表达式时，参数名称可以正确绑定，但是生成的Curl-example 会有问题,貌似做了一个正则替换。
	 * @param fooStr 测试携带正则的参数绑定
	 */
	@GetMapping("/path-with-regex/{fooStr:^\\w{1,12}-[\\d|\\w]+$}")
	public void barPathWithRegex(@PathVariable String  fooStr){

	}
	/**
	 * Multiple Path
	 * @apiNote 测试场景来源 <a href="https://www.baeldung.com/spring-pathvariable">Spring Path Variable</a>
	 * TODO #040 如果使用了多个路径，测试的Curl-example只有一个路径（默认第一个)
	 * @param fooInt 测试可选参数
	 */
	@GetMapping(value = {"/optional/variable/{fooInt}/{fooLong}","/optional/variable/a/{fooInt}","/optional/variable/b/{fooLong}"})
	public void koo(@PathVariable Integer fooInt,@PathVariable Long fooLong ){}

	/**
	 * Multiple Path With Optional Path Variables
	 * @apiNote 测试场景来源 <a href="https://www.baeldung.com/spring-pathvariable">Spring Path Variable</a>
	 * TODO #041 如果多路径中出现类似如下可选参数的写法，则不会生成Path-parameters, 似乎只有所有的路径中都含有的参数才会生成Path-parameters,
	 *
	 * @param fooInt 测试可选参数
	 */
	@GetMapping(value = {"/optional/variable/","/optional/variable/{fooInt}","/optional/variable/a/{fooInt}"})
	public void bar(@PathVariable(required = false) Integer fooInt){}


}