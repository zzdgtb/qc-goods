package com.qcwoshou.goods.controller.app;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;
import com.qcwoshou.goods.service.IPLiveInfoService;
import com.qcwoshou.version.annotations.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @RequestMapping("/goodsCenter/app/liveinfo/{version}")
 */
@Api(description = "开播信息相关接口列表", basePath = "/video/app/liveinfo")
@RestController
@RequestMapping("/video/app/liveinfo")
public class PLiveInfoAppController {

    @Autowired
    private IPLiveInfoService pLiveInfoService;


    //@ApiVersion(1)
    @ApiOperation(value = "开播信息保存", httpMethod = "POST")
    @PostMapping(value = "/save")
    public BaseCommonResult<LiveInfoAddResponse> save(@RequestBody @Valid PLiveInfoAddRequest pLiveInfo) {

        return pLiveInfoService.add(pLiveInfo);
    }

    //@ApiVersion(1)
    @ApiOperation(value = "查看开播详情", httpMethod = "POST")
    @PostMapping(value = "/view")
    public BaseCommonResult<LiveInfoViewResponse> view(@RequestBody @Valid PLiveInfoViewRequest pLiveInfo) {

        return pLiveInfoService.view(pLiveInfo);
    }

    //@ApiVersion(1)
    @ApiOperation(value = "开播", httpMethod = "POST")
    @PostMapping(value = "/live")
    public BaseCommonResult<LiveInfoLiveResponse> live(@RequestBody @Valid PLiveInfoLiveRequest pLiveInfo) {

        return pLiveInfoService.live(pLiveInfo);
    }

    //@ApiVersion(1)
    @ApiOperation(value = "获取用户视频开播列表", httpMethod = "POST")
    @PostMapping(value = "/list")
    public BaseCommonResult<LiveInfoListResponse> list(@RequestBody @Valid PLiveInfoListRequest pLiveInfo) {

        return pLiveInfoService.list(pLiveInfo);
    }

    //@ApiVersion(1)
    @ApiOperation(value = "删除开播信息", httpMethod = "POST")
    @PostMapping(value = "/delete")
    public BaseCommonResult<LiveInfoDeleteResponse> delete(@RequestBody @Valid PLiveInfoDeleteRequest pLiveInfo) {

        return pLiveInfoService.delete(pLiveInfo);
    }
    //@ApiVersion(1)
    @ApiOperation(value = "转发开播信息", httpMethod = "POST")
    @PostMapping(value= "/transmit")
    public BaseCommonResult<LiveInfoTransmitResponse> transmit(@RequestBody @Valid PLiveInfoTransmitRequest pLiveInfo) {

        return pLiveInfoService.transmit(pLiveInfo);
    }
}
