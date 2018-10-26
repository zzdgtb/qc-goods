package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PAttrTypeRelation;
import com.qcwoshou.goods.model.PAttrTypeRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PAttrTypeRelationMapper {
    int countByExample(PAttrTypeRelationExample example);

    int deleteByExample(PAttrTypeRelationExample example);

    int insert(PAttrTypeRelation record);

    int insertSelective(PAttrTypeRelation record);

    List<PAttrTypeRelation> selectByExample(PAttrTypeRelationExample example);

    int updateByExampleSelective(@Param("record") PAttrTypeRelation record, @Param("example") PAttrTypeRelationExample example);

    int updateByExample(@Param("record") PAttrTypeRelation record, @Param("example") PAttrTypeRelationExample example);
}