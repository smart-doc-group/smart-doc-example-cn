package com.power.doc.service;

import com.power.common.util.DateTimeUtil;
import com.power.doc.builder.ApiDocBuilder;
import com.power.doc.enums.ErrorCodeEnum;
import com.power.doc.model.*;
import org.junit.Test;

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
     * 简单型接口，不需要指定请求头，并且项目是maven的.
     */
    @Test
    public void testBuilderControllersApiSimple() {
        //将生成的文档输出到d:\md目录下，严格模式下api-doc会检测Controller的接口注释
        ApiDocBuilder.builderControllersApi("d:\\md", true);

    }

    /**
     * 包括设置请求头，缺失注释的字段批量在文档生成期使用定义好的注释
     */
    @Test
    public void testBuilderControllersApi() {
        ApiConfig config = new ApiConfig();
        config.setServerUrl("http://localhost:8080");
        config.setStrict(true);//true会严格要求注释，推荐设置true
        config.setAllInOne(true);//true会将文档合并导出到一个markdown
        config.setOutPath("d:\\md");
        // @since 1.2,如果不配置该选项，则默认匹配全部的controller,
        // 如果需要配置有多个controller可以使用逗号隔开
        config.setPackageFilters("com.power.doc.controller");
        //不指定SourcePaths默认加载代码为项目src/main/java下的,如果项目的某一些实体来自外部代码可以一起加载
        config.setSourcePaths(
                SourcePath.path().setDesc("本项目代码").setPath("src/main/java")

               //  SourcePath.path().setPath("E:\\Test\\Mybatis-PageHelper-master\\src\\main\\java"),
               // SourcePath.path().setDesc("加载项目外代码").setPath("E:\\ApplicationPower\\ApplicationPower\\Common-util\\src\\main\\java")
        );

        //设置请求头，如果没有请求头，可以不用设置
        config.setRequestHeaders(
                ApiReqHeader.header().setName("access_token").setType("string").setDesc("Basic auth credentials"),
                ApiReqHeader.header().setName("user_uuid").setType("string").setDesc("User Uuid key")
        );
        //对于外部jar的类，编译后注释会被擦除，无法获取注释，但是如果量比较多请使用setSourcePaths来加载外部代码
        //如果有这种场景，则自己添加字段和注释，api-doc后期遇到同名字段则直接给相应字段加注释
        config.setCustomResponseFields(
                CustomRespField.field().setName("success").setDesc("成功返回true,失败返回false"),
                CustomRespField.field().setName("message").setDesc("接口响应信息"),
                CustomRespField.field().setName("data").setDesc("接口响应数据"),
                CustomRespField.field().setName("code").setValue("00000").setDesc("响应代码")
        );

        //设置项目错误码列表，设置自动生成错误列表,
        List<ApiErrorCode> errorCodeList = new ArrayList<>();
        for(ErrorCodeEnum codeEnum: ErrorCodeEnum.values()){
            ApiErrorCode errorCode = new ApiErrorCode();
            errorCode.setValue(codeEnum.getCode()).setDesc(codeEnum.getDesc());
            errorCodeList.add(errorCode);
        }
        //如果没需要可以不设置
        config.setErrorCodes(errorCodeList);

        long start = System.currentTimeMillis();
        ApiDocBuilder.builderControllersApi(config);
        long end = System.currentTimeMillis();
        DateTimeUtil.printRunTime(end, start);
    }

}
