package cn.avicted.config;

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

import java.io.IOException;

/**
 * @ClassName MutipartResolverConfig
 * @Description 两种不同的配置Multipart方式
 * @Author xulei
 * @Date 2019/5/14/014 14:46
 * @Version 1.0
 **/
public class MutipartResolverConfig {

    /*@Bean
    public MultipartResolver starndardMultipartResolver() throws IOException {
        return new StandardServletMultipartResolver();
    }*/

    @Bean
    public MultipartResolver commonsMultipartResolver() throws IOException{
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setUploadTempDir(new FileSystemResource("F:/GitProject/SpringInActionForMVC/upload"));
        multipartResolver.setMaxUploadSize(2097152);
        multipartResolver.setMaxInMemorySize(0);
        return multipartResolver;
    }



}
