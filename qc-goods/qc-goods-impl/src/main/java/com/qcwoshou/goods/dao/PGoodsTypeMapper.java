package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PGoodsType;
import com.qcwoshou.goods.model.PGoodsTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PGoodsTypeMapper {
    int countByExample(PGoodsTypeExample example);

    int deleteByExample(PGoodsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PGoodsType record);

    int insertSelective(PGoodsType record);

    List<PGoodsType> selectByExample(PGoodsTypeExample example);

    PGoodsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PGoodsType record, @Param("example") PGoodsTypeExample example);

    int updateByExample(@Param("record") PGoodsType record, @Param("example") PGoodsTypeExample example);

    int updateByPrimaryKeySelective(PGoodsType record);

    int updateByPrimaryKey(PGoodsType record);
}