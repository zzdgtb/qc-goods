package com.qcwoshou.goods.service;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.facade.dto.request.GoodsStatisticalUpdateRequest;

import java.util.List;

/**
 * @Author zhouzhiming
 * @Description 操作商品下单量、销量等统计数据业务处理接口类
 * @Date 23:47 2018/10/23
 * @Param 
 * @return 
 **/
public interface IGoodsStatisticalService {


	/**
	 * @Author zhouzhiming
	 * @Description //TODO 
	 * @Date 23:48 2018/10/23
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	public BaseCommonResult<Void> updateGoodsStatistical(List<GoodsStatisticalUpdateRequest> request);
}
