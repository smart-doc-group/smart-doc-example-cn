package com.power.doc.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author yu3.sun on 2022/3/29
 */
public class BizEntity<T> implements Serializable {
  /**
   * 主键
   *
   * @ignore
   */
  @TableId("id")
  private T id;

  /**
   * 更新人
   *
   * @ignore
   */
  @TableField(fill = FieldFill.INSERT_UPDATE)
  private T updatedBy;

  /**
   * 更新时间
   *
   * @ignore
   */
  @TableField(fill = FieldFill.INSERT_UPDATE)
  private LocalDateTime updatedAt;

  /**
   * 创建人
   *
   * @ignore
   */
  @TableField(fill = FieldFill.INSERT)
  private T createdBy;

  /**
   * 创建时间
   *
   * @ignore
   */
  @TableField(fill = FieldFill.INSERT)
  private LocalDateTime createdAt;
}

