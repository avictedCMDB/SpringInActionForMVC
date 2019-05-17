package cn.avicted.springSecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @ClassName SecurityConfig1
 * @Description 配置Spring Security的方法1
 * @Author xulei
 * @Date 2019/5/16/016 14:01
 * @Version 1.0
 **/
@Configuration
@EnableWebSecurity
public class SecurityConfig1 implements WebSecurityConfigurer {

    @Override
    public void init(SecurityBuilder securityBuilder) throws Exception {

    }

    @Override
    public void configure(SecurityBuilder securityBuilder) throws Exception {

    }
}
