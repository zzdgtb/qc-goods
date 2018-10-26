package com.qcwoshou.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qcwoshou.common.GoodsApiCode;
import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.exception.GoodsException;
import com.qcwoshou.goods.dao.PGoodsTagMapper;
import com.qcwoshou.goods.dto.request.GoodsTagAddRequest;
import com.qcwoshou.goods.dto.request.GoodsTagAllListRequest;
import com.qcwoshou.goods.dto.request.GoodsTagListRequest;
import com.qcwoshou.goods.dto.request.GoodsTagUpdateRequest;
import com.qcwoshou.goods.dto.response.GoodsTagAllListResponse;
import com.qcwoshou.goods.dto.response.GoodsTagDetailsResponse;
import com.qcwoshou.goods.dto.response.GoodsTagListResponse;
import com.qcwoshou.goods.dto.response.GoodsTagResponse;
import com.qcwoshou.goods.model.PGoodsTag;
import com.qcwoshou.goods.model.PGoodsTagExample;
import com.qcwoshou.goods.model.PGoodsTagExample.Criteria;
import com.qcwoshou.goods.service.IGoodsTagService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/***
 * 
* 功能描述: 商品标签
* @author: xiongkun
* @date: 2017年11月20日 下午3:20:22
 */
@Slf4j
@Service
public class GoodsTagServiceImpl implements IGoodsTagService{

	@Autowired
	private PGoodsTagMapper goodsTagMapper;
	
	@Autowired
	private DozerBeanMapper dozer;
	
	@Override
	public BaseCommonResult<GoodsTagListResponse> list(GoodsTagListRequest req) {
		BaseCommonResult<GoodsTagListResponse> result = new BaseCommonResult<>();
		log.info("商品标签-获取商品标签列表--开始, 请求信息：{}", req);
		try{
			PageHelper.startPage(req.getPage(), req.getPageSize());
			PGoodsTag goodTag = new PGoodsTag();
			dozer.map(req, goodTag);
			PGoodsTagExample goodsTagExample = new PGoodsTagExample();
			Criteria criteria = goodsTagExample.createCriteria();
			if(StringUtils.isNotBlank(goodTag.getTagName())){
				criteria.andTagNameLike("%" + goodTag.getTagName() + "%");
			}
			criteria.andIsDeleteEqualTo(new Byte("0"));
			List<PGoodsTag> list = goodsTagMapper.selectByExample(goodsTagExample);
			
			PageInfo<PGoodsTag> pageInfo = new PageInfo<PGoodsTag>(list);
			GoodsTagListResponse response = new GoodsTagListResponse();
			response.setPageInfo(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(),
					pageInfo.getTotal());
			for(PGoodsTag gt : list){
				GoodsTagResponse goodTagResponse = dozer.map(gt, GoodsTagResponse.class);
				response.addT(goodTagResponse);
			}
			result.setData(response);
		}catch(GoodsException e){
			log.info("商品标签-获取商品标签列表--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_TAG_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_TAG_LIST));
		}catch(Exception e){
			log.info("商品标签-获取商品标签列表--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_TAG_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_TAG_LIST));
		}
		log.info("商品标签-获取商品标签列表--结束, 返回信息：{}", result);
		return result;
	}
	
	@Override
	public BaseCommonResult<List<GoodsTagAllListResponse>> allList(GoodsTagAllListRequest req) {
		BaseCommonResult<List<GoodsTagAllListResponse>> result = new BaseCommonResult<>();
		log.info("商品标签-获取所有商品标签列表--开始, 请求信息：{}", req);
		try{
			PGoodsTag goodTag = new PGoodsTag();
			dozer.map(req, goodTag);
			PGoodsTagExample goodsTagExample = new PGoodsTagExample();
			Criteria criteria = goodsTagExample.createCriteria();
			criteria.andIsDeleteEqualTo(new Byte("0"));
			List<PGoodsTag> list = goodsTagMapper.selectByExample(goodsTagExample);
			
			List<GoodsTagAllListResponse> tagResponseList = new ArrayList<>();
			
			for(PGoodsTag gt : list){
				GoodsTagAllListResponse goodTagResponse = dozer.map(gt, GoodsTagAllListResponse.class);
				tagResponseList.add(goodTagResponse);
			}
			result.setData(tagResponseList);
		}catch(GoodsException e){
			log.info("商品标签-获取所有商品标签列表--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_TAG_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_TAG_LIST));
		}catch(Exception e){
			log.info("商品标签-获取所有商品标签列表--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_TAG_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_TAG_LIST));
		}
		log.info("商品标签-获取所有商品标签列表--结束, 返回信息：{}", result);
		return result;
	}

	@Override
	public BaseCommonResult<GoodsTagDetailsResponse> details(Integer id) {
		BaseCommonResult<GoodsTagDetailsResponse> result = new BaseCommonResult<>();
		log.info("商品标签-获取商品标签详情--开始, 请求信息：{}", id);
		try{
			PGoodsTag goodsTag = goodsTagMapper.selectByPrimaryKey(id.longValue());
			GoodsTagDetailsResponse response = dozer.map(goodsTag, GoodsTagDetailsResponse.class);
			result.setData(response);
		}catch(GoodsException e){
			log.info("商品标签-获取商品标签详情--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品标签-获取商品标签详情--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_TAG_DETAILS,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_TAG_DETAILS));
		}
		log.info("商品标签-获取商品标签详情--结束, 返回信息：{}", result);
		return result;
	}

	@Override
	public BaseCommonResult<Void> update(GoodsTagUpdateRequest request) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品标签-商品标签更新--开始, 请求信息：{}", request);
		try{
			PGoodsTag goodsTag = new PGoodsTag();
			dozer.map(request, goodsTag);
			Integer currentTime = new Long(System.currentTimeMillis()/1000).intValue();
			goodsTag.setUpdateTime(currentTime);
			
			goodsTagMapper.updateByPrimaryKeySelective(goodsTag);
			
		}catch(GoodsException e){
			log.info("商品标签-商品标签更新--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品标签-商品标签更新--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.UPDATE_GOODS_TAG,GoodsApiCode.getZhMsg(GoodsApiCode.UPDATE_GOODS_TAG));
		}
		log.info("商品标签-商品标签更新--结束, 返回信息：{}", result);
		return result;
	}

	@Override
	public BaseCommonResult<Void> add(GoodsTagAddRequest request) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品标签-商品标签新增--开始, 请求信息：{}", request);
		try{
			PGoodsTag goodsTag = new PGoodsTag();
			dozer.map(request, goodsTag);
			Integer currentTime = new Long(System.currentTimeMillis()/1000).intValue();
			goodsTag.setAddTime(currentTime);
			goodsTag.setIsDelete(new Byte("0"));
			goodsTag.setUpdateTime(currentTime);
			goodsTagMapper.insert(goodsTag);
			
		}catch(GoodsException e){
			log.info("商品标签-商品标签新增--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品标签-商品标签新增--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.ADD_GOODS_TAG,GoodsApiCode.getZhMsg(GoodsApiCode.ADD_GOODS_TAG));
		}
		log.info("商品标签-商品标签新增--结束, 返回信息：{}", result);
		return result;
	}

	@Override
	public BaseCommonResult<Void> delete(Integer id) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品标签-商品标签删除--开始, 请求信息：{}", id);
		try{
			PGoodsTag goodsTag = new PGoodsTag();
			goodsTag.setId(id.longValue());
			Integer currentTime = new Long(System.currentTimeMillis()/1000).intValue();
			goodsTag.setUpdateTime(currentTime);
			goodsTag.setIsDelete(new Byte("1"));
			goodsTagMapper.updateByPrimaryKeySelective(goodsTag);
			
		}catch(GoodsException e){
			log.info("商品标签-商品标签删除--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品标签-商品标签删除--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.DELETE_GOODS_TAG,GoodsApiCode.getZhMsg(GoodsApiCode.DELETE_GOODS_TAG));
		}
		log.info("商品标签-商品标签删除--结束, 返回信息：{}", result);
		return result;
	}

	
}
