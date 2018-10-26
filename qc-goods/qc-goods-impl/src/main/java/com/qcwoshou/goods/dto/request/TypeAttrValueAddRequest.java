package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * 功能描述: 获取商品属性值新增请求类
 * 
 * @author: xiongkun
 * @date: 2017年11月20日 下午4:30:32
 */
@Data
public class TypeAttrValueAddRequest {

	@ApiModelProperty(value = "属性ID")
	private Integer attributeId;
	@ApiModelProperty(value = "属性值")
	private String attributeValue;
	@ApiModelProperty(value = "排序")
    private Byte sort;
}
