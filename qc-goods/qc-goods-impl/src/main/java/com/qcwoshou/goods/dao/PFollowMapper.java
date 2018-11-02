package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PFollow;
import com.qcwoshou.goods.model.PFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PFollowMapper {
    int countByExample(PFollowExample example);

    int deleteByExample(PFollowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PFollow record);

    int insertSelective(PFollow record);

    List<PFollow> selectByExample(PFollowExample example);

    PFollow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PFollow record, @Param("example") PFollowExample example);

    int updateByExample(@Param("record") PFollow record, @Param("example") PFollowExample example);

    int updateByPrimaryKeySelective(PFollow record);

    int updateByPrimaryKey(PFollow record);
}