package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 
* 功能描述: 获取商品sku model新增请求类
* @author: xiongkun
* @date: 2017年11月20日 下午4:30:32
 */
@Data
public class AppGoodsSkuModelResponse implements Serializable{
	  
	/**
	*/
	private static final long serialVersionUID = 4747396098745353422L;
	
	@ApiModelProperty(value="标签ID")
	private Integer id;
	@ApiModelProperty(value="商品SKU属性模板key名")
    private String name;
	@ApiModelProperty(value="商品ID")
    private Integer goodsId;
	@ApiModelProperty(value="父级ID")
    private Integer pid;
	@ApiModelProperty(value="排序")
    private Byte sort;
	@ApiModelProperty(value="模板key")
	private String modelNumberKey;
	@ApiModelProperty(value="子模板")
    private List<AppGoodsSkuModelResponse> childList;
}
