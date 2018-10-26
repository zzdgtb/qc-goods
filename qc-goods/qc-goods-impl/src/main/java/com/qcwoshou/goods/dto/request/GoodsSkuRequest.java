package com.qcwoshou.goods.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 
* 更新商品sku列表请求参数model类
* @author wenwj 
* @date: 2017年11月25日 下午3:31:34 
* @version 1.4.0
*
 */
@Data
public class GoodsSkuRequest {
	
	@ApiModelProperty(value="sku对应ID，非必填，存在id则更新，不存在，则新增")
	@NotNull(message="sku对应ID不能为空")
	private Integer id;
	
	@ApiModelProperty(value="当前销售价,必填")
	@NotNull(message="当前销售价不能为空")
    private BigDecimal currentPrice;
	
	@ApiModelProperty(value="能否使用积分 0为否；1为是，必填")
	@NotNull(message="能否使用积分不能为空")
    private Byte useScore;
	
	@ApiModelProperty(value="礼品卡，养老积分，消费积分最大使用点数")
    private Integer integralUseRatio;
	
	@ApiModelProperty(value="与商家的结算价，必填")
	@NotNull(message="结算价不能为空")
    private BigDecimal balancePrice;
	
	@ApiModelProperty(value="库存，必填")
	@NotNull(message="库存不能为空")
    private Integer bought;
	
	@ApiModelProperty(value="最小购买数，必填")
	@NotNull(message="最小购买数不能为空")
    private Integer minBuyCount;
}
