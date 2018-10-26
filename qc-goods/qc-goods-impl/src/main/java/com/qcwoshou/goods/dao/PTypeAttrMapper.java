package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PTypeAttr;
import com.qcwoshou.goods.model.PTypeAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PTypeAttrMapper {
    int countByExample(PTypeAttrExample example);

    int deleteByExample(PTypeAttrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PTypeAttr record);

    int insertSelective(PTypeAttr record);

    List<PTypeAttr> selectByExample(PTypeAttrExample example);

    PTypeAttr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PTypeAttr record, @Param("example") PTypeAttrExample example);

    int updateByExample(@Param("record") PTypeAttr record, @Param("example") PTypeAttrExample example);

    int updateByPrimaryKeySelective(PTypeAttr record);

    int updateByPrimaryKey(PTypeAttr record);
}