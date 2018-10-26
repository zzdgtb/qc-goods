package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PTypeAttrValue;
import com.qcwoshou.goods.model.PTypeAttrValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PTypeAttrValueMapper {
    int countByExample(PTypeAttrValueExample example);

    int deleteByExample(PTypeAttrValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PTypeAttrValue record);

    int insertSelective(PTypeAttrValue record);

    List<PTypeAttrValue> selectByExample(PTypeAttrValueExample example);

    PTypeAttrValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PTypeAttrValue record, @Param("example") PTypeAttrValueExample example);

    int updateByExample(@Param("record") PTypeAttrValue record, @Param("example") PTypeAttrValueExample example);

    int updateByPrimaryKeySelective(PTypeAttrValue record);

    int updateByPrimaryKey(PTypeAttrValue record);
}