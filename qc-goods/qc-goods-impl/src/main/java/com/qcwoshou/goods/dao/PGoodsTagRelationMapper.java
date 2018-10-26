package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PGoodsTagRelation;
import com.qcwoshou.goods.model.PGoodsTagRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PGoodsTagRelationMapper {
    int countByExample(PGoodsTagRelationExample example);

    int deleteByExample(PGoodsTagRelationExample example);

    int insert(PGoodsTagRelation record);

    int insertSelective(PGoodsTagRelation record);

    List<PGoodsTagRelation> selectByExample(PGoodsTagRelationExample example);

    int updateByExampleSelective(@Param("record") PGoodsTagRelation record, @Param("example") PGoodsTagRelationExample example);

    int updateByExample(@Param("record") PGoodsTagRelation record, @Param("example") PGoodsTagRelationExample example);
}