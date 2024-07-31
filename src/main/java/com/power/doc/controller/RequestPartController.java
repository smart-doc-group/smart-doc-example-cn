package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.model.Student;
import com.power.doc.model.User;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * `@RequestPart` Controller
 * Demonstrates various use cases of the @RequestPart annotation
 * for handling multipart form data in Spring.
 * <p>
 *
 * @author linwumingshi
 */
@SuppressWarnings({"unused", "unchecked"})
@RequestMapping("/request/part")
@RestController
public class RequestPartController {


    /**
     * Test uploading a single file using @RequestPart.
     *
     * @param file the file to be uploaded
     * @return the result
     */
    @PostMapping("/uploadSingleFile")
    public CommonResult<String> uploadSingleFile(@RequestPart("file") MultipartFile file) {
        return CommonResult.ok().setResult("uploadSingleFile");
    }

    /**
     * Test uploading a file and a Student object using @RequestPart.
     *
     * @param student the student object
     * @param file    the file to be uploaded
     * @return the result
     */
    @PostMapping("/uploadFileAndStudent")
    public CommonResult<String> uploadFileAndStudent(@RequestPart(value = "student", required = true) Student student,
                                                     @RequestPart MultipartFile file) {
        return CommonResult.ok().setResult("uploadFileAndStudent");
    }


    /**
     * Test uploading a file and a validated Student object using @RequestPart.
     *
     * @param student the validated student object
     * @param file    the file to be uploaded
     * @return the result
     */
    @PostMapping("/uploadValidatedFileAndStudent")
    public CommonResult<String> uploadValidatedFileAndStudent(@RequestPart(value = "student", required = true) @Validated Student student,
                                                              @RequestPart MultipartFile file) {
        return CommonResult.ok().setResult("uploadValidatedFileAndStudent");
    }


    /**
     * Test uploading a file and an optional validated Student object using @RequestPart.
     *
     * @param student the validated student object (optional)
     * @param file    the file to be uploaded
     * @return the result
     */
    @PostMapping("/uploadOptionalValidatedFileAndStudent")
    public CommonResult<String> uploadOptionalValidatedFileAndStudent(@RequestPart(value = "student", required = false) @Validated Student student,
                                                                      @RequestPart MultipartFile file) {
        return CommonResult.ok().setResult("uploadOptionalValidatedFileAndStudent");
    }

    /**
     * Test uploading a string using @RequestPart.
     *
     * @param aa the string to be uploaded
     * @return the result
     */
    @PostMapping("/uploadString")
    public CommonResult<String> uploadString(@RequestPart(value = "aaa", required = true) @NotBlank(message = "aaa is not blank") String aa) {
        return CommonResult.ok().setResult("uploadString");
    }


    /**
     * Test uploading a ranged integer using @RequestPart.
     *
     * @param aa the integer to be uploaded
     * @return the result
     */
    @PostMapping("/uploadRangedInteger")
    public CommonResult<String> uploadRangedInteger(@RequestPart(value = "aaa", required = true) @Range(min = 1, max = 10) Integer aa) {
        return CommonResult.ok().setResult("uploadRangedInteger");
    }


    /**
     * Test uploading an array of strings using @RequestPart.
     *
     * @param aa the array of strings to be uploaded
     * @return the result
     */
    @PostMapping("/uploadStringArray")
    public CommonResult<String> uploadStringArray(@RequestPart(value = "a2", required = true) String[] aa) {
        return CommonResult.ok().setResult("uploadStringArray");
    }


    /**
     * Test uploading a list of files and a User object using @RequestPart.
     *
     * @param user  the user object
     * @param files the list of files to be uploaded
     * @return the result
     */
    @PostMapping("/uploadFilesAndUser")
    public CommonResult<String> uploadFilesAndUser(@RequestPart("user") User user,
                                                   @RequestPart("files") List<MultipartFile> files) {
        return CommonResult.ok().setResult("uploadFilesAndUser");
    }


    /**
     * Test uploading a list of files and a list of User objects using @RequestPart.
     *
     * @param users the list of user objects
     * @param files the list of files to be uploaded
     * @return the result
     */
    @PostMapping("/uploadFilesAndUsers")
    public CommonResult<String> uploadFilesAndUsers(@RequestPart("users") List<User> users,
                                                    @RequestPart("files") List<MultipartFile> files) {
        return CommonResult.ok().setResult("uploadFilesAndUsers");
    }


    /**
     * Test uploading a file and a boolean using @RequestPart.
     *
     * @param active the boolean flag
     * @param file   the file to be uploaded
     * @return the result
     */
    @PostMapping("/uploadFileAndBoolean")
    public CommonResult<String> uploadFileAndBoolean(@RequestPart("active") Boolean active,
                                                     @RequestPart MultipartFile file) {
        return CommonResult.ok().setResult("uploadFileAndBoolean");
    }


    /**
     * Test uploading multiple files and a map of metadata using @RequestPart.
     *
     * @param metadata the map of metadata
     * @param files    the list of files to be uploaded
     * @return the result
     */
    @PostMapping("/uploadFilesAndMetadata")
    public CommonResult<String> uploadFilesAndMetadata(@RequestPart("metadata") Map<String, String> metadata,
                                                       @RequestPart("files")
                                                       @Length(min = 1, max = 10, message = "文件数量最少1个 最多10个") List<MultipartFile> files) {
        return CommonResult.ok().setResult("uploadFilesAndMetadata");
    }
}
