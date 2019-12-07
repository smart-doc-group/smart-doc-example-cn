package com.power.doc.service;

import com.power.common.util.DateTimeUtil;
import com.power.doc.builder.AdocDocBuilder;
import com.power.doc.builder.ApiDocBuilder;
import com.power.doc.builder.HtmlApiDocBuilder;
import com.power.doc.constants.DocGlobalConstants;
import com.power.doc.enums.ErrorCodeEnum;
import com.power.doc.enums.GenderEnum;
import com.power.doc.enums.OrderEnum;
import com.power.doc.model.ApiConfig;
import com.power.doc.model.ApiDataDictionary;
import com.power.doc.model.ApiErrorCodeDictionary;
import com.power.doc.model.ApiReqHeader;
import org.junit.Test;

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
    @Deprecated
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

        config.setCoverOld(true);

        config.setProjectName("Smart-doc测试样例");


        //指定文档输出路径
        //@since 1.7 版本开始，选择生成静态html doc文档可使用该路径：DocGlobalConstants.HTML_DOC_OUT_PATH;
        config.setOutPath(DocGlobalConstants.HTML_DOC_OUT_PATH);
//        config.setOutPath("E:\\chen\\test-smart");
        // @since 1.2,如果不配置该选项，则默认匹配全部的controller,
        // 如果需要配置有多个controller可以使用逗号隔开
//        config.setPackageFilters("com.power.doc.controller.app");

        config.setRequestHeaders(
                ApiReqHeader.header().setName("token").setRequired(true).setType("string").setDesc("token"),
                ApiReqHeader.header().setName("partnerId").setType("string").setRequired(true).setDesc("合作方账号")
        );

        //添加数据字典
        config.setDataDictionaries(
                ApiDataDictionary.dict().setTitle("订单状态").setEnumClass(OrderEnum.class)
                        .setCodeField("code") //字典码值字段名
                        .setDescField("desc"), //字段码
                ApiDataDictionary.dict().setTitle("订单状态1").setEnumClass(OrderEnum.class)
                        .setCodeField("code").setDescField("desc"),
                ApiDataDictionary.dict().setTitle("性别字典").setEnumClass(GenderEnum.class)
                        .setCodeField("code").setDescField("desc")
        );
        //1.7.9 添加错误码处理，用于替代遍历代码
        config.setErrorCodeDictionaries(
                ApiErrorCodeDictionary.dict().setEnumClass(ErrorCodeEnum.class)
                        .setCodeField("code") //错误码值字段名
                        .setDescField("desc")//错误码描述
        );


        long start = System.currentTimeMillis();
        //获取接口数据后自行处理
        HtmlApiDocBuilder.builderControllersApi(config);
//        AdocDocBuilder.builderControllersApi(config);
//        ApiDocBuilder.builderControllersApi(config);
        //List<ApiDoc> docList = ApiDocBuilder.listOfApiData(config);
        long end = System.currentTimeMillis();
        DateTimeUtil.printRunTime(end, start);
    }
}
