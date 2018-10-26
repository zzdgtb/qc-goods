package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 添加商品请求参数类
*
 * @author wenwj 
 * @date: 2017年11月21日 下午2:37:14 
* @since 1.4.0
 */
@Data
public class GoodsBasicAddResponse {

	@ApiModelProperty(value="商品ID")
    private Integer id;
}