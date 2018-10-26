package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class AdminBrandAllVo {
	@ApiModelProperty(value = "所有品牌集合")
	private List<AdminBrandListResponse>  brandAllList;

}
