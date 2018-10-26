package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 商品sku模板列表请求参数
*
 * @author wenwj 
 * @date: 2017年11月23日 下午2:22:07 
* @since 1.0
 */
@Data
public class GoodsSkuModelUpdateRequest {
	
	@ApiModelProperty(value="sku模板id")
	@NotNull(message="sku模板id不能为空")
	private Integer id;
	
	@ApiModelProperty(value="sku模板名称")
	@NotBlank(message="sku模板名称不能为空")
    private String name;

	
	@ApiModelProperty(value="商品id")
	@NotNull(message="商品id不能为空")
	private Integer goodsId;
	
	@ApiModelProperty(value="模型图片URL")
    private String imageUrl;
}
