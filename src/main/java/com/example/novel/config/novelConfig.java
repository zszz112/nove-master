package com.example.novel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class novelConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new LoginInterceptor());
        interceptorRegistration.addPathPatterns("/**");
        interceptorRegistration.excludePathPatterns("/mess/signin","/mess/login","/js/**","/mess/doLogin","/**/*.html");


    }
}
