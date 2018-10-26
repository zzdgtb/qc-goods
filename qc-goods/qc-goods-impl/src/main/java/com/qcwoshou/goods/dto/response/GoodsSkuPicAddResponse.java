package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description="新增商品SKU图片返回信息")
public class GoodsSkuPicAddResponse {
	@ApiModelProperty(value="商品sku图片ID")
    private Integer id;
}
