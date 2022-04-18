package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.entity.MultipartFileDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;

/**
 * 文件上传测试
 * @author yu 2019/10/31.
 */
@RestController
public class FileUploadController {

    /**
     * 上传单个文件
     * @param userId 用户id
     * @param file 文件
     * @return
     */
    @PostMapping(value = "/upload",consumes = "multipart/form-data")
    public CommonResult upload(String userId,@RequestParam MultipartFile file) {
        return CommonResult.ok();
    }

    /**
     * 批量上传文件
     * @param file 文件
     * @return
     */
    @PostMapping(name = "/batchUpload1",consumes = "multipart/form-data")
    public CommonResult batchFileUpload1(MultipartFile[] file) {
        return CommonResult.ok();
    }

    /**
     * 批量上传文件1
     * @param file 文件
     * @return
     */
    @PostMapping(value = "/batchUpload2",consumes = "multipart/form-data")
    public CommonResult batchFileUpload2(List<MultipartFile> file) {
        return CommonResult.ok();
    }

    /**
     * 批量上传文件2
     * @param files 批量文件
     * @return
     */
    @PostMapping(value = "/batchUpload3",consumes = "multipart/form-data")
    public CommonResult batchFileUpload3(CommonsMultipartFile[] files){
        return CommonResult.ok();
    }


    /**
     * 批量上传文件3
     * @param files 批量文件
     * @return
     */
    @PostMapping(value = "/batchUpload4",consumes = "multipart/form-data")
    public CommonResult batchFileUpload4(List<CommonsMultipartFile> files){
        return CommonResult.ok();
    }

    /**
     * 批量上传文件5
     * @param dto
     * @return
     */
    @PostMapping(value = "/batchUpload5", consumes = "multipart/form-data")
    public CommonResult<Void> batchUpload5(MultipartFileDTO dto) {
        return CommonResult.ok();
    }



}
