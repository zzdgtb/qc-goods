package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 
* 功能描述: 商品分类广告返回类
* @author: xiongkun
* @date: 2017年11月20日 下午5:00:26
 */
@Getter
@Setter
public class GoodsTypeAdsResponse implements Serializable{

	
	/**
	*/
	private static final long serialVersionUID = -6566409863031470626L;
	
	@ApiModelProperty(value = "商品类型广告ID")
	private Integer id;
	@ApiModelProperty(value = "商品类型ID")
    private Integer goodsTypeId;
	@ApiModelProperty(value = "广告图url")
    private String image;
	@ApiModelProperty(value = "广告图path")
    private String imageData;
	@ApiModelProperty(value = "link")
    private String link;
	@ApiModelProperty(value = "类型")
    private Byte type;
	@ApiModelProperty(value = "排序")
    private Byte sort;

}
