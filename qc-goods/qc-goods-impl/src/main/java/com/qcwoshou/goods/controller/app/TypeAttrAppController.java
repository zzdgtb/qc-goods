package com.qcwoshou.goods.controller.app;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.response.AppTypeAttrResponse;
import com.qcwoshou.goods.service.ITypeAttrService;
import com.qcwoshou.version.annotations.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "商品attr模块app相关接口列表", basePath = "/app/typeAttr")
@RestController
@RequestMapping("/goodsCenter/app/typeAttr/{version}")
public class TypeAttrAppController {

	@Autowired
	private ITypeAttrService typeAttrService;

	@ApiVersion(1)
	@ApiOperation(value = "查询商品attr列表", httpMethod = "GET")
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<List<AppTypeAttrResponse>> list(
			@ApiParam(required=true,name="goodsTypeId",value="商品分类ID")
			@RequestParam(name="goodsTypeId") Integer goodsTypeId) {
		return typeAttrService.appList(goodsTypeId);
	}
	
	
}
