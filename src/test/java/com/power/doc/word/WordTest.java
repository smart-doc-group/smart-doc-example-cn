package com.power.doc.word;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.plugin.markdown.MarkdownRenderData;
import com.deepoove.poi.plugin.markdown.MarkdownRenderPolicy;
import com.deepoove.poi.plugin.markdown.MarkdownStyle;
import com.google.common.collect.Lists;
import com.ly.doc.builder.DocBuilderTemplate;
import com.ly.doc.builder.ProjectDocConfigBuilder;
import com.ly.doc.constants.DocGlobalConstants;
import com.ly.doc.constants.TemplateVariable;
import com.ly.doc.constants.TornaConstants;
import com.ly.doc.factory.BuildTemplateFactory;
import com.ly.doc.helper.JavaProjectBuilderHelper;
import com.ly.doc.model.*;
import com.ly.doc.template.IDocBuildTemplate;
import com.ly.doc.utils.DocUtil;
import com.power.common.interfaces.IMessage;
import com.power.common.util.FileUtil;
import com.power.doc.enums.OrderEnum;
import com.thoughtworks.qdox.JavaProjectBuilder;
import org.apache.commons.io.IOUtils;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @author <a href="mailto:cqmike0315@gmail.com">chenqi</a>
 * @version 1.0
 */
public class WordTest {

    @Test
    public void testMarkdown2Word() throws IOException {
        // D:\code\IdeaProject\smart-doc-example-cn\target\doc\ListCControllerApi.md
        MarkdownRenderData code = new MarkdownRenderData();
        code.setMarkdown(new String(Files.readAllBytes(Paths.get("D:\\code\\IdeaProject\\smart-doc-example-cn\\target\\doc\\ListCControllerApi.md"))));
        code.setStyle(MarkdownStyle.newStyle());

        Map<String, Object> data = new HashMap<>();
        data.put("md", code);

        Configure config = Configure.builder().bind("md", new MarkdownRenderPolicy()).build();
        XWPFTemplate.compile("D:\\code\\IdeaProject\\smart-doc-example-cn\\target\\doc\\markdown_template.docx", config).render(data);
    }

    @Test
    public void renderWord() throws Exception {
        ApiConfig config = ApiConfig.getInstance();
        JavaProjectBuilder javaProjectBuilder = JavaProjectBuilderHelper.create();
        config.setBaseDir("D:\\code\\IdeaProject\\smart-doc-example-cn");
        config.setCodePath("src/main/java");
        config.setAllInOne(true);


        config.setOutPath(DocGlobalConstants.HTML_DOC_OUT_PATH);
        config.setPackageFilters("com.power.doc.controller.PageHelperController");

        DocBuilderTemplate builderTemplate = new DocBuilderTemplate();
        builderTemplate.checkAndInit(config, Boolean.TRUE);
        config.setParamsDataToTree(false);
        ProjectDocConfigBuilder configBuilder = new ProjectDocConfigBuilder(config, javaProjectBuilder);
        IDocBuildTemplate<ApiDoc> docBuildTemplate = BuildTemplateFactory.getDocBuildTemplate(config.getFramework());
        ApiSchema<ApiDoc> apiData = docBuildTemplate.getApiData(configBuilder);
        List<ApiDoc> apiDocList = apiData.getApiDatas();
        System.out.println(apiDocList);

    }

    private ApiConfig config(boolean isAll) {
        ApiConfig config = new ApiConfig();
        config.setBaseDir("D:\\code\\IdeaProject\\smart-doc-example-cn");
        config.setCodePath("src/main/java");
        config.setServerUrl("http://127.0.0.1:9000");
        config.setAllInOne(isAll);

        ApiReqParam header = new ApiReqParam();
        header.setValue("kk");
        header.setType("string");
        header.setName("token");
        header.setRequired(true);
        header.setSince("true");
        header.setDesc("truetruetruetrue");
        config.setRequestHeaders(header);

        ApiErrorCodeDictionary errorCodeDictionary = new ApiErrorCodeDictionary();
        errorCodeDictionary.setEnumClass(IMessage.class);
        errorCodeDictionary.setEnumClassName("com.power.common.interfaces.IMessage");
        errorCodeDictionary.setCodeField("code");
        errorCodeDictionary.setDescField("message");
        config.setErrorCodeDictionaries(errorCodeDictionary);

        ApiDataDictionary dictionary = new ApiDataDictionary();
        dictionary.setEnumClass(OrderEnum.class);
        dictionary.setEnumClassName("com.power.doc.enums.OrderEnum");
        dictionary.setTitle("测试配置枚举");
        dictionary.setCodeField("code");
        dictionary.setDescField("desc");
        config.setDataDictionaries(dictionary);

        ApiGroup apiGroup = new ApiGroup();
        apiGroup.setName("测试分组1");
        apiGroup.setApis("com.power.doc.controller.EnumController");
        ApiGroup apiGroup1 = new ApiGroup();
        apiGroup1.setName("测试分组2");
        apiGroup1.setApis("com.power.doc.controller.FormDataController");
        config.setGroups(apiGroup, apiGroup1);

        RevisionLog revisionLog = new RevisionLog();
        revisionLog.setAuthor("cq");
        revisionLog.setRevisionTime("2023-11-26 00:00:00");
        revisionLog.setVersion("1.1.1");
        revisionLog.setStatus("撒旦");
        revisionLog.setRemarks("asdsa");
        config.setRevisionLogs(revisionLog);

        config.setRequestExample(true);
        config.setResponseExample(true);
        config.setOutPath(DocGlobalConstants.HTML_DOC_OUT_PATH);
        List<String> f = Lists.newArrayList(
//                "com.power.doc.controller.app.*",
//                "com.power.doc.controller.dubbo.*",
//                "com.power.doc.controller.feign.*",
//                "com.power.doc.controller.A.*",
//                "com.power.doc.controller.B.*",
//                "com.power.doc.controller.C.*",
//                "com.power.doc.controller.D.*",
//                "com.power.doc.controller.E.*",
//                "com.power.doc.controller.F.*",
//                "com.power.doc.controller.G.*",
//                "com.power.doc.controller.H.*",
//                "com.power.doc.controller.I.*",
//                "com.power.doc.controller.J.*",
//                "com.power.doc.controller.K.*",
//                "com.power.doc.controller.L.*",
//                "com.power.doc.controller.M.*",
//                "com.power.doc.controller.N.*",
//                "com.power.doc.controller.O.*",
                "com.power.doc.controller.P.*",
                "com.power.doc.controller.Q.*",
                "com.power.doc.controller.parent.*",
                "com.power.doc.controller.torna.*",
                ""
        );
        config.setPackageFilters(String.join(",", f));
        DocBuilderTemplate builderTemplate = new DocBuilderTemplate();
        builderTemplate.checkAndInit(config, Boolean.TRUE);
        config.setParamsDataToTree(false);
        return config;
    }

    private List<ApiDoc> list(ApiConfig config, JavaProjectBuilder javaProjectBuilder) {
        ProjectDocConfigBuilder configBuilder = new ProjectDocConfigBuilder(config, javaProjectBuilder);
        IDocBuildTemplate<ApiDoc> docBuildTemplate = BuildTemplateFactory.getDocBuildTemplate(config.getFramework());
        ApiSchema<ApiDoc> apiData = docBuildTemplate.getApiData(configBuilder);
        List<ApiDoc> apiDocList = apiData.getApiDatas();
        if (config.isAllInOne()) {
            apiDocList = docBuildTemplate.handleApiGroup(apiDocList, config);
        }
        return apiDocList;
    }
    public static Template getByName(String templateName) {
        try {
            ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader("/template/");
            Configuration cfg = Configuration.defaultConfiguration();
            cfg.setCharset("UTF-8");
            cfg.add("/smart-doc-beetl.properties");
            GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
            return gt.getTemplate(templateName);
        } catch (IOException e) {
            throw new RuntimeException("Can't get Beetl template.");
        }
    }

    public void createTemplate(String template, String outputXml) {
        ApiConfig config = config(true);
        JavaProjectBuilder javaProjectBuilder = JavaProjectBuilderHelper.create();
        List<ApiDoc> apiDocList = list(config, javaProjectBuilder);
        Template tpl = getByName(template);
        List<ApiErrorCode> errorCodeList = DocUtil.errorCodeDictToList(config, javaProjectBuilder);
        List<ApiDocDict> apiDocDictList = DocUtil.buildDictionary(config, javaProjectBuilder);
        tpl.binding(TemplateVariable.ERROR_LIST_TITLE.getVariable(), DocGlobalConstants.ERROR_CODE_LIST_CN_TITLE);
        tpl.binding(TemplateVariable.DICT_LIST_TITLE.getVariable(), DocGlobalConstants.DICT_CN_TITLE);
        tpl.binding(TemplateVariable.DICT_LIST.getVariable(), apiDocDictList);
        tpl.binding(TemplateVariable.PROJECT_NAME.getVariable(), "测试项目名称");
        tpl.binding(TemplateVariable.API_DOC_LIST.getVariable(), apiDocList);
        tpl.binding(TemplateVariable.VERSION_LIST.getVariable(), config.getRevisionLogs());
        tpl.binding(TemplateVariable.REQUEST_EXAMPLE.getVariable(), config.isRequestExample());
        tpl.binding(TemplateVariable.RESPONSE_EXAMPLE.getVariable(), config.isResponseExample());
        tpl.binding(TemplateVariable.ERROR_CODE_LIST.getVariable(), errorCodeList);

        boolean onlyHasDefaultGroup = apiDocList.stream().allMatch(doc -> Objects.equals(TornaConstants.DEFAULT_GROUP_CODE, doc.getGroup()));
        tpl.binding(TemplateVariable.API_DOC_LIST_ONLY_HAS_DEFAULT_GROUP.getVariable(), onlyHasDefaultGroup);
        FileUtil.nioWriteFile(tpl.render(), "src/test/resources/" + outputXml);
    }

    /**
     * @throws Exception
     */
    @Test
    public void build() throws Exception {
        createTemplate("allDocument.xml", "AllTemplateDocument.xml");
        replaceDocx("src/test/resources/template.docx", "AllTemplateDocument.xml", "AllBuild.docx");
    }
    /**
     * @throws Exception
     */
    @Test
    public void buildNewTemplate() throws Exception {
        createTemplate("mdAllDocument.xml", "AllMdTemplateDocument.xml");
        replaceDocx("src/test/resources/md.docx", "AllMdTemplateDocument.xml", "AllMdBuild.docx");
    }

    public void createSingleTemplate(String outputXml) {
        JavaProjectBuilder javaProjectBuilder = JavaProjectBuilderHelper.create();
        ApiConfig config = config(false);
        List<ApiDoc> apiDocList = list(config, javaProjectBuilder);
        Template tpl = getByName("template/mdDocument.xml");
        ApiDoc doc = apiDocList.get(0);
        tpl.binding(TemplateVariable.DESC.getVariable(), doc.getDesc());
        tpl.binding(TemplateVariable.NAME.getVariable(), doc.getName());
        tpl.binding(TemplateVariable.LIST.getVariable(), doc.getList());
        tpl.binding(TemplateVariable.REQUEST_EXAMPLE.getVariable(), config.isRequestExample());
        tpl.binding(TemplateVariable.RESPONSE_EXAMPLE.getVariable(), config.isResponseExample());
        FileUtil.nioWriteFile(tpl.render(), "src/test/resources/" + outputXml);
    }

    /**
     * @throws Exception
     */
    @Test
    public void singleBuild() throws Exception {
        createSingleTemplate("templateDocument.xml");
        replaceDocx("src/test/resources/template.docx", "templateDocument.xml", "build.docx");
    }

    public void replaceDocx(String srcPath, String templateXml, String buildDocx) throws Exception {

        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(srcPath));
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("src/test/resources/" + buildDocx));
        // 遍历压缩包中的文件
        ZipEntry entry;
        while ((entry = zipInputStream.getNextEntry()) != null) {
            String entryName = entry.getName();

            // 判断是否为要修改的文件
            if (entryName.equals("word/document.xml")) {
                // 创建新的压缩包文件项
                zipOutputStream.putNextEntry(new ZipEntry(entryName));
                System.out.println(entryName);

                FileInputStream fileInputStream = new FileInputStream("src/test/resources/" + templateXml);
                byte[] buff = new byte[fileInputStream.available()];
                IOUtils.readFully(fileInputStream, buff);
                // 写入修改后的内容
                zipOutputStream.write(buff, 0, buff.length);
            } else {
                // 复制其他文件项
                zipOutputStream.putNextEntry(entry);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = zipInputStream.read(buffer)) > 0) {
                    zipOutputStream.write(buffer, 0, len);
                }
            }

            // 关闭当前文件项
            zipOutputStream.closeEntry();
            zipInputStream.closeEntry();
        }

        // 关闭压缩包
        zipInputStream.close();
        zipOutputStream.close();
    }


    @Test
    public void buildAll() throws Exception {
        JavaProjectBuilder javaProjectBuilder = JavaProjectBuilderHelper.create();
        ApiConfig config = config(true);
        List<ApiDoc> apiDocList = list(config, javaProjectBuilder);
        Template tpl = getByName("template.xml");
        tpl.binding(TemplateVariable.PROJECT_NAME.getVariable(), "测试项目名称");
        tpl.binding(TemplateVariable.API_DOC_LIST.getVariable(), apiDocList);
        tpl.binding(TemplateVariable.VERSION_LIST.getVariable(), config.getRevisionLogs());
        tpl.binding(TemplateVariable.REQUEST_EXAMPLE.getVariable(), config.isRequestExample());
        tpl.binding(TemplateVariable.RESPONSE_EXAMPLE.getVariable(), config.isResponseExample());

        boolean onlyHasDefaultGroup = apiDocList.stream().allMatch(doc -> Objects.equals(TornaConstants.DEFAULT_GROUP_CODE, doc.getGroup()));
        tpl.binding(TemplateVariable.API_DOC_LIST_ONLY_HAS_DEFAULT_GROUP.getVariable(), onlyHasDefaultGroup);
        Writer w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/test/resources/buildAll.doc"), StandardCharsets.UTF_8));
        tpl.renderTo(w);
        w.close();
    }
}
