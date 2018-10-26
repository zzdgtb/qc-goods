package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 商品图片数组更新
*
 * @author wenwj 
 * @date: 2017年11月22日 上午9:41:19 
* @since 1.0
 */
@Data
public class GoodsIsOnliveUpdateRequest {

	@ApiModelProperty(value="商品ID")
	@NotNull(message="商品ID不能为空")
	private Integer id;
	
	@ApiModelProperty(value="商品上下架状态：0为已下架 1为已上架 2为未上架")
	@NotNull(message="商品上下架状态不能为空")
    private Byte isOnlive;
}
