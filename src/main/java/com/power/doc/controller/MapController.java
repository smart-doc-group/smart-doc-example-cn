package com.power.doc.controller;

import com.power.doc.model.Student;
import com.power.doc.model.Teacher;
import com.power.doc.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Description:
 * Map返回型接口api文档测试
 *
 * @author yu 2018/06/27.
 */

@RestController
@RequestMapping("map/")
public class MapController {


    /**
     * Map<String,Integer>结构
     *
     * @return
     */
    @GetMapping(value = "/primitive")
    public Map<String, Integer> testMap() {
        return null;
    }

    /**
     * Map<String,Object>结构
     *
     * @return
     */
    @GetMapping(value = "/objectValue")
    public Map<String, Object> testMapObject() {
        return null;
    }

    /**
     * Map<String,User>结构
     *
     * @return
     */
    @GetMapping(value = "/object")
    public Map<String, User> testMapUser() {
        return null;
    }

    /**
     * Map<String,Student>结构
     *
     * @return
     */
    @GetMapping(value = "/test")
    public Map<String, Student> testMapStudent() {
        return null;
    }

    /**
     * Map<String,Teacher<List<User>,User,Student>>超复杂结构
     *
     * @return
     */
    @GetMapping(value = "/test")
    public Map<String, Teacher<List<User>, User, Student>> testMap3() {
        return null;
    }

    /**
     * TreeMap<String,Teacher<List<User>,User,Student>>超复杂结构
     *
     * @return
     */
    @GetMapping(value = "/test")
    public TreeMap<String, Teacher<List<User>, User, Student>> testTreeMap() {
        return null;
    }

    /**
     * Map<String,Teacher<Map<String,User>,Map<String,User>,Map<String,User>>>超复杂结构
     *
     * @return
     */
    @GetMapping(value = "/test")
    public Map<String, Teacher<Map<String, User>, Map<String, User>, Map<String, User>>> testMap4() {
        return null;
    }
}
