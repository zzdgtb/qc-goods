package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AffiliationTypeVo {
	
	@ApiModelProperty(value = "商品分类id")
	private Integer goodsTypeId;
	
	@ApiModelProperty(value = "分类名称")
	private String typeName;

}
