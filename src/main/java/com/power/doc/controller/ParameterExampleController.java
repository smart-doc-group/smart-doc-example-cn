package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.entity.BasePager;
import com.power.doc.entity.Car;
import com.power.doc.entity.Employee;
import com.power.doc.entity.EmployeeAndFile;
import com.power.doc.entity.EmployeeAndFileList;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 示例控制器：演示路径、查询参数及请求体中的参数处理，用于处理各种类型的参数传递方式。
 * Example Controller: Demonstrates handling of parameters in path, query, request body, and multipart files.
 *
 * @author smart-doc
 */
@RestController
@RequestMapping("/api/v1/parameters")
public class ParameterExampleController {

    /**
     * 获取员工信息，参数在查询中
     * Fetch employee details, parameters passed in query.
     *
     * @param employee 员工对象 Employee object
     * @return 包含员工信息的通用结果 Common result with employee details
     */
    @GetMapping("/employee")
    public CommonResult<Employee> getEmployeeDetails(Employee employee) {
        return CommonResult.ok(employee);
    }

    /**
     * 接收基本数据类型参数，参数在查询或表单数据中
     * Accept a primitive type parameter, passed in query or form-data.
     *
     * @param number 整数 Integer value
     * @return 包含输入整数的通用结果 Common result with the input integer
     */
    @PostMapping("/primitive")
    public CommonResult<Integer> receivePrimitiveParam(Integer number) {
        return CommonResult.ok(number);
    }

    /**
     * 接收基本数据类型参数，明确使用 @RequestParam 注解
     * Accept a primitive type parameter using @RequestParam.
     *
     * @param number 整数 Integer value
     * @return 包含输入整数的通用结果 Common result with the input integer
     */
    @PostMapping("/primitive/explicit")
    public CommonResult<Integer> receiveExplicitRequestParam(@RequestParam Integer number) {
        return CommonResult.ok(number);
    }

    /**
     * 接收员工信息，参数在查询或表单数据中
     * Accept employee details, parameters passed in query or form-data.
     *
     * @param employee 员工对象 Employee object
     * @return 包含员工信息的通用结果 Common result with employee details
     */
    @PostMapping("/employee/form")
    public CommonResult<Employee> receiveEmployeeForm(Employee employee) {
        return CommonResult.ok(employee);
    }

    /**
     * 接收员工信息，参数在请求体中
     * Accept employee details, passed in the request body.
     *
     * @param employee 员工对象 Employee object
     * @return 包含员工信息的通用结果 Common result with employee details
     */
    @PostMapping("/employee/body")
    public CommonResult<Employee> receiveEmployeeBody(@RequestBody Employee employee) {
        return CommonResult.ok(employee);
    }

    /**
     * 接收表单数据，参数在 x-www-form-urlencoded 表单中
     * Accept form data, passed as x-www-form-urlencoded.
     *
     * @param employee 员工对象 Employee object
     * @return 包含员工信息的通用结果 Common result with employee details
     */
    @PostMapping(path = "/employee/form-urlencoded", consumes = "application/x-www-form-urlencoded")
    public CommonResult<Employee> receiveFormUrlEncoded(Employee employee) {
        return CommonResult.ok(employee);
    }

    /**
     * 接收查询参数和请求体中的 JSON 数据
     * Accept query parameters and JSON data in the request body.
     *
     * @param pager 分页对象 Pagination object
     * @param car   汽车对象 Car object
     * @return 包含分页信息的通用结果 Common result with pagination details
     */
    @PostMapping("/query-and-body")
    public CommonResult<BasePager> receiveQueryAndBody(BasePager pager, @RequestBody Car car) {
        return CommonResult.ok(pager);
    }

    /**
     * 接收查询参数、请求体和路径参数
     * Accept query, JSON body, and path parameters.
     *
     * @param pager 分页对象 Pagination object
     * @param extra 查询字符串 Query string
     * @param car   汽车对象 Car object
     * @param id    路径参数 Path parameter
     * @return 包含分页信息的通用结果 Common result with pagination details
     */
    @PostMapping("/query-body-and-path/{id}")
    public CommonResult<BasePager> receiveQueryBodyAndPath(BasePager pager,
                                                           @RequestParam String extra,
                                                           @RequestBody Car car,
                                                           @PathVariable String id) {
        return CommonResult.ok(pager);
    }

    /**
     * 接收表单和文件数据
     * Accept form data and files.
     *
     * @param data 包含文件的表单数据 Form data containing files
     * @return 员工信息 Employee details
     */
    @PostMapping("/form-and-file")
    public CommonResult<Employee> receiveFormAndFile(EmployeeAndFile data) {
        Employee employee = new Employee();
        employee.setEmpId(data.getEmpId());
        return CommonResult.ok(employee);
    }

    /**
     * 接收多个文件列表和查询参数
     * Accept a file list and query parameters.
     *
     * @param data 表单数据包含文件列表 Form data containing file list
     * @param name 查询参数 Query parameter
     * @return 员工信息 Employee details
     */
    @PostMapping("/form-file-list")
    public CommonResult<Employee> receiveFormFileList(EmployeeAndFileList data, @RequestParam String name) {
        Employee employee = new Employee();
        employee.setEmpId(data.getEmpId());
        return CommonResult.ok(employee);
    }

    /**
     * 接收单个 Multipart 文件和其他参数。
     * Accept a single multipart file along with additional parameters.
     *
     * @param file 上传的文件 Uploaded file
     * @param name 文件相关名称 Associated name
     * @param id   路径参数 Path parameter
     * @return 员工信息 Employee details
     */
    @PostMapping("/upload/single/{id}")
    public CommonResult<Employee> uploadSingleFile(MultipartFile file, @RequestParam String name, @PathVariable String id) {
        Employee employee = new Employee();
        employee.setEmpId(name);
        return CommonResult.ok(employee);
    }

    /**
     * 接收多个 Multipart 文件数组和其他参数。
     * Accept an array of multipart files along with additional parameters.
     *
     * @param files 上传的文件数组 Array of uploaded files
     * @param name  文件相关名称 Associated name
     * @param id    路径参数 Path parameter
     * @return 员工信息 Employee details
     */
    @PostMapping("/upload/array/{id}")
    public CommonResult<Employee> uploadFileArray(MultipartFile[] files, @RequestParam String name, @PathVariable String id) {
        Employee employee = new Employee();
        employee.setEmpId(name);
        return CommonResult.ok(employee);
    }

    /**
     * 接收多个 Multipart 文件列表和其他参数。
     * Accept a list of multipart files along with additional parameters.
     *
     * @param files 上传的文件列表 List of uploaded files
     * @param name  文件相关名称 Associated name
     * @param id    路径参数 Path parameter
     * @return 员工信息 Employee details
     */
    @PostMapping("/upload/list/{id}")
    public CommonResult<Employee> uploadFileList(@NotEmpty List<@NotNull MultipartFile> files, @RequestParam String name,
                                                 @PathVariable String id) {
        Employee employee = new Employee();
        employee.setEmpId(name);
        return CommonResult.ok(employee);
    }
}
