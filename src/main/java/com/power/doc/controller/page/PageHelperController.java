package com.power.doc.controller.page;


import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageSerializable;
import com.power.doc.model.Parent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PageHelper
 */
@RestController
public class PageHelperController {

    /**
     * 分页
     * @return
     */
    @GetMapping("pagehelper")
    public PageInfo<Parent> getPage(){
        return null;
    }
}
