package com.lzf.tfirst.config;

import com.lzf.tfirst.interce.MyIntercetor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class webConfigTwo implements WebMvcConfigurer {
    /**
     * 拦截器注册
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new MyIntercetor());
    }
}
