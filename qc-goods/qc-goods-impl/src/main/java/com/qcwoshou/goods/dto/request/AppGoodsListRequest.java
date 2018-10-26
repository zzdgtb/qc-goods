package com.qcwoshou.goods.dto.request;

import com.qcwoshou.core.common.constants.Constants;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 
* 功能描述: 获取商品列表请求类
* @author: xiongkun
* @date: 2017年11月20日 下午4:30:32
 */
@Data
public class AppGoodsListRequest {
	 /** 当前页 */
	  @ApiModelProperty(value="当前分页数，默认：1")
	  private Integer page = Constants.DEFAULT_PAGE;
	  /** 每页记录数 */
	  @ApiModelProperty(value="当前分页条数，默认：20")
	  private Integer pageSize = Constants.DEFAULT_PAGE_SIZE;
	  
	  @ApiModelProperty(value="商品分类ID")
	  @NotNull(message="商品分类ID不能为空")
	  private Integer goodsTypeId;
	  @ApiModelProperty(value="启用价格排序  1为正序 2为倒序")
	  private Integer priceOrder;
	  @ApiModelProperty(value="商品品牌ID 多个用,符号分隔")
	  private String brandId;
	  @ApiModelProperty(value="商品品牌ID数组,前端不需要传")
	  private Integer[] brandIdArray;
	  @ApiModelProperty(value="商品属性值ID 多个用,符号分隔")
	  private String attributeValueId;
	  @ApiModelProperty(value="商品属性值ID数组,前端不需要传")
	  private Integer[] attributeValueIdArray;
	  @ApiModelProperty(value="是否自营  1为是  空查全部")
	  private String isOwn;
	  
}
