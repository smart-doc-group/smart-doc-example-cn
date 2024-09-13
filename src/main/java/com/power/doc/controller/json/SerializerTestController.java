package com.power.doc.controller.json;

import com.power.common.model.CommonResult;
import com.power.doc.model.SerializerTestModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Jackson ToStringSerializer test
 *
 * @author yusun 2024/01/30
 * @see <a href="https://github.com/TongchengOpenSource/smart-doc/issues/833">issues #833</a>
 * @see <a href="https://github.com/TongchengOpenSource/smart-doc/issues/687">issues #687</a>
 */
@RestController
@RequestMapping("/serializer")
public class SerializerTestController {


    /**
     * 测试方法
     *
     * @param model 测试参数
     */
    @PostMapping
    public CommonResult<SerializerTestModel> testSerializer(@RequestBody SerializerTestModel model) {
        return CommonResult.ok(model);
    }
}
