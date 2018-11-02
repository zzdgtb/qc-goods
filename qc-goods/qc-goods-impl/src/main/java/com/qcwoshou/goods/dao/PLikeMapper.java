package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PLike;
import com.qcwoshou.goods.model.PLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PLikeMapper {
    int countByExample(PLikeExample example);

    int deleteByExample(PLikeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PLike record);

    int insertSelective(PLike record);

    List<PLike> selectByExample(PLikeExample example);

    PLike selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PLike record, @Param("example") PLikeExample example);

    int updateByExample(@Param("record") PLike record, @Param("example") PLikeExample example);

    int updateByPrimaryKeySelective(PLike record);

    int updateByPrimaryKey(PLike record);
}