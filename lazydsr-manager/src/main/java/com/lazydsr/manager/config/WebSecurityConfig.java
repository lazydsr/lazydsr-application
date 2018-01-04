package com.lazydsr.manager.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
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
@EnableGlobalMethodSecurity(prePostEnabled = true)  //AOP
@Slf4j
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        log.error("SecurityConfig start");
        //针对iframe拒绝的问题
        http.headers().frameOptions().disable();
        http
                .authorizeRequests()
                .antMatchers("/static/**").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/logout").permitAll()
                .antMatchers("/manager1/**").access("hasRole('ADMIN')")
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error=true");
        //http
        //        .formLogin()                        //启用默认登陆页面
        //        .failureUrl("/login?error")         //登陆失败返回URL:/login?error
        //        .defaultSuccessUrl("/")         //登陆成功跳转URL
        //        .permitAll();                       //登陆页面全部权限可访问

        super.configure(http);
        http.csrf().disable();
        log.error("SecurityConfig start success");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
        auth
                .inMemoryAuthentication()
                .withUser("admin")
                .password("Lazy@dsr")
                .roles("ADMIN");
    }
}
