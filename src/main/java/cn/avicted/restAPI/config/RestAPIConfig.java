package cn.avicted.restAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

/**
 * @ClassName RestAPIConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/27/027 16:25
 * @Version 1.0
 **/
@Configuration
public class RestAPIConfig extends WebMvcConfigurerAdapter {

    /*@Override
    @Bean
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
       configurer.defaultContentType(MediaType.APPLICATION_JSON);
    }

    @Bean
    public ViewResolver cnViewResolver(ContentNegotiationManager cnm) {
        ContentNegotiatingViewResolver cnvr = new ContentNegotiatingViewResolver();
        cnvr.setContentNegotiationManager(cnm);
        return  cnvr;
    }*/



}
