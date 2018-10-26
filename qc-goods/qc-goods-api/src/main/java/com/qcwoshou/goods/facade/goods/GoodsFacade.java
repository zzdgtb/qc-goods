package com.qcwoshou.goods.facade.goods;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.facade.dto.request.GoodsBoughtDRequest;
import com.qcwoshou.goods.facade.dto.request.GoodsBoughtUpdateDRequest;
import com.qcwoshou.goods.facade.dto.request.GoodsDetailsDRequest;
import com.qcwoshou.goods.facade.dto.request.GoodsStatisticalUpdateRequest;
import com.qcwoshou.goods.facade.dto.response.GoodsBoughtDResponse;
import com.qcwoshou.goods.facade.dto.response.GoodsBoughtUpdateDResponse;
import com.qcwoshou.goods.facade.dto.response.GoodsDetailsDResponse;
import com.qcwoshou.goods.facade.dto.response.GoodsTypeSelectMapResponse;

import java.util.List;

/**
 * @Author zhouzhiming
 * @Description 商品服务-dubbo接口
 * @Date 17:45 2018/10/23
 * @Param
 * @return
 **/
public interface GoodsFacade {

	/**
	 * @Author zhouzhiming
	 * @Description 根据商品ID和SkuNumber获取商品详情
	 * @Date 17:45 2018/10/23
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.facade.dto.response.GoodsDetailsDResponse>
	 **/
	public BaseCommonResult<GoodsDetailsDResponse> getGoodsDetailsByIdAndSkuNumber(GoodsDetailsDRequest request);
	
	/**
	 * @Author zhouzhiming
	 * @Description 获取商品库存信息
	 * @Date 17:45 2018/10/23
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.facade.dto.response.GoodsBoughtDResponse>
	 **/
	public BaseCommonResult<GoodsBoughtDResponse> getGoodsBought(GoodsBoughtDRequest request);
	
	/**
	 * @Author zhouzhiming
	 * @Description 更新商品库存信息
	 * @Date 17:45 2018/10/23
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.facade.dto.response.GoodsBoughtUpdateDResponse>
	 **/
	public BaseCommonResult<GoodsBoughtUpdateDResponse> updateGoodsBought(GoodsBoughtUpdateDRequest request);
	
	/**
	 * @Author zhouzhiming
	 * @Description 根据商品id获取商品分类信息
	 * @Date 17:45 2018/10/23
	 * @Param [goodsIds]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.facade.dto.response.GoodsTypeSelectMapResponse>
	 **/
	public BaseCommonResult<GoodsTypeSelectMapResponse> getGoodsType(List<Integer> goodsIds);
	
	/**
	 * @Author zhouzhiming
	 * @Description 根据商品ID和SKU编码更新下单量和销量
	 * @Date 17:46 2018/10/23
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	public BaseCommonResult<Void> updateGoodsStatistical(List<GoodsStatisticalUpdateRequest> request);
}
