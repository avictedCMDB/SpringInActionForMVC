package cn.avicted.redis.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CachingConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/22/022 14:22
 * @Version 1.0
 **/
@Configuration
@EnableCaching
public class CachingConfig{

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager();
    }



}
