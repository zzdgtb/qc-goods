package com.qcwoshou.common;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author zhouzhiming
 * @Description 商品模块：Url统一处理工具类
 * @Date 18:02 2018/10/23
 * @Param
 * @return
 **/
public class GoodsUrlUtil {

	/**
	 * @Author zhouzhiming
	 * @Description 全路径拼接
	 * @Date 18:30 2018/10/23
	 * @Param [url, path]
	 * url  前缀域名，后缀不包括"/"，如：http://***.***.com
	 * path  文件短路径，如:/img/path/2332.jpg
	 * @return 返回可访问全路径 url+path
	 **/
	public static String contactUrlAndPath(String url,String path){
		String imgCompleteUrl = "";
		if(StringUtils.isNotBlank(url)&&StringUtils.isNotBlank(path)){
			if(!path.startsWith("/")){
				path = "/" + path;
			}
			imgCompleteUrl = url+path;
		}
		return imgCompleteUrl;
	}

	/**
	 * @Author zhouzhiming
	 * @Description 检查短路径是否已经加上
	 * @Date 18:31 2018/10/23
	 * @Param [path]
	 * @return 返回有效访问路径，前缀包括“/"
	 **/
	public static String checkValidPath(String path){
		if(StringUtils.isNotBlank(path)){
			if(!path.startsWith("/")){
				path = "/" + path;
			}
		}
		return path;
	}
}
