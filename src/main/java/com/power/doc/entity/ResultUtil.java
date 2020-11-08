package com.power.doc.entity;

import lombok.Data;

/**
 * Author: hcy
 * Version: 1.0.0V
 * Date:  2019/12/5 10:32
 * Description: 正常返回工具类
 **/

@Data
public class ResultUtil<T> extends  BaseResult implements IApiResult<T> {

    /**
     * 返回数据
     */
    private T data;


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
