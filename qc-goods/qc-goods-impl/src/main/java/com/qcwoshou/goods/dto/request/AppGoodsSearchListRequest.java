package com.qcwoshou.goods.dto.request;

import com.qcwoshou.core.common.constants.Constants;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 
* 功能描述: 搜索商品列表请求类
* @author: xiongkun
* @date: 2017年11月30日 下午4:30:32
 */
@Data
public class AppGoodsSearchListRequest {
	 /** 当前页 */
	  @ApiModelProperty(value="当前分页数，默认：1")
	  private Integer page = Constants.DEFAULT_PAGE;
	  /** 每页记录数 */
	  @ApiModelProperty(value="当前分页条数，默认：20")
	  private Integer pageSize = Constants.DEFAULT_PAGE_SIZE;
	  
	  @ApiModelProperty(value="搜索关键字")
	  @NotNull(message="搜索关键字不能为空")
	  private String keyword;
	  @ApiModelProperty(value="启用价格排序  1为正序 2为倒序")
	  private Integer priceOrder;
	  @ApiModelProperty(value="是否自营  1为是  空查全部")
	  private String isOwn;
	  
}
