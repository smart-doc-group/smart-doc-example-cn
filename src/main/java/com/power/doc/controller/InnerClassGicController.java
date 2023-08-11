package com.power.doc.controller;

import com.power.doc.entity.InnerClassGicVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 内部类泛型问题<br/>
 *
 * @author abing22333
 * @version 1.0
 */
@RequestMapping("/InnerClassGic")
@RestController
public class InnerClassGicController {

    /**
     * 测试  com.power.doc.entity.InnerClassGicVO<T>$ActualInnerClass<T>
     *
     * @return ignore
     * @author cqmike
     * @since 1.0.0
     */
    @GetMapping("/test")
    public InnerClassGicVO<String> test() {
        return null;
    }
}
