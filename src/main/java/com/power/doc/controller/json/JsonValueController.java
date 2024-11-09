package com.power.doc.controller.json;

import com.power.common.model.CommonResult;
import com.power.doc.enums.GenderEnum;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * JsonValue On Enum field Controller
 *
 * @author linwumingshi
 */
@RestController
@RequestMapping("/jsonValue")
public class JsonValueController {


    /**
     * test JsonValue enum field On Post RequestBody
     *
     * @param user test1
     * @return test1
     */
    @PostMapping("/test1")
    public CommonResult<TestUser> test1(@RequestBody TestUser user) {
        return CommonResult.ok(user);
    }

    /**
     * test JsonValue enum field On Post Form Data
     *
     * @param user test2
     * @return test2
     */
    @PostMapping("/test2")
    public CommonResult<TestUser> test2(TestUser user) {
        return CommonResult.ok(user);
    }


    /**
     * test JsonValue enum field On Get Query Parameter
     *
     * @param user test3
     * @return test3
     */
    @GetMapping("/test3")
    public CommonResult<TestUser> test3(TestUser user) {
        return CommonResult.ok(user);
    }


    /**
     * TestUser has JsonValue enum field
     */
    @Data
    public static class TestUser {

        /**
         * gender
         */
        private GenderEnum gender;
    }
}
