package com.power.doc.utils;

import com.power.common.util.StringUtil;
import com.power.doc.entity.Employee;
import com.power.doc.model.mybatisplus.MybatisPlusPage;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yu 2021/7/11.
 */

public class JacksonUtilTest {

    @Test
    public void testToJsonString() {

        String json2 = "{\"EmpId\":\"66936\"}";

        Employee employee = JacksonUtil.json2Bean(json2,Employee.class);
        System.out.println(employee);

    }

}
