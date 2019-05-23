package cn.avicted.redis.config;

import net.sf.ehcache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName EhcacheCacheConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/22/022 14:40
 * @Version 1.0
 **/
@Configuration
@EnableCaching
public class EhcacheCacheConfig {

    /**
    * @Author xulei
    * @Description Spring和EhCache都定义了CacheManager类型：但是，EhCache的CacheManager要被注入到Spring的EhCacheCacheManager之中。
    * @Date 9:03 2019/5/23/023
    * @Param [cm]
    * @return org.springframework.cache.ehcache.EhCacheCacheManager
    **/
    @Bean
    public EhCacheCacheManager cacheConfig(CacheManager cm) {
        return new EhCacheCacheManager(cm);
    }

    @Bean
    public EhCacheManagerFactoryBean ehcache() {
        EhCacheManagerFactoryBean ehCacheManagerFactoryBean = new EhCacheManagerFactoryBean();
        ehCacheManagerFactoryBean.setConfigLocation(new ClassPathResource("classpath:config/redis-config.xml"));

        return ehCacheManagerFactoryBean;
    }


}
