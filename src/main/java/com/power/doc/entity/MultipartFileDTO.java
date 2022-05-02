package com.power.doc.entity;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;

/**
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
@Data
public class MultipartFileDTO {

    /**
     * 名称
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 地址
     */
    private List<String> addressList;

    /**
     *  文件List
     */
    private List<MultipartFile> multipartFileList;

    /**
     * 文件array
     */
    private MultipartFile[] multipartFiles;

    /**
     *  文件List
     */
    private List<CommonsMultipartFile> commonsMultipartFileList;

    /**
     * 文件array
     */
    private CommonsMultipartFile[] commonsMultipartFiles;
}
