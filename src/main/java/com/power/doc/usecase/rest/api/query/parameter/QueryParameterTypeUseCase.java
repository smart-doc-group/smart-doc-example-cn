package com.power.doc.usecase.rest.api.query.parameter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;


import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;

import com.power.doc.usecase.rest.pojo.type.BarType;
import com.power.doc.usecase.rest.pojo.type.FooCircleDependency;
import com.power.doc.usecase.rest.pojo.type.FooEnum;
import com.power.doc.usecase.rest.pojo.type.FooType;
import org.checkerframework.framework.qual.RequiresQualifier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Type Field
 * @author zongzi
 */
@RestController
@RequestMapping("query/parameters/type")
public class QueryParameterTypeUseCase {

	/**
	 * Claim Basic Type
	 * @apiNote 基础的参数类型可以直接在controller方法的参数上声明, 如下代码所示
	 * <code>
	 *     `@GetMapping("/use-basic-type")`
	 *     public void fooWithBaseType(Integer fooId, Double barId, String kooName){};
	 * </code>,
	 * 此时Content-Type为<b>application/x-www-form-urlencoded;charset=UTF-8</b>
	 * @param fooId foo's id
	 * @param barId bar's id
	 * @param kooName koo's name
	 */
	@GetMapping("/use-basic-type")
	public void fooWithBaseType(Integer fooId, Double barId, String kooName) {

	}

	/**
	 * Claim Self-Definition Type
	 * @apiNote 自定义类型, 可以直接在参数列表中声明，代码如下
	 * <code>
	 *     `@GetMapping("/use-sel-definition-type")`
	 *      public void fooWithSelfDefinitionType(Foo foo){}
	 * </code>
	 * 注意：
	 * 此时自定义对象的参数名'foo'以及`@param foo`的注释无法获取
	 *
	 * @param foo 测试自定义对象
	 */
	@GetMapping("/use-sel-definition-type")
	public void fooWithSelfDefinitionType(FooType foo,FooEnum fooEnum) {

	}

	/**
	 * Claim Circle Dependency Type
	 * @apiNote foo对象的成员变量有bar，bar的成员变量有foo
	 *
	 * @param foo 测试对象
	 */
	@GetMapping("/use-circle-dependency-type")
	public void fooWithCircleDependency(FooCircleDependency foo) {

	}

	/**
	 * Claim With @RequestParam
	 * @apiNote TODO #007 当使用@RequestParam声明参数时，生成的Curl-example的代码会多包涵一个bar参数，如下代码
	 * <code>
	 *    	 `@GetMapping("/claim-with-request-param")
	 *        public void fooWithRequestParam(@RequestParam Bar bar){}
	 * </code>
	 * 生成的 Curl-example时，如下:
	 * <code>
	 *     curl -X GET -i http://{{host}}:{{port}}/query/parameters/type/claim-with-request-param?barString=bison&bar=
	 * </code>
	 * @param bar 测试自定义对象
	 */
	@GetMapping("/claim-with-request-param")
	public void fooWithRequestParam(@RequestParam BarType bar,@RequestParam String fooStr) {

	}

	/**
	 * Specify The Param Name
	 * @apiNote 可以使用@RequestParam(value="fooStr") 来指定参数的适配
	 * TODO #044 查看Curl-example一栏，--data参数的值是否正确,查看链接 https://linuxize.com/post/curl-post-request/
	 * 场景来源 https://www.baeldung.com/spring-request-param   #3 Specifying the Request Parameter Name
	 * @param fooStr 测试字符串
	 * @param barStr 测试字符串
	 */
	@GetMapping("specify-the-param-name/")
	public void specifyTheParamName(@RequestParam("fooStr")String fooStr,@RequestParam String barStr){

	}

	/**
	 * Mix Request Param Up（Basic Type)
	 * @apiNote 将普通参数与添加@RequestParam的参数混合声明
	 * TODO #045 查看Curl-example一栏，--data参数的值是否正确。这种情况似乎在多个@RequestParam或者@RequestParam和不携带RequestParam的参数互用时才会产生(即多个入参时）,
	 * 并且出现在--data中的示例值一定是使用@Requestparam注解的参数。下方的示例也具有同样的问题
	 * @param fooStr 测试字符串入参
	 * @param barStr 测试字符串入参
	 * @param bizStr 测试字符串入参
	 */
	@GetMapping("specify-the-param-name-2/")
	public void specifyTheParamName2(String fooStr,@RequestParam String barStr,String bizStr){

	}

	/**
	 * Mix Request Param Up (Http Types)
	 * @apiNote 将普通参数与添加@RequestParam的参数混合声明，查看代码
	 * <code>public void bar(HttpServletRequest request,@RequestParam String barStr,@RequestParam String bizStr)</code>
	 * @param request 请求体
	 * @param barStr 请求参数
	 * @param bizStr 请求参数
	 */
	@GetMapping("mix-request-param-with-no-reqeust-param/")
	public void bar(HttpServletRequest request,@RequestParam String barStr,@RequestParam String bizStr){

	}

	/**
	 *
	 * Claim With Optional API
	 * @apiNote 当使用Optional Api作为接口入参时的参数类型声明,
	 * 示例场景来源 <a href="https://www.baeldung.com/spring-request-param">Spring Request Param#4.1 Using Java 8 Optional</a>
	 * TODO #046 使用Optional API 时, Query-Parameters的分析结果存在问题，（Type/Value/Description)，Curl-Example的参数示例值存在问题
	 * @param fooStr 测试字符串，声明方式Optional<String>
	 */
	@GetMapping("claim-with-optional-apis")
	public void fooWithOptionalApi(@RequestParam("fooStr")Optional<String> fooStr){

	}

	/**
	 * A Default Value For Request Param
	 * @apiNote 当指定Request Param的默认值时，
	 * 测试场景来源 <a href="https://www.baeldung.com/spring-request-param#a-default-value-for-the-request-parameter">Spring Request Param#5。A Default Value for the Request Parameter</a>
	 * TODO #047 当RequestParam指定了默认值时，Curl-Example 也产生了--data的值，并且格式似乎也不正确。
	 * @param fooStr 设置了defaultValue值，
	 */
	@GetMapping("use-request-param-with-default-value")
	public void requestParamAnnotationWithDefaultValue(@RequestParam(defaultValue = "smart-doc")String fooStr){

	}
	/**
	 * Claim With @RequestBody
	 * @apiNote 参数可以和@RequestBody一同声明
	 * 注意：
	 * TODO #006 但是和@RequestBody一同声明，如果包含对象的话（如下代码中的参数`foo`)，
	 * <code>
	 *     `@GetMapping("/use-annotation-request-body")`
	 *     public void fooWithRequestBodyAndSelfDefinitionType(Integer fooId, BarType bar1, @RequestBody BarType bar2)
	 * </code>
	 * foo的字段会跑到Body-parameters一栏中，
	 * @param barId 测试自定义
	 * @param bar1   测试自定义对象
	 * @param bar2   测试自定义对象
	 */
	@GetMapping("/use-annotation-request-body")
	public void fooWithRequestBodyAndSelfDefinitionType(Integer barId, BarType bar1, @RequestBody BarType bar2) {

	}

	/**
	 * Claim With @RequestBody & @RequestParam
	 * @apiNote 同时声明@RequestParam 和 @RequestBody
	 * 注意：同时声明结果同 #006 的效果一致
	 * @param bar1 测试对象1
	 * @param bar2 测试对象2
	 */
	@GetMapping("/use-annotation-request-body-and-request-param")
	public void fooWithRequestBodyAndRequestParam(@RequestParam BarType bar1, @RequestBody BarType bar2) {

	}

	/**
	 * Claim Array(Basic Type)
	 * @apiNote 声明基础类型数组作为入参 TODO #048 产生的Curl-example的示例值的类型为String，
	 * @param ids 测试ID列表
	 * @param characters TODO #049 实例值应为字符数组，但是此时为对象列表数组
	 */
	@GetMapping("/use-basic-type-array")
	public void fooWithArrayBasicType(Integer[] ids,Byte[] bytes,Short[] shorts,Long[] longs,
			Boolean[] booleans,Character[] characters,Float[] floats,Double[] doubles, Date[] dates, BigDecimal[] bigDecimals,
			FooEnum[] fooEnums) {

	}

	/**
	 * Claim  Bar[]
	 * @apiNote 声明对象数组作为入参
	 * 注意：TODO #008 smart-doc 在方法入参中使用对象数组时，会抛出异常，如果使用@RequestParam时,则会直接跳过Query-parameters渲染
	 * @param bars 测试对象数组
	 */
	@GetMapping("use-object-array")
	public void fooWithArrayObjects(@RequestParam BarType[] bars) {

	}

	/**
	 * Claim List(Basic Type)
	 * @apiNote 示例场景来源 <a href="https://www.baeldung.com/spring-request-param#mapping-a-multi-value-parameter">Spring Request Param #7 Mapping a Multi-Value Parameter</a>
	 * @param fooStrList 示例多值列表
	 */
	@GetMapping("calim-with-multiple-values")
	public void fooWithMultipleParams(@RequestParam List<String> fooStrList,@RequestParam List<Integer> integers,@RequestParam List<Byte> bytes,@RequestParam List<Short> shorts,
			@RequestParam List<Long> longs){

	}
	/**
	 * Claim List<Bar>
	 * @apiNote 使用泛型声明参数,
	 * 注意：TODO #009 smart-doc 在方法入参中使用集合框架时，会抛出异常，如果使用@RequestParam时,则会直接跳过Query-parameters渲染,
	 * 但是List<FooEnum>却可以正常渲染
	 * @param bars 测试对象列表
	 */
	@GetMapping("generic-type-list")
	public void fooWithGenericTypeList(@RequestParam List<BarType> bars,@RequestParam List<FooEnum> fooEnums) {
	}

	/**
	 * Claim Map<String,String>
	 * @apiNote 使用泛型声明参数
	 * 注意：TODO #035 smart-doc 在方法入参中使用Map<String,String>，生成的Curl-Example会有问题，查看链接
	 * <a href="https://www.baeldung.com/spring-request-param#mapping-all-parameters"> Spring Request Param #6. Mapping All Parameters/a>
	 * @param barMap 测试对象列表
	 */
	@GetMapping("String-type-with-map")
	public void fooWithStringTypeMap(@RequestParam Map<String, String> barMap) {
	}

	/**
	 * Claim Map<String,Bar>
	 * @apiNote 使用泛型声明参数
	 * 注意：TODO #010 smart-doc 在方法入参中使用Map时，会抛出警告，如果使用@RequestParam时,会直接渲染Map<K,V>中的V
	 * @param barMap 测试对象列表
	 */
	@GetMapping("generic-type-with-map")
	public void fooWithGenericTypeMap(@RequestParam Map<String, BarType> barMap) {
	}

}
