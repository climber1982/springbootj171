package com.lovo.boot.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 配置类
 */
@Component
public class MyConfig implements WebMvcConfigurer {

//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//
//		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
//	}

    /**
     * 放过静态资源
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    /**
     * 跨域
     */
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
////		registry.addMapping("/**")
////				.allowedMethods("*")  //允许所有的请求方式
////				.allowedOrigins("*")//允许所有的请求域名
////				.allowedHeaders("*");//允许所有的请求头
//	}



//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/ajax")
//				.allowedMethods("*")  //允许所有的请求方式
//			.allowedOrigins("*")//允许所有的请求域名
//			.allowedHeaders("*");//允许所有的请求头
//	}
}