package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 
* 功能描述: app获取商品详情请求类
* @author: xiongkun
* @date: 2017年11月29日 下午4:30:32
 */
@Data
public class AppGoodsDetailsRequest {
	  
	  @ApiModelProperty(value="商品ID")
	  @NotNull(message="商品ID不能为空")
	  private Integer goodsId;
	  
}
