package com.power.doc.controller;

import com.power.doc.entity.KeyValuePair;
import com.power.doc.entity.SimpleUser;
import com.power.doc.entity.XbootBaseEntity;
import com.power.doc.model.User;
import org.springframework.web.bind.annotation.*;

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
     * @apiNote 用于测试apiNote注释是否有效
     * @return
     */
    @PostMapping(value = "/test")
    public String test(@RequestBody List<SimpleUser> user){
        return "hello apiNote";
    }

    /**
     * 测试key value对泛型
     * @param keyValuePair
     * @return
     */
    @PostMapping(value = "testKeyValue")
    public String testKV(@RequestBody KeyValuePair<SimpleUser,XbootBaseEntity> keyValuePair) {
        return "";
    }
}
