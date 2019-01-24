package com.sun.demo.config;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 登录视图配置
 *
 * @author sun
 * @date 2019/1/11 18:09
 */
@EnableWebMvc
//@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    // ...

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login.html").setViewName("login");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}