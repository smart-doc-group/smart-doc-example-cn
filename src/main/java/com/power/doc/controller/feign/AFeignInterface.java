package com.power.doc.controller.feign;

import com.power.doc.constants.RequestHeadValue;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * feign测试
 * @restApi
 * @author yu 2020/6/21.
 */
@FeignClient(value = "SER0",path = RequestHeadValue.PREFIX + RequestHeadValue.URL)
public interface AFeignInterface {

    /**
     * 解析路径
     * @param id 标识
     * @param name 姓名
     * @return un
     */
    @GetMapping(value = "/{id}/{name}")
    String pathResolve(@PathVariable String id,@PathVariable String name);

    /**
     * 模具
     * @return
     */
    @GetMapping(value = "/enum")
    String test();
}
