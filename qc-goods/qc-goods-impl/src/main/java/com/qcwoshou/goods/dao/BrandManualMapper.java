package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.dto.response.AdminBrandInfoResponse;
import com.qcwoshou.goods.dto.response.AdminBrandListResponse;
import com.qcwoshou.goods.model.BrandWithBLOBs;

import java.util.List;

public interface BrandManualMapper {
    
	List<BrandWithBLOBs> selectByGoodsTypeId(Integer goodsTypeId);

	List<AdminBrandListResponse> selectList();

	List<AdminBrandInfoResponse> selectListByGoodsTypeId(Integer goodsTypeId);

}