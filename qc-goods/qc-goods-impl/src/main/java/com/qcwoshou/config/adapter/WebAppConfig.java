package com.qcwoshou.config.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@Configuration
@EnableWebMvc
public class WebAppConfig extends WebMvcConfigurerAdapter {
  
//	@Bean
//	AccessPathInterceptor accessPathInterceptor(){
//		return new AccessPathInterceptor();
//	}
//
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(accessPathInterceptor()).addPathPatterns("/goodsCenter/**");
//		super.addInterceptors(registry);                              
//	}
  

    /**
     * 配置springmvc返回的对象自动将属性未null的转换未空字符串
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
/*        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
        objectMapper.registerModule(simpleModule);
        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
                  jgen.writeString("");
            }
        });
        MappingJackson2HttpMessageConverter jackson2HttpMessageConverter=new MappingJackson2HttpMessageConverter(objectMapper);
        converters.add(jackson2HttpMessageConverter);*/
      
      MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
      ObjectMapper mapper = converter.getObjectMapper();
      // 为mapper注册一个带有SerializerModifier的Factory，此modifier主要做的事情为：当序列化类型为array，list、set时，当值为空时，序列化成[]
      mapper.setSerializerFactory(mapper.getSerializerFactory().withSerializerModifier(new CustomBeanSerializerModifier()));  
      converter.setSupportedMediaTypes(ImmutableList.of(MediaType.TEXT_HTML, MediaType.APPLICATION_JSON));
      converters.add(converter);
    }
    
    
    
  

    /**
     * swagger-ui.html静态资源文件显示用
     */
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

  }

}