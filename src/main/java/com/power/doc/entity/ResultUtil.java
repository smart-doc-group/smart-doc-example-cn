package com.power.doc.entity;

import lombok.Data;

/**
 * Author: hcy
 * Version: 1.0.0V
 * Date:  2019/12/5 10:32
 * Description: 正常返回工具类
 **/

@Data
public class ResultUtil<T, O> {
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


}
