package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BrandByGoodTypeIdRequest {
	@ApiModelProperty(value = "品牌id")
	private Integer goodsTypeId;
}
