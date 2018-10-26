package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * 功能描述: 获取商品分类详情请求类
 * 
 * @author: xiongkun
 * @date: 2017年11月20日 下午4:30:32
 */
@Data
public class GoodsTypeDetailsRequest {

	@ApiModelProperty(value = "标签ID")
	private Integer id;
}
