package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PVideoType;
import com.qcwoshou.goods.model.PVideoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PVideoTypeMapper {
    int countByExample(PVideoTypeExample example);

    int deleteByExample(PVideoTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PVideoType record);

    int insertSelective(PVideoType record);

    List<PVideoType> selectByExample(PVideoTypeExample example);

    PVideoType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PVideoType record, @Param("example") PVideoTypeExample example);

    int updateByExample(@Param("record") PVideoType record, @Param("example") PVideoTypeExample example);

    int updateByPrimaryKeySelective(PVideoType record);

    int updateByPrimaryKey(PVideoType record);
}