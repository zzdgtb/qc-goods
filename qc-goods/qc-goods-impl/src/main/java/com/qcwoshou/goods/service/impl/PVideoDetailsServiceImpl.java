package com.qcwoshou.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qcwoshou.common.GoodsApiCode;
import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.exception.GoodsException;
import com.qcwoshou.goods.dao.*;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;
import com.qcwoshou.goods.model.*;
import com.qcwoshou.goods.service.IPVideoDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName IPVideoDetailsServiceImpl
 * @Author wh
 * @Date 2018/11/1
 * @Version 1.0.0
 */
@Service
@Slf4j
public class PVideoDetailsServiceImpl implements IPVideoDetailsService {
    @Autowired
    private DozerBeanMapper dozer;

    @Autowired
    private PVideoDetailsMapper pVideoDetailsMapper;

    @Autowired
    private PTransmitMapper pTransmitMapper;

    @Autowired
    private PFollowMapper pFollowMapper;

    @Autowired
    private PLikeMapper pLikeMapper;

    @Autowired
    private PCollectMapper pCollectMapper;

    @Override
    public BaseCommonResult<VideoDetailsViewResponse> view(VideoDetailsViewRequest video) {
        BaseCommonResult<VideoDetailsViewResponse> result = new BaseCommonResult<VideoDetailsViewResponse>();
        log.info("视频模块-查看视频详情--开始, 请求信息：{}", video);
        try {
            PVideoDetailsExample pe = new PVideoDetailsExample();
            PVideoDetailsExample.Criteria criteria = pe.createCriteria().andVideoCodeEqualTo(video.getVideoCode());

            List<PVideoDetails> videoDetails = pVideoDetailsMapper.selectByExample(pe);

            if (null == videoDetails || videoDetails.size() != 1) {
                throw new GoodsException(GoodsApiCode.VEDIOS_DETAIL_VIEW_TOO_MANY_RESULTS, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_DETAIL_VIEW_TOO_MANY_RESULTS));
            }

            VideoDetailsViewResponse response = dozer.map(videoDetails.get(0), VideoDetailsViewResponse.class);
            //尚未结束直播返回直播地址
            if (videoDetails.get(0).getIsEndLive() == 0) {
                response.setPlayUrl(videoDetails.get(0).getPlayLiveUrl());
            }
            //直播结束返回回放地址
            if (videoDetails.get(0).getIsEndLive() == 1) {
                response.setPlayUrl(videoDetails.get(0).getPlayRecordUrl());
            }
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-查看视频详情--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-查看视频详情--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_DETAIL_VIEW_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_DETAIL_VIEW_FAIL));
        }
        log.info("视频模块-查看视频详情--成功, 返回信息：{}", result);
        return result;

    }

    @Override
    public BaseCommonResult<VideoDetailsTransmitResponse> transmit(VideoDetailsTransmitRequest video) {
        BaseCommonResult<VideoDetailsTransmitResponse> result = new BaseCommonResult<VideoDetailsTransmitResponse>();
        log.info("视频模块-转发/分享视频信息--开始, 请求信息：{}", video);
        try {
            PTransmit pTransmit = new PTransmit();
            pTransmit.setUserId(video.getUserId().longValue());
            pTransmit.setDestination(video.getDestination());
            pTransmit.setTransmitCode(video.getVideoCode());
            pTransmit.setTransmitType(new Byte("1"));
            pTransmitMapper.insertSelective(pTransmit);

            VideoDetailsTransmitResponse response = new VideoDetailsTransmitResponse();
            response.setVideoCode(video.getVideoCode());
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-转发/分享视频信息--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-转发/分享视频信息--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_DETAIL_TRANSMIT_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_DETAIL_TRANSMIT_FAIL));
        }
        log.info("视频模块-转发/分享视频信息--成功, 返回信息：{}", result);
        return result;
    }


    @Override
    public BaseCommonResult<VideoDetailsFollowResponse> follow(VideoDetailsFollowRequest video) {
        BaseCommonResult<VideoDetailsFollowResponse> result = new BaseCommonResult<VideoDetailsFollowResponse>();
        log.info("视频模块-用户关注视频--开始, 请求信息：{}", video);
        try {
            PFollow pFollow = new PFollow();
            pFollow.setUserId(video.getUserId().longValue());
            pFollow.setVideoCode(video.getVideoCode());
            pFollow.setCreateBy(video.getUserId().longValue());
            pFollowMapper.insertSelective(pFollow);

            VideoDetailsFollowResponse response = new VideoDetailsFollowResponse();
            response.setVideoCode(video.getVideoCode());
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-用户关注视频--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-用户关注视频--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_DETAIL_FOLLOW_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_DETAIL_FOLLOW_FAIL));
        }
        log.info("视频模块-用户关注视频--成功, 返回信息：{}", result);
        return result;
    }
    @Override
    public BaseCommonResult like(VideoDetailsLikeRequest video) {
        BaseCommonResult result = new BaseCommonResult();
        log.info("视频模块-用户点赞视频--开始, 请求信息：{}", video);
        try {
            PLike pLike = new PLike();
            pLike.setUserId(video.getUserId().longValue());
            pLike.setVideoCode(video.getVideoCode());
            pLike.setCreateBy(video.getUserId().longValue());
            pLikeMapper.insertSelective(pLike);

            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));

        } catch (GoodsException g) {
            log.info("视频模块-用户点赞视频--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-用户点赞视频--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_DETAIL_LIKE_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_DETAIL_LIKE_FAIL));
        }
        log.info("视频模块-用户点赞视频--成功, 返回信息：{}", result);
        return result;
    }

    @Override
    public BaseCommonResult collect(VideoDetailsCollectRequest video) {
        BaseCommonResult result = new BaseCommonResult();
        log.info("视频模块-用户收藏视频--开始, 请求信息：{}", video);
        try {
            PCollect pCollect = new PCollect();
            pCollect.setUserId(video.getUserId().longValue());
            pCollect.setVideoCode(video.getVideoCode());
            pCollect.setCreateBy(video.getUserId().longValue());
            pCollectMapper.insertSelective(pCollect);

            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));

        } catch (GoodsException g) {
            log.info("视频模块-用户收藏视频--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-用户收藏视频--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_DETAIL_COLLECT_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_DETAIL_COLLECT_FAIL));
        }
        log.info("视频模块-用户收藏视频--成功, 返回信息：{}", result);
        return result;
    }

    @Override
    public BaseCommonResult<VideosCollectListResponse> collectlist(VideosCollectListRequest video) {
        BaseCommonResult<VideosCollectListResponse> result = new BaseCommonResult<VideosCollectListResponse>();
        log.info("视频模块-获取用户视频收藏列表--开始, 请求信息：{}", video);
        try {
            PageHelper.startPage(video.getPage(), video.getPageSize());
            List<VideoDetailsResponse> list = pVideoDetailsMapper.getCollectVideoList(video);
            VideosCollectListResponse response = new VideosCollectListResponse();
            response.setList(list);
            PageInfo<VideoDetailsResponse> pageInfo = new PageInfo<VideoDetailsResponse>(list);
            response.setPageInfo(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(),
                    pageInfo.getTotal());
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-获取用户视频收藏列表--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-获取用户视频收藏列表--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_DETAIL_COLLECT_LIST_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_DETAIL_COLLECT_LIST_FAIL));
        }
        log.info("视频模块-获取用户视频收藏列表--成功, 返回信息：{}", result);
        return result;
    }

    @Override
    public BaseCommonResult<VideosListResponse> list(VideosListRequest video) {
        BaseCommonResult<VideosListResponse> result = new BaseCommonResult<VideosListResponse>();
        log.info("视频模块-获取我的视频列表失败--开始, 请求信息：{}", video);
        try {
            PageHelper.startPage(video.getPage(), video.getPageSize());
            List<VideoDetailsResponse> list = pVideoDetailsMapper.getVideoList(video);
            VideosListResponse response = new VideosListResponse();
            response.setList(list);
            PageInfo<VideoDetailsResponse> pageInfo = new PageInfo<VideoDetailsResponse>(list);
            response.setPageInfo(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(),
                    pageInfo.getTotal());
            result.setCode(GoodsApiCode.SUCCESS);
            result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
            result.setData(response);
        } catch (GoodsException g) {
            log.info("视频模块-获取我的视频列表失败--失败, 信息：{}", g);
            throw g;
        } catch (Exception e) {
            log.info("视频模块-获取我的视频列表失败--失败, 信息：{}", e);
            throw new GoodsException(GoodsApiCode.VEDIOS_DETAIL_LIST_FAIL, GoodsApiCode.getZhMsg(GoodsApiCode.VEDIOS_DETAIL_LIST_FAIL));
        }
        log.info("视频模块-获取我的视频列表失败--成功, 返回信息：{}", result);
        return result;
    }
}
