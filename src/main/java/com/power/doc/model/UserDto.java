package com.power.doc.model;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.Serializable;
import java.util.List;

/**
 * @author yu 2019/10/17.
 */
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * token
     */
    private String token;

    /**
     * UserDto 用户信息列表
     */
    private Page<LoginDto> LoginList;
}
