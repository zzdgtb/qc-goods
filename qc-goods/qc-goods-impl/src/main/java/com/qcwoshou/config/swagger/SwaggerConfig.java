package com.qcwoshou.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig{

   @Bean
   public Docket customDocket(){
      return new Docket(DocumentationType.SWAGGER_2)
           .apiInfo(apiInfo())
           .genericModelSubstitutes(ResponseEntity.class)
           .select()
           //配置仅需要显示api的路径
           .apis(RequestHandlerSelectors.basePackage("com.qcwoshou.goods.controller.app"))
           .build();
             
   }
  
   private ApiInfo apiInfo() {
       return new ApiInfoBuilder()
               .title("全城握手视频模块api接口文档")
               .description("api根地址：http://192.168.0.102:10050")
              // .termsOfServiceUrl("https://xiaomo.info/")
               .contact("wanghai")
               .version("1")
               .build();
   }

}
