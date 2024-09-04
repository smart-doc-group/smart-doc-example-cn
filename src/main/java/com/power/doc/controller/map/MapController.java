package com.power.doc.controller.map;

import com.power.common.model.CommonResult;
import com.power.doc.enums.SimpleEnum;
import com.power.doc.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map返回型接口api文档测试
 *
 * @author yu 2018/06/27.
 */

@RestController
@RequestMapping("map/")
public class MapController {

    /**
     * mapEnumOne sexUserMap
     *
     * @param sexUserMap sexUserMap
     * @return sexUserMap
     */
    @PostMapping("/sexUserMap")
    public Map<SimpleEnum, JobReplicaSpec> mapEnumOne(@RequestBody Map<SimpleEnum, JobReplicaSpec> sexUserMap) {
        return sexUserMap;
    }

    /**
     * mapEnumTwo pyTorchJobSpec
     *
     * @param pyTorchJobSpec pyTorchJobSpec
     * @return pyTorchJobSpec
     */
    @PostMapping("/pyTorchJobSpec")
    public PyTorchJobSpec mapEnumTwo(@RequestBody PyTorchJobSpec pyTorchJobSpec) {
        return pyTorchJobSpec;
    }


    /**
     * mapEnumThree pyTorchJobSpecInfo
     *
     * @param pyTorchJobSpecInfo pyTorchJobSpecInfo
     * @return pyTorchJobSpecInfo
     */
    @PostMapping("/pyTorchJobSpecInfo")
    public PyTorchJobSpecInfo mapEnumThree(@RequestBody PyTorchJobSpecInfo pyTorchJobSpecInfo) {
        return pyTorchJobSpecInfo;
    }

    /**
     * mapEnumFour nestingEnumMap
     *
     * @param nestingEnumMap nestingEnumMap
     * @return nestingEnumMap
     */
    @PostMapping("/nestingEnumMap")
    public NestingEnumMap mapEnumFour(@RequestBody NestingEnumMap nestingEnumMap) {
        return nestingEnumMap;
    }


    /**
     * 测试map解析
     *
     * @return CommonResult
     * @apiNote CommonResult<Map < String, Map < String, Children>>>
     */
    @GetMapping(value = "/test5")
    public CommonResult<Map<String, Map<String, Children>>> testMap0() {
        return null;
    }

    /**
     * {@code Map<String,Integer>}结构
     *
     * @return map
     */
    @GetMapping(value = "/primitive")
    public Map<String, Integer> testMap() {
        return null;
    }

    /**
     * {@code Map<String,Object>}结构
     *
     * @return map
     */
    @GetMapping(value = "/objectValue")
    public Map<String, Object> testMapObject() {
        return null;
    }

    /**
     * {@code Map<String,User>}结构
     *
     * @return map
     */
    @GetMapping(value = "/object")
    public Map<String, User> testMapUser() {
        return null;
    }

    /**
     * {@code Map<String,Student>} 结构
     *
     * @return map
     */
    @GetMapping(value = "/test1")
    public Map<String, Student> testMapStudent() {
        return null;
    }

    /**
     * {@code Map<String,Teacher<List<User>,User,Student>>}超复杂结构
     *
     * @return map
     */
    @GetMapping(value = "/test2")
    public Map<String, Teacher<List<User>, User, Student>> testMap3() {
        return null;
    }

    /**
     * {@code TreeMap<String,Teacher<List<User>,User,Student>>}超复杂结构
     *
     * @return map
     */
    @GetMapping(value = "/test3")
    public TreeMap<String, Teacher<List<User>, User, Student>> testTreeMap() {
        return null;
    }

    /**
     * {@code Map<String,Teacher<Map<String,User>,Map<String,User>,Map<String,User>>>}超复杂结构
     *
     * @return map
     */
    @GetMapping(value = "/test4")
    public Map<String, Teacher<Map<String, User>, Map<String, User>, Map<String, User>>> testMap4() {
        return null;
    }
}
