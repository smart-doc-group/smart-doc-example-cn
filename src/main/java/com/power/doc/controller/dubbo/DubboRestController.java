package com.power.doc.controller.dubbo;

import com.power.common.model.CommonResult;
import com.power.doc.model.LoginDto;
import org.springdoc.core.RequestBodyInfo;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 * DubboRest 接口测试
 *
 * @dubboRest
 */
@Path("/test-api")
public class DubboRestController {


    /**
     * 测试POST
     *
     * @param commonResult commonResult
     * @return CommonResult
     */
    @POST
    @Path("/test")
    @HeaderParam("Content-Type")
    public CommonResult test(CommonResult commonResult) {
        return CommonResult.ok();
    }

    /**
     * 测试键值对
     *
     * @param name 姓名
     * @return CommonResult
     */
    @GET
    @Path("/get")
    @HeaderParam("Content-Type")
    public CommonResult get(String name) {
        return CommonResult.ok();
    }

    /**
     * 测试delete
     *
     * @param name 姓名
     * @return CommonResult
     */
    @DELETE
    @Path("/delete")
    @HeaderParam("Content-Type")
    public CommonResult delete(String name) {
        return CommonResult.ok();
    }

    /**
     * 测试put
     *
     * @param name 姓名
     * @return CommonResult
     */
    @PUT
    @Path("/put")
    @HeaderParam("Content-Type")
    public CommonResult put(String name) {
        return CommonResult.ok();
    }

    /**
     * 测试参数为json
     *
     * @param loginDto loginDto
     * @return CommonResult
     */
    @POST
    @Path("/postjson")
    @HeaderParam("Content-Type")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public CommonResult postJson(LoginDto loginDto) {
        return CommonResult.ok();
    }

    /**
     * 测试PathParamput
     *
     * @param id id
     * @return CommonResult
     */
    @PUT
    @Path("/pathParam")
    @HeaderParam("Content-Type")
    @PathParam(value = "/{id}")
    public CommonResult pathParam(int id) {
        return CommonResult.ok();
    }

}