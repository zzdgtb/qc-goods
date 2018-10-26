package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description="商品图片返回结果信息")
public class GoodsSkuPicResponse {
	@ApiModelProperty(value="sku图片id")
    private Integer id;
	@ApiModelProperty(value="sku图片所属商品ID")
    private Integer goodsId;
	@ApiModelProperty(value="sku图片所属sku规格编码")
    private String skuNumber;
	@ApiModelProperty(value="sku图片短路径")
    private String imageUrl;

}
