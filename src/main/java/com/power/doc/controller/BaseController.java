package com.power.doc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * BaseController
 *
 * @author yu on 2018/07/07.
 */
public abstract class BaseController<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    /**
     * excel文件
     */
    public static final String EXCEL_CONTENT_TYPE = "application/vnd.ms-excel;charset=utf-8";

    /**
     * 普通的文本
     */
    public static final String TEXT_CONTENT_TYPE = "application/octet-stream;charset=utf-8";

    /**
     * 分页查询
     *
     * @param $filter
     * @param $page
     * @param $size
     * @param $orderby
     * @return
     */
    @PostMapping(value = "/list")
    public T getPageList(@RequestBody T t) {

        return null;
    }




    /**
     * 导出excel,添加文件名时需要自己添加后缀
     *
     * @param fileName 文件名(用户信息表.xls)
     * @param response HttpServletResponse
     * @return ServletOutputStream
     * @throws Exception
     */
    protected ServletOutputStream exportExcel(String fileName, HttpServletResponse response) throws IOException {
        return baseDownload(EXCEL_CONTENT_TYPE,fileName,response);
    }

    /**
     * 基础的文件下载
     * @param contentType 下载文件的类型
     * @param fileName
     * @param response
     * @return
     * @throws IOException
     */
    protected ServletOutputStream baseDownload(String contentType, String fileName, HttpServletResponse response)
            throws IOException {
        response.setContentType(contentType);
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename="
                + new String(fileName.getBytes("gbk"), "iso-8859-1"));
        return response.getOutputStream();
    }

    /**
     * 文件下载
     * @param fileName 下载文件
     * @param response 响应
     * @return
     * @throws IOException
     */
    protected ServletOutputStream downloadText(String fileName,HttpServletResponse response) throws IOException{
        return baseDownload(TEXT_CONTENT_TYPE,fileName,response);
    }
}