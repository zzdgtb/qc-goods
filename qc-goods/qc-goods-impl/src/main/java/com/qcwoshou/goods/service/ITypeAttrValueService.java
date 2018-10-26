package com.qcwoshou.goods.service;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.TypeAttrValueAddRequest;
import com.qcwoshou.goods.dto.request.TypeAttrValueListRequest;
import com.qcwoshou.goods.dto.request.TypeAttrValueUpdateRequest;
import com.qcwoshou.goods.dto.response.TypeAttrValueDetailsResponse;
import com.qcwoshou.goods.dto.response.TypeAttrValueListResponse;

/**
 * 
* 功能描述: 商品属性值
* @author: xiongkun
* @date: 2017年11月20日 下午3:20:42
 */
public interface ITypeAttrValueService {

	/**
	 * 
	* 功能描述: 商品属性值列表
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<TypeAttrValueListResponse> list(TypeAttrValueListRequest request);
	
	/**
	 * 
	* 功能描述: 商品属性值详情
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<TypeAttrValueDetailsResponse> details(Integer id);
	
	/**
	 * 
	* 功能描述: 商品属性值编辑
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> update(TypeAttrValueUpdateRequest request);
	
	/**
	 * 
	* 功能描述: 商品属性值新增
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> add(TypeAttrValueAddRequest request);
	
	/**
	 * 
	* 功能描述: 商品属性值删除
	* @author: xiongkun
	* @date: 2017年11月20日 下午3:20:39 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> delete(Integer id);
}
