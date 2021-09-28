package com.power.doc.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.power.doc.entity.RoleDTO;
import com.power.doc.model.mybatisplus.MybatisPlusPage;

import org.junit.jupiter.api.Test;

/**
 * @author yu 2021/7/11.
 */

public class JacksonUtilTest {

    @Test
    public void testToJsonString(){
        MybatisPlusPage mybatisPlusPage = new MybatisPlusPage();
        mybatisPlusPage.setCurrent(1L);
        mybatisPlusPage.setSize(1L);
        mybatisPlusPage.setTotal(1L);

        String url ="null";
        Pattern pattern = Pattern.compile("(https?://)([^:^/]*)(:\\d*)?(.*)?");
        Matcher matcher = pattern.matcher(url);
        if(matcher.find()){
            String protocol = matcher.group(1);
            String domain   = matcher.group(2);
            String port     = matcher.group(3);
            String uri      = matcher.group(4);
        }


    }

}
