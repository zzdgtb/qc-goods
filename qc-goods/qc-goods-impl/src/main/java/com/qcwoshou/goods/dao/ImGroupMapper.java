package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.ImGroup;
import com.qcwoshou.goods.model.ImGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImGroupMapper {
    int countByExample(ImGroupExample example);

    int deleteByExample(ImGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImGroup record);

    int insertSelective(ImGroup record);

    List<ImGroup> selectByExample(ImGroupExample example);

    ImGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImGroup record, @Param("example") ImGroupExample example);

    int updateByExample(@Param("record") ImGroup record, @Param("example") ImGroupExample example);

    int updateByPrimaryKeySelective(ImGroup record);

    int updateByPrimaryKey(ImGroup record);
}