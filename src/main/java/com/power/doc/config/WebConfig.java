package com.power.doc.config;

import com.power.doc.filter.XssFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yu 2019/1/20.
 */
@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new XssFilter());
        registration.addUrlPatterns("/*");
        //多个例外配置使用分号隔开，注意这里的例外是可选的，如果没有配置例外，则表示拦截做所有
        registration.setName("xssFilter");
        registration.setOrder(1);
        return registration;
    }
}
