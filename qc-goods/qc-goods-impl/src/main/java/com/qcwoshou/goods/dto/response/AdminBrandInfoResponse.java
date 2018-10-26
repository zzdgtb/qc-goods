package com.qcwoshou.goods.dto.response;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AdminBrandInfoResponse {
	@ApiModelProperty(value = "品牌id")
	private Integer brandId;
	
	@ApiModelProperty(value = "品牌名称")
	private String brandName;
	
	@ApiModelProperty(value = "图标地址")
	private String logo;
	
	@ApiModelProperty(value = "排序")
	private Integer sort;
}
