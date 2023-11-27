package com.power.doc.entity.valid;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.groups.Default;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author <a href="mailto:cqmike0315@gmail.com">chenqi</a>
 * @version 1.0
 */
@Data
@EqualsAndHashCode
public class User {

    /**
     * id
     */
    @Null(groups = Save.class)
    @NotNull(groups = Update.class)
    private Long id;

    /**
     * 名称
     */
    @NotEmpty(message = "名称不能为空")
    private String name;

    /**
     * 邮件
     */
    private String email;

    public interface Save extends Default {

    }

    public interface Update extends Default {

    }
}
