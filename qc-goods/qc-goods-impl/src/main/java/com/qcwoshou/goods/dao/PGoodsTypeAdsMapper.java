package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PGoodsTypeAds;
import com.qcwoshou.goods.model.PGoodsTypeAdsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PGoodsTypeAdsMapper {
    int countByExample(PGoodsTypeAdsExample example);

    int deleteByExample(PGoodsTypeAdsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PGoodsTypeAds record);

    int insertSelective(PGoodsTypeAds record);

    List<PGoodsTypeAds> selectByExample(PGoodsTypeAdsExample example);

    PGoodsTypeAds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PGoodsTypeAds record, @Param("example") PGoodsTypeAdsExample example);

    int updateByExample(@Param("record") PGoodsTypeAds record, @Param("example") PGoodsTypeAdsExample example);

    int updateByPrimaryKeySelective(PGoodsTypeAds record);

    int updateByPrimaryKey(PGoodsTypeAds record);
}