package com.power.doc.filter;

import org.springframework.boot.jackson.autoconfigure.JsonMapperBuilderCustomizer;
import tools.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author yu 2019/1/20.
 */
public class XssFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        XssAndSqlHttpServletRequestWrapper xssRequestWrapper = new XssAndSqlHttpServletRequestWrapper(req);
        chain.doFilter(xssRequestWrapper, response);
    }

    @Override
    public void destroy() {

    }

    /**
     * 过滤json类型的
     * @return
     */
    @Bean
    public JsonMapperBuilderCustomizer xssJsonMapperCustomizer() {
        return builder -> {
            SimpleModule xssModule = new SimpleModule("XssStringJsonSerializer");
            xssModule.addSerializer(new XssStringJsonSerializer());
            builder.addModule(xssModule);
        };
    }


}
