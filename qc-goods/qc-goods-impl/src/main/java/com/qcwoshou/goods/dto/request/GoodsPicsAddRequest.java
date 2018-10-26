package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 商品图片数组更新
*
 * @author wenwj 
 * @date: 2017年11月22日 上午9:41:19 
* @since 1.0
 */
@Data
public class GoodsPicsAddRequest {

	@ApiModelProperty(value="商品ID")
	@NotNull(message="商品ID不能为空")
	private Integer goodsId;
	
	@ApiModelProperty(value="商品sku编号")
	@NotBlank(message="商品sku编号不能为空")
    private String skuNumber;
	
	@ApiModelProperty(value="商品sku图片，单张，短路径")
	@NotBlank(message="商品sku图片不能为空")
    private String imageUrl;
}
