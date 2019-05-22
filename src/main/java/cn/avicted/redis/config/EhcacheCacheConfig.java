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
