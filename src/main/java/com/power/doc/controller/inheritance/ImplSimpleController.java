package com.power.doc.controller;

import com.power.doc.entity.SimpleUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实现controller接口
 * @author yu 2021/11/14.
 */
@RestController
@RequestMapping("testImpl")
public class ImplSimpleController implements SimpleController<SimpleUser>{

    @Override
    public int test() {
        return 0;
    }
}
