package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.annotation.ErrorCode;
import com.power.doc.enums.ErrorCodeEnum;
import com.power.doc.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * Description:
 * 基础Controller
 *
 * @author yu 2018/06/28.
 */
public abstract class BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    /**
     * 自定义参数验证
     * @param bindingResult
     * @return
     */
    protected CommonResult validParams(BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            Class clazz = bindingResult.getTarget().getClass();
            ErrorCode errorCode;
            try{
                errorCode = clazz.getDeclaredField(fieldError.getField()).getAnnotation(ErrorCode.class);
            }catch (NoSuchFieldException e){
                LOGGER.error("相关属性名不存在:{}",e);
                return ResultUtil.returnError(ErrorCodeEnum.UNKNOWN_ERROR);
            }
            LOGGER.error("errorCode:{}",errorCode.value());
            return ResultUtil.returnError(errorCode.value().getCode(),fieldError.getDefaultMessage());
        }
        return ResultUtil.returnSuccess("");
    }
}
