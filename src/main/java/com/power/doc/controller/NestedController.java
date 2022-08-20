package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.entity.NestedVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试深层级map
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
@RequestMapping("/nested")
@RestController
public class NestedController {

    /**
     * 测试
     *
     * @author cqmike
     * @since 1.0.0
     * @return
     */
    @GetMapping("/test")
    public CommonResult<NestedVO> test() {
        return CommonResult.ok();
    }
}
