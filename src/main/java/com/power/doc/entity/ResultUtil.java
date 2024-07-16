package com.power.doc.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.MDC;

/**
 * Author: hcy
 * Version: 1.0.0V
 * Date:  2019/12/5 10:32
 * Description: 正常返回工具类
 **/

@EqualsAndHashCode(callSuper = true)
@Data
public class ResultUtil<T> extends  BaseResult implements IApiResult<T> {

    /**
     * 时间戳
     */
    private String timestamp = String.valueOf(System.currentTimeMillis());

    /**
     * 链路id
     */
    private String traceId = MDC.get("traceId");

    /**
     * 返回数据
     */
    private T data;

    public String getTraceId() {
        return traceId;
    }

    public ResultUtil<T> setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }



    @Override
    public String getCode() {
        return super.getCode();
    }

    @Override
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
