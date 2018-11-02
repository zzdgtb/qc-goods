package com.qcwoshou.goods.controller.app;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;
import com.qcwoshou.goods.service.IPVideoDetailsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @ClassName PVideoDetailsAppController
 * @Author wh
 * @Date 2018/11/1
 * @Version 1.0.0
 */
@Api(description = "直播视频相关接口列表", basePath = "/video/app/details")
@RestController
@RequestMapping("/video/app/details")
public class PVideoDetailsAppController {
    @Autowired
    private IPVideoDetailsService pVideoDetailsService;

   //@ApiVersion(1)
    @ApiOperation(value = "查看视频详情", httpMethod = "POST")
    @PostMapping(value = "/view")
    public BaseCommonResult<VideoDetailsViewResponse> view(@RequestBody @Valid VideoDetailsViewRequest Video) {

        return pVideoDetailsService.view(Video);
    }
    //@ApiVersion(1)
    @ApiOperation(value = "转发/分享视频信息", httpMethod = "POST")
    @PostMapping(value = "/transmit")
    public BaseCommonResult<VideoDetailsTransmitResponse> transmit(@RequestBody @Valid VideoDetailsTransmitRequest Video) {

        return pVideoDetailsService.transmit(Video);
    }
    //@ApiVersion(1)
    @ApiOperation(value = "关注视频", httpMethod = "POST")
    @PostMapping(value = "/follow")
    public BaseCommonResult<VideoDetailsFollowResponse> follow(@RequestBody @Valid VideoDetailsFollowRequest Video) {

        return pVideoDetailsService.follow(Video);
    }
    //@ApiVersion(1)
    @ApiOperation(value = "点赞视频", httpMethod = "POST")
    @PostMapping(value = "/like")
    public BaseCommonResult follow(@RequestBody @Valid VideoDetailsLikeRequest Video) {

        return pVideoDetailsService.like(Video);
    }
    //@ApiVersion(1)
    @ApiOperation(value = "收藏视频", httpMethod = "POST")
    @PostMapping(value = "/collect")
    public BaseCommonResult collect(@RequestBody @Valid VideoDetailsCollectRequest Video) {

        return pVideoDetailsService.collect(Video);
    }

    @ApiOperation(value = "我的视频列表", httpMethod = "POST")
    @PostMapping(value = "/list")
    public BaseCommonResult<VideosListResponse> collectlist(@RequestBody @Valid VideosListRequest Video) {

        return pVideoDetailsService.list(Video);
    }

    @ApiOperation(value = "视频收藏列表", httpMethod = "POST")
    @PostMapping(value = "/collectlist")
    public BaseCommonResult<VideosCollectListResponse> collectlist(@RequestBody @Valid VideosCollectListRequest Video) {

        return pVideoDetailsService.collectlist(Video);
    }
}
