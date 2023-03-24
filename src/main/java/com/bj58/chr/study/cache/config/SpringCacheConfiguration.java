package com.bj58.chr.study.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class SpringCacheConfiguration extends CachingConfigurerSupport {

    @Bean
    public CacheManager cacheManager(){
        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
        return simpleCacheManager;
    }
    @Bean
    public KeyGenerator keyGenerator(){
        SimpleKeyGenerator simpleKeyGenerator = new SimpleKeyGenerator();
        return simpleKeyGenerator;
    }

}
