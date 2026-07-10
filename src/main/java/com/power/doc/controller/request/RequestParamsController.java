package com.power.doc.controller;

import com.alibaba.fastjson2.JSON;
import com.power.common.model.CommonResult;
import com.power.doc.constants.RequestParamConstant;
import com.power.doc.constants.RequestValueConstant;
import com.power.doc.model.FastJson;
import com.power.doc.model.User;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Map;

/**
 * Spring boot params test
 *
 * @author yu 2019/9/28.
 */

@RestController
public class RequestParamsController {

    /**
     * 测试mapping中的params设置2
     * @param id
     * @return
     */
    @GetMapping(value = "/ex/bars", params = "id=bind")
    @ResponseBody
    public String getBarBySimplePathWithExplicitRequestParam2(
        @RequestParam("id") long id) {
        return "Narrow Get a specific Bar with id=" + id;
    }

    /**
     * Test Normal param binding
     *
     * @param name name
     * @param age  age
     */
    @GetMapping("testNormalParams/binding")
    public void testNormalParam(@NotEmpty String name, @Min(value = 0) @Max(value = 130) Integer age) {


    }
    /**
     * Test Normal param binding
     *
     * @param name name
     * @param age  age
     */
    @GetMapping("testNormalParams/m")
    public void testNormalParamm(String name,  Integer age) {


    }
    /**
     * Test @RequestBody User
     *
     * @param user
     */
    @PostMapping("testRequestBody")
    public void testRequestBody(@RequestBody User user) {

    }

    /**
     * Test @RequestBody Map
     *
     * @param user
     */
    @PostMapping("testRequestBodyMap")
    public void testRequestBodyMap(@RequestBody Map<String, User> user) {

    }

    /**
     * Test @RequestBody List
     *
     * @param ids array of user id
     */
    @PostMapping("testRequestBodyList")
    public void testRequestBodyList(@RequestBody List<String> ids) {

    }

    /**
     * Test Array Params
     * @param fastJsons
     * @return
     */
    @PostMapping(value = "/testArray")
    public String test(@RequestBody CommonResult<FastJson>[] fastJsons){
        return JSON.toJSONString(fastJsons);
    }

    /**
     * Test @PathVariable
     *
     * @param name name
     * @param no   no
     */
    @GetMapping("test/{name}/{no}/info")
    public void testPa(@PathVariable String name, @PathVariable String no) {

    }

    /**
     * Test @RequestParam
     *
     * @param author author|詹姆斯
     * @param type   type
     */
    @GetMapping("testRequestParam")
    public void testRequestParam(@RequestParam String author, @RequestParam String type) {

    }

    /**
     * Test @RequestParam with value
     *
     * @param userName user name
     * @apiNote Use @RequestParam binding value is name,but method param name is userName
     */
    @GetMapping("testRequestParamWithValue")
    public void testRequestParamWithValue(@RequestParam(value = "name") String userName) {

    }

    /**
     * Test @RequestParam with default value
     *
     * @param userName user name
     * @apiNote Use @RequestParam binding default value Jordan
     */
    @GetMapping("testRequestParamWithDefaultVal")
    public void testRequestParamWithDefaultVal(@RequestParam(defaultValue = "Jordan") String userName) {

    }

    /**
     * Test much path
     *
     * @param userId userId
     * @apiNote gitee issues #I1545A
     */
    @GetMapping(value = {"/testMuchPath/get/{userId}", "/testMuchPath/find/{userId}"})
    public void testMuchPath(@PathVariable Long userId) {

    }

    /**
     * Test much path much parameter
     *
     * @param userId userId
     * @param deptId deptId
     */
    @PostMapping(value = {"/get/{deptId}/{userId}", "/find/{deptId}/{userId}"})
    public void testMuchPathMuchParameter(@PathVariable Long userId, @PathVariable Long deptId) {

    }

    /**
     * Test Constants
     * @param page 页码
     */
    @GetMapping(value = "testConstants")
    public void testConstantsRequestParams(@RequestParam(required = false, defaultValue = RequestValueConstant.PAGE_DEFAULT_NONE, value = RequestParamConstant.PAGE) int page){

    }

    /**
     * 测试mapping中的params设置1
     * @param id
     * @return
     */
    @GetMapping(value = "/ex/bars", params = "id")
    @ResponseBody
    public String getBarBySimplePathWithExplicitRequestParam(@RequestParam("id") long id) {
        return "Get a specific Bar with id=" + id;
    }

    /**
     * 测试mapping中的2
     * @param id
     * @return
     */
    @GetMapping(value = "/ex/bars", params = { "id", "second" })
    @ResponseBody
    public String getBarBySimplePathWithExplicitRequestParams(
            @RequestParam("id") long id) {
        return "Narrow Get a specific Bar with id=" + id;
    }



}
