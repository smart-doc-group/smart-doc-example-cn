package com.power.doc.controller;

import com.power.doc.entity.Pager;
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
     * 测试apiNote
     * @author cht
     * @apiNote
     * This method returns a List instead of a Collection or Stream,
     * because processing of multiple Wombats usually involves traversing
     * the list in alternating forward and reverse directions.
     * @return
     */
    @Deprecated
    @GetMapping(value = "/test")
    public String test(Pager pager){
        return "hello apiNote";
    }
}
