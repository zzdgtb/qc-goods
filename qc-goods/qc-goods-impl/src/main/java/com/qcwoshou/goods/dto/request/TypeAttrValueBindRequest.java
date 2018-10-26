package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * 功能描述: 商品属性值绑定请求
 * 
 * @author: xiongkun
 * @date: 2017年11月20日 下午4:30:32
 */
@Data
public class TypeAttrValueBindRequest {
	@ApiModelProperty(value = "属性值ID")
	private Integer id;
	@ApiModelProperty(value = "属性ID")
	private Integer attributeId;
	
}
