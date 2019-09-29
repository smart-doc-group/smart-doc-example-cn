package com.power.doc.controller;

import com.power.doc.model.User;
import org.springframework.web.bind.annotation.*;

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
     * Test Normal param binding
     *
     * @param name name
     * @param age  age
     */
    @GetMapping("testNormalParams/binding")
    public void testNormalParam(String name, Integer age) {


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
     * @param author author
     * @param type type
     */
    @GetMapping("testRequestParam")
    public void testRequestParam(@RequestParam String author, @RequestParam String type) {

    }


}
