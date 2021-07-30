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

        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setRoleId(1);
        roleDTO.setAge(13);
        roleDTO.setRoleName("aa");
        System.out.println(JacksonUtil.bean2Json(roleDTO));
    }

}
