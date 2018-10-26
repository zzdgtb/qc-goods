package com.qcwoshou.goods.controller.admin;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.GoodsTypeAddRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeAllListRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeListRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeUpdateRequest;
import com.qcwoshou.goods.dto.response.GoodsTypeDetailsResponse;
import com.qcwoshou.goods.dto.response.GoodsTypeListResponse;
import com.qcwoshou.goods.dto.response.GoodsTypeResponse;
import com.qcwoshou.goods.service.IGoodsTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(description = "商品分类模块后台相关接口列表", basePath = "/admin/goodsType")
@RestController
@RequestMapping("/goodsCenter/admin/goodsType")
public class GoodsTypeController {

	@Autowired
	private IGoodsTypeService goodsTypeService;

	@ApiOperation(value = "分页查询商品分类列表", httpMethod = "GET")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
    BaseCommonResult<GoodsTypeListResponse> queryOrderListByPage(
			@Valid GoodsTypeListRequest req) {
		return goodsTypeService.list(req);
	}
	
	@ApiOperation(value = "查询商品分类全部列表", httpMethod = "GET")
	@RequestMapping(value = "/allList", method = RequestMethod.GET)
	public @ResponseBody
    BaseCommonResult<List<GoodsTypeResponse>> queryOrderListByPage(
			@Valid GoodsTypeAllListRequest req) {
		return goodsTypeService.allList(req);
	}
	
	@ApiOperation(value = "查询商品分类详情", httpMethod = "GET")
	@RequestMapping(value = "/details", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<GoodsTypeDetailsResponse> details(
			@RequestParam("id") Integer id) {
		return goodsTypeService.details(id);
	}
	
	@ApiOperation(value = "更新商品分类", httpMethod = "POST")
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<Void> update(
			@RequestBody @Valid GoodsTypeUpdateRequest request) {
		return goodsTypeService.update(request);
	}
	
	@ApiOperation(value = "新增商品分类", httpMethod = "POST")
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<Void> add(
			@RequestBody @Valid GoodsTypeAddRequest request) {
		return goodsTypeService.add(request);
	}
	
	@ApiOperation(value = "删除商品分类", httpMethod = "DELETE")
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<Void> delete(
			@RequestParam(name="id") Integer id) {
		return goodsTypeService.delete(id);
	}
}
