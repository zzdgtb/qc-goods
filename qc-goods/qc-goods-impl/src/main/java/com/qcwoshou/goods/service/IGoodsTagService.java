package com.qcwoshou.goods.service;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.GoodsTagAddRequest;
import com.qcwoshou.goods.dto.request.GoodsTagAllListRequest;
import com.qcwoshou.goods.dto.request.GoodsTagListRequest;
import com.qcwoshou.goods.dto.request.GoodsTagUpdateRequest;
import com.qcwoshou.goods.dto.response.GoodsTagAllListResponse;
import com.qcwoshou.goods.dto.response.GoodsTagDetailsResponse;
import com.qcwoshou.goods.dto.response.GoodsTagListResponse;

import java.util.List;

/**
 * 
* 功能描述: 商品标签
* @author: xiongkun
* @date: 2017年11月20日 下午3:20:42
 */
public interface IGoodsTagService {

	/**
	 * 
	* 功能描述: 商品标签列表
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<GoodsTagListResponse> list(GoodsTagListRequest request);
	
	/**
	 * 
	* 功能描述: 获取所有商品标签
	* @author: xiongkun
	* @date: 2017年11月30日 下午5:33:48 
	* @param req
	* @return
	 */
	public BaseCommonResult<List<GoodsTagAllListResponse>> allList(GoodsTagAllListRequest req);
	
	/**
	 * 
	* 功能描述: 商品标签详情
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<GoodsTagDetailsResponse> details(Integer id);
	
	/**
	 * 
	* 功能描述: 商品标签编辑
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> update(GoodsTagUpdateRequest request);
	
	/**
	 * 
	* 功能描述: 商品标签新增
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> add(GoodsTagAddRequest request);
	
	/**
	 * 
	* 功能描述: 商品标签删除
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> delete(Integer id);
}
