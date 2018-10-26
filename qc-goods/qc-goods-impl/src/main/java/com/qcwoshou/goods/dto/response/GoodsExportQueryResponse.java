package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
* 功能描述: 商品导出查询
* @author: xiongkun
* @date: 2017年12月21日 上午11:40:30
 */
@Getter
@Setter
public class GoodsExportQueryResponse implements Serializable{

	/**
	*/
	private static final long serialVersionUID = 1734244871549520423L;
	@ApiModelProperty(value="ID")
	private Integer id;
	@ApiModelProperty(value="商品名称")
	private String name;
	@ApiModelProperty(value="商品规格")
	private String skuTitle;
	@ApiModelProperty(value="商品父分类")
	private Integer pid;
	@ApiModelProperty(value="商品分类名称")
	private String goodsTypeName;
	@ApiModelProperty(value="一级分类")
	private String firstGoodsTypeName;
	@ApiModelProperty(value="二级分类")
	private String secondGoodsTypeName;
	@ApiModelProperty(value="三级分类")
	private String thirdGoodsTypeName;	
	@ApiModelProperty(value="状态 0:等待审核 1:审核通过 2:审核不通过 3草稿发状态(没提交到审核)")
	private String publishWait;
	@ApiModelProperty(value="商品规格编号")
	private String skuNumber;	
	@ApiModelProperty(value="售价")
	private BigDecimal currentPrice;
	@ApiModelProperty(value="原价")
	private BigDecimal originPrice;
	@ApiModelProperty(value="商家的结算价")
	private BigDecimal balancePrice;
	@ApiModelProperty(value="库存")
	private Integer bought;
	@ApiModelProperty(value="可使用积分点")
	private Integer integralUseRatio;
	@ApiModelProperty(value="最小购买数量")
	private Integer minBuyCount;
	@ApiModelProperty(value="上架时间")
	private String shelvesDate;
	@ApiModelProperty(value="下架时间")
	private String lastUpdateDate;
	@ApiModelProperty(value="是否可以使用积分")
	private String useScore;	
	@ApiModelProperty(value="实物或者服务类虚拟商品  0为实体商品 1为虚拟商品")
	private String isDelivery;
	@ApiModelProperty(value="是否自营  0不是 1是")
	private String isOwn;
	@ApiModelProperty(value="需要实名认证 0为否 1为是")
	private String isRealName;
	@ApiModelProperty(value="销量")
	private Integer buyCount;
}
