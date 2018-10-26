package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PGoodsStatistical;
import com.qcwoshou.goods.model.PGoodsStatisticalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PGoodsStatisticalMapper {
    int countByExample(PGoodsStatisticalExample example);

    int deleteByExample(PGoodsStatisticalExample example);

    int deleteByPrimaryKey(String skuNumber);

    int insert(PGoodsStatistical record);

    int insertSelective(PGoodsStatistical record);

    List<PGoodsStatistical> selectByExample(PGoodsStatisticalExample example);

    PGoodsStatistical selectByPrimaryKey(String skuNumber);

    int updateByExampleSelective(@Param("record") PGoodsStatistical record, @Param("example") PGoodsStatisticalExample example);

    int updateByExample(@Param("record") PGoodsStatistical record, @Param("example") PGoodsStatisticalExample example);

    int updateByPrimaryKeySelective(PGoodsStatistical record);

    int updateByPrimaryKey(PGoodsStatistical record);
}