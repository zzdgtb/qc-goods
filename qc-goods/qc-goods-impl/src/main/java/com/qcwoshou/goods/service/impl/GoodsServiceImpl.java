
package com.qcwoshou.goods.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qcwoshou.common.GoodsApiCode;
import com.qcwoshou.common.GoodsConstants;
import com.qcwoshou.common.GoodsUrlUtil;
import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.core.dto.result.BasePage;
import com.qcwoshou.core.dto.result.UserLoginResponse;
import com.qcwoshou.exception.GoodsException;
import com.qcwoshou.fieldpack.annotations.PackTarget;
import com.qcwoshou.goods.dao.*;
import com.qcwoshou.goods.dao.custom.PGoodsStatisticalManualMapper;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.dto.response.*;
import com.qcwoshou.goods.facade.dto.request.GoodsBoughtDRequest;
import com.qcwoshou.goods.facade.dto.request.GoodsBoughtUpdateDRequest;
import com.qcwoshou.goods.facade.dto.request.GoodsDetailsDRequest;
import com.qcwoshou.goods.facade.dto.response.GoodsBoughtDResponse;
import com.qcwoshou.goods.facade.dto.response.GoodsBoughtUpdateDResponse;
import com.qcwoshou.goods.facade.dto.response.GoodsDetailsDResponse;
import com.qcwoshou.goods.model.*;
import com.qcwoshou.goods.service.IGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class GoodsServiceImpl implements IGoodsService {
	
	@Autowired
	private DozerBeanMapper dozer;
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private GoodsManualMapper goodsManualMapper;
	/*@Autowired
	private GoodsSkuMapper goodsSkuMapper;
	@Autowired
	private GoodsSkuModelMapper goodsSkuModelMapper;*/
	@Autowired
	private PGoodsTypeMapper goodsTypeMapper;
	@Autowired
	private PGoodsStatisticalMapper goodsStatisticalMapper;
	@Autowired
	private PGoodsStatisticalManualMapper goodsStatisticalManualMapper;
	@Autowired
	private PGoodsAttrMapper goodsAttrMapper;
	@Autowired
	private PGoodsTagRelationMapper goodsTagRelationMapper;
	@Autowired
	private PTypeAttrMapper attrMapper;	

	@Autowired
	private HttpServletServiceImpl httpServletService;
	
	@Value("${qcws.url}")
	private String aliyuncs;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public BaseCommonResult<GoodsAddResponse> addGoods(GoodsAddRequest request,String loginId) {
		BaseCommonResult<GoodsAddResponse> result = new BaseCommonResult<GoodsAddResponse>();
		log.info("商品信息-新增商品基本信息--开始, 请求信息：{}", request);
		try{
			Goods goods = dozer.map(request, Goods.class);
			goods.setDealNum("qcws"+(new Date().getTime()));
			//设置商品来源、创建人信息
			UserLoginResponse userInfo = null;//UserInfoRedisUtil.getUserCache(loginId);
			if(userInfo!=null){
				goods.setSubmitFrom(new Byte(userInfo.getUserType()));
				goods.setCreateUserId(Integer.parseInt(userInfo.getUserId()));
			}else{
				log.info("商品信息-新增商品基本信息--结束, 信息：{}", GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR));
				throw new GoodsException(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR));
			}
			int goodsRowNumber = goodsMapper.insertSelective(goods);
			if("2".equals(goods.getShelvesType().toString())){
				if(goods.getShelvesDate()==null){
					log.info("商品信息-新增商品基本信息--结束, 信息：{}", GoodsApiCode.getZhMsg(GoodsApiCode.SHELVESDATE_IS_NULL));
					throw new GoodsException(GoodsApiCode.SHELVESDATE_IS_NULL,GoodsApiCode.getZhMsg(GoodsApiCode.SHELVESDATE_IS_NULL));
				}
			}

			GoodsAddResponse response = new GoodsAddResponse();
			response.setId(goods.getId());
			result.setCode(GoodsApiCode.SUCCESS);
			result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
			result.setData(response);
		}catch(GoodsException g){
			log.info("商品信息-新怎商品基本信息--结束, 信息：{}", g);
			throw g;
		}catch(Exception e){
			log.info("商品信息-新增商品基本信息--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.ADD_GOODS,GoodsApiCode.getZhMsg(GoodsApiCode.ADD_GOODS));
		}
		log.info("商品信息-新增商品基本信息--结束, 返回信息：{}", result);
		return result;
	}
	

	@Override
	@Transactional(rollbackFor = Exception.class)
	public BaseCommonResult<Void> updateGoods(GoodsUpdateRequest request) {
		BaseCommonResult<Void> result = new BaseCommonResult<Void>();
		log.info("商品信息-更新商品信息--开始, 请求信息：{}", request);
		try{
			Goods goods = dozer.map(request, Goods.class);
			List<GoodsSkuRequest> goodsSkuRequests = request.getSkuList();
			//检查商品状态信息
			Goods goodsdb = goodsMapper.selectByPrimaryKey(goods.getId());
			if(GoodsConstants.GOODS_IS_ONLIVE_ONE.equals(goodsdb.getIsOnlive())){
				throw new GoodsException(GoodsApiCode.UPDATE_GOODS_IS_ONLIVE_ONE_ERROR,GoodsApiCode.getZhMsg(GoodsApiCode.UPDATE_GOODS_IS_ONLIVE_ONE_ERROR)+"，上架状态:"+goodsdb.getIsOnlive());
			}else{
				//是否提交审核
				if("1".equals(request.getIsSubmit().toString())){
					goods.setPublishWait(GoodsConstants.GOODS_PUBLISH_WAIT_ZERO);
				}else{
					goods.setPublishWait(GoodsConstants.GOODS_PUBLISH_WAIT_THREE);
				}
			}
			if(goodsSkuRequests != null && goodsSkuRequests.size() > 0){
				goods.setCurrentPrice(goodsSkuRequests.get(0).getCurrentPrice());
			}
			
			int goodsRowNumber = goodsMapper.updateByPrimaryKeySelective(goods);

			result.setCode(GoodsApiCode.SUCCESS);
			result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
		}catch(GoodsException g){
			log.info("商品信息-更新商品信息--结束, 信息：{}", g);
			throw g;
		}catch(Exception e){
			log.info("商品信息-更新商品信息--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.UPDATE_GOODS,GoodsApiCode.getZhMsg(GoodsApiCode.UPDATE_GOODS));
		}
		log.info("商品信息-更新商品信息--结束, 返回信息：{}", result);
		return result;
	}


	@Override
    @PackTarget
	public BaseCommonResult<GoodsGetResponse> getGoods(Integer id) {
		BaseCommonResult<GoodsGetResponse> result = new BaseCommonResult<GoodsGetResponse>();
		log.info("商品信息-获取商品信息--开始, 请求信息：{}", id);
		try{
			Goods goods = goodsMapper.selectByPrimaryKey(id);
			if(goods==null){
				log.info("商品信息-获取商品信息--结束, 信息：{}", GoodsApiCode.getZhMsg(GoodsApiCode.GET_GOODS));
				throw new GoodsException(GoodsApiCode.GET_GOODS,GoodsApiCode.getZhMsg(GoodsApiCode.GET_GOODS));
			}
			GoodsGetResponse response = dozer.map(goods, GoodsGetResponse.class);
			response.setImgUrlPrix(aliyuncs);
			//检查商品图片路径是否存在"/"，不存在，则拼接
			response.setImg(GoodsUrlUtil.checkValidPath(goods.getImg()));
			
			//获取sku规格信息、图片信息
			GoodsSkuExample skuExample = new GoodsSkuExample();
			skuExample.createCriteria().andGoodsIdEqualTo(id).andIsDeleteEqualTo(new Byte("0"));
			skuExample.setOrderByClause(" id asc ");

			result.setCode(GoodsApiCode.SUCCESS);
			result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
			result.setData(response);
		}catch(GoodsException g){
			log.info("商品信息-删除商品信息--结束, 信息：{}", g);
			throw g;
		}catch(Exception e){
			log.info("商品信息-获取商品信息--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.GET_GOODS,GoodsApiCode.getZhMsg(GoodsApiCode.GET_GOODS));
		}
		log.info("商品信息-获取商品信息--结束, 返回信息：{}", result);
		return result;
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public BaseCommonResult<Void> deleteGoods(Integer id) {
		BaseCommonResult<Void> result = new BaseCommonResult<Void>();
		log.info("商品信息-删除商品信息--开始, 请求信息：{}", id);
		try{
			Goods goods = goodsMapper.selectByPrimaryKey(id);
			if(GoodsConstants.GOODS_IS_ONLIVE_ONE.equals(goods.getIsOnlive())){
				throw new GoodsException(GoodsApiCode.DELETE_GOODS_IS_ONLIVE_ONE_ERROR,GoodsApiCode.getZhMsg(GoodsApiCode.DELETE_GOODS_IS_ONLIVE_ONE_ERROR)+"，上架状态:"+goods.getIsOnlive());
			}
			goodsManualMapper.deleteGoodsById(id);
			
			result.setCode(GoodsApiCode.SUCCESS);
			result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
		}catch(GoodsException g){
			log.info("商品信息-删除商品信息--结束, 信息：{}", g);
			throw g;
		}catch(Exception e){
			log.info("商品信息-删除商品信息--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.DELETE_GOODS,GoodsApiCode.getZhMsg(GoodsApiCode.DELETE_GOODS));
		}
		log.info("商品信息-删除商信息--结束, 返回信息：{}", result);
		return result;
	}


	@Override
	public BaseCommonResult<GoodsListResponse> list(GoodsListRequest request) {
		BaseCommonResult<GoodsListResponse> result = new BaseCommonResult<>();
		log.info("商品列表-获取商品列表--开始, 请求信息：{}", JSON.toJSONString(request));
		try{
			PageHelper.startPage(request.getPage(), request.getPageSize());
			List<GoodsResponse> list = goodsManualMapper.selectListByCondition(request);
			
			PageInfo<GoodsResponse> pageInfo = new PageInfo<GoodsResponse>(list);
			GoodsListResponse response = new GoodsListResponse();
			response.setPageInfo(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(),
					pageInfo.getTotal());
			for(GoodsResponse goods : list){	
				//主图
				if(StringUtils.isNotBlank(goods.getImg())){
					//检查商品图片路径是否存在"/"，不存在，则拼接
					goods.setImg(GoodsUrlUtil.contactUrlAndPath(aliyuncs,goods.getImg()));
				}
				//总销量
				PGoodsStatistical goodsStatistical = new PGoodsStatistical();
				
				goodsStatistical.setGoodsId(goods.getId());
				Integer buyCountTotal = goodsStatisticalManualMapper.selectBuyCount(goodsStatistical);
				if(buyCountTotal == null){
					buyCountTotal = 0;
				}
				goods.setBuyCountTotal(buyCountTotal);
				response.addT(goods);
			}
			result.setData(response);
		}catch(Exception e){
			log.info("商品列表-获取商品列表--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}
		log.info("商品列表-获取商品列表--结束, 返回信息：{}", JSON.toJSONString(result));
		return result;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public BaseCommonResult<Void> updateGoodsIsOnlive(GoodsIsOnliveUpdateRequest request) {
		BaseCommonResult<Void> result = new BaseCommonResult<Void>();
		log.info("商品信息-更新商品上架状态信息--开始, 请求信息：{}", request);
		try{
			Goods goods = dozer.map(request, Goods.class);
			Goods goodsdb = goodsMapper.selectByPrimaryKey(request.getId());
			if(GoodsConstants.GOODS_IS_ONLIVE_ONE.equals(goods.getIsOnlive())&&"1".equals(goodsdb.getShelvesType().toString())){
				goods.setShelvesDate(new Date());
			}
			int goodsRowNumber = goodsMapper.updateByPrimaryKeySelective(goods);
			result.setCode(GoodsApiCode.SUCCESS);
			result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
		}catch(Exception e){
			log.info("商品信息-更新商品上架状态信息--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.DELETE_GOODS,GoodsApiCode.getZhMsg(GoodsApiCode.DELETE_GOODS));
		}
		log.info("商品信息-更新商品上架状态信息--结束, 返回信息：{}", result);
		return result;
	}

	@Override
	public int updateGoodsShelvesed() {
		return goodsManualMapper.updateGoodsShelvesed();
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public BaseCommonResult<Void> updateGoodsPublishWait(GoodsPublishWaitUpdateRequest request,String loginId) {
		BaseCommonResult<Void> result = new BaseCommonResult<Void>();
		log.info("商品信息-更新商品审核状态信息--开始, 请求信息：{}", request);
		try{
			Goods goods = dozer.map(request, Goods.class);
			if(GoodsConstants.GOODS_PUBLISH_WAIT_ONE.equals(goods.getPublishWait())){
				UserLoginResponse userInfo = null;//UserInfoRedisUtil.getUserCache(loginId);
				if(userInfo!=null){
					goods.setReviewerId(Integer.parseInt(userInfo.getUserId())); 
					goods.setAuditTime(new Date());
					goods.setIsOnlive(GoodsConstants.GOODS_IS_ONLIVE_TWO);
				}else{
					log.info("商品信息-新增商品基本信息--结束, 信息：{}", GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR));
					throw new GoodsException(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LOGIN_USER_ERROR));
				}
			}
			int goodsRowNumber = goodsMapper.updateByPrimaryKeySelective(goods);			
			
			result.setCode(GoodsApiCode.SUCCESS);
			result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS));
		}catch(Exception e){
			log.info("商品信息-更新商品审核状态信息--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.DELETE_GOODS,GoodsApiCode.getZhMsg(GoodsApiCode.DELETE_GOODS));
		}
		log.info("商品信息-更新商品审核状态信息--结束, 返回信息：{}", result);
		return result;
	}
	
	@Override
	public BaseCommonResult<List<GoodsTagRelationResponse>> goodsTagRelation(GoodsTagRelationRequest request) {
		BaseCommonResult<List<GoodsTagRelationResponse>> result = new BaseCommonResult<>();
		log.info("商品标签-商品标签关系--开始, 请求信息：{}", JSON.toJSONString(request));
		try{
			List<GoodsTagRelationResponse> response = goodsManualMapper.selectGoodsTagRelation(request.getGoodsId());
			result.setData(response);
		}catch(GoodsException e){
			log.info("商品标签-商品标签关系--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.GOODS_TAG_RELATION,GoodsApiCode.getZhMsg(GoodsApiCode.GOODS_TAG_RELATION));
		}catch(Exception e){
			log.info("商品标签-商品标签关系--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.GOODS_TAG_RELATION,GoodsApiCode.getZhMsg(GoodsApiCode.GOODS_TAG_RELATION));
		}
		log.info("商品标签-商品标签关系--结束, 返回信息：{}", JSON.toJSONString(result));
		return result;
	}
	
	@Transactional
	@Override
	public BaseCommonResult<Void> goodsBindTag(GoodsBindTagRequest request) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品列表-商品绑定标签--开始, 请求信息：{}", JSON.toJSONString(request));
		try{
			Integer goodsId = request.getGoodsId();
			Integer[] tagIds = request.getTagIds();
			//先删除，再插入
			PGoodsTagRelationExample deleteExample = new PGoodsTagRelationExample();
			deleteExample.createCriteria().andGoodsIdEqualTo(goodsId);
			goodsTagRelationMapper.deleteByExample(deleteExample);
			
			for(Integer tagId : tagIds){
				PGoodsTagRelation relation = new PGoodsTagRelation();
				relation.setGoodsId(goodsId);
				relation.setTagId(tagId);
				goodsTagRelationMapper.insert(relation);
			}
		}catch(GoodsException e){
			log.info("商品列表-商品绑定标签--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.GOODS_BIND_TAG,GoodsApiCode.getZhMsg(GoodsApiCode.GOODS_BIND_TAG));
		}catch(Exception e){
			log.info("商品列表-商品绑定标签--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.GOODS_BIND_TAG,GoodsApiCode.getZhMsg(GoodsApiCode.GOODS_BIND_TAG));
		}
		log.info("商品列表-商品绑定标签--结束, 返回信息：{}", JSON.toJSONString(result));
		return result;
	}

	@Override
	public BaseCommonResult<List<GoodsAttrRelationResponse>> goodsAttrRelation(GoodsAttrRelationRequest request) {
		BaseCommonResult<List<GoodsAttrRelationResponse>> result = new BaseCommonResult<>();
		log.info("商品标签-商品标签属性关系--开始, 请求信息：{}", JSON.toJSONString(request));
		try{
			List<GoodsAttrRelationResponse> responseList = new ArrayList<>();
			Integer goodsId = request.getGoodsId();
			PTypeAttrExample typeAttrExample = new PTypeAttrExample();
			typeAttrExample.createCriteria().andIsDeleteEqualTo(new Byte("0"));
			typeAttrExample.setOrderByClause("sort desc");
			List<PTypeAttr> list = attrMapper.selectByExample(typeAttrExample);
			for(PTypeAttr attr : list){	
				GoodsAttrRelationResponse goodsAttrRelationResponse = dozer.map(attr, GoodsAttrRelationResponse.class);
				//属性值			
				List<TypeAttrValueResponse>  attrValueResponseList = goodsManualMapper.selectGoodsAttrValueRelation(goodsId, attr.getId());
				goodsAttrRelationResponse.setTypeAttrs(attrValueResponseList);
				responseList.add(goodsAttrRelationResponse);
			}
			result.setData(responseList);
		}catch(GoodsException e){
			log.info("商品标签-商品标签属性关系--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.GOODS_ATTR_RELATION,GoodsApiCode.getZhMsg(GoodsApiCode.GOODS_ATTR_RELATION));
		}catch(Exception e){
			log.info("商品标签-商品标签属性关系--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.GOODS_ATTR_RELATION,GoodsApiCode.getZhMsg(GoodsApiCode.GOODS_ATTR_RELATION));
		}
		log.info("商品标签-商品标签属性关系--结束, 返回信息：{}", JSON.toJSONString(result));
		return result;
	}
	
	
	@Transactional
	@Override
	public BaseCommonResult<Void> goodsBindAttr(GoodsBindAttrRequest request) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品列表-商品绑定属性--开始, 请求信息：{}", JSON.toJSONString(request));
		try{
			Integer goodsId = request.getGoodsId();
			List<TypeAttrValueBindRequest> attrValues = request.getAttrValues();
			//先删除，再插入
			PGoodsAttrExample deleteExample = new PGoodsAttrExample();
			deleteExample.createCriteria().andGoodsIdEqualTo(goodsId);
			goodsAttrMapper.deleteByExample(deleteExample);
			
			for(TypeAttrValueBindRequest attrValue : attrValues){
				PGoodsAttr goodsAttr = new PGoodsAttr();
				goodsAttr.setGoodsId(goodsId);
				goodsAttr.setAttributeId(attrValue.getAttributeId());
				goodsAttr.setAttributeValueId(attrValue.getId());
				goodsAttrMapper.insertSelective(goodsAttr);
			}
		}catch(GoodsException e){
			log.info("商品列表-商品绑定属性--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.GOODS_BIND_ATTR,GoodsApiCode.getZhMsg(GoodsApiCode.GOODS_BIND_ATTR));
		}catch(Exception e){
			log.info("商品列表-商品绑定属性--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.GOODS_BIND_ATTR,GoodsApiCode.getZhMsg(GoodsApiCode.GOODS_BIND_ATTR));
		}
		log.info("商品列表-商品绑定属性--结束, 返回信息：{}", JSON.toJSONString(result));
		return result;
	}

	/*******************app接口********************/
	@Override
	public BaseCommonResult<BasePage<AppGoodsListResponse>> appList(AppGoodsListRequest request) {
		BaseCommonResult<BasePage<AppGoodsListResponse>> result = new BaseCommonResult<>();
		log.info("商品列表-app获取商品列表--开始, 请求信息：{}", JSON.toJSONString(request));
		try{
			
			String[] attributeValueIds = null;
			if(request.getAttributeValueId() !=  null){
				attributeValueIds = request.getAttributeValueId().split(",");
			}			
			if(attributeValueIds != null && attributeValueIds.length > 0){				
				Integer[] attributeValueIdArray = new Integer[attributeValueIds.length];
				for(int i = 0; i < attributeValueIds.length; i++){
					attributeValueIdArray[i] = Integer.parseInt(attributeValueIds[i]);
				}
				request.setAttributeValueIdArray(attributeValueIdArray);
			}
			String[] brandIds =null;
			if(request.getBrandId() !=  null){
				brandIds = request.getBrandId().split(",");
			}
			if(brandIds != null && brandIds.length > 0){				
				Integer[] brandIdArray = new Integer[brandIds.length];
				for(int i = 0; i < brandIds.length; i++){
					brandIdArray[i] = Integer.parseInt(brandIds[i]);
				}
				request.setBrandIdArray(brandIdArray);
			}
			
			PageHelper.startPage(request.getPage(), request.getPageSize());
			List<AppGoodsListResponse> list = goodsManualMapper.selectAppListByCondition(request);
			
			PageInfo<AppGoodsListResponse> pageInfo = new PageInfo<AppGoodsListResponse>(list);
			BasePage<AppGoodsListResponse> response = new BasePage<>();
			response.setPageInfo(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(),
					pageInfo.getTotal());
			for(AppGoodsListResponse goods : list){	
				Integer goodsId = goods.getId();
				//主图全路径
				if(StringUtils.isNotBlank(goods.getImg())){
					//检查商品图片路径是否存在"/"，不存在，则拼接
					goods.setImg(GoodsUrlUtil.contactUrlAndPath(aliyuncs,goods.getImg()));
				}
				//顶级分类ID
				PGoodsType goodsType = getParentType(goods.getGoodsTypeId());
				goods.setFirstGoodsTypeId(goodsType.getId());
				//总销量
				PGoodsStatistical goodsStatistical = new PGoodsStatistical();
				goodsStatistical.setGoodsId(goods.getId());
				Integer buyCountTotal = goodsStatisticalManualMapper.selectBuyCount(goodsStatistical);
				if(buyCountTotal == null){
					buyCountTotal = 0;
				}
				goods.setBuyCountTotal(buyCountTotal);		
				String goodsIdString = goodsId + "";
				goodsIdString = goodsIdString.substring(goodsIdString.length() - 1);
				Integer buyCountMax = GoodsConstants.TEN + buyCountTotal + Integer.parseInt(goodsIdString);
				goods.setBuyCountMax(buyCountMax);
				//sku
				List<AppGoodsSkuResponse> skuResponseList = new ArrayList<>();
				GoodsSkuExample skuExample = new GoodsSkuExample();
				skuExample.createCriteria().andIsDeleteEqualTo(new Byte("0"))
					.andGoodsIdEqualTo(goods.getId());
				
				response.addT(goods);
			}
			result.setData(response);
		}catch(GoodsException e){
			log.info("商品列表-app获取商品列表--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}catch(Exception e){
			log.info("商品列表-app获取商品列表--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}
		log.info("商品列表-app获取商品列表--结束, 返回信息：{}", JSON.toJSONString(result));
		return result;
	}
	
	/**
	 * @Author zhouzhiming
	 * @Description 获取子节点
	 * @Date 10:22 2018/10/24
	 * @Param [id]
	 * @return com.qcwoshou.goods.model.PGoodsType
	 **/
	public PGoodsType getParentType(Integer id){
		PGoodsType PGoodsType = goodsTypeMapper.selectByPrimaryKey(id);
		if(PGoodsType.getPid() != 0){
			PGoodsType = getParentType(PGoodsType.getPid());
		}
		return PGoodsType;
	}

	@Override
	@PackTarget
	public BaseCommonResult<AppGoodsDetailsResponse> appGoodsDetails(AppGoodsDetailsRequest request) {
		return null;
	}

	@Override
	public BaseCommonResult<BasePage<AppGoodsListResponse>> appSearchList(AppGoodsSearchListRequest request) {
		return null;
	}


	@Override
	public BaseCommonResult<BasePage<AppGoodsListResponse>> appHomeNewList(AppGoodsHomeNewListRequest request) {
		BaseCommonResult<BasePage<AppGoodsListResponse>> result = new BaseCommonResult<>();
		log.info("商品列表-app首页新商品列表--开始, 请求信息：{}", JSON.toJSONString(request));
		try{
			PageHelper.startPage(request.getPage(), request.getPageSize());
			List<AppGoodsListResponse> list = goodsManualMapper.selectAppHomeNewListByCondition(request);
			
			PageInfo<AppGoodsListResponse> pageInfo = new PageInfo<AppGoodsListResponse>(list);
			BasePage<AppGoodsListResponse> response = new BasePage<>();
			response.setPageInfo(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(),
					pageInfo.getTotal());
			for(AppGoodsListResponse goods : list){	
				Integer goodsId = goods.getId();
				//主图全路径
				if(StringUtils.isNotBlank(goods.getImg())){
					//检查商品图片路径是否存在"/"，不存在，则拼接
					goods.setImg(GoodsUrlUtil.contactUrlAndPath(aliyuncs,goods.getImg()));
				}

				//总销量
				PGoodsStatistical goodsStatistical = new PGoodsStatistical();
				goodsStatistical.setGoodsId(goods.getId());
				Integer buyCountTotal = goodsStatisticalManualMapper.selectBuyCount(goodsStatistical);
				if(buyCountTotal == null){
					buyCountTotal = 0;
				}
				goods.setBuyCountTotal(buyCountTotal);				
				String goodsIdString = goodsId + "";
				goodsIdString = goodsIdString.substring(goodsIdString.length() - 1);
				Integer buyCountMax = GoodsConstants.TEN + buyCountTotal + Integer.parseInt(goodsIdString);
				goods.setBuyCountMax(buyCountMax);
				response.addT(goods);
			}
			result.setData(response);
		}catch(GoodsException e){
			log.info("商品列表-app首页新商品列表--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}catch(Exception e){
			log.info("商品列表-app首页新商品列表--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}
		log.info("商品列表-app首页新商品列表--结束, 返回信息：{}", JSON.toJSONString(result));
		return result;
	}


    @Override
    public BaseCommonResult<GoodsDetailsDResponse> getGoodsDetailsByIdAndSkuNumber(GoodsDetailsDRequest request) {
        return null;
    }

	@Override
	public BaseCommonResult<GoodsBoughtDResponse> getGoodsBought(GoodsBoughtDRequest request) {
		//目前量不大，暂时直接操作数据库
		BaseCommonResult<GoodsBoughtDResponse> result = new BaseCommonResult<>();
		GoodsBoughtDResponse response = new GoodsBoughtDResponse();
		GoodsSku goodsSku = goodsManualMapper.selectGoodsStockByGoodsIdAndSkuNumber(request.getGoodsId(),request.getSkuNumber());
		if(goodsSku == null ){
			throw new GoodsException(GoodsApiCode.GET_GOODS, GoodsApiCode.getZhMsg(GoodsApiCode.GET_GOODS));
		}
		response.setGoodsId(goodsSku.getGoodsId());
		response.setSkuNumber(goodsSku.getSkuNumber());
		response.setStock(goodsSku.getBought());
		result.setData(response);
		return result;
	}

	@Override
	public BaseCommonResult<GoodsBoughtUpdateDResponse> updateGoodsBought(GoodsBoughtUpdateDRequest request) {
		BaseCommonResult<GoodsBoughtUpdateDResponse> result = new BaseCommonResult<>();
		String skuNumber = request.getSkuNumber();
		Integer goodsId = request.getGoodsId();
		GoodsSkuExample goodsSkuExample = new GoodsSkuExample();
		goodsSkuExample.createCriteria().andSkuNumberEqualTo(skuNumber).andGoodsIdEqualTo(goodsId);

		return result;
	}

	@Override
	public BaseCommonResult<GoodsExportResponse> exportList(GoodsExportRequest request) {
		return null;
	}


	@Override
	public BaseCommonResult<List<GoodsExportQueryResponse>> getExportList(GoodsExportQueryRequest request) {
		BaseCommonResult<List<GoodsExportQueryResponse>> result = new BaseCommonResult<>();
		try{
			PageHelper.startPage(request.getPage(), request.getPageSize());
			List<GoodsExportQueryResponse> queryList = goodsManualMapper.selectExportList(request);
			PageInfo<GoodsExportQueryResponse> pageInfo = new PageInfo<GoodsExportQueryResponse>(queryList);
//			List<GoodsExportQueryResponse> responseList = pageInfo.getList();
			
			
			for(GoodsExportQueryResponse response : queryList){
				Integer pid = response.getPid();
				//分类
				PGoodsType goodsType2 = goodsTypeMapper.selectByPrimaryKey(pid);
				if(goodsType2 != null){
					response.setSecondGoodsTypeName(goodsType2.getName());	
					PGoodsType goodsType1 = goodsTypeMapper.selectByPrimaryKey(goodsType2.getPid());
					if(goodsType1 != null){
						response.setFirstGoodsTypeName(goodsType1.getName());
					}
				}						
				response.setThirdGoodsTypeName(response.getGoodsTypeName());
				//状态
				if("0".equals(response.getPublishWait())){
					response.setPublishWait("等待审核");
				}else if("1".equals(response.getPublishWait())){
					response.setPublishWait("审核通过");
				}else if("2".equals(response.getPublishWait())){
					response.setPublishWait("审核不通过");
				}else if("3".equals(response.getPublishWait())){
					response.setPublishWait("草稿");
				}
				//是否可使用积分
				if("0".equals(response.getUseScore())){
					response.setUseScore("否");
				}else if("1".equals(response.getUseScore())){
					response.setUseScore("是");
				}

				//是否需要实名认证
				if("0".equals(response.getIsRealName())){
					response.setIsRealName("否");
				}else if("1".equals(response.getIsRealName())){
					response.setIsRealName("是");
				}
			}
			result.setData(queryList);
		}catch (Exception e) {
			log.info("商品导出异常：" + e);
			throw new GoodsException(GoodsApiCode.GOODS_EXPORT_ERROR, GoodsApiCode.getZhMsg(GoodsApiCode.GOODS_EXPORT_ERROR));
		}		
		return result;
	}

}
