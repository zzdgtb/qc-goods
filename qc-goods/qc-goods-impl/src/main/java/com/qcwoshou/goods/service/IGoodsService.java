package com.qcwoshou.goods.service;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.core.dto.result.BasePage;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;
import com.qcwoshou.goods.facade.dto.request.GoodsBoughtDRequest;
import com.qcwoshou.goods.facade.dto.request.GoodsBoughtUpdateDRequest;
import com.qcwoshou.goods.facade.dto.request.GoodsDetailsDRequest;
import com.qcwoshou.goods.facade.dto.response.GoodsBoughtDResponse;
import com.qcwoshou.goods.facade.dto.response.GoodsBoughtUpdateDResponse;
import com.qcwoshou.goods.facade.dto.response.GoodsDetailsDResponse;

import java.util.List;

/**
 * @Author zhouzhiming
 * @Description 商品service业务处理类
 * @Date 9:13 2018/10/24
 * @Param
 * @return
 **/
public interface IGoodsService {

	/**
	 * @Author zhouzhiming
	 * @Description 新增商品信息
	 * @Date 9:13 2018/10/24
	 * @Param [request, loginId]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.dto.response.GoodsAddResponse>
	 **/
	public BaseCommonResult<GoodsAddResponse> addGoods(GoodsAddRequest request, String loginId);

	/**
	 * @Author zhouzhiming
	 * @Description 更新商品信息
	 * @Date 9:13 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	public BaseCommonResult<Void> updateGoods(GoodsUpdateRequest request);

	/**
	 * @Author zhouzhiming
	 * @Description 获取商品信息
	 * @Date 9:12 2018/10/24
	 * @Param [id]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.dto.response.GoodsGetResponse>
	 **/
	public BaseCommonResult<GoodsGetResponse> getGoods(Integer id);

	/**
	 * @Author zhouzhiming
	 * @Description 删除商品信息
	 * @Date 9:12 2018/10/24
	 * @Param [id]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	public BaseCommonResult<Void> deleteGoods(Integer id);

	/**
	 * @Author zhouzhiming
	 * @Description 更新商品上架状态
	 * @Date 9:12 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	public BaseCommonResult<Void> updateGoodsIsOnlive(GoodsIsOnliveUpdateRequest request);

	//===========================商品上架定时任务业务处理逻辑===================================

	/**
	 * @Author zhouzhiming
	 * @Description 更新符合定时上架视频商品状态
	 * @Date 9:11 2018/10/24
	 * @Param []
	 * @return int
	 **/
	public int updateGoodsShelvesed();

	/**
	 * @Author zhouzhiming
	 * @Description 更新商品审核状态
	 * @Date 9:11 2018/10/24
	 * @Param [request, loginId]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	public BaseCommonResult<Void> updateGoodsPublishWait(GoodsPublishWaitUpdateRequest request, String loginId);
	
	/**
	 * @Author zhouzhiming
	 * @Description 商品列表
	 * @Date 9:11 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.dto.response.GoodsListResponse>
	 **/
	public BaseCommonResult<GoodsListResponse> list(GoodsListRequest request);
	
	/**
	 * @Author zhouzhiming
	 * @Description 商品导出列表
	 * @Date 9:10 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.dto.response.GoodsExportResponse>
	 **/
	public BaseCommonResult<GoodsExportResponse> exportList(GoodsExportRequest request);
	
	/**
	 * @Author zhouzhiming
	 * @Description 商品导出列表查询
	 * @Date 9:10 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.util.List<com.qcwoshou.goods.dto.response.GoodsExportQueryResponse>>
	 **/
	public BaseCommonResult<List<GoodsExportQueryResponse>> getExportList(GoodsExportQueryRequest request);
	
	/**
	 * 
	* 功能描述: 商品标签关联关系
	* @author: xiongkun
	* @date: 2017年11月30日 下午5:49:52 
	* @param request
	* @return
	 */
	public BaseCommonResult<List<GoodsTagRelationResponse>> goodsTagRelation(GoodsTagRelationRequest request);
	
	/**
	 * 
	* 功能描述: 商品绑定标签
	* @author: xiongkun
	* @date: 2017年11月30日 下午5:49:52 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> goodsBindTag(GoodsBindTagRequest request);
	
	/**
	 * 
	* 功能描述: 商品attr关联关系
	* @author: xiongkun
	* @date: 2017年11月30日 下午5:49:52 
	* @param request
	* @return
	 */
	public BaseCommonResult<List<GoodsAttrRelationResponse>> goodsAttrRelation(GoodsAttrRelationRequest request);
	
	/**
	 * 
	* 功能描述: 商品绑定属性
	* @author: xiongkun
	* @date: 2017年11月30日 下午5:49:52 
	* @param request
	* @return
	 */
	public BaseCommonResult<Void> goodsBindAttr(GoodsBindAttrRequest request);
	
	/**********************app接口************************/
	/**
	 * 
	* 功能描述: app商品分类列表
	* @author: xiongkun
	* @date: 2017年11月27日 下午2:50:55 
	* @param request
	* @return
	 */
	public BaseCommonResult<BasePage<AppGoodsListResponse>> appList(AppGoodsListRequest request);
	
	/**
	 * 
	* 功能描述: app商品详情
	* @author: xiongkun
	* @date: 2017年11月30日 上午10:51:17 
	* @param request
	* @return
	 */
	public BaseCommonResult<AppGoodsDetailsResponse> appGoodsDetails(AppGoodsDetailsRequest request);
	
	/**
	 * 
	* 功能描述: app商品搜索列表
	* @author: xiongkun
	* @date: 2017年11月30日 下午2:50:55 
	* @param request
	* @return
	 */
	public BaseCommonResult<BasePage<AppGoodsListResponse>> appSearchList(AppGoodsSearchListRequest request);
	
	/**
	 * 
	* 功能描述: app首页新商品列表
	* @author: xiongkun
	* @date: 2017年11月30日 下午2:50:55 
	* @param request
	* @return
	 */
	public BaseCommonResult<BasePage<AppGoodsListResponse>> appHomeNewList(AppGoodsHomeNewListRequest request);
	
	/**
	 * 
	 * 功能描述: dubbo服务接口，获取商品详情<br>
	 * @author: wenwj
	 * @date: 2017年12月4日 下午5:33:47 
	 * @version 1.4.0
	 * @param request
	 * @return
	 */
	public BaseCommonResult<GoodsDetailsDResponse> getGoodsDetailsByIdAndSkuNumber(GoodsDetailsDRequest request);

	/**
	 * 获取商品sku库存
	 * @param request 请求参数
	 * @return
     */
	BaseCommonResult<GoodsBoughtDResponse> getGoodsBought(GoodsBoughtDRequest request);

	/**
	 * 更新商品sku库存
	 * @param request 请求参数
	 * @return
	 */
	BaseCommonResult<GoodsBoughtUpdateDResponse> updateGoodsBought(GoodsBoughtUpdateDRequest request);
	
}
