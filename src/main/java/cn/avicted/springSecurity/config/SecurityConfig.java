package cn.avicted.springSecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * @ClassName SecurityConfig
 * @Description 配置Spring Security的方法2
    * @EnableWebSecurity：可以启用任意Web应用的安全性功能。
    * 通过重载WebSecurityConfigurerAdapter的三个configure()方法来配置Web安全性。
 * @Author xulei
 * @Date 2019/5/16/016 14:00
 * @Version 1.0
 **/
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
    * @Author xulei
    * @Description inMemoryAuthentication()方法可以启用、配置并任意填充基于内存的用户存储。
    * @Date 14:29 2019/5/16/016
    * @Param [auth]
    * @return void
    **/
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER")
                .and().withUser("admin").password("password").roles("USER","ADMIN");
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }
}
