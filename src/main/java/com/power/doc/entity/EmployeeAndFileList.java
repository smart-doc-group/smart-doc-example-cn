package com.power.doc.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author yu3.sun on 2021/11/21
 */
@Data
public class EmployeeAndFileList {

    /**
     * 员工编号
     */
    @JsonProperty("EmpId")
    private String empId;

    /**
     * 文本文件集合
     */
    private List<MultipartFile> books;
}
