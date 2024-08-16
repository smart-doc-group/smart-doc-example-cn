package com.power.doc.controller.json.view;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 示例控制器：演示如何使用 @JsonView 注解来控制 JSON 序列化的字段可见性。
 *
 * @author linwumingshi
 */
@RestController
@RequestMapping("/api/json/view")
public class JsonViewTestController {

    /**
     * 仅返回隐私字段（密码和手机号码）
     *
     * @return 包含隐私信息的用户数据
     */
    @JsonView(UserPrivacy.class)
    @GetMapping("/user/privacy")
    public JsonViewUser getUserPrivacy() {
        return getTempUser();
    }

    /**
     * 仅返回公共字段（用户名和手机号码）
     *
     * @return 包含公共信息的用户数据
     */
    @JsonView(UserPublic.class)
    @GetMapping("/user/public")
    public JsonViewUser getUserPublic() {
        return getTempUser();
    }

    /**
     * 返回所有字段，除了地址
     *
     * @return 除了地址之外的所有用户数据
     */
    @JsonView(CombinedView.class)
    @GetMapping("/user/all-except-address")
    public JsonViewUser getUserAllExceptAddress() {
        return getTempUser();
    }

    /**
     * 返回所有字段（没有 @JsonView 限制）
     *
     * @return 全部用户数据
     */
    @GetMapping("/user/all")
    public JsonViewUser getUserAll() {
        return getTempUser();
    }

    /**
     * 测试：传入多个 @JsonView 注解会导致错误
     *
     * @return 用户数据，但此方法将抛出异常
     */
    @JsonView({UserPrivacy.class, UserPublic.class})
    @GetMapping("/user/error")
    public JsonViewUser getUserWithError() {
        return getTempUser();
    }

    /**
     * 获取临时用户数据
     *
     * @return 模拟的用户数据
     */
    public static JsonViewUser getTempUser() {
        JsonViewUser jsonViewUser = new JsonViewUser();
        jsonViewUser.setName("testUser");
        jsonViewUser.setPassword("securePassword123");
        jsonViewUser.setAge(25);
        jsonViewUser.setAddress("Shanghai, China");
        jsonViewUser.setMobile("+86-12345678910");
        return jsonViewUser;
    }

    /**
     * 用户实体类：使用 @JsonView 来控制字段的可见性
     */
    @Data
    public static class JsonViewUser {

        /**
         * 用户名
         */
        @JsonView(UserPublic.class)
        private String name;

        /**
         * 密码
         */
        @JsonView(UserPrivacy.class)
        private String password;

        /**
         * 年龄
         */
        @JsonView(CombinedView.class)
        private Integer age;

        /**
         * 地址
         */
        private String address;

        /**
         * 手机号码
         */
        @JsonView({UserPrivacy.class, UserPublic.class})
        private String mobile;
    }


    public interface UserPublic {
    }

    public interface UserPrivacy {
    }


    public interface CombinedView extends UserPublic, UserPrivacy {
    }
}