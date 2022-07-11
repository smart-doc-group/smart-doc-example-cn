package com.power.doc.controller;

import com.power.doc.entity.Order;
import com.power.doc.enums.OrderEnum;
import com.power.doc.enums.SimpleEnum;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 枚举参数测试
 * @author yu 2019/11/28.
 */
@RestController
public class EnumController {

    /**
     * 获取枚举参数1
     * @param simpleEnum 简单枚举
     * @return
     */
    @GetMapping(value = "/enum")
    public String test(SimpleEnum simpleEnum){
        System.out.println(simpleEnum.name());
        return "hello apiNote";
    }

    /**
     * 获取枚举参数2
     * @param orderEnum 简单枚举
     * @return
     */
    @GetMapping(value = "/enum/{orderEnum}")
    public String testEnumPathVal0(@PathVariable OrderEnum orderEnum){
        System.out.println(orderEnum.name());
        return "hello apiNote";
    }


    /**
     * 获取枚举参数3
     * @param simpleEnum 简单枚举
     * @return
     */
    @GetMapping(value = "/enum/{simpleEnum}")
    public String testEnumPathVal(@PathVariable SimpleEnum simpleEnum){
        System.out.println(simpleEnum.name());
        return "hello apiNote";
    }

    /**
     * 获取枚举参数4(json)
     * @param order 简单枚举
     * @return
     */
    @PostMapping(value = "/enum/test1")
    public String testEnum2(@RequestBody Order order){
        return "hello apiNote";
    }

    /**
     * 获取枚举参数5
     * @param order 简单枚举
     * @return
     */
    @PostMapping(value = "/enum/test2")
    public Order testEnum3(Order order){
        return null;
    }

    /**
     * 枚举响应
     * @return
     */
    @GetMapping(value = "/enum/resp")
    public SimpleEnum resp(){
        return null;
    }

    /**
     * 测试枚举array
     * https://github.com/smart-doc-group/smart-doc/issues/254
     * @author chen qi
     * @param enums
     * @since 1.0.0
     * @return
     */
    @GetMapping("/enum/testArray")
    public String testArray(OrderEnum[] enums) {
        return null;
    }

    /**
     * 测试枚举list
     *
     * @author chen qi
     * @param enums
     * @since 1.0.0
     * @return
     */
    @GetMapping("/enum/testList")
    public String testList(List<OrderEnum> enums) {
        return null;
    }

    /**
     * 测试@see
     *
     * @author chen qi
     * @param enums enum
     * @see OrderEnum
     * @since 1.0.0
     * @return
     */
    @GetMapping("/enum/see")
    public String testSee(String enums) {
        return null;
    }


}
