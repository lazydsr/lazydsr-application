package com.lazydsr.manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * MvcConfiguration
 * PROJECT_NAME: lazy-web
 * PACKAGE_NAME: com.lazy.lazyweb.config
 * Created by Lazy on 2017/10/9 10:57
 * Version: 0.1
 * Info: @TODO:...
 */
@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}