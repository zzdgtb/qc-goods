package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 
* 功能描述: 商品标签关联关系返回信息
* @author: xiongkun
* @date: 2017年12月8日 下午2:39:14
 */
@Data
public class GoodsTagRelationResponse implements Serializable{
	
	/**
	*/
	private static final long serialVersionUID = 646917153559923412L;
	
	@ApiModelProperty(value="商品ID")
	private Integer goodsId;	
	@ApiModelProperty(value="标签ID")
	private Integer tagId;
	@ApiModelProperty(value="标签名称")
	private String tagName;
	@ApiModelProperty(value="是否选中  1:选中  0:未选中")
	private Integer isChecked;
}
