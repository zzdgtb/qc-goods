package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 
* 功能描述: 商品属性关联关系返回信息
* @author: xiongkun
* @date: 2017年12月8日 下午2:39:14
 */
@Data
public class GoodsAttrRelationResponse implements Serializable{
	
	/**
	*/
	private static final long serialVersionUID = 8210703534678460249L;
	
	@ApiModelProperty(value="属性ID")
	private Integer id;
	@ApiModelProperty(value="属性名称")
	private String attributeName;
	@ApiModelProperty(value="属性值")
	private List<TypeAttrValueResponse> typeAttrs;
}
