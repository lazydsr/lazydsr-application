package com.lazydsr.manager.config;

import com.lazydsr.manager.interceptor.UserInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * MvcConfiguration
 * PROJECT_NAME: lazy-web
 * PACKAGE_NAME: com.lazy.lazyweb.config
 * Created by Lazy on 2017/10/9 10:57
 * Version: 0.1
 * Info: 给静态资源添加额外的路径
 */
@Configuration
//@PropertySource("classpath:config/application-interceptor.yml")
@PropertySource("classpath:config/interceptor.properties")
@ConfigurationProperties
public class MvcConfiguration extends WebMvcConfigurerAdapter {
    @Value("${status}")
    private boolean userStatus;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        if (userStatus) {
            registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**").excludePathPatterns("/error", "/login");
        }
    }
}