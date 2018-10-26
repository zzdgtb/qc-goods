package com.qcwoshou.goods.controller.app;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.response.AppGoodsTypeResponse;
import com.qcwoshou.goods.service.IGoodsTypeService;
import com.qcwoshou.version.annotations.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "商品分类模块app相关接口列表", basePath = "/app/goodsType")
@RestController
@RequestMapping("/goodsCenter/app/goodsType/{version}")
public class GoodsTypeAppController {

	@Autowired
	private IGoodsTypeService goodsTypeService;

	@ApiVersion(1)
	@ApiOperation(value = "查询商品attr列表", httpMethod = "GET")
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public @ResponseBody
    BaseCommonResult<List<AppGoodsTypeResponse>> list(
			@ApiParam(required=true,name="pid",value="商品分类父ID")
			@RequestParam(name="pid") Integer pid) {
		return goodsTypeService.appList(pid);
	}
	
	
}
