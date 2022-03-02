package com.power.doc.controller.issue.plugin12;

import com.google.gson.Gson;
import com.power.doc.entity.UserRole;
import com.power.doc.entity.issue.plugin12.InteractiveProtocol;
import com.power.doc.model.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xingzi
 */
@RestController
@RequestMapping("/mulGeneric")
public class MulGenericController {

    /**
     * test mulGeneric
     * @param user user对象
     * @response 测试返回数据
     * @return
     */
    @PostMapping("/test")
    public InteractiveProtocol<UserDto, UserRole> a(@RequestBody InteractiveProtocol<UserDto,UserRole> user){
        System.out.println(new Gson().toJson(user));
        return null;
    }
}
