package com.power.doc.model.mybatisplus;


import com.alibaba.fastjson2.annotation.JSONType;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 测试mybatis-plugs page字段忽略
 * @author yu 2021/7/11.
 */
@JSONType(ignores ={"current", "size", "orders", "hitCount", "searchCount", "pages","optimizeCountSql"})
@JsonIgnoreProperties({"current", "size", "orders", "hitCount", "searchCount", "pages","optimizeCountSql"})
public class MybatisPlusPage<T> extends Page<T> {


}
