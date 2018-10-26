package com.qcwoshou.goods.service.impl;

import com.qcwoshou.common.GoodsApiCode;
import com.qcwoshou.core.common.constants.Constants;
import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.exception.GoodsException;
import com.qcwoshou.goods.dao.PGoodsStatisticalMapper;
import com.qcwoshou.goods.dao.custom.PGoodsStatisticalManualMapper;
import com.qcwoshou.goods.facade.dto.request.GoodsStatisticalUpdateRequest;
import com.qcwoshou.goods.model.PGoodsStatistical;
import com.qcwoshou.goods.service.IGoodsStatisticalService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 
* 商品统计信息操作实现类
* @author wenwj 
* @date: 2017年12月23日 下午2:26:59 
* @version 1.4.0
*
 */
@Service
@Slf4j
public class GoodsStatisticalServiceImpl implements IGoodsStatisticalService {

	@Autowired
	private DozerBeanMapper dozer;
	@Autowired
	private PGoodsStatisticalMapper pgoodsStatisticalMapper;
	@Autowired
	private PGoodsStatisticalManualMapper goodsStatisticalManualMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public BaseCommonResult<Void> updateGoodsStatistical(List<GoodsStatisticalUpdateRequest> request) {
		BaseCommonResult<Void> result = new BaseCommonResult<Void>();
		if(request==null||request.isEmpty()){
			log.info("更新商品统计信息（下单量、销量）信息--异常：请求参数列表为空");
			throw new GoodsException(GoodsApiCode.UPDATE_GOODS_STATISTICAL_ERROR,GoodsApiCode.getZhMsg(GoodsApiCode.UPDATE_GOODS_STATISTICAL_ERROR));
		}
		String responseMsg = "";
		//校验待更新商品SKU信息书否符合要求
		for (GoodsStatisticalUpdateRequest goodsStatisticalUpdateRequest : request) {
			String requestCheckMsg = goodsStatisticalUpdateRequest.check();
			if(StringUtils.isNotBlank(requestCheckMsg)){
				responseMsg = responseMsg+";"+requestCheckMsg;
				break;
			}
		}
		if(StringUtils.isNotBlank(responseMsg)){
			log.info("更新商品统计信息（下单量、销量）信息--异常：请求参数异常：{}",responseMsg);
			throw new GoodsException(GoodsApiCode.UPDATE_GOODS_STATISTICAL_ERROR,responseMsg);
		}
		//检查数据库是否存在该记录，存在则加入待批量更新列表，不存在，则加入待批量插入列表
		List<PGoodsStatistical> addBatchList = new ArrayList<PGoodsStatistical>();
		List<PGoodsStatistical> updateBatchList = new ArrayList<PGoodsStatistical>();
		for (GoodsStatisticalUpdateRequest gs : request) {
			//待入库实体类
			PGoodsStatistical goodsStatistical = dozer.map(gs, PGoodsStatistical.class);
			if(Constants.CONSTANT_STR_ONE.equals(gs.getType().toString())){//下单量
				goodsStatistical.setUserCount(gs.getCount());
				goodsStatistical.setBuyCount(0);
			}else{//销量
				goodsStatistical.setUserCount(0);
				goodsStatistical.setBuyCount(gs.getCount());
			}
			
			PGoodsStatistical pgsdb = pgoodsStatisticalMapper.selectByPrimaryKey(gs.getSkuNumber());
			if(pgsdb!=null){
				updateBatchList.add(goodsStatistical);
			}else{
				addBatchList.add(goodsStatistical);
			}
		}
		//不为空，则批量新增
		int addBatchNumber = 0;
		if(!addBatchList.isEmpty()){
			addBatchNumber = goodsStatisticalManualMapper.insertByBatch(addBatchList);
		}
		//不为空，则批量更新
		int updateBatchNumber = 0;
		if(!updateBatchList.isEmpty()){
			updateBatchNumber = goodsStatisticalManualMapper.updateByBatch(updateBatchList);
		}
		result.setCode(GoodsApiCode.SUCCESS);
		result.setMsg(GoodsApiCode.getZhMsg(GoodsApiCode.SUCCESS)+"，新增记录条数："+addBatchNumber+",更新记录条数："+updateBatchNumber);
		return result;
	}

}
