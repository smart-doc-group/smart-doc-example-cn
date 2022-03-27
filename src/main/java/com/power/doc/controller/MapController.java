package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.model.Children;
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
 *
 * Map返回型接口api文档测试
 *
 * @author yu 2018/06/27.
 */

@RestController
@RequestMapping("map/")
public class MapController {


    /**
     * 测试map解析
     * @apiNote CommonResult<Map<String,Map<String, Children>>>
     * @return
     */
    @GetMapping(value = "/test5")
    public CommonResult<Map<String,Map<String, Children>>> testMap0(){
        return null;
    }
    /**
     * Map&lt;String,Integer&gt;结构
     *
     * @return
     */
    @GetMapping(value = "/primitive")
    public Map<String, Integer> testMap() {
        return null;
    }

    /**
     * Map&lt;String,Object&gt;结构
     *
     * @return
     */
    @GetMapping(value = "/objectValue")
    public Map<String, Object> testMapObject() {
        return null;
    }

    /**
     * Map&lt;String,User&gt;结构
     *
     * @return
     */
    @GetMapping(value = "/object")
    public Map<String, User> testMapUser() {
        return null;
    }

    /**
     * Map&lt;String,Student&gt;结构
     *
     * @return
     */
    @GetMapping(value = "/test1")
    public Map<String, Student> testMapStudent() {
        return null;
    }

    /**
     * Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
     *
     * @return
     */
    @GetMapping(value = "/test2")
    public Map<String, Teacher<List<User>, User, Student>> testMap3() {
        return null;
    }

    /**
     * TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
     *
     * @return
     */
    @GetMapping(value = "/test3")
    public TreeMap<String, Teacher<List<User>, User, Student>> testTreeMap() {
        return null;
    }

    /**
     * Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构
     *
     * @return
     */
    @GetMapping(value = "/test4")
    public Map<String, Teacher<Map<String, User>, Map<String, User>, Map<String, User>>> testMap4() {
        return null;
    }
}
