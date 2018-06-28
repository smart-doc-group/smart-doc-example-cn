package com.power.doc.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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
    private String subjectName;


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
