package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 
 * 功能描述: 商品标签关联关系请求类
 * 
 * @author: xiongkun
 * @date: 2017年12月8日 下午4:30:32
 */
@Data
public class GoodsTagRelationRequest {

	@ApiModelProperty(value = "商品ID 不能为空")
	@NotNull(message="商品ID不能为空")
	private Integer goodsId;

}
