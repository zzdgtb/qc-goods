package com.qcwoshou.goods.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel(description="删除sku模板返回信息")
public class GoodsSkuModelDeleteResponse {
	
	@ApiModelProperty(value="图片全路径前缀，例：http://qctest.oss-cn-shenzhen.aliyuncs.com")
	private String imgUrlPrix;
	
	@ApiModelProperty(value="商品Sku列表")
	private List<GoodsSkuResponse> goodsSkuList;

	@ApiModelProperty(value="商品Sku模板列表")
	private List<GoodsSkuModelVo> goodsSkuModelList;

	public List<GoodsSkuResponse> getGoodsSkuList(){
		if(this.goodsSkuList==null){
			this.goodsSkuList = new ArrayList<GoodsSkuResponse>();
		}
		return this.goodsSkuList;
	}
	
	
}
