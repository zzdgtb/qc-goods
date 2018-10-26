package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 
* 功能描述: 获取所有商品标签列表
* @author: xiongkun
* @date: 2017年11月30日 下午5:36:14
 */
@Getter
@Setter
public class GoodsTagAllListResponse implements Serializable{

	
	/**
	*/
	private static final long serialVersionUID = 3820867466909913332L;

	@ApiModelProperty("ID")
	private Integer id;
	
	@ApiModelProperty("标签名")
	private String tagName;
}
