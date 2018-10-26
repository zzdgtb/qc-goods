package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PGoodsAttr;
import com.qcwoshou.goods.model.PGoodsAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PGoodsAttrMapper {
    int countByExample(PGoodsAttrExample example);

    int deleteByExample(PGoodsAttrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PGoodsAttr record);

    int insertSelective(PGoodsAttr record);

    List<PGoodsAttr> selectByExample(PGoodsAttrExample example);

    PGoodsAttr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PGoodsAttr record, @Param("example") PGoodsAttrExample example);

    int updateByExample(@Param("record") PGoodsAttr record, @Param("example") PGoodsAttrExample example);

    int updateByPrimaryKeySelective(PGoodsAttr record);

    int updateByPrimaryKey(PGoodsAttr record);
}