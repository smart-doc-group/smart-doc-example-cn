package com.power.doc.controller.parent.temp.children;

import com.power.common.model.CommonResult;
import com.power.doc.controller.parent.temp.ParentProjectController;
import com.power.doc.model.Leader;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * 测试子类继承父类 之 子类,类带 @RestController,不带@RequestMapping会生成接口文档
 *
 * @author linwumingshi
 * @see <a href="https://github.com/TongchengOpenSource/smart-doc/issues/792">
 * issues792</a>
 */
@RestController
public class ChildrenControllerHasEndPoint extends ParentProjectController {

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