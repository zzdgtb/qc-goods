package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * 功能描述: app商品图片返回信息
 * 
 * @author: xiongkun
 * @date: 2017年11月28日 下午2:39:14
 */
@Data
public class AppGoodsSkuPicResponse implements Serializable {

	/**
	*/
	private static final long serialVersionUID = -2686250446554092125L;
	@ApiModelProperty(value = "商品ID")
	private Integer goodsId;
	@ApiModelProperty(value = "sku编号")
	private String skuNumber;
	@ApiModelProperty(value = "图片URL")
	private String imageUrl;
	

}
