package com.power.doc.controller.parent.temp.impl;

import com.power.common.model.CommonResult;
import com.power.doc.controller.parent.temp.ParentInterface;
import com.power.doc.model.Leader;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试子类实现接口 之 子类,类带 @RestController,会生成接口文档
 *
 * @author linwumingshi
 * @see <a href="https://github.com/TongchengOpenSource/smart-doc/issues/792">
 * issues792</a>
 */
@RestController
@RequestMapping("/children/interface/hasEndPoint")
public class ChildrenControllerImplHasEndPointAndMapping implements ParentInterface {

    /**
     * 提交
     *
     * @param leader leader
     * @return CommonResult
     */
    @PostMapping("/submit")
    public CommonResult<?> handleSubmit(@RequestBody Leader leader) {
        return CommonResult.ok();
    }
}
