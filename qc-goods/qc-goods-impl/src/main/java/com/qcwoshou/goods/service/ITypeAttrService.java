package com.qcwoshou.goods.service;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;

import java.util.List;

/**
 * 
* 功能描述: 商品attr
* @author: xiongkun
* @date: 2017年11月20日 下午3:20:42
 */
public interface ITypeAttrService {

	/***************web接口*********************/
	/**
	 * 
	* 功能描述: 商品attr列表
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<TypeAttrListResponse> list(TypeAttrListRequest request);
	
	/**
	 * 
	* 功能描述: 根据商品名称获取商品attr列表
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<List<TypeAttrAllListResponse>> allList(TypeAttrAllListRequest request);
	
	/**
	 * 
	* 功能描述: 获取所有attr及AttrValue列表
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<List<TypeAttrAndAttrValueAllListResponse>> allAttrAndAttrValueList(TypeAttrAndAttrValueAllListRequest request);
	
	/**
	 * 
	* 功能描述: 商品attr详情
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<TypeAttrDetailsResponse> details(Integer id);
	
	/**
	 * 
	* 功能描述: 商品attr编辑
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> update(TypeAttrUpdateRequest request);
	
	/**
	 * 
	* 功能描述: 商品attr新增
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> add(TypeAttrAddRequest request);
	
	/**
	 * 
	* 功能描述: 商品attr删除
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> delete(Integer id);
	
	
	/***************app接口******************/
	
	public BaseCommonResult<List<AppTypeAttrResponse>> appList(Integer goodsTypeId);
}
