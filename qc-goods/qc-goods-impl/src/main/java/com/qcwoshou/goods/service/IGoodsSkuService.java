package com.qcwoshou.goods.service;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.GoodsPicsAddRequest;
import com.qcwoshou.goods.dto.request.GoodsSkuModelAddRequest;
import com.qcwoshou.goods.dto.response.GoodsSkuModelAddResponse;
import com.qcwoshou.goods.dto.response.GoodsSkuModelDeleteResponse;
import com.qcwoshou.goods.dto.response.GoodsSkuPicAddResponse;

/**
 * 
* 商品Sku-service业务处理类
* @author wenwj 
* @date: 2017年11月28日 下午4:16:13 
* @version 1.4.0
*
 */
public interface IGoodsSkuService {

	/**
	 * 
	 * 功能描述: 新增sku-model信息<br>
	 * @author: wenwj
	 * @date: 2017年11月28日 下午4:16:43 
	 * @version 1.4.0
	 * @param request
	 * @return
	 */
	public BaseCommonResult<GoodsSkuModelAddResponse> addSkuModel(GoodsSkuModelAddRequest request);
	
	/**
	 * 
	 * 功能描述: 删除sku-model信息<br>
	 * @author: wenwj
	 * @date: 2017年11月28日 下午4:17:18 
	 * @version 1.4.0
	 * @param id
	 * @return
	 */
	public BaseCommonResult<GoodsSkuModelDeleteResponse> deleteSkuModel(Integer id);
	
	/**
	 * 
	 * 功能描述: 增加商品sku图片信息，图片URL json数组（非全路径）<br>
	 * @author: wenwj
	 * @date: 2017年11月28日 下午4:18:18 
	 * @version 1.4.0
	 * @param request
	 * @return
	 */
	public BaseCommonResult<GoodsSkuPicAddResponse> addGoodsSkuPic(GoodsPicsAddRequest request);
	
	/**
	 * 
	 * 功能描述: 删除商品sku图片<br>
	 * @author: wenwj
	 * @date: 2017年11月29日 上午11:57:39 
	 * @version 1.4.0
	 * @param id
	 * @return
	 */
	public BaseCommonResult<Void> deleteSkuPic(Integer id);
}
