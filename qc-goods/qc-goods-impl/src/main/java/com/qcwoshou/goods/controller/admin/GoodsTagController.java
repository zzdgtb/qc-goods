package com.qcwoshou.goods.controller.admin;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.GoodsTagAddRequest;
import com.qcwoshou.goods.dto.request.GoodsTagAllListRequest;
import com.qcwoshou.goods.dto.request.GoodsTagListRequest;
import com.qcwoshou.goods.dto.request.GoodsTagUpdateRequest;
import com.qcwoshou.goods.dto.response.GoodsTagAllListResponse;
import com.qcwoshou.goods.dto.response.GoodsTagDetailsResponse;
import com.qcwoshou.goods.dto.response.GoodsTagListResponse;
import com.qcwoshou.goods.service.IGoodsTagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(description = "商品标签模块后台相关接口列表", basePath = "/admin/goodsTag")
@RestController
@RequestMapping("/goodsCenter/admin/goodsTag")
public class GoodsTagController {

	@Autowired
	private IGoodsTagService goodsTagService;

	@ApiOperation(value = "分页查询商品标签列表", httpMethod = "GET")
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<GoodsTagListResponse> list(
			@Valid GoodsTagListRequest request) {
		return goodsTagService.list(request);
	}
	
	@ApiOperation(value = "获取所有商品标签列表", httpMethod = "GET")
	@RequestMapping(value = "/allList", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<List<GoodsTagAllListResponse>> allList(
			@Valid GoodsTagAllListRequest request) {
		return goodsTagService.allList(request);
	}
	
	@ApiOperation(value = "查询商品标签详情", httpMethod = "GET")
	@RequestMapping(value = "/details", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<GoodsTagDetailsResponse> details(
			@RequestParam("id") Integer id) {
		return goodsTagService.details(id);
	}
	
	@ApiOperation(value = "更新商品标签", httpMethod = "POST")
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<Void> update(
			@RequestBody @Valid GoodsTagUpdateRequest request) {
		return goodsTagService.update(request);
	}
	
	@ApiOperation(value = "新增商品标签", httpMethod = "POST")
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<Void> add(
			@RequestBody @Valid GoodsTagAddRequest request) {
		return goodsTagService.add(request);
	}
	
	@ApiOperation(value = "删除商品标签", httpMethod = "DELETE")
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<Void> delete(
			@RequestParam(name="id") Integer id) {
		return goodsTagService.delete(id);
	}
}
