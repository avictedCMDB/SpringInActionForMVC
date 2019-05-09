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
    * @Description 该方法返回的带有@Configuration注解的类将会用来定义ContextLoaderListener应用上下文中的bean
    * @Date 10:28 2019/5/9/009
    * @Param []
    * @return java.lang.Class<?>[]
    **/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
    * @Author xulei
    * @Description 该方法返回的带有@Configuration注解的类将会用来定义DispatcherServlet应用上下文中的bean
    * @Date 15:06 2019/5/9/009
    * @Param []
    * @return java.lang.Class<?>[]
    **/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
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
