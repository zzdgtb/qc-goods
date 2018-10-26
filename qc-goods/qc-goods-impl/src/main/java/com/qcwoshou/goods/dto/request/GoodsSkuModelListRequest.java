package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 商品sku模板列表请求参数
*
 * @author wenwj 
 * @date: 2017年11月23日 下午2:22:07 
* @since 1.0
 */
@Data
public class GoodsSkuModelListRequest {

	@ApiModelProperty(value="商品ID")
	@NotNull(message="商品ID不能为空")
	private Integer id;
	
	@ApiModelProperty(value="商品sku模板父级ID")
    private Integer pid;
}
