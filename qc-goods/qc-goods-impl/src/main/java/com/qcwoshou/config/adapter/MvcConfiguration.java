package com.qcwoshou.config.adapter;

import com.qcwoshou.version.handler.CustomRequestMappingHandlerMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * 版本控制配置
 * Created by 建宇 on 2017/10/28.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.qcwoshou.goods.controller", useDefaultFilters = false, includeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION, value = { Controller.class }) })
public class MvcConfiguration extends WebMvcConfigurationSupport {

  /**
    * requestMapping重载，接口版本请求控制
    */
  @Override
  @Bean
  public RequestMappingHandlerMapping requestMappingHandlerMapping() {
      RequestMappingHandlerMapping handlerMapping = new CustomRequestMappingHandlerMapping();
      handlerMapping.setOrder(0);
      handlerMapping.setInterceptors(getInterceptors());
      return handlerMapping;
  }
}
