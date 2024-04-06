package com.power.doc.controller.page;

import com.power.doc.entity.Car;
import com.power.doc.entity.ResultUtil;
import com.power.doc.entity.SimpleUser;
import com.power.doc.entity.User;
import com.power.doc.entity.page.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分页
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
@RestController
@RequestMapping("/page")
public class PageController {
    /**
     * 分页查询用户列表
     * @param user
     * @return
     */
    @GetMapping("/page")
    public ResultUtil<Page<Car>> page( SimpleUser user){

        return null;
    }

    /**
     * mybatisPage分页查询用户列表
     * @param user
     * @return
     */
    @GetMapping("/mybatisPage")
    public ResultUtil<com.baomidou.mybatisplus.extension.plugins.pagination.Page<Car>> mybatisPage( SimpleUser user){
        return null;
    }
}
