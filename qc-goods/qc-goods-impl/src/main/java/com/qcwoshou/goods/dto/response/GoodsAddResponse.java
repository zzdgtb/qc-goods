package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description="新增商品返回信息")
public class GoodsAddResponse {
	@ApiModelProperty(value="商品ID")
    private Integer id;
}
