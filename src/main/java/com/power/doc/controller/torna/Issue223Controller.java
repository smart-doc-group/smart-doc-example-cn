package com.power.doc.controller.torna;

import com.power.common.model.CommonResult;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Joker
 */
@RestController
@RequestMapping("/issue223")
public class Issue223Controller {

    /**
     * 阿哲
     */
    @Data
    public static class TestDto {
        /**
         * 姓名
         */
        private String name;

        /**
         * 性别
         */
        private Integer sex;
    }

    /**
     * 测试list map的value为实体时, map的key的推送效果
     *
     * @return
     */
    @GetMapping("/test")
    public CommonResult<List<Map<String, TestDto>>> test() {


        return CommonResult.ok();
    }


    /**
     * test1
     *
     * @return
     */
    @PostMapping("/test1")
    public CommonResult<Map<String, Integer>> test1() {

        return CommonResult.ok();
    }
    /**
     * test2
     *
     * @return
     */
    @PostMapping("/test2")
    public CommonResult<List<Map<String, Map<String, Integer>>>> test2() {

        return CommonResult.ok();
    }


    /**
     * test3
     *
     * @return
     */
    @PostMapping("/test3")
    public Map<String, Integer> test3() {

        return null;
    }
    /**
     * test4
     *
     * @return
     */
    @PostMapping("/test4")
    public Map<String, TestDto> test4() {

        return null;
    }

    /**
     * test5
     *
     * @return
     */
    @PostMapping("/test5")
    public Map<String, Object> test5() {

        return null;
    }

}
