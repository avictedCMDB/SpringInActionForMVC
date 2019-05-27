package cn.avicted.remoteService.config;

import cn.avicted.remoteService.service.SpitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapServiceExporter;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Properties;

/**
 * @ClassName config
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/24/024 11:00
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackageClasses = {SpitterService.class})
public class config {

    @Bean
    public RmiServiceExporter rmiServiceExporter(SpitterService spitterService) {
        RmiServiceExporter rmiExporter = new RmiServiceExporter();
        // 表明要把sptterService发布为一个RMI服务。
        rmiExporter.setService(spitterService);
        rmiExporter.setServiceName("SpitterService");
        rmiExporter.setServiceInterface(SpitterService.class);

        rmiExporter.setRegistryHost("rmi.spitter.serverHost");
        rmiExporter.setRegistryPort(1199);

        return rmiExporter;
    }


    
    /**
    * @Author xulei
    * @Description 在客户端增加如下Bean
    * @Date 10:12 2019/5/27/027
    * @Param 
    * @return 
    **/
    @Bean
    public RmiProxyFactoryBean spitterService() {
        RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
        rmiProxy.setServiceUrl("rmi.spitter.serverHost/SpitterService");
        rmiProxy.setServiceInterface(SpitterService.class);

        return rmiProxy;
    }

    
    /**
    * @Author xulei
    * @Description 配置Hessian服务
    * @Date 10:57 2019/5/27/027
    * @Param 
    * @return 
    **/
    @Bean
    public HessianServiceExporter hessianExporterSpittedService(SpitterService spitterService) {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(spitterService);
        exporter.setServiceInterface(SpitterService.class);

        return exporter;
    }

    /**
    * @Author xulei
    * @Description 配置一个URL映射来确保DispatcherServlet把请求转给方法hessianExporterSpittedService（）
    * @Date 11:02 2019/5/27/027
    * @Param 
    * @return 
    **/
    @Bean
    public HandlerMapping hessianMapping() {
        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
        Properties mappings = new Properties();
        mappings.setProperty("/spitter.service", "hessianExporterSpittedService");
        mapping.setMappings(mappings);

        return mapping;
    }


    /**
     * @Author xulei
     * @Description 配置Http invoker服务
     * @Date 10:57 2019/5/27/027
     * @Param
     * @return
     **/
    @Bean
    public HttpInvokerServiceExporter httpExportedSpitterService(SpitterService spitterService) {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setService(spitterService);
        exporter.setServiceInterface(SpitterService.class);

        return exporter;
    }


    /**
     * @Author xulei
     * @Description 配置一个URL映射来确保DispatcherServlet把请求转给方法httpExportedSpitterService（）
     * @Date 11:02 2019/5/27/027
     * @Param
     * @return
     **/
    @Bean
    public HandlerMapping httpInvokerMapping() {
        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
        Properties mappings = new Properties();
        mappings.setProperty("/spitter.service", "httpExportedSpitterService");
        mapping.setMappings(mappings);

        return mapping;
    }


    /**
     * @Author xulei
     * @Description 在客户端增加如下Bean
     * @Date 10:12 2019/5/27/027
     * @Param
     * @return
     **/
    @Bean
    public HttpInvokerProxyFactoryBean spitterHttpService() {
        HttpInvokerProxyFactoryBean proxy = new HttpInvokerProxyFactoryBean();
        proxy.setServiceUrl("rmi.spitter.serverHost/spitter.service");
        proxy.setServiceInterface(SpitterService.class);

        return proxy;
    }



}
