package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 商品审核状态更新请求参数类
*
 * @author wenwj 
 * @date: 2017年11月22日 上午9:41:19 
* @since 1.0
 */
@Data
public class GoodsPublishWaitUpdateRequest {

	@ApiModelProperty(value="商品ID")
	@NotNull(message="商品ID不能为空")
	private Integer id;
	
	@ApiModelProperty(value="商品审核状态： 0:等待审核 1:审核通过 2:审核不通过 3草稿发状态(没提交到审核)")
	@NotNull(message="商品审核状态不能为空")
    private Integer publishWait;
}
