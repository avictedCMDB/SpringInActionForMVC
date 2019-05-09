package cn.avicted.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @ClassName SpittrWebAppInitializer
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/9/009 9:45
 * @Version 1.0
 **/
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
    * @Author xulei
    * @Description 指定配置类
    * @Date 10:28 2019/5/9/009
    * @Param []
    * @return java.lang.Class<?>[]
    **/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
    * @Author xulei
    * @Description 将DispatcherServlet映射到 "/"
    * @Date 10:27 2019/5/9/009
    * @Param []
    * @return java.lang.String[]
    **/
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
