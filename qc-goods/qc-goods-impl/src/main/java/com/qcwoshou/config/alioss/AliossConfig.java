package com.qcwoshou.config.alioss;

import com.qcwoshou.core.utils.alioss.OSSClientUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zhouzhiming
 * @Description //TODO
 * @Date 18:32 2018/10/23
 * @Param
 * @return
 **/
@Configuration
@Slf4j
public class AliossConfig {
	// oss节点
	@Value("${aliyunOSS.endpoint}")
	private String endpoint;
	@Value("${aliyunOSS.accessKeyId}")
	private String accessKeyId;
	@Value("${aliyunOSS.accessKeySecret}")
	private String accessKeySecret;
	/**空间*/
	@Value("${aliyunOSS.bucketName}")
	private String bucketName;
	@Value("${qcws.url}")
	private String url;
	
	@Bean
	public OSSClientUtil OSSClientUtil(){
		log.info("show oss info:"+endpoint+","+accessKeyId+","+accessKeySecret+","+bucketName+","+url);
		return new OSSClientUtil(endpoint,accessKeyId,accessKeySecret,bucketName,url); 
	}
}
