package com.power.doc.controller;

import com.power.doc.constants.HeaderConstants;
import com.power.doc.constants.RequestHeadValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * RequestHeader注解测试
 *
 * @author xingzi
 * @date 2019 10 11  22:35
 */
@Slf4j
@RestController
public class RequestHeaderController {

    /**
     * 测试RequestHeader常规使用
     *
     * @param name 请求头(name)
     * @param age  年龄
     */
    @GetMapping("testRequestHeader")
    public void testRequestHeader(@RequestHeader String name, Integer age) {

    }

    /**
     * 测试RequestHeader绑定参数名
     *
     * @param name 请求头(name)
     * @param age  年龄
     */
    @GetMapping("testRequestHeader/value")
    public void testRequestHeaderAnnotationWithValue(@RequestHeader(value = "token", required = false) String name, @RequestHeader Integer age) {

    }

    /**
     * 测试RequestHeader绑定默认值
     *
     * @param name 请求头(name)
     * @param age  年龄
     */
    @GetMapping("testRequestHeader/DefaultVal")
    public void testRequestHeaderAnnotationWithDefaultVal(@RequestHeader(value = "token", defaultValue = "da", required = false) String name, Integer age) {

    }

    /**
     * 测试Mapping中的headers属性
     *
     * @return
     */
    @GetMapping(value = "testRequestHeader/foos", headers = {"key1=val1", "key2=val2"})
    @ResponseBody
    public String getFoosWithHeaders() {
        return "Get some Foos with Header";
    }

    /**
     * 测试Mapping header属性
     *
     * @return
     */
    @GetMapping(value = "/ex/foos", headers = "key=val")
    @ResponseBody
    public String getFoosWithHeader() {
        return "Get some Foos with Header";
    }

    /**
     * 测试常量请求头1
     *
     * @param token 请求头
     * @return
     */
    @GetMapping("testRequestHeader/constants1")
    public String testConstants(@RequestHeader(HeaderConstants.TOKEN) String token) {
        return "header constants";
    }

    /**
     * 测试常量请求头2
     *
     * @param token 请求头
     * @return
     */
    @GetMapping("testRequestHeader/constant2")
    public String testConstants2(@RequestHeader(value = HeaderConstants.TOKEN) String token) {
        return "header constants";
    }

    /**
     * 测试常量请求头3
     *
     * @param token 请求头
     * @return
     */
    @GetMapping("testRequestHeader/constant3")
    public String testConstants3(@RequestHeader(name= HeaderConstants.TOKEN) String token) {
        return "header constants";
    }

    /**
     *
     * 测试RequestHeader注解 'value' 属性为常量 绑定参数名
     * @param name 请求头(name)
     * @param age   年龄
     */
    @GetMapping("testRequestHeader/constValue")
    public void testRequestHeaderAnnotationWithConstValue(@RequestHeader(value = RequestHeadValue.TEST_BIND_VALUE, required = false)String name, @RequestHeader Integer age) {

    }

}
