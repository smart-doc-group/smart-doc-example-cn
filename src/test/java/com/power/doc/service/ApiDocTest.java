package com.power.doc.service;

import com.power.common.util.DateTimeUtil;
import com.power.doc.builder.AdocDocBuilder;
import com.power.doc.builder.ApiDocBuilder;
import com.power.doc.builder.HtmlApiDocBuilder;
import com.power.doc.constants.DocGlobalConstants;
import com.power.doc.enums.ErrorCodeEnum;
import com.power.doc.model.*;
import org.junit.Test;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * ApiDoc测试
 *
 * @author yu 2018/06/11.
 */
public class ApiDocTest {

    /**
     * 包括设置请求头，缺失注释的字段批量在文档生成期使用定义好的注释
     */
    @Test
    public void testBuilderControllersApi() {
        ApiConfig config = new ApiConfig();
        config.setServerUrl("http://localhost:8080");
        //true会严格要求注释，推荐设置true
        config.setStrict(true);
        //true会将文档合并导出到一个markdown
        config.setAllInOne(true);
        //生成html时加密文档名不暴露controller的名称
        config.setMd5EncryptedHtmlName(true);

        //指定文档输出路径
        //@since 1.7 版本开始，选择生成静态html doc文档可使用该路径：DocGlobalConstants.HTML_DOC_OUT_PATH;
        config.setOutPath(DocGlobalConstants.HTML_DOC_OUT_PATH);
        //config.setOutPath("E:\\chen\\test-smart");
        // @since 1.2,如果不配置该选项，则默认匹配全部的controller,
        // 如果需要配置有多个controller可以使用逗号隔开
//        config.setPackageFilters("com.power.doc.controller");


        long start = System.currentTimeMillis();
        //获取接口数据后自行处理
        HtmlApiDocBuilder.builderControllersApi(config);
        AdocDocBuilder.builderControllersApi(config);
        ApiDocBuilder.builderControllersApi(config);
        //List<ApiDoc> docList = ApiDocBuilder.listOfApiData(config);
        long end = System.currentTimeMillis();
        DateTimeUtil.printRunTime(end, start);
    }
}
