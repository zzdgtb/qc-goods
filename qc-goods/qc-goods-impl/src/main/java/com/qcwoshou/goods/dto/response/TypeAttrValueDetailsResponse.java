package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 
* 功能描述: 商品attr详情返回类
* @author: xiongkun
* @date: 2017年11月20日 下午5:00:26
 */
@Getter
@Setter
public class TypeAttrValueDetailsResponse implements Serializable{

	
	/**
	*/
	private static final long serialVersionUID = -140852374015253104L;
	
	@ApiModelProperty(value = "ID")
	private Integer id;
	@ApiModelProperty(value = "属性ID")
	private Integer attributeId;
	@ApiModelProperty(value = "属性值")
	private String attributeValue;
	@ApiModelProperty(value = "排序")
    private Byte sort;

}
