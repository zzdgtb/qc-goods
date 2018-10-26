package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class BrandSaveRequest {
	
	@ApiModelProperty(value = "品牌id")
	private Integer brandId;
	
	@ApiModelProperty(value = "品牌名称")
	@NotBlank(message="品牌名称不能为空")
	private String brandName;
	
	@ApiModelProperty(value = "商品分类id 多个用,逗号隔开 例如 ： 1,2,3,4")
	@NotBlank(message="商品分类id不能为空")
	private String goodsTypeIds;
	
	@ApiModelProperty(value = "图标地址url")
	@NotBlank(message="图标地址不能为空")
	private String logo;
	
	@ApiModelProperty(value = "排序")
	private Integer sort;
	
	@ApiModelProperty(value = "品牌简介")
	private String brief;
	
}
