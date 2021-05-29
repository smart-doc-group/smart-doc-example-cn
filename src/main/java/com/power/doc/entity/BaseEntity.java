package com.power.doc.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * entity 基类
 *
 * @since 2020/9/22 14:15
 */
@Data
@ToString
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class BaseEntity<T extends Model<T>> extends Model<T> {

    private static final long serialVersionUID = -4035746430764065642L;

    public static final String ID = "id";
    public static final String CREATE_BY = "create_by";
    public static final String CREATE_DATE = "create_date";
    public static final String UPDATE_BY = "update_by";
    public static final String UPDATE_DATE = "update_date";
    public static final String DEL_FLAG = "del_flag";


    /**
     * 创建时间
     *
     *
     */
    private LocalDateTime createDate;


    /**
     * 主键
     */
    @TableId
    protected String id;
    /**
     * 创建者
     *
     * @ignore
     */
    @TableField(value = CREATE_BY, fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 修改者
     *
     * @ignore
     */
    @TableField(value = UPDATE_BY, fill = FieldFill.INSERT_UPDATE)
    private String updateBy;

    /**
     * 修改时间
     *
     * @ignore
     */
    @TableField(value = UPDATE_DATE, fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateDate;

    /**
     * 删除标志
     *
     * @ignore
     */
    @TableField(DEL_FLAG)
    @TableLogic
    private Boolean delFlag;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

