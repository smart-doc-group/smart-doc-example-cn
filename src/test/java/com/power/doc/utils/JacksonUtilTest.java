package com.power.doc.utils;

import com.power.doc.entity.RoleDTO;
import com.power.doc.model.mybatisplus.MybatisPlusPage;

/**
 * @author yu 2021/7/11.
 */

public class JacksonUtilTest {

    public void testToJsonString(){
        MybatisPlusPage mybatisPlusPage = new MybatisPlusPage();
        mybatisPlusPage.setCurrent(1L);
        mybatisPlusPage.setSize(1L);
        mybatisPlusPage.setTotal(1L);
    }

}
