package com.qcwoshou.goods.controller.app;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.core.dto.result.BasePage;
import com.qcwoshou.goods.dto.request.AppGoodsDetailsRequest;
import com.qcwoshou.goods.dto.request.AppGoodsHomeNewListRequest;
import com.qcwoshou.goods.dto.request.AppGoodsListRequest;
import com.qcwoshou.goods.dto.request.AppGoodsSearchListRequest;
import com.qcwoshou.goods.dto.response.AppGoodsDetailsResponse;
import com.qcwoshou.goods.dto.response.AppGoodsListResponse;
import com.qcwoshou.goods.service.IGoodsService;
import com.qcwoshou.version.annotations.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(description = "商品模块app相关接口列表", basePath = "/app/goods")
@RestController
@RequestMapping("/ htgoodsCenter/app/goods/{version}")
			public class GoodsAppController {

			@Autowired
			private IGoodsService goodsService;

			@ApiVersion(1)
			@ApiOperation(value = "查询商品列表", httpMethod = "GET")
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
	BaseCommonResult<BasePage<AppGoodsListResponse>> list(@Valid AppGoodsListRequest request) {

		return goodsService.appList(request);
	}

	@ApiVersion(1)
	@ApiOperation(value = "搜索商品列表",httpMethod = "GET")
	@RequestMapping(value = "/searchList", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<BasePage<AppGoodsListResponse>> searchList(@Valid AppGoodsSearchListRequest request) {
		
		return goodsService.appSearchList(request);
	}
	
	@ApiVersion(1)
	@ApiOperation(value = "首页新商品列表", httpMethod = "GET")
	@RequestMapping(value = "/homeNewList", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<BasePage<AppGoodsListResponse>> homeNewList(@Valid AppGoodsHomeNewListRequest request) {
		
		return goodsService.appHomeNewList(request);
	}
	
	@ApiVersion(1)
	@ApiOperation(value = "查询商品详情", httpMethod = "GET")
	@RequestMapping(value = "/details", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<AppGoodsDetailsResponse> list(@Valid AppGoodsDetailsRequest request) {
		return goodsService.appGoodsDetails(request);
	}
}
