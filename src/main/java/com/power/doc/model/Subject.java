package com.power.doc.model;

import com.power.doc.annotation.ErrorCode;
import com.power.doc.enums.ErrorCodeEnum;

import jakarta.validation.constraints.NotEmpty;


/**
 * Description:
 * 学科
 *
 * @author yu 2018/06/12.
 */
public class Subject {

    /**
     * 科目名称
     */
    @ErrorCode(ErrorCodeEnum.PARAM_EMPTY)
    @NotEmpty(message = "科目名称不能为空")
    private String subjectName;

    /**
     * 分数
     */
    private int core;




    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }
}
