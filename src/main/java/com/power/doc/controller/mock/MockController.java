package com.power.doc.controller;

import com.power.common.model.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Mock Test
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
@RestController
public class MockController  {

    /**
     * 测试基本类型数组
     *
     * @author cqmike
     * @param ids id数组|1,2,3
     * @since 1.0.0
     * @return
     */
    @PostMapping("/testMockPrimaryArray")
    public CommonResult<Void> testMockPrimaryArray(@RequestParam final long[] ids) {
        return CommonResult.ok();
    }

    /**
     * 测试包装类型数组
     *
     * @author cqmike
     * @param ids id包装数组
     * @since 1.0.0
     * @return
     */
    @PostMapping("/testMockPackageArray")
    public CommonResult<Void> testMockPackageArray(@RequestParam final Long[] ids) {
        return CommonResult.ok();
    }

    /**
     * 测试包装类型List
     *
     * @author cqmike
     * @param ids idList
     * @since 1.0.0
     * @return
     */
    @PostMapping("/testMockPackageList")
    public CommonResult<Void> testMockPackageList(@RequestParam final List<Long> ids, String configQueryParam, MultipartFile file) {
        return CommonResult.ok();
    }

    /**
     * 测试基本类型数组(JSON)
     *
     * @author cqmike
     * @param ids id包装数组|1,2,3
     * @since 1.0.0
     * @return
     */
    @PostMapping("/testMockPrimaryArrayJson")
    public CommonResult<Void> testMockPrimaryArrayJson(@RequestBody final long[] ids) {
        return CommonResult.ok();
    }

    /**
     * 测试包装类型数组(JSON)
     *
     * @author cqmike
     * @param ids id包装数组|1,2,3
     * @since 1.0.0
     * @return
     */
    @PostMapping("/testMockPackageArrayJson")
    public CommonResult<Void> testMockPackageArrayJson(@RequestBody final Long[] ids) {
        return CommonResult.ok();
    }

    /**
     * 测试包装类型List(JSON)
     *
     * @author cqmike
     * @param ids idList
     * @since 1.0.0
     * @return
     */
    @PostMapping("/testMockPackageListJson")
    public CommonResult<Void> testMockPackageListJson(@RequestBody final List<Long> ids) {
        return CommonResult.ok();
    }
}
