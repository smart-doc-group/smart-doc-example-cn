package com.power.doc.controller.feat;


import com.power.common.model.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * jdk17新特性
 *
 * @author yusun 20230716
 */
@RestController
public class JDK17Controller {


    /**
     * 字符串处理
     *
     * @return
     */
    @GetMapping("/ste")
    public CommonResult highVersion() {
        String jsonText = """
                {
                  "name": "二狗子",
                  "age": 18,
                  "address": "北京"
                }
                """;
        return CommonResult.ok(jsonText);
    }
    /**
     * @param jsonText jsonText
     * @return string
     */
    @GetMapping("/ste")
    public CommonResult<String> highVersion2(@RequestParam(defaultValue = """
    {
        "name": "二狗子",
            "age": 18,
            "address": "北京"
    }
""") String jsonText) {
        return CommonResult.ok(jsonText);
    }
}
