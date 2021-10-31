package com.power.doc.utils;

import com.power.common.util.StringUtil;
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
        MybatisPlusPage mybatisPlusPage = new MybatisPlusPage();
        mybatisPlusPage.setCurrent(1L);
        mybatisPlusPage.setSize(1L);
        mybatisPlusPage.setTotal(1L);

        String url = "http://{{host}}/async-deferredresult";
        Pattern pattern = Pattern.compile("(https?://)([^:^/]*)(:[a-zA-Z-z0-9|^{{\\}}$]*)?(.*)?");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            String protocol = matcher.group(1);
            protocol = protocol.substring(0,protocol.indexOf(":"));
            String domain = matcher.group(2);
            String port = matcher.group(3);
            if(StringUtil.isNotEmpty(port)){
                port = port.replace(":","");
            }
            String uri = matcher.group(4);
            System.out.println("protocol:" + protocol);
            System.out.println("domain:" + domain);
            System.out.println("port:" + port);
            System.out.println("uri:" + uri);
        }


    }

}
