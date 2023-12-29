//package com.cache.config;
//
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//@Configuration
//@EnableCaching
//public class EhcacheConfig {
//
//	 @Bean
//	    CacheManager cacheManager(){
//	        return new EhCacheCacheManager(ehCacheManager());
//	    }
//
//	    private net.sf.ehcache.CacheManager ehCacheManager() {
//	        EhCacheManagerFactoryBean factoryBean = new EhCacheManagerFactoryBean();
//	        factoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
//	        factoryBean.setShared(true);
//	        return factoryBean.getObject();
//	    }
//}
