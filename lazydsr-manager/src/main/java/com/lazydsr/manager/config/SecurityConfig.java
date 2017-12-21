package com.lazydsr.manager.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * SecurityConfig
 * PROJECT_NAME: lazy-web
 * PACKAGE_NAME: com.lazy.web.config
 * Created by Lazy on 2017/9/25 22:38
 * Version: 0.1
 * Info: @TODO:...
 */
@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        log.error("SecurityConfig start");
        //针对iframe拒绝的问题
        http.headers().frameOptions().disable();
        http
                .authorizeRequests()
                .antMatchers("/manager1/**").access("hasRole('READER')")
                .antMatchers("/**").permitAll()
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error=true");
        http.csrf().disable();
        log.error("SecurityConfig start success");
    }
}
