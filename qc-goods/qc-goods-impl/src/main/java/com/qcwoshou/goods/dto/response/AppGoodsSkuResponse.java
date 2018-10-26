package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 
* 功能描述: app商品sku返回信息
* @author: xiongkun
* @date: 2017年11月28日 下午2:39:14
 */
@Data
public class AppGoodsSkuResponse implements Serializable{
	
	/**
	*/
	private static final long serialVersionUID = 3206840739399732672L;
	@ApiModelProperty(value="属性内容 例如：红色；黑色；")
	private String skuTitle;
	@ApiModelProperty(value="当前销售价")
	private BigDecimal currentPrice;
	@ApiModelProperty(value="礼品卡，养老积分，消费积分最大使用点数")
	private Integer integralUseRatio = 0;
	@ApiModelProperty(value="能否使用积分 0为否；1为是")
	private Byte useScore;
	@ApiModelProperty(value="sku编号")
    private String skuNumber;
	@ApiModelProperty(value="SKU模板组合编码")
    private String modelNumber;
	@ApiModelProperty(value="原始库存")
    private Integer maxBought = 0;
	@ApiModelProperty(value="当前库存")
    private Integer bought = 0;
	@ApiModelProperty(value="属性对应的商品主图")
    private String skuImg;
	@ApiModelProperty(value="与商家的结算价")
    private BigDecimal balancePrice;
	@ApiModelProperty(value="最小购买量")
    private Integer minBuyCount = 0;
	@ApiModelProperty(value="最大购买量")
    private Integer maxBuyCount = 0;
	@ApiModelProperty(value="销量")
    private Integer buyCount = 0;
//	@ApiModelProperty(value="sku图片")
//	private List<AppGoodsSkuPicResponse> picData;
	@ApiModelProperty(value="sku图片")
	private List<String> picData;
}
