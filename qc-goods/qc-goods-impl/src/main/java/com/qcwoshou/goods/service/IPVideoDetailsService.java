package com.qcwoshou.goods.service;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;

/**
 * @ClassName IPVideoDetailsService
 * @Author wh
 * @Date 2018/11/1
 * @Version 1.0.0
 */
public interface IPVideoDetailsService {
    /**
     * 查看视频详情
     * @param video
     * @return
     */
    BaseCommonResult<VideoDetailsViewResponse> view(VideoDetailsViewRequest video);

    /**
     * 转发/分享视频信息
     * @param video
     * @return
     */
    BaseCommonResult<VideoDetailsTransmitResponse> transmit(VideoDetailsTransmitRequest video);

    /**
     * 关注视频
     * @param video
     * @return
     */
    BaseCommonResult<VideoDetailsFollowResponse> follow(VideoDetailsFollowRequest video);

    /**
     * 点赞视频
     * @param video
     * @return
     */
    BaseCommonResult like(VideoDetailsLikeRequest video);

    /**
     * 收藏视频
     * @param video
     * @return
     */
    BaseCommonResult collect(VideoDetailsCollectRequest video);

    /**
     * 获取用户视频收藏列表
     * @param video
     * @return
     */
    BaseCommonResult<VideosCollectListResponse> collectlist(VideosCollectListRequest video);

    /**
     * 视频列表
     * @param video
     * @return
     */
    BaseCommonResult<VideosListResponse> list(VideosListRequest video);
}
