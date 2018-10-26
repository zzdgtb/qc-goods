package com.qcwoshou.goods.service.impl;

import com.qcwoshou.common.GoodsApiCode;
import com.qcwoshou.common.GoodsConstants;
import com.qcwoshou.common.LiveUrlUtil;
import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.exception.GoodsException;
import com.qcwoshou.goods.dao.PVideoDetailsMapper;
import com.qcwoshou.goods.dao.PVideoMapper;
import com.qcwoshou.goods.dto.request.PVideoAddRequest;
import com.qcwoshou.goods.dto.request.PVideoLiveRequest;
import com.qcwoshou.goods.dto.response.VideosAddResponse;
import com.qcwoshou.goods.dto.response.VideosLiveResponse;
import com.qcwoshou.goods.model.PVideo;
import com.qcwoshou.goods.model.PVideoDetails;
import com.qcwoshou.goods.service.IPVideoService;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static com.qcwoshou.common.DateUtil.getDateSomeMinisBehind;
import static com.qcwoshou.common.DateUtil.getNow;
import static com.qcwoshou.common.RandomUtils.getRandomStringWithTime;

/**
 * @ClassName PVideoServiceImpl
 * @Author admin
 * @Date 2018/10/25
 * @Version 1.0.0
 */
@Service
@Slf4j
public class PVideoServiceImpl implements IPVideoService {

    @Autowired
    private DozerBeanMapper dozer;

    @Autowired
    private PVideoMapper pVideoMapper;

    @Autowired
    private PVideoDetailsMapper pVideoDetailsMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public BaseCommonResult<VideosAddResponse> add(PVideoAddRequest pVideo) {
        BaseCommonResult<VideosAddResponse> result = new BaseCommonResult<VideosAddResponse>();
        log.info("视频模块-新增视频开播信息--开始, 请求信息：{}", pVideo);
        try {
            PVideo Videos = dozer.map(pVideo, PVideo.class);
            //Videos.setVideoCode("qcws"+(new Date().getTime()));
            //设置商品来源、创建人信息
            /*UserLoginResponse userInfo = null;//UserInfoRedisUtil.getUserCache(loginId);
            if(userInfo!=null){
                Videos.setSubmitFrom(new Byte(userInfo.getUserType()));
                Videos.setCreateUserId(Integer.parseInt(userInfo.getUserId()));
            }else{
                log.info("商品信息-新增商品基本信息--结束, 信息：{}", GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR));
                throw new GoodsException(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR));
            }*/
            //保存草稿
            Videos.setStatus(GoodsConstants.VIDEO_STATUS.NEW_CREATE.statusCode);

            if (null == Videos.getId()) {
                Videos.setCreateUserId(pVideo.getUserid());
                int goodsRowNumber = pVideoMapper.insertSelective(Videos);
            } else {
                int goodsRowNumber = pVideoMapper.updateByPrimaryKeySelective(Videos);
            }

            VideosAddResponse response = dozer.map(Videos, VideosAddResponse.class);
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-新增视频开播信息--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-新增视频开播信息--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.ADD_GOODS, GoodsApiCode.getZhMsg(GoodsApiCode.ADD_GOODS));
        }
        log.info("视频模块-新增视频开播信息--成功, 返回信息：{}", result);
        return result;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public BaseCommonResult<VideosLiveResponse> live(PVideoLiveRequest pVideo) {
        BaseCommonResult<VideosLiveResponse> result = new BaseCommonResult<VideosLiveResponse>();
        log.info("视频模块-视频开播--开始, 请求信息：{}", pVideo);
        try {
            if (null != pVideo.getBeginLiveTime()) {
                //直播开始时间小于当前时间+10分钟
                if (getDateSomeMinisBehind(GoodsConstants.BEGIN_LIVETIME_DEFAULT_BEHAIND_NOW).after(pVideo.getBeginLiveTime())) {
                    log.info("视频模块-视频开播--失败, 信息：{}", GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_BEGIN_LIVETIME_TOO_SMALL));
                    throw new GoodsException(GoodsApiCode.VEDIOS_BEGIN_LIVETIME_TOO_SMALL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_BEGIN_LIVETIME_TOO_SMALL));
                }
                if (null == pVideo.getEndLiveTime() || pVideo.getEndLiveTime().after(pVideo.getBeginLiveTime())) {
                    log.info("视频模块-视频开播--失败, 信息：{}", GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_END_LIVETIME_IS_NULL));
                    throw new GoodsException(GoodsApiCode.VEDIOS_END_LIVETIME_IS_NULL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_END_LIVETIME_IS_NULL));
                }
            }
            PVideo Videos = dozer.map(pVideo, PVideo.class);
            //生成视频编码
            Videos.setVideoCode("qcws" + getRandomStringWithTime(new Date(), GoodsConstants.VEDIO_CODE_RANDOM_BIT_NUM));
            //设置商品来源、创建人信息
            /*UserLoginResponse userInfo = null;//UserInfoRedisUtil.getUserCache(loginId);
            if(userInfo!=null){
                Videos.setSubmitFrom(new Byte(userInfo.getUserType()));
                Videos.setCreateUserId(Integer.parseInt(userInfo.getUserId()));
            }else{
                log.info("商品信息-新增商品基本信息--结束, 信息：{}", GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR));
                throw new GoodsException(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR));
            }*/

            //直播中
            Videos.setStatus(GoodsConstants.VIDEO_STATUS.LIVING.statusCode);
            //每个用户分配一个唯一的房间号
            Videos.setRoomCode("qcws" + pVideo.getUserid());
            //视频推流url
            String liveUrl = LiveUrlUtil.getPushUrl(GoodsConstants.BIZ_ID, GoodsConstants.LIVE_KEY, GoodsConstants.BIZ_ID + "_"
                    + Videos.getRoomCode(), GoodsConstants.DEFAULT_LIVE_TIME);
            //视频播放url flv格式
            String playUrl = LiveUrlUtil.getFlvLiveUrl(GoodsConstants.BIZ_ID, GoodsConstants.BIZ_ID + "_"
                    + Videos.getRoomCode());
            if (null == Videos.getId()) {
                Videos.setCreateUserId(pVideo.getUserid());
                int goodsRowNumber = pVideoMapper.insertSelective(Videos);
            } else {
                int goodsRowNumber = pVideoMapper.updateByPrimaryKeySelective(Videos);
            }
            //保存视频信息
            PVideoDetails videoDetails = new PVideoDetails();
            videoDetails.setVideoCode(Videos.getVideoCode());
            videoDetails.setRoomCode(Videos.getRoomCode());
            videoDetails.setPushLiveUrl(liveUrl);
            videoDetails.setPlayLiveUrl(playUrl);
            videoDetails.setCreateUserId(pVideo.getUserid());
            videoDetails.setRealBeginLivetime(getNow());
            pVideoDetailsMapper.insertSelective(videoDetails);

            VideosLiveResponse response = dozer.map(Videos, VideosLiveResponse.class);
            response.setPushLiveUrl(liveUrl);
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-视频开播--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-视频开播--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.ADD_GOODS, GoodsApiCode.getZhMsg(GoodsApiCode.ADD_GOODS));
        }
        log.info("视频模块-视频开播--成功, 返回信息：{}", result);
        return result;
    }
}
