package com.qcwoshou.goods.facade.dto.request;

import com.qcwoshou.core.dto.request.DubboCommonRequest;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author zhouzhiming
 * @Description 订单服务获取商品信息
 * @Date 17:41 2018/10/23
 * @Param
 * @return
 **/

public class GoodsDetailsDRequest extends DubboCommonRequest implements Serializable{
	
	@NotNull(message="商品ID不能为空")
	private Integer goodsId;
	
	@NotBlank(message="商品Sku编码不能为空")
	private String skuNumber;

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getSkuNumber() {
		return skuNumber;
	}

	public void setSkuNumber(String skuNumber) {
		this.skuNumber = skuNumber;
	}
}
