package com.qcwoshou.goods.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qcwoshou.common.GoodsApiCode;
import com.qcwoshou.common.GoodsConstants;
import com.qcwoshou.common.GoodsUrlUtil;
import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.exception.GoodsException;
import com.qcwoshou.goods.dao.PAttrTypeRelationMapper;
import com.qcwoshou.goods.dao.PGoodsTypeAdsMapper;
import com.qcwoshou.goods.dao.PGoodsTypeManualMapper;
import com.qcwoshou.goods.dao.PGoodsTypeMapper;
import com.qcwoshou.goods.dto.request.GoodsTypeAddRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeAllListRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeListRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeUpdateRequest;
import com.qcwoshou.goods.dto.response.*;
import com.qcwoshou.goods.model.*;
import com.qcwoshou.goods.model.PGoodsTypeExample.Criteria;
import com.qcwoshou.goods.service.IGoodsTypeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/***
 * 
* 功能描述: 商品分类
* @author: xiongkun
* @date: 2017年11月20日 下午3:20:22
 */
@Slf4j
@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService{

	@Autowired
	private PGoodsTypeMapper goodsTypeMapper;
	
	@Autowired
	private PGoodsTypeAdsMapper goodsTypeAdsMapper;
	
	@Autowired
	private PGoodsTypeManualMapper goodsTypeManualMapper;
	
	@Autowired
	private PAttrTypeRelationMapper attrTypeRelationMapper;
	
	@Autowired
	private DozerBeanMapper dozer;
	@Value("${qcws.url}")
	private String aliyuncs;
	
	@Override
	public BaseCommonResult<GoodsTypeListResponse> list(GoodsTypeListRequest req) {
		BaseCommonResult<GoodsTypeListResponse> result = new BaseCommonResult<>();
		log.info("商品分类-获取商品分类列表--开始, 请求信息：{}", req);
		try{
			PageHelper.startPage(req.getPage(), req.getPageSize());
			PGoodsType goodType = new PGoodsType();
			dozer.map(req, goodType);
			PGoodsTypeExample goodsTypeExample = new PGoodsTypeExample();
			Criteria criteria = goodsTypeExample.createCriteria()
					.andPidEqualTo(goodType.getPid())					
					.andIsDeleteEqualTo(new Byte("0"));
			if(StringUtils.isNotBlank(req.getName())){
				criteria.andNameLike("%" + goodType.getName() + "%");
			}
			if(goodType.getLevel() != null ){
				criteria.andLevelEqualTo(goodType.getLevel());
			}
			goodsTypeExample.setOrderByClause(" sort desc");
			List<PGoodsType> list = goodsTypeMapper.selectByExample(goodsTypeExample);
			
			PageInfo<PGoodsType> pageInfo = new PageInfo<PGoodsType>(list);
			GoodsTypeListResponse response = new GoodsTypeListResponse();
			response.setPageInfo(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(),
					pageInfo.getTotal());
			for(PGoodsType gt : list ){
				if(StringUtils.isNotBlank(gt.getIcon())){
					//检查商品分类ICON图片路径是否存在"/"，不存在，则拼接
					gt.setIcon(GoodsUrlUtil.contactUrlAndPath(aliyuncs,gt.getIcon()));
				}
				GoodsTypeResponse goodTypeResponse = dozer.map(gt, GoodsTypeResponse.class);
				response.addT(goodTypeResponse);
			}
			result.setData(response);
		}catch(GoodsException e){
			log.info("商品分类-获取商品分类列表--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}catch(Exception e){
			log.info("商品分类-获取商品分类列表--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}
		log.info("商品分类-获取商品分类列表--结束, 返回信息：{}", result);
		return result;
	}
	
	@Override
	public BaseCommonResult<List<GoodsTypeResponse>> allList(GoodsTypeAllListRequest request) {
		BaseCommonResult<List<GoodsTypeResponse>> result = new BaseCommonResult<>();
		log.info("商品分类-获取商品分类全部列表--开始, 请求信息：{}", request);
		try{
			PGoodsType goodType = new PGoodsType();
			dozer.map(request, goodType);
			PGoodsTypeExample goodsTypeExample = new PGoodsTypeExample();
			goodsTypeExample.createCriteria().andPidEqualTo(goodType.getPid())
				.andIsDeleteEqualTo(new Byte("0"));
			List<PGoodsType> list = goodsTypeMapper.selectByExample(goodsTypeExample);
			
			List<GoodsTypeResponse> responseList = new ArrayList<>();
			for(PGoodsType gt : list ){
				GoodsTypeResponse goodTypeResponse = dozer.map(gt, GoodsTypeResponse.class);
				responseList.add(goodTypeResponse);
			}
			result.setData(responseList);
		}catch(GoodsException e){
			log.info("商品分类-获取商品分类全部列表--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}catch(Exception e){
			log.info("商品分类-获取商品分类全部列表--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}
		log.info("商品分类-获取商品分类全部列表--结束, 返回信息：{}", result);
		return result;
	}
	
	@Override
	public BaseCommonResult<GoodsTypeDetailsResponse> details(Integer id) {
		BaseCommonResult<GoodsTypeDetailsResponse> result = new BaseCommonResult<>();
		log.info("商品分类-获取商品分类列表--开始, 请求信息：{}", id);
		try{
			PGoodsType goodsType = goodsTypeMapper.selectByPrimaryKey(id);
			GoodsTypeDetailsResponse response = dozer.map(goodsType, GoodsTypeDetailsResponse.class);
			response.setImgUrlPrix(aliyuncs);
			if(StringUtils.isNotBlank(response.getIcon())){
				response.setIcon(GoodsUrlUtil.checkValidPath(response.getIcon()));
			}
			//父级分类
			if(goodsType.getPid() != 0){
				PGoodsType parentGoodsType = goodsTypeMapper.selectByPrimaryKey(goodsType.getPid());
				response.setPName(parentGoodsType.getName());
			}
			//分类广告
			PGoodsTypeAdsExample example = new PGoodsTypeAdsExample();
			example.createCriteria().andGoodsTypeIdEqualTo(id);
			List<PGoodsTypeAds> goodsTypeAdsList = goodsTypeAdsMapper.selectByExample(example);			
			List<GoodsTypeAdsResponse> GoodsTypeAdsResponseList = new ArrayList<>();
			for(PGoodsTypeAds goodsTypeAds : goodsTypeAdsList){
				GoodsTypeAdsResponse goodsTypeAdsResponse = dozer.map(goodsTypeAds, GoodsTypeAdsResponse.class);
				//检查商品广告图片路径是否有效，则拼接
				goodsTypeAdsResponse.setImage(GoodsUrlUtil.checkValidPath(goodsTypeAds.getImage()));
				GoodsTypeAdsResponseList.add(goodsTypeAdsResponse);
			}
			response.setGoodsTypeAdsList(GoodsTypeAdsResponseList);
			//关联attr属性
			List<TypeAttrResponse> typeAttrResponseList = goodsTypeManualMapper.selectAttrByGoodsTypeId(id);
			response.setAttrList(typeAttrResponseList);
			
			result.setData(response);
		}catch(GoodsException e){
			log.info("商品分类-获取商品分类列表--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}catch(Exception e){
			log.info("商品分类-获取商品分类列表--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}
		log.info("商品分类-获取商品分类列表--结束, 返回信息：{}", result);
		return result;
	}

	@Transactional
	@Override
	public BaseCommonResult<Void> update(GoodsTypeUpdateRequest request) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品分类-商品分类更新--开始, 请求信息：{}", request);
		try{
			PGoodsType goodsType = new PGoodsType();
			dozer.map(request, goodsType);		
			goodsType.setIsDelete(new Byte("0"));
			goodsType.setAppHome(new Byte("0"));
			
			if(goodsType.getPid() == 0){
				goodsType.setLevel(GoodsConstants.GOODS_TYPE_LEVEL_ONE);
			}else{
				PGoodsType parentGoodsType = goodsTypeMapper.selectByPrimaryKey(goodsType.getPid());
				if(GoodsConstants.GOODS_TYPE_LEVEL_ONE .equals(parentGoodsType.getLevel())){
					goodsType.setLevel(GoodsConstants.GOODS_TYPE_LEVEL_TWO);
				}else if(GoodsConstants.GOODS_TYPE_LEVEL_TWO .equals(parentGoodsType.getLevel())){
					goodsType.setLevel(GoodsConstants.GOODS_TYPE_LEVEL_THREE);
				}
			}
			goodsTypeMapper.updateByPrimaryKey(goodsType);
			//分类广告
			Integer goodsTypeId = request.getId();			
			PGoodsTypeAdsExample example = new PGoodsTypeAdsExample();
			example.createCriteria().andGoodsTypeIdEqualTo(goodsTypeId);
			
			PGoodsTypeAds goodsTypeAds = new PGoodsTypeAds();
			goodsTypeAds.setGoodsTypeId(goodsTypeId);
			if(StringUtils.isNotBlank(request.getAdsImage())){
				goodsTypeAds.setImage(request.getAdsImage());
			}else{
				goodsTypeAds.setImage("");
			}
			
			List<PGoodsTypeAds> TypeList = goodsTypeAdsMapper.selectByExample(example);
			if(TypeList != null && TypeList.size() > 0){
				goodsTypeAdsMapper.updateByExampleSelective(goodsTypeAds, example);
			}else{
				goodsTypeAdsMapper.insertSelective(goodsTypeAds);
			}		
			
			//关联attr属性
			//先删除
			PAttrTypeRelationExample attrExample = new PAttrTypeRelationExample();
			attrExample.createCriteria().andGoodsTypeIdEqualTo(goodsTypeId);
			attrTypeRelationMapper.deleteByExample(attrExample);
			//再新增
			Integer[] attrIds = request.getAttrIds();
			for(Integer attrId :attrIds){
				PAttrTypeRelation attrTypeRelation =  new PAttrTypeRelation();
				attrTypeRelation.setAttrId(attrId);
				attrTypeRelation.setGoodsTypeId(goodsTypeId);
				attrTypeRelationMapper.insert(attrTypeRelation);
			}
			
		}catch(GoodsException e){
			log.info("商品分类-商品分类更新--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品分类-商品分类更新--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.UPDATE_GOODS_TAG,GoodsApiCode.getZhMsg(GoodsApiCode.UPDATE_GOODS_TAG));
		}
		log.info("商品分类-商品分类更新--结束, 返回信息：{}", result);
		return result;
	}

	@Transactional
	@Override
	public BaseCommonResult<Void> add(GoodsTypeAddRequest request) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品分类-商品分类新增--开始, 请求信息：{}", request);
		try{
			PGoodsType goodsType = new PGoodsType();
			dozer.map(request, goodsType);
			goodsType.setIsDelete(new Byte("0"));
			if(goodsType.getPid() == null ||goodsType.getPid() == 0){
				goodsType.setLevel(GoodsConstants.GOODS_TYPE_LEVEL_ONE);
			}else{
				PGoodsType parentGoodsType = goodsTypeMapper.selectByPrimaryKey(goodsType.getPid());
				if(GoodsConstants.GOODS_TYPE_LEVEL_ONE .equals(parentGoodsType.getLevel())){
					goodsType.setLevel(GoodsConstants.GOODS_TYPE_LEVEL_TWO);
				}else if(GoodsConstants.GOODS_TYPE_LEVEL_TWO .equals(parentGoodsType.getLevel())){
					goodsType.setLevel(GoodsConstants.GOODS_TYPE_LEVEL_THREE);
				}
			}
			goodsTypeMapper.insertSelective(goodsType);
			//分类广告
			Integer goodsTypeId = goodsType.getId();
			if(StringUtils.isNotBlank(request.getAdsImage())){
				PGoodsTypeAds goodsTypeAds = new PGoodsTypeAds();
				goodsTypeAds.setImage(request.getAdsImage());
				goodsTypeAds.setGoodsTypeId(goodsTypeId);
				goodsTypeAdsMapper.insertSelective(goodsTypeAds);
			}
			//关联attr属性
			Integer[] attrIds = request.getAttrIds();
			for(Integer attrId :attrIds){
				PAttrTypeRelation attrTypeRelation =  new PAttrTypeRelation();
				attrTypeRelation.setAttrId(attrId);
				attrTypeRelation.setGoodsTypeId(goodsTypeId);
				attrTypeRelationMapper.insert(attrTypeRelation);
			}
		}catch(GoodsException e){
			log.info("商品分类-商品分类新增--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品分类-商品分类新增--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.ADD_GOODS_TAG,GoodsApiCode.getZhMsg(GoodsApiCode.ADD_GOODS_TAG));
		}
		log.info("商品分类-商品分类新增--结束, 返回信息：{}", result);
		return result;
	}

	@Transactional
	@Override
	public BaseCommonResult<Void> delete(Integer id) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品分类-商品分类删除--开始, 请求信息：{}", id);
		try{
			PGoodsType goodsType = new PGoodsType();
			goodsType.setId(id);
			goodsType.setIsDelete(new Byte("1"));
			goodsTypeMapper.updateByPrimaryKeySelective(goodsType);  //逻辑删除
			//分类广告
			Integer goodsTypeId = goodsType.getId();
			PGoodsTypeAds goodsTypeAds = new PGoodsTypeAds();
			goodsTypeAds.setIsDelete(new Byte("1"));	
			PGoodsTypeAdsExample goodsTypeAdsExample = new PGoodsTypeAdsExample();
			goodsTypeAdsExample.createCriteria().andGoodsTypeIdEqualTo(goodsTypeId);			
			goodsTypeAdsMapper.updateByExampleSelective(goodsTypeAds, goodsTypeAdsExample);
			//关联attr属性
			PAttrTypeRelationExample attrTypeRelationExample = new PAttrTypeRelationExample();
			attrTypeRelationExample.createCriteria().andGoodsTypeIdEqualTo(goodsTypeId);
			attrTypeRelationMapper.deleteByExample(attrTypeRelationExample);
		}catch(GoodsException e){
			log.info("商品分类-商品分类删除--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品分类-商品分类删除--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.DELETE_GOODS_TAG,GoodsApiCode.getZhMsg(GoodsApiCode.DELETE_GOODS_TAG));
		}
		log.info("商品分类-商品分类删除--结束, 返回信息：{}", result);
		return result;
	}

	/************************app接口*******************************/
	@Override
	public BaseCommonResult<List<AppGoodsTypeResponse>> appList(Integer pid) {
		BaseCommonResult<List<AppGoodsTypeResponse>> result = new BaseCommonResult<>();
		log.info("商品分类-app获取商品分类列表--开始, 请求信息：{}", pid);
		try{
			List<AppGoodsTypeResponse> allResponseList = new ArrayList<>();
		
			List<AppGoodsTypeResponse> list = getChildType(pid);
			for(AppGoodsTypeResponse response : list){
				//设置子分类
				if(pid != 0){
					List<AppGoodsTypeResponse> childList = getChildType(response.getId());				
//					List<AppGoodsTypeResponse> findChildList = findChildType(response, childList);
//					log.info("商品子分类：{}", JSON.toJSONString(findChildList));
					for(AppGoodsTypeResponse child : childList){ //第三层
						child.setIcon(GoodsUrlUtil.contactUrlAndPath(aliyuncs,child.getIcon()));
					}
					response.setTypeChildList(childList);
				}
				//检查图片路径是否有效，拼接
				response.setIcon(GoodsUrlUtil.contactUrlAndPath(aliyuncs,response.getIcon()));
				//设置分类广告
				PGoodsTypeAdsExample example = new PGoodsTypeAdsExample();
				example.createCriteria()
					.andGoodsTypeIdEqualTo(response.getId())
					.andIsDeleteEqualTo(new Byte("0"));
				List<PGoodsTypeAds> goodsTypeAdsList = goodsTypeAdsMapper.selectByExample(example);	
				for(PGoodsTypeAds goodsTypeAds : goodsTypeAdsList){
					if(StringUtils.isNotBlank(goodsTypeAds.getImage())){
						//检查图片路径是否有效，拼接
						goodsTypeAds.setImage(GoodsUrlUtil.contactUrlAndPath(aliyuncs,goodsTypeAds.getImage()));
					}
				}
				if(goodsTypeAdsList != null && goodsTypeAdsList.size() > 0){
					response.setAdsList(goodsTypeAdsList);
				}
				allResponseList.add(response);
			}
	
			result.setData(allResponseList);
		}catch(GoodsException e){
			log.info("商品分类-app获取商品分类列表--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}catch(Exception e){
			log.info("商品分类-app获取商品分类列表--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_GOODS_LIST,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_GOODS_LIST));
		}
		log.info("商品分类-app获取商品分类列表--结束, 返回信息：{}", JSON.toJSONString(result));
		return result;
	}
	
	/**
	 * 
	* 功能描述: 获取子节点
	* @author: xiongkun
	* @date: 2017年11月24日 上午9:05:36 
	* @param pid
	* @return
	 */
	private List<AppGoodsTypeResponse> getChildType(Integer pid){
		List<AppGoodsTypeResponse> childList = new ArrayList<>();
		PGoodsTypeExample goodsTypeExample = new PGoodsTypeExample();
		goodsTypeExample.createCriteria()
				.andPidEqualTo(pid)
				.andIsDeleteEqualTo(new Byte("0"));		
		goodsTypeExample.setOrderByClause(" sort desc,id asc ");
		List<PGoodsType> list = goodsTypeMapper.selectByExample(goodsTypeExample);
		if(list != null && list.size() > 0){
			
			for(PGoodsType goodsType : list ){
				AppGoodsTypeResponse response = dozer.map(goodsType, AppGoodsTypeResponse.class);
				childList.add(response);
			}
		}
		return childList;
	}
	
	/**
	 * 
	* 功能描述: 设置分类结构
	* @author: xiongkun
	* @date: 2017年11月24日 上午11:44:42 
	* @param root  父节点
	* @param allList   父节点下的子节点
	* @return
	 */
	private List<AppGoodsTypeResponse> findChildType(AppGoodsTypeResponse root, List<AppGoodsTypeResponse> allList){
		List<AppGoodsTypeResponse> childList = new ArrayList<>();
		for (AppGoodsTypeResponse comparedOne : allList) {
			if (comparedOne.getPid() == root.getId()) {
				if(StringUtils.isNotBlank(comparedOne.getIcon())){
					//检查图片路径是否有效，拼接
					comparedOne.setIcon(GoodsUrlUtil.contactUrlAndPath(aliyuncs,comparedOne.getIcon()));
				}
				childList.add(comparedOne);
				root.setTypeChildList(childList);
				List<AppGoodsTypeResponse> childNextList = getChildType(comparedOne.getId());
				if(childNextList !=  null && childNextList.size() > 0){
					findChildType(comparedOne, childNextList);
				}
			}
		}
		return childList;
	}

}
