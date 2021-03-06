package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
* 功能描述: 商品导出请求类
* @author: xiongkun
* @date: 2017年12月21日 下午4:30:32
 */
@Data
public class GoodsExportRequest {

	  
	  @ApiModelProperty(value="状态 0:等待审核 1:审核通过 2:审核不通过 3草稿发状态(没提交到审核)")
	  private Byte publishWait;
	  @ApiModelProperty(value="上架状态  0为已下架 1为已上架 2为未上架")
	  private Byte isOnlive;
	  @ApiModelProperty(value="商品分类ID")
	  private Integer goodsTypeId;
	  @ApiModelProperty(value="商家ID")
	  private Integer supplierId;
	  @ApiModelProperty(value="商品ID")
	  private Integer id;
	  @ApiModelProperty(value="商品名称")
	  private String name;
	  @ApiModelProperty(value="最新推荐 0不是 1是")
	  private Byte isNew;
	  @ApiModelProperty(value="虚拟商品 0为实体商品 1为虚拟商品")
	  private Byte isDelivery;
	  
}
