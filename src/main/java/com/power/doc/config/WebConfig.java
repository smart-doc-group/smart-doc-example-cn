package com.power.doc.config;

import com.power.doc.filter.XssFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author yu 2019/1/20.
 */
@Configuration
public class WebConfig {

//    @Bean
//    public FilterRegistrationBean testFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
////        registration.setFilter(new XssFilter());
//        registration.addUrlPatterns("/*");
//        //多个例外配置使用分号隔开，注意这里的例外是可选的，如果没有配置例外，则表示拦截做所有
//        registration.setName("xssFilter");
//        registration.setOrder(1);
//        return registration;
//    }
    private CorsConfiguration buildConfig() {

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 1. 设置访问源地址
        corsConfiguration.addAllowedOrigin("*");
        // 2. 设置访问源请求头
        corsConfiguration.addAllowedHeader("*");
        // 3. 设置访问源请求方法
        corsConfiguration.addAllowedMethod("*");

        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 4. 对接口配置跨域设置
        source.registerCorsConfiguration("/**", buildConfig());

        return new CorsFilter(source);
    }
}
