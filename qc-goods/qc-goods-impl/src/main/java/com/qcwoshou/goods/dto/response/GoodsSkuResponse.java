package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel(description="SKU规格返回数据类")
public class GoodsSkuResponse {
	@ApiModelProperty(value="SKU规格ID")
	private Integer id;

	@ApiModelProperty(value="商品ID")
    private Integer goodsId;

	@ApiModelProperty(value="Sku编码（商品编号）")
    private String skuNumber;

	@ApiModelProperty(value="SKU规格模板组合编码 例如：s10es13e； s99es10e")
    private String modelNumber;
	
	@ApiModelProperty(value="SKU规格名1")
	private String skuModelName1;
	
	@ApiModelProperty(value="SKU规格名2")
	private String skuModelName2;
	
	@ApiModelProperty(value="SKU规格名3")
	private String skuModelName3;

	@ApiModelProperty(value="售价")
    private BigDecimal currentPrice;

	@ApiModelProperty(value="能否使用积分 0为否；1为是")
    private Byte useScore;

	@ApiModelProperty(value="积分最大可使用点数")
    private Integer integralUseRatio;

	@ApiModelProperty(value="与商家的结算价（即商价提供给平台商的成本价）")
    private BigDecimal balancePrice;
	
	@ApiModelProperty(value="最大库存")
    private Integer maxBought;
	
	@ApiModelProperty(value="最小购买量")
    private Integer minBuyCount;

	@ApiModelProperty(value="库存")
    private Integer bought;

	@ApiModelProperty(value="排序")
    private Byte sort;

	@ApiModelProperty(value="sku规格名称")
	private String skuName;
	
	@ApiModelProperty(value="商品SKU规格图片列表")
	private List<GoodsSkuPicResponse> goodsSkuPicList;
	
	public List<GoodsSkuPicResponse> getGoodsSkuPicList(){
		if(this.goodsSkuPicList==null){
			this.goodsSkuPicList = new ArrayList<GoodsSkuPicResponse>();
		}
		return this.goodsSkuPicList;
	}
}
