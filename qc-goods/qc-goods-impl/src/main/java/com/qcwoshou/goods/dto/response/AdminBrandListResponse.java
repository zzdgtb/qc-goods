package com.qcwoshou.goods.dto.response;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class AdminBrandListResponse {
	
	@ApiModelProperty(value = "品牌id")
	private Integer brandId;
	
	@ApiModelProperty(value = "品牌名称")
	private String brandName;
	
	@ApiModelProperty(value = "所属分类集合")
	private List<AffiliationTypeVo> affiliationTypeList;
	
	@ApiModelProperty(value="图片全路径前缀，例：http://qctest.oss-cn-shenzhen.aliyuncs.com")
	private String imgUrlPrix;
	
	@ApiModelProperty(value = "图标地址")
	private String logo;
	
	@ApiModelProperty(value = "排序")
	private Integer sort;
	
	@ApiModelProperty(value = "品牌简介")
	private String brief;
	
}
