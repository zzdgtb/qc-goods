package com.qcwoshou.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qcwoshou.common.GoodsApiCode;
import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.exception.GoodsException;
import com.qcwoshou.goods.dao.PTypeAttrValueMapper;
import com.qcwoshou.goods.dto.request.TypeAttrValueAddRequest;
import com.qcwoshou.goods.dto.request.TypeAttrValueListRequest;
import com.qcwoshou.goods.dto.request.TypeAttrValueUpdateRequest;
import com.qcwoshou.goods.dto.response.TypeAttrValueDetailsResponse;
import com.qcwoshou.goods.dto.response.TypeAttrValueListResponse;
import com.qcwoshou.goods.dto.response.TypeAttrValueResponse;
import com.qcwoshou.goods.model.PTypeAttrValue;
import com.qcwoshou.goods.model.PTypeAttrValueExample;
import com.qcwoshou.goods.service.ITypeAttrValueService;
import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * 
* 功能描述: 商品属性值
* @author: xiongkun
* @date: 2017年11月20日 下午3:20:22
 */
@Slf4j
@Service
public class TypeAttrValueServiceImpl implements ITypeAttrValueService{

	@Autowired
	private PTypeAttrValueMapper typeAttrValueMapper;
	
	@Autowired
	private DozerBeanMapper dozer;
	
	@Override
	public BaseCommonResult<TypeAttrValueListResponse> list(TypeAttrValueListRequest req) {
		BaseCommonResult<TypeAttrValueListResponse> result = new BaseCommonResult<>();
		log.info("商品属性值-获取商品属性值列表--开始, 请求信息：{}", req);
		try{
			PageHelper.startPage(req.getPage(), req.getPageSize());
			PTypeAttrValue typeAttrValue = new PTypeAttrValue();
			dozer.map(req, typeAttrValue);
			PTypeAttrValueExample typeAttrValueExample = new PTypeAttrValueExample();
			typeAttrValueExample.createCriteria().andAttributeIdEqualTo(typeAttrValue.getAttributeId()).andIsDeleteEqualTo(new Byte("0"));
			typeAttrValueExample.setOrderByClause("sort desc");
			List<PTypeAttrValue> list = typeAttrValueMapper.selectByExample(typeAttrValueExample);
			
			PageInfo<PTypeAttrValue> pageInfo = new PageInfo<PTypeAttrValue>(list);
			TypeAttrValueListResponse response = new TypeAttrValueListResponse();
			response.setPageInfo(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(),
					pageInfo.getTotal());
			for(PTypeAttrValue gt : list){
				TypeAttrValueResponse typeAttrValueResponse = dozer.map(gt, TypeAttrValueResponse.class);
				response.addT(typeAttrValueResponse);
			}
			result.setData(response);
		}catch(GoodsException e){
			log.info("商品属性值-获取商品属性值列表--结束, 信息：{}", e.getMessage());
			throw new GoodsException(GoodsApiCode.QUERY_ATTR_VALUE,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_ATTR_VALUE));
		}catch(Exception e){
			log.info("商品属性值-获取商品属性值列表--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_ATTR_VALUE,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_ATTR_VALUE));
		}
		log.info("商品属性值-获取商品属性值列表--结束, 返回信息：{}", result);
		return result;
	}

	@Override
	public BaseCommonResult<TypeAttrValueDetailsResponse> details(Integer id) {
		BaseCommonResult<TypeAttrValueDetailsResponse> result = new BaseCommonResult<>();
		log.info("商品属性值-获取商品属性值详情--开始, 请求信息：{}", id);
		try{
			PTypeAttrValue typeAttrValue = typeAttrValueMapper.selectByPrimaryKey(id);
			TypeAttrValueDetailsResponse response = dozer.map(typeAttrValue, TypeAttrValueDetailsResponse.class);
			result.setData(response);
		}catch(GoodsException e){
			log.info("商品属性值-获取商品属性值详情--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品属性值-获取商品属性值详情--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.QUERY_ATTR_VALUE,GoodsApiCode.getZhMsg(GoodsApiCode.QUERY_ATTR_VALUE));
		}
		log.info("商品属性值-获取商品属性值详情--结束, 返回信息：{}", result);
		return result;
	}

	@Override
	public BaseCommonResult<Void> update(TypeAttrValueUpdateRequest request) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品属性值-商品属性值更新--开始, 请求信息：{}", request);
		try{
			PTypeAttrValue typeAttrValue = new PTypeAttrValue();
			dozer.map(request, typeAttrValue);
			typeAttrValueMapper.updateByPrimaryKeySelective(typeAttrValue);
			
		}catch(GoodsException e){
			log.info("商品属性值-商品属性值更新--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品属性值-商品属性值更新--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.UPDATE_ATTR,GoodsApiCode.getZhMsg(GoodsApiCode.UPDATE_ATTR));
		}
		log.info("商品属性值-商品属性值更新--结束, 返回信息：{}", result);
		return result;
	}

	@Override
	public BaseCommonResult<Void> add(TypeAttrValueAddRequest request) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品属性值-商品属性值新增--开始, 请求信息：{}", request);
		try{
			PTypeAttrValue typeAttrValue = new PTypeAttrValue();
			dozer.map(request, typeAttrValue);
			typeAttrValue.setIsDelete(new Byte("0"));
			typeAttrValueMapper.insertSelective(typeAttrValue);
			
		}catch(GoodsException e){
			log.info("商品属性值-商品属性值新增--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品属性值-商品属性值新增--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.ADD_ATTR_VALUE,GoodsApiCode.getZhMsg(GoodsApiCode.ADD_ATTR_VALUE));
		}
		log.info("商品属性值-商品属性值新增--结束, 返回信息：{}", result);
		return result;
	}

	@Override
	public BaseCommonResult<Void> delete(Integer id) {
		BaseCommonResult<Void> result = new BaseCommonResult<>();
		log.info("商品属性值-商品属性值删除--开始, 请求信息：{}", id);
		try{
			PTypeAttrValue typeAttrValue = new PTypeAttrValue();
			typeAttrValue.setId(id);
			typeAttrValue.setIsDelete(new Byte("1"));
			typeAttrValueMapper.updateByPrimaryKeySelective(typeAttrValue);
			
		}catch(GoodsException e){
			log.info("商品属性值-商品属性值删除--结束, 信息：{}", e.getMessage());
			throw new GoodsException(e.getResponseCode(), e.getResponseMsg());
		}catch(Exception e){
			log.info("商品属性值-商品属性值删除--结束, 信息：{}", e);
			throw new GoodsException(GoodsApiCode.DELETE_ATTR_VALUE,GoodsApiCode.getZhMsg(GoodsApiCode.DELETE_ATTR_VALUE));
		}
		log.info("商品属性值-商品属性值删除--结束, 返回信息：{}", result);
		return result;
	}
}
