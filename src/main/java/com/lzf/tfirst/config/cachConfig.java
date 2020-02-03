/*
package com.lzf.tfirst.config;

import net.sf.ehcache.config.CacheConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;


@Configuration
@EnableCaching
public class cachConfig extends CacheConfiguration {


    */
/*@Bean
    public CacheManager cacheManager() {
        EhCacheCacheManager cacheManager = new EhCacheCacheManager();
        cacheManager.setCacheManager(ehCacheManagerFactoryBean().getObject());
        return cacheManager;
    }*//*

    @Bean
    public CacheManager cacheManager( EhCacheManagerFactoryBean ehCacheManagerFactoryBean) {
        CacheManager cacheManager  = new EhCacheCacheManager(ehCacheManagerFactoryBean.getObject());
        return cacheManager;
    }
}
*/
