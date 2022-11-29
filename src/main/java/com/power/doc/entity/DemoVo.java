package com.power.doc.entity;

import jakarta.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;

/**
 * @author yu 2021/3/22.
 */
public class DemoVo {

    /**
     * 用户名称
     * @required
     * @mock 李海峰
     * @since 1.0
     */
    @NotBlank(message = "username不允许为空")
    public String username;

//    /**
//     * children
//     */
//    public List<DemoVo> children;

    /**
     * key,value
     */
    public Map<String,Object> params;
}
