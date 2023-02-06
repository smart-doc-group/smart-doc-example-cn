package com.power.doc.controller.feign;

import com.power.doc.controller.feign.AFeignInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试issues-229
 *
 * @apiNote https://github.com/smart-doc-group/smart-doc/issues/229
 * @author Joker
 */
@RestController
public class FeignController implements AFeignInterface {


    /**
     * 解析路径
     *
     * @param id   标识
     * @param name 姓名
     * @return un
     */
    @GetMapping(value = "/{id}/{name}")
    @Override
    public String pathResolve(@PathVariable String id,@PathVariable String name) {
        return null;
    }

    @Override
    public String issue216() {
        return null;
    }


    /**
     * 模具
     *
     * @return
     */
    @Override
    public String test() {
        return null;
    }
}