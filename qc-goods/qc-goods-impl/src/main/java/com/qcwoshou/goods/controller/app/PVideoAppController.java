package com.qcwoshou.goods.controller.app;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.PVideoAddRequest;
import com.qcwoshou.goods.dto.request.PVideoLiveRequest;
import com.qcwoshou.goods.dto.response.VideosAddResponse;
import com.qcwoshou.goods.dto.response.VideosLiveResponse;
import com.qcwoshou.goods.service.IPVideoService;
import com.qcwoshou.version.annotations.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
/**
 * @RequestMapping("/goodsCenter/app/videos/{version}")
 */
@Api(description = "直播视频相关接口列表", basePath = "/app/videos")
@RestController
@RequestMapping("/goodsCenter/app/videos/{version}")
public class PVideoAppController {

	@Autowired
	private IPVideoService pVideoService;

	@ApiVersion(1)
	@ApiOperation(value = "开播信息保存", httpMethod = "GET")
	@RequestMapping(value = "/save", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public BaseCommonResult<VideosAddResponse> save(@Valid PVideoAddRequest pVideo) {

		return pVideoService.add(pVideo);
	}

	@ApiVersion(1)
	@ApiOperation(value = "开播", httpMethod = "GET")
	@RequestMapping(value = "/live", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	public BaseCommonResult<VideosLiveResponse> live(@Valid PVideoLiveRequest pVideo) {

		return pVideoService.live(pVideo);
	}
}
