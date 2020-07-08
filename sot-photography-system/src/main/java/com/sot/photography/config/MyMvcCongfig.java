package com.sot.photography.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcCongfig implements WebMvcConfigurer {

    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }

    //视图映射器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/register.html").setViewName("register");
        registry.addViewController("/admin.html").setViewName("admin");
        registry.addViewController("/test.html").setViewName("test");
        registry.addViewController("/user/userInfo_index.html").setViewName("user/userInfo_index");
        registry.addViewController("/user/userInfo_head.html").setViewName("user/userInfo_head");
        registry.addViewController("/user/userInfo_info.html").setViewName("user/userInfo_info");
        registry.addViewController("/user/userInfo_vip.html").setViewName("user/userInfo_vip");
    }

    //资源映射 静态文件 addResourceHandlers处理静态资源文件的映射路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
        //配置上传图片的位置映射
        registry.addResourceHandler("/files/**").addResourceLocations("file:/C://Users/asus/IdeaProjects/sot-photography-system/src/main/webapp/files/");

    }
}
