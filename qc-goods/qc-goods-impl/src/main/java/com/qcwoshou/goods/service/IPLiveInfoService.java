package com.qcwoshou.goods.service;

import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;

/**
 * 功能描述 直播视频业务处理
 * @Author wh
 * @Date 2018/10/25
 * @Version 1.0.0
 */
public interface IPLiveInfoService {

    /**
     * 新增
     * @param pLiveInfo
     * @return
     */
    BaseCommonResult<LiveInfoAddResponse> add(PLiveInfoAddRequest pLiveInfo);

    /**
     * 开播
     * @param pLiveInfo
     * @return
     */
    BaseCommonResult<LiveInfoLiveResponse> live(PLiveInfoLiveRequest pLiveInfo);

    /**
     * 根据用户id获取开播列表
     * @param pLiveInfo
     * @return
     */
    BaseCommonResult<LiveInfoListResponse> list(PLiveInfoListRequest pLiveInfo);

    /**
     * 删除开播信息
     * @param pLiveInfo
     * @return
     */
    BaseCommonResult<LiveInfoDeleteResponse> delete(PLiveInfoDeleteRequest pLiveInfo);

    /**
     * 开播信息转发
     * @param pLiveInfo
     * @return
     */
    BaseCommonResult<LiveInfoTransmitResponse> transmit(PLiveInfoTransmitRequest pLiveInfo);

    /**
     * 查看开播详情
     * @param pLiveInfo
     * @return
     */
    BaseCommonResult<LiveInfoViewResponse> view(PLiveInfoViewRequest pLiveInfo);
}
