package com.qcwoshou.goods.dto.request;

import com.qcwoshou.core.common.constants.Constants;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
* 功能描述: 首页新商品列表请求类
* @author: xiongkun
* @date: 2017年11月30日 下午4:30:32
 */
@Data
public class AppGoodsHomeNewListRequest {
	 /** 当前页 */
	  @ApiModelProperty(value="当前分页数，默认：1")
	  private Integer page = Constants.DEFAULT_PAGE;
	  /** 每页记录数 */
	  @ApiModelProperty(value="当前分页条数，默认：20")
	  private Integer pageSize = Constants.DEFAULT_PAGE_SIZE;
	  
}
