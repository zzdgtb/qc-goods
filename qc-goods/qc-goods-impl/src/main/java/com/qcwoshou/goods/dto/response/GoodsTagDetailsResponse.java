package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 
* 功能描述: 商品标签详情返回类
* @author: xiongkun
* @date: 2017年11月20日 下午5:00:26
 */
@Getter
@Setter
public class GoodsTagDetailsResponse implements Serializable{

	/**
	*/
	private static final long serialVersionUID = -8098759701234641189L;

	@ApiModelProperty("ID")
	private Integer id;
	
	@ApiModelProperty("标签名")
	private String tagName;

}
