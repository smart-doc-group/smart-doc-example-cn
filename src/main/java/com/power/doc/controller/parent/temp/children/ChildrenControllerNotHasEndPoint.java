package com.power.doc.controller.parent.temp.children;

import com.power.common.model.CommonResult;
import com.power.doc.controller.parent.temp.ParentProjectController;
import com.power.doc.model.Leader;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试子类继承父类 之 子类,类不带 @RestController,不会生成接口文档
 *
 * @author linwumingshi
 * @see <a href="https://github.com/TongchengOpenSource/smart-doc/issues/792">
 * issues792</a>
 */
@RequestMapping("/children/controller/notHasEndPoint")
public class ChildrenControllerNotHasEndPoint extends ParentProjectController {

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
