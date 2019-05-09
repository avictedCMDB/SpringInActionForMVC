package cn.avicted.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @ClassName WebConfig
 * @Description 使用Java进行配置 WebConfig配置类
 * @Author xulei
 * @Date 2019/5/9 10:51
 * @Version 1.0
 **/
@Configuration
@EnableWebMvc
@ComponentScan("cn.avicted.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
    * @Author xulei
    * @Description 配置视图解析器
    * @Date 15:10 2019/5/9/009
    * @Param []
    * @return org.springframework.web.servlet.ViewResolver
    **/
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");

        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    /**
    * @Author xulei
    * @Description 要求DispatcherServlet将对静态资源的请求转发到servlet容器中默认的Servlet上
     * 【而不是使用DispatcherServlet本身来处理此类请求】
    * @Date 11:16 2019/5/9/009
    * @Param [configurer]
    * @return void
    **/
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    
}
