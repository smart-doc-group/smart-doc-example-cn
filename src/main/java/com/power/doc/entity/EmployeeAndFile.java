package com.power.doc.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author yu3.sun on 2021/11/21
 */
@Data
public class EmployeeAndFile {

    /**
     * 员工编号
     */
    @JsonProperty("EmpId")
    private String empId;

    /**
     * 员工头像文件
     */
    private MultipartFile avatar;
}
