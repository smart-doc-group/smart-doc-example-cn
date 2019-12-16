package com.power.doc.entity;

import lombok.Data;

/**
 * Author: hcy
 * Version: 1.0.0V
 * Date:  2019/12/5 10:32
 * Description: 正常返回工具类
 **/

@Data
public class ResultUtil<T> {
    /**
     * ok: 接口业务成功返回
     * 其他返回表示相应的错误提示
     */
    private String msg;
    /**
     * 0: 表示业务正常返回
     * 非0: 则表示业务异常, msg会有相应的异常信息
     */
    private String code;
    /**
     * 返回数据
     */
    private T data;

    /**
     * 无参返回结果
     *
     * @return
     */
    public static ResultUtil<Boolean> success() {
        ResultUtil<Boolean> result = new ResultUtil<>();
        result.setData(true);
        return result;
    }

    /**
     * 有参返回结果
     *
     * @param data
     * @return
     */
    public static <T> ResultUtil<T> success(T data) {
        ResultUtil<T> result = new ResultUtil<>();
        result.setData(data);
        return result;
    }

    /**
     * 无参错误返回结果
     *
     * @return
     */
    public static ResultUtil<Boolean> error() {
        ResultUtil<Boolean> result = new ResultUtil<>();
        result.setData(false);
        return result;
    }

    /**
     * 有参,错误代码,错误信息返回
     *
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static <T> ResultUtil<T> error(String code, String msg, T data) {
        ResultUtil<T> result = new ResultUtil<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    /**
     * 有参数, 错误代码返回
     *
     * @param code
     * @param data
     * @return
     */
    public static <T> ResultUtil<T> error(String code, T data) {
        ResultUtil<T> result = new ResultUtil<>();
        result.setCode(code);
        result.setData(data);
        return result;
    }
}
