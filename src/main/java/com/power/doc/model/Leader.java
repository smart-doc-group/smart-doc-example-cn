package com.power.doc.model;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import com.power.doc.constants.ValidConstants;

/**
 * Description:
 * 领导者
 *
 * @author yu 2018/06/28.
 */
public class Leader {

    /**
     * 生日
     */
    @Pattern(regexp = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$", message = "出生日期格式不正确")
    @Length(max = ValidConstants.Max)
    @Min(value = 4)
    @NotBlank(message = "生日不能为空")
    private String birthday;

    /**
     * 姓名
     */
    @NotEmpty(message = "姓名不能为空")
    @Length(max = 5)
    private String name;



    /**
     * 年龄
     */
    @Min(value = 0)
    private Integer age;

    /**
     * 科目
     */
    @Valid
    @NotNull(message = "科目不能为空")
    private Subject subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
