package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class GoodsResponse implements Serializable{

	/**
	*/
	private static final long serialVersionUID = -4249384657162751630L;
	@ApiModelProperty(value="商品ID")
	private Integer id;
	@ApiModelProperty(value="商品名称")
	private String name;
	@ApiModelProperty(value="商家名称")
	private String supplierName;
	@ApiModelProperty(value="分类")
	private String goodsTypeName;
	@ApiModelProperty(value="状态 0:等待审核 1:审核通过 2:审核不通过 3草稿发状态(没提交到审核)")
	private Integer publishWait;
	@ApiModelProperty(value="价格")
	private BigDecimal currentPrice;
	@ApiModelProperty(value="总销量")
	private Integer buyCountTotal;
	@ApiModelProperty(value="实物/虚拟  0为实体商品 1为虚拟商品")
	private Integer isDelivery;
	@ApiModelProperty(value="是否最新推荐  0不是 1是")
	private Integer isNew;
	@ApiModelProperty(value="上架状态 0为已下架 1为已上架 2为未上架")
	private Byte isOnlive;
	@ApiModelProperty(value="商品主图")
	private String img;
}
