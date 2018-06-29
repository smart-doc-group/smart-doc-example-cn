package com.power.doc.model;

import com.power.doc.annotation.ErrorCode;
import com.power.doc.enums.ErrorCodeEnum;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 * Description:
 * 领导者
 *
 * @author yu 2018/06/28.
 */
public class Leader {

    /**
     * 姓名
     */
    @NotEmpty
    @ErrorCode(ErrorCodeEnum.PARAM_EMPTY)
    private String name;

    /**
     * 生日
     */
    @ErrorCode(ErrorCodeEnum.PARAM_ERROR)
    @Pattern(regexp="^[0-9]{4}-[0-9]{2}-[0-9]{2}$",message="出生日期格式不正确")
    private String birthday;

    /**
     * 年龄
     */
    @Min(value = 0)
    private Integer age;

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
}
