package com.power.doc.controller.jsr;

import com.power.common.model.CommonResult;
import com.power.doc.model.FastJson;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * jsr验证
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
@RestController
public class JsrController {

    /**
     * 测试忽略注解效果
     *
     * @author chen qi
     * @since 1.0.0
     * @return
     */
    @PostMapping("/jsr/ignore")
    public CommonResult<FastJson> ignore(@Validated @RequestBody FastJson fastJson) {
        return CommonResult.ok();
    }
}
