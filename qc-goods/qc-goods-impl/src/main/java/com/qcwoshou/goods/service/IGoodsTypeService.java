package com.qcwoshou.goods.service;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.GoodsTypeAddRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeAllListRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeListRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeUpdateRequest;
import com.qcwoshou.goods.dto.response.AppGoodsTypeResponse;
import com.qcwoshou.goods.dto.response.GoodsTypeDetailsResponse;
import com.qcwoshou.goods.dto.response.GoodsTypeListResponse;
import com.qcwoshou.goods.dto.response.GoodsTypeResponse;

import java.util.List;

/**
 * 
* 功能描述: 商品分类
* @author: xiongkun
* @date: 2017年11月20日 下午3:20:42
 */
public interface IGoodsTypeService {

	/**
	 * 
	* 功能描述: 商品分类分页列表
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<GoodsTypeListResponse> list(GoodsTypeListRequest request);
	
	/**
	 * 
	* 功能描述: 商品分类分全部
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<List<GoodsTypeResponse>> allList(GoodsTypeAllListRequest request);
	
	/**
	 * 
	* 功能描述: 商品分类详情
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<GoodsTypeDetailsResponse> details(Integer id);
	
	/**
	 * 
	* 功能描述: 商品分类编辑
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> update(GoodsTypeUpdateRequest request);
	
	/**
	 * 
	* 功能描述: 商品分类新增
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> add(GoodsTypeAddRequest request);
	
	/**
	 * 
	* 功能描述: 商品分类删除
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> delete(Integer id);
	
	/******************app接口*******************/
	/**
	 * 
	* 功能描述: 分类列表接口
	* @author: xiongkun
	* @date: 2017年11月23日 下午2:26:01 
	* @param pid
	* @return
	 */
	public BaseCommonResult<List<AppGoodsTypeResponse>> appList(Integer pid);
}
