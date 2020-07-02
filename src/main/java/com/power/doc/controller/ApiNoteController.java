package com.power.doc.controller;

import com.power.doc.entity.Pager;
import com.power.doc.entity.RoleDTO;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * apiNote注解测试
 * @author cht 2019/10/16.
 */
@RestController
public class ApiNoteController {

    /**
     * Jpa Page
     * @author cht
     * @apiNote
     * 用于测试Jpa的分页查询
     * @return
     */
    @Deprecated
    @PostMapping(value = "/test")
    public Page<RoleDTO> test(){
        return null;
    }
}
