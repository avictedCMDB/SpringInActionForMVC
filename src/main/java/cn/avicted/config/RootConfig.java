package cn.avicted.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @ClassName RootConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/9/009 10:51
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackages = "cn.avicted", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {

}
