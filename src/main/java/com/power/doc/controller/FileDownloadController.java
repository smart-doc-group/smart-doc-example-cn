package com.power.doc.controller;


import com.power.common.util.RandomUtil;
import com.power.common.util.StringUtil;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 文件下载
 * @author yu 2021/5/29.
 */
@RestController
public class FileDownloadController extends BaseController{


    /**
     * 下载文件
     * @apiNote smart-doc自动识别文件流对象，不需要做文件下载标记
     * @param filename 文件名|me
     * @return
     */
    @PostMapping("download1/{filename}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String filename) {
        String fileName = filename+".log";
        String randomStr = RandomUtil.randomNumbers(50);
        Resource resource = new ByteArrayResource(randomStr.getBytes());
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
                .body(resource);
    }

    /**
     * 下载普通文件文件
     * @apiNote 方法没有返回对象可以识别，需要做download标记
     * @param response
     * @return
     * @throws IOException
     * @download
     */
    @PostMapping("text/")
    public void download(HttpServletResponse response) throws IOException {
        String randomStr = RandomUtil.randomNumbers(50);
        String fileName = "test.log";
        //要使用smart-doc debug页面测试文件下载，则必须设置filename响应头，否则请采用其他模拟工具测试。
        // urlDecode用于处理中文件名
        response.setHeader("filename", urlEncode(fileName));// since 2.0.2后不需要这样设置
        ServletOutputStream outputStream = this.downloadText(fileName, response);
        outputStream.write(randomStr.getBytes());
    }

    public String urlEncode(String str) {
        if (StringUtil.isEmpty(str)) {
            return null;
        } else {
            try {
                return java.net.URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

}
