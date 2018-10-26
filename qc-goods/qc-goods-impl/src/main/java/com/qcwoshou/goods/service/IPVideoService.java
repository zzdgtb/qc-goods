package com.qcwoshou.goods.service;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.PVideoAddRequest;
import com.qcwoshou.goods.dto.request.PVideoLiveRequest;
import com.qcwoshou.goods.dto.response.VideosAddResponse;
import com.qcwoshou.goods.dto.response.VideosLiveResponse;

/**
 * 功能描述 直播视频业务处理
 * @Author wh
 * @Date 2018/10/25
 * @Version 1.0.0
 */
public interface IPVideoService {

    /**
     * 新增
     * @param pVideo
     * @return
     */
    BaseCommonResult<VideosAddResponse> add(PVideoAddRequest pVideo);

    /**
     * 开播
     * @param pVideo
     * @return
     */
    BaseCommonResult<VideosLiveResponse> live(PVideoLiveRequest pVideo);
}
