package com.qcwoshou.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qcwoshou.common.*;
import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.exception.GoodsException;
import com.qcwoshou.goods.dao.PLiveInfoMapper;
import com.qcwoshou.goods.dao.PTransmitMapper;
import com.qcwoshou.goods.dao.PVideoDetailsMapper;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;
import com.qcwoshou.goods.model.PLiveInfo;
import com.qcwoshou.goods.model.PLiveInfoExample;
import com.qcwoshou.goods.model.PLiveInfoExample.Criteria;
import com.qcwoshou.goods.model.PTransmit;
import com.qcwoshou.goods.model.PVideoDetails;
import com.qcwoshou.goods.service.IMService;
import com.qcwoshou.goods.service.IPLiveInfoService;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static com.qcwoshou.common.DateUtil.getNow;
import static com.qcwoshou.common.DateUtil.getminisBetweenTwoDate;
import static com.qcwoshou.common.RandomUtils.getRandomStringWithTime;

/**
 * @ClassName PLiveInfoServiceImpl
 * @Author admin
 * @Date 2018/10/25
 * @Version 1.0.0
 */
@Service
@Slf4j
public class PLiveInfoServiceImpl implements IPLiveInfoService {

    @Autowired
    private DozerBeanMapper dozer;

    @Autowired
    private PLiveInfoMapper pLiveInfoMapper;

    @Autowired
    private PVideoDetailsMapper pLiveInfoDetailsMapper;

    @Autowired
    private IMService iMService;

    @Autowired
    private PTransmitMapper  pTransmitMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public BaseCommonResult<LiveInfoAddResponse> add(PLiveInfoAddRequest pLiveInfo) {
        BaseCommonResult<LiveInfoAddResponse> result = new BaseCommonResult<LiveInfoAddResponse>();
        log.info("视频模块-新增开播信息--开始, 请求信息：{}", pLiveInfo);
        try {
            PLiveInfo liveInfos = dozer.map(pLiveInfo, PLiveInfo.class);
            //保存草稿
            liveInfos.setStatus(GoodsConstants.VIDEO_STATUS.NEW_CREATE.statusCode);

            if (null == liveInfos.getId()) {
                liveInfos.setCreateUserId(pLiveInfo.getUserId());
                int goodsRowNumber = pLiveInfoMapper.insertSelective(liveInfos);
            } else {
                int goodsRowNumber = pLiveInfoMapper.updateByPrimaryKeySelective(liveInfos);
            }

            LiveInfoAddResponse response = dozer.map(liveInfos, LiveInfoAddResponse.class);
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-新增开播信息--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-新增开播信息--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_ADD_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_ADD_FAIL));
        }
        log.info("视频模块-新增开播信息--成功, 返回信息：{}", result);
        return result;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public BaseCommonResult<LiveInfoLiveResponse> live(PLiveInfoLiveRequest pLiveInfo) {
        BaseCommonResult<LiveInfoLiveResponse> result = new BaseCommonResult<LiveInfoLiveResponse>();
        log.info("视频模块-视频开播--开始, 请求信息：{}", pLiveInfo);
        try {
            if (null != pLiveInfo.getBeginLiveTime()) {
                //开播时间与预播时间偏差不能大于10分钟
                if ("0".equals(pLiveInfo.getIsDerectLive()) && getminisBetweenTwoDate(DateUtil.getNow(), pLiveInfo.getBeginLiveTime()) >= GoodsConstants.BEGIN_LIVETIME_DEFAULT_BEHAIND_NOW) {
                    log.info("视频模块-视频开播--失败, 信息：{}", GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_BEGIN_LIVETIME_UN_SAME));
                    throw new GoodsException(GoodsApiCode.VEDIOS_BEGIN_LIVETIME_UN_SAME, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_BEGIN_LIVETIME_UN_SAME));
                }
                if (null == pLiveInfo.getEndLiveTime() || pLiveInfo.getEndLiveTime().before(pLiveInfo.getBeginLiveTime())) {
                    log.info("视频模块-视频开播--失败, 信息：{}", GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_END_LIVETIME_IS_NULL));
                    throw new GoodsException(GoodsApiCode.VEDIOS_END_LIVETIME_IS_NULL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_END_LIVETIME_IS_NULL));
                }
            }
            PLiveInfo liveInfos = dozer.map(pLiveInfo, PLiveInfo.class);
            //生成视频编码
            String videoCode="qcws" + getRandomStringWithTime(new Date(), GoodsConstants.VEDIO_CODE_RANDOM_BIT_NUM);
            //创建群组信息
            iMService.createGroup(videoCode, pLiveInfo.getUserId() + "_" + liveInfos.getClassName(), pLiveInfo.getUserId() + "");
            //直播中
            liveInfos.setStatus(GoodsConstants.VIDEO_STATUS.LIVING.statusCode);
            //每个用户分配一个唯一的房间号
            liveInfos.setRoomCode("qcws" + pLiveInfo.getUserId());
            //视频推流url
            String liveUrl = LiveUrlUtil.getPushUrl(GoodsConstants.BIZ_ID, GoodsConstants.LIVE_KEY, GoodsConstants.BIZ_ID + "_"
                    + liveInfos.getRoomCode(), GoodsConstants.DEFAULT_LIVE_TIME);
            //视频播放url flv格式
            String playUrl = LiveUrlUtil.getFlvLiveUrl(GoodsConstants.BIZ_ID, GoodsConstants.BIZ_ID + "_"
                    + liveInfos.getRoomCode());
            if (null == liveInfos.getId()) {
                liveInfos.setCreateUserId(pLiveInfo.getUserId());
                int goodsRowNumber = pLiveInfoMapper.insertSelective(liveInfos);
            } else {
                int goodsRowNumber = pLiveInfoMapper.updateByPrimaryKeySelective(liveInfos);
            }
            //保存视频信息
            PVideoDetails liveInfoDetails = new PVideoDetails();
            liveInfoDetails.setLiveInfoId(liveInfos.getId());
            liveInfoDetails.setVideoCode(videoCode);
            liveInfoDetails.setRoomCode(liveInfos.getRoomCode());
            liveInfoDetails.setPushLiveUrl(liveUrl);
            liveInfoDetails.setPlayLiveUrl(playUrl);
            liveInfoDetails.setCreateUserId(pLiveInfo.getUserId());
            liveInfoDetails.setRealBeginLivetime(getNow());
            pLiveInfoDetailsMapper.insertSelective(liveInfoDetails);

            LiveInfoLiveResponse response = dozer.map(liveInfos, LiveInfoLiveResponse.class);
            response.setPushLiveUrl(liveUrl);
            response.setGroupId(videoCode);
            response.setVideoCode(videoCode);
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-视频开播--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-视频开播--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_LIVE_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_LIVE_FAIL));
        }
        log.info("视频模块-视频开播--成功, 返回信息：{}", result);
        return result;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public BaseCommonResult<LiveInfoListResponse> list(PLiveInfoListRequest pLiveInfo) {
        BaseCommonResult<LiveInfoListResponse> result = new BaseCommonResult<LiveInfoListResponse>();
        log.info("视频模块-获取开播信息列表--开始, 请求信息：{}", pLiveInfo);
        try {
            PageHelper.startPage(pLiveInfo.getPage(), pLiveInfo.getPageSize());
            PLiveInfoExample pe = new PLiveInfoExample();
            Criteria criteria = pe.createCriteria().andCreateUserIdEqualTo(pLiveInfo.getUserId()).andIsDeleteEqualTo(new Byte("0"));
            pe.setOrderByClause("begin_live_time desc");
            if (!StringUtil.isEmpty(pLiveInfo.getStatus())) {
                criteria.andStatusEqualTo(new Byte(pLiveInfo.getStatus()));
            }
            List<PLiveInfo> liveInfolist = pLiveInfoMapper.selectByExample(pe);
            LiveInfoListResponse response = new LiveInfoListResponse();
            for (PLiveInfo liveInfo : liveInfolist) {
                LiveInfoResponse repvo = dozer.map(liveInfo, LiveInfoResponse.class);
                response.addT(repvo);
            }
            PageInfo<PLiveInfo> pageInfo = new PageInfo<PLiveInfo>(liveInfolist);
            response.setPageInfo(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(),
                    pageInfo.getTotal());
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-获取开播信息列表--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-获取开播信息列表--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_LIST_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_LIST_FAIL));
        }
        log.info("视频模块-获取开播信息列表--成功, 返回信息：{}", result);
        return result;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public BaseCommonResult<LiveInfoDeleteResponse> delete(PLiveInfoDeleteRequest pLiveInfo) {
        BaseCommonResult<LiveInfoDeleteResponse> result = new BaseCommonResult<LiveInfoDeleteResponse>();
        log.info("视频模块-删除开播信息--开始, 请求信息：{}", pLiveInfo);
        try {
            PLiveInfo liveInfo = dozer.map(pLiveInfo, PLiveInfo.class);
            liveInfo.setIsDelete(new Byte("1"));
            pLiveInfoMapper.updateByPrimaryKeySelective(liveInfo);
            LiveInfoDeleteResponse response = new LiveInfoDeleteResponse();
            response.setId(liveInfo.getId().intValue());
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-删除开播信息--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-删除开播信息--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_DELETE_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_DELETE_FAIL));
        }
        log.info("视频模块-删除开播信息--成功, 返回信息：{}", result);
        return result;
    }

    @Override
    public BaseCommonResult<LiveInfoTransmitResponse> transmit(PLiveInfoTransmitRequest PLiveInfoTransmit) {
        BaseCommonResult<LiveInfoTransmitResponse> result = new BaseCommonResult<LiveInfoTransmitResponse>();
        log.info("视频模块-转发开播信息--开始, 请求信息：{}", PLiveInfoTransmit);
        try {
            PTransmit pTransmit = new PTransmit();
            pTransmit.setUserId(PLiveInfoTransmit.getUserId().longValue());
            pTransmit.setDestination(PLiveInfoTransmit.getDestination());
            pTransmit.setTransmitCode(PLiveInfoTransmit.getLiveInfoid().toString());
            pTransmit.setTransmitType(new Byte("0"));
            pTransmitMapper.insertSelective(pTransmit);

            LiveInfoTransmitResponse response = new LiveInfoTransmitResponse();
            response.setId(PLiveInfoTransmit.getLiveInfoid());
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-转发开播信息--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-转发开播信息--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_TRANSMIT_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_TRANSMIT_FAIL));
        }
        log.info("视频模块-转发开播信息--成功, 返回信息：{}", result);
        return result;
    }

    @Override
    public BaseCommonResult<LiveInfoViewResponse> view(PLiveInfoViewRequest pLiveInfo) {
        BaseCommonResult<LiveInfoViewResponse> result = new BaseCommonResult<LiveInfoViewResponse>();
        log.info("视频模块-查看开播信息详情--开始, 请求信息：{}", pLiveInfo);
        try {
            PLiveInfo liveInfo = pLiveInfoMapper.selectByPrimaryKey(pLiveInfo.getId().longValue());

            LiveInfoViewResponse response = dozer.map(liveInfo, LiveInfoViewResponse.class);
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-查看开播信息详情--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-查看开播信息详情--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_VIEW_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_VIEW_FAIL));
        }
        log.info("视频模块-查看开播信息详情--成功, 返回信息：{}", result);
        return result;
    }
}
