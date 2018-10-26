package com.qcwoshou.goods.controller.admin;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.TypeAttrValueAddRequest;
import com.qcwoshou.goods.dto.request.TypeAttrValueListRequest;
import com.qcwoshou.goods.dto.request.TypeAttrValueUpdateRequest;
import com.qcwoshou.goods.dto.response.TypeAttrValueDetailsResponse;
import com.qcwoshou.goods.dto.response.TypeAttrValueListResponse;
import com.qcwoshou.goods.service.ITypeAttrValueService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(description = "商品属性值模块后台相关接口列表", basePath = "/admin/typeAttrValue")
@RestController
@RequestMapping("/goodsCenter/admin/typeAttrValue")
public class TypeAttrValueController {

	@Autowired
	private ITypeAttrValueService typeAttrValueService;

	@ApiOperation(value = "分页查询商品属性值列表", httpMethod = "GET")
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<TypeAttrValueListResponse> list(
			@Valid TypeAttrValueListRequest request) {
		return typeAttrValueService.list(request);
	}
	
	@ApiOperation(value = "查询商品属性值详情", httpMethod = "GET")
	@RequestMapping(value = "/details", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<TypeAttrValueDetailsResponse> details(
			@RequestParam("id") Integer id) {
		return typeAttrValueService.details(id);
	}
	
	@ApiOperation(value = "更新商品属性值", httpMethod = "POST")
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<Void> update(
			@RequestBody @Valid TypeAttrValueUpdateRequest request) {
		return typeAttrValueService.update(request);
	}
	
	@ApiOperation(value = "新增商品属性值", httpMethod = "POST")
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<Void> add(
			@RequestBody @Valid TypeAttrValueAddRequest request) {
		return typeAttrValueService.add(request);
	}
	
	@ApiOperation(value = "删除商品属性值", httpMethod = "DELETE")
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<Void> delete(
			@RequestParam(name="id") Integer id) {
		return typeAttrValueService.delete(id);
	}
}
