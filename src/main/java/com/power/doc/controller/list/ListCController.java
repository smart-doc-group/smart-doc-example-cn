package com.power.doc.controller.list;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.power.common.model.CommonResult;
import com.power.doc.model.Student;
import com.power.doc.model.Teacher;
import com.power.doc.model.User;
import com.power.doc.model.UserDto;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 *
 * List返回接口Api文档测试
 *
 * @author yu 2018/06/27.
 */
@RestController
@RequestMapping("list/")
public class ListCController {

    /**
     * CommonResult&lt;List&lt;UserDto&gt;&gt;
     * @return
     */
    @GetMapping(value = "listUserDto1")
    public CommonResult<List<Map<String, UserDto>>> testListUserDto(){
        return null;
    }

}
