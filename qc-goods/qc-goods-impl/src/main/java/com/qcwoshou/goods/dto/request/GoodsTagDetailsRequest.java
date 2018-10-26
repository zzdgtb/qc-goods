package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
* 功能描述: 获取商品标签详情请求类
* @author: xiongkun
* @date: 2017年11月20日 下午4:30:32
 */
@Data
public class GoodsTagDetailsRequest {
	  
	  @ApiModelProperty(value="标签ID")
	  private Integer id;
}
