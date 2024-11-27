package com.power.doc.controller.enums;

import com.power.common.model.CommonResult;
import com.power.doc.entity.Order;
import com.power.doc.entity.SimpleUser;
import com.power.doc.enums.GenderEnum;
import com.power.doc.enums.OrderEnum;
import com.power.doc.enums.SimpleEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 枚举参数测试
 *
 * @author yu 2019/11/28.
 */
@RestController
public class EnumController {

    /**
     * 获取枚举参数1
     *
     * @param simpleEnum 简单枚举
     * @return
     */
    @GetMapping(value = "/enum0")
    public String test2(SimpleEnum simpleEnum) {
        System.out.println(simpleEnum.name());
        return "hello apiNote";
    }

    /**
     * 获取枚举参数2
     *
     * @param orderEnum 简单枚举
     * @return
     */
    @GetMapping(value = "/enum/{orderEnum}")
    public String testEnumPathVal0(@PathVariable OrderEnum orderEnum) {
        System.out.println(orderEnum.name());
        return "hello apiNote";
    }


    /**
     * 获取枚举参数3
     *
     * @param simpleEnum 简单枚举
     * @return
     */
    @GetMapping(value = "/enum/{simpleEnum}")
    public String testEnumPathVal(@PathVariable SimpleEnum simpleEnum) {
        System.out.println(simpleEnum.name());
        return "hello apiNote";
    }

    /**
     * 获取枚举参数4(json)
     *
     * @param order 简单枚举
     * @return
     */
    @PostMapping(value = "/enum/test1")
    public String testEnum2(@RequestBody Order order) {
        return "hello apiNote";
    }

    /**
     * 获取枚举参数5
     *
     * @param order 简单枚举
     * @return
     */
    @PostMapping(value = "/enum/test2")
    public Order testEnum3(Order order) {
        return null;
    }

    /**
     * 枚举响应
     *
     * @return
     */
    @GetMapping(value = "/enum/resp")
    public SimpleEnum resp() {
        return null;
    }

    /**
     * 测试枚举array
     * https://github.com/smart-doc-group/smart-doc/issues/254
     *
     * @param enums
     * @return
     * @author chen qi
     * @since 1.0.0
     */
    @GetMapping("/enum/testArray")
    public String testArray(OrderEnum[] enums) {
        return null;
    }

    /**
     * 测试枚举list
     *
     * @param enums
     * @return
     * @author chen qi
     * @since 1.0.0
     */
    @GetMapping("/enum/testList")
    public String testList(List<OrderEnum> enums) {
        return null;
    }

    /**
     * 测试@see
     *
     * @param enums enum
     * @return
     * @author chen qi
     * @see OrderEnum
     * @since 1.0.0
     */
    @GetMapping("/enum/see")
    public String testSee(String enums) {
        return null;
    }

    /**
     * 测试query参数枚举
     *
     * @param genderEnum
     * @return
     * @author cqmike
     * @since 1.0.0
     */
    @PostMapping("/enum/testQueryEnum")
    public String testQueryEnum(GenderEnum genderEnum) {
        return null;
    }


    /**
     * 测试 JsonValue枚举PathVariable + RequestParam
     *
     * @param genderEnum PathVariable 性别数据字典
     * @param test2      RequestParam 性别数据字典
     * @return null
     */
    @GetMapping("/testPathVariableAndRequestParamJsonValueEnum/{genderEnum}")
    public CommonResult<String> testPathVariableAndRequestParamJsonValueEnum(@PathVariable GenderEnum genderEnum,
                                                                             @RequestParam(value = "test2", required = false)
                                                                             GenderEnum test2) {
        SimpleUser simpleUser = new SimpleUser();
        simpleUser.setGender(genderEnum);
        return CommonResult.ok("genderEnum.code=" + genderEnum.getCode() + "\r\n test2.code=" + test2.getCode());
    }


    /**
     * 测试 普通枚举PathVariable + RequestParam
     *
     * @param simpleEnum1 PathVariable simpleEnum1
     * @param simpleEnum2 RequestParam simpleEnum2
     * @return null
     */
    @PostMapping("/testPathVariableAndRequestParamEnum/{simpleEnum1}")
    public CommonResult<String> testPathVariableAndRequestParamJsonValueEnum(@PathVariable SimpleEnum simpleEnum1,
                                                                             @RequestParam(value = "simpleEnum2", required = false)
                                                                             SimpleEnum simpleEnum2) {

        return CommonResult.ok("simpleEnum1=" + simpleEnum1.name() + "\r\n simpleEnum2=" + simpleEnum2.name());
    }

}
