package com.qcwoshou.config.dozer;
import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zhouzhiming
 * @Description 对象复制转换
 * @Date 10:47 2018/10/24
 * @Param
 * @return
 **/
@Configuration
public class DozerConfig {
    @Bean
    public DozerBeanMapper dozerBean() {
        //List<String> mappingFiles = Arrays.asList("dozer-configration-mapping.xml");
        DozerBeanMapper dozerBean = new DozerBeanMapper();
        //dozerBean.setMappingFiles(mappingFiles);
        return dozerBean;
    }
}



