package com.qcwoshou.goods.dto.request;

import com.qcwoshou.core.common.constants.Constants;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 
* 功能描述: 获取商品品牌列表请求类
* @author: xiongkun
* @date: 2017年11月20日 下午4:30:32
 */
@Data
public class AppBrandListRequest {
	 /** 当前页 */
	  @ApiModelProperty(value="当前分页数，默认：1")
	  private Integer page = Constants.DEFAULT_PAGE;
	  /** 每页记录数 */
	  @ApiModelProperty(value="当前分页条数，默认：20")
	  private Integer pageSize = Constants.DEFAULT_PAGE_SIZE;
	  
	  @ApiModelProperty(value="商品分类ID")
	  @NotNull(message="商品分类ID不能为空")
	  private Integer goodsTypeId;
}
