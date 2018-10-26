package com.qcwoshou.goods.controller.admin;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;
import com.qcwoshou.goods.service.IGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.qcwoshou.core.common.constants.Constants.HEADER_LOGINID;

/**
 * @Author zhouzhiming
 * @Description 商品管理
 * @Date 9:09 2018/10/24
 * @Param
 * @return
 **/
@Api(description = "商品信息相关接口列表", basePath = "/goods")
@RestController
@RequestMapping("/goodsCenter/admin/goods")
public class GoodsAdminController {
	@Autowired
	private IGoodsService goodsService;
	
	/**
	 * @Author zhouzhiming
	 * @Description 商品列表
	 * @Date 9:09 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.dto.response.GoodsListResponse>
	 **/
	@ApiOperation(value = "分页查询商品列表", httpMethod = "GET")
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public BaseCommonResult<GoodsListResponse> list( @Valid GoodsListRequest request) {
		return goodsService.list(request);
	}
	
	/**
	 * @Author zhouzhiming
	 * @Description 商品列表
	 * @Date 9:10 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.dto.response.GoodsExportResponse>
	 **/
	@ApiOperation(value = "商品导出", httpMethod = "GET")
	@RequestMapping(value = "/exportList", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public BaseCommonResult<GoodsExportResponse> list( @Valid GoodsExportRequest request) {
		return goodsService.exportList(request);
	}
	
	/**
	 * @Author zhouzhiming
	 * @Description 商品标签关联关系
	 * @Date 10:11 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.util.List<com.qcwoshou.goods.dto.response.GoodsTagRelationResponse>>
	 **/
	@ApiOperation(value = "商品标签关联关系", httpMethod = "GET")
	@RequestMapping(value = "/goodsTagRelation", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public BaseCommonResult<List<GoodsTagRelationResponse>> goodsTagRelation(@Valid GoodsTagRelationRequest request) {
		return goodsService.goodsTagRelation(request);
	}
	
	/**
	 * @Author zhouzhiming
	 * @Description 商品绑定标签
	 * @Date 10:11 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	@ApiOperation(value = "商品绑定标签", httpMethod = "POST")
	@RequestMapping(value = "/goodsBindTag", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public BaseCommonResult<Void> goodsBindTag(@RequestBody @Valid GoodsBindTagRequest request) {
		return goodsService.goodsBindTag(request);
	}
	
	/**
	 * @Author zhouzhiming
	 * @Description 商品属性关联关系
	 * @Date 10:11 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.util.List<com.qcwoshou.goods.dto.response.GoodsAttrRelationResponse>>
	 **/
	@ApiOperation(value = "商品属性关联关系", httpMethod = "GET")
	@RequestMapping(value = "/goodsAttrRelation", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public BaseCommonResult<List<GoodsAttrRelationResponse>> goodsAttrRelation(@Valid GoodsAttrRelationRequest request) {
		return goodsService.goodsAttrRelation(request);
	}
	
	/**
	 * @Author zhouzhiming
	 * @Description 商品绑定属性
	 * @Date 10:11 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	@ApiOperation(value = "商品绑定属性", httpMethod = "POST")
	@RequestMapping(value = "/goodsBindAttr", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public BaseCommonResult<Void> goodsBindAttr(@RequestBody @Valid GoodsBindAttrRequest request) {
		return goodsService.goodsBindAttr(request);
	}
	
	/**
	 * @Author zhouzhiming
	 * @Description 添加商品信息
	 * @Date 10:11 2018/10/24
	 * @Param [request, loginId]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.dto.response.GoodsAddResponse>
	 **/
	@ApiOperation(value = "新增商品信息", httpMethod = "POST")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public BaseCommonResult<GoodsAddResponse> addGoods(@RequestBody @Valid GoodsAddRequest request, @RequestHeader(HEADER_LOGINID) String loginId){
		return goodsService.addGoods(request,loginId);
	}
	
	/**
	 * @Author zhouzhiming
	 * @Description 修改商品信息
	 * @Date 10:11 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	@ApiOperation(value = "更新商品信息", httpMethod = "POST")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public BaseCommonResult<Void> updateGoods(@RequestBody @Valid GoodsUpdateRequest request){
		return goodsService.updateGoods(request);
	}

	/**
	 * @Author zhouzhiming
	 * @Description 获取商品信息
	 * @Date 10:12 2018/10/24
	 * @Param [id]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<com.qcwoshou.goods.dto.response.GoodsGetResponse>
	 **/
	@ApiOperation(value = "获取商品信息", httpMethod = "GET")
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public BaseCommonResult<GoodsGetResponse> queryGoods(@ApiParam(value = "商品id" ,required=true ) @PathVariable("id") Integer id) {
		return goodsService.getGoods(id);
	}
	
	
	/**
	 * @Author zhouzhiming
	 * @Description 删除商品功能
	 * @Date 10:12 2018/10/24
	 * @Param [id]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	@ApiOperation(value = "删除单个商品信息", httpMethod = "DELETE")
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public BaseCommonResult<Void> deleteGoods(@ApiParam(value = "商品id" ,required=true ) @PathVariable("id") Integer id) {
		return goodsService.deleteGoods(id);
	}

	/**
	 * @Author zhouzhiming
	 * @Description 更新商品是否上架状态
	 * @Date 10:12 2018/10/24
	 * @Param [request]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	@ApiOperation(value = "更新商品上架状态", httpMethod = "POST")
	@RequestMapping(value = "/isOnlive/update", method = RequestMethod.POST)
	public BaseCommonResult<Void> updateGoodsIsOnlive(@RequestBody @Valid GoodsIsOnliveUpdateRequest request) {
		return goodsService.updateGoodsIsOnlive(request);
	}
	
	/**
	 * @Author zhouzhiming
	 * @Description 更新商品审核状态功能
	 * @Date 10:12 2018/10/24
	 * @Param [request, loginId]
	 * @return com.qcwoshou.core.dto.result.BaseCommonResult<java.lang.Void>
	 **/
	@ApiOperation(value = "更新商品审核状态", httpMethod = "POST")
	@RequestMapping(value = "/publishWait/update", method = RequestMethod.POST)
	public BaseCommonResult<Void> updateGoodsPublishWait(@RequestBody @Valid GoodsPublishWaitUpdateRequest request, @RequestHeader(HEADER_LOGINID) String loginId) {
		return goodsService.updateGoodsPublishWait(request,loginId);
	}
}
