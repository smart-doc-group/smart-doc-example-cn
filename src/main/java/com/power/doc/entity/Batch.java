package com.power.doc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * gitee #I3BTFY .
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("hr_batch")
public class Batch extends BaseEntity<Batch> {



    /**
     * 申请截止日期
     */
    private LocalDateTime closeDate;
    /**
     * 开始日期
     */
    private LocalDate beginDate;

    /**
     * 结束日期
     */
    private LocalDate endDate;



    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 状态
     * @ignore
     */
    private String status;

    /**
     * 截止修改时间
     */
    private LocalDateTime closeUpdateDate;

    /**
     * 过期
     * @ignore
     */
    @TableField(exist = false)
    private boolean expired;

    public boolean getExpired() {
        if (closeDate != null) {
            return LocalDateTime.now().isAfter(closeDate);
        } else {
            return false;
        }
    }

}
