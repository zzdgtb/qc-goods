package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PCollect;
import com.qcwoshou.goods.model.PCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PCollectMapper {
    int countByExample(PCollectExample example);

    int deleteByExample(PCollectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PCollect record);

    int insertSelective(PCollect record);

    List<PCollect> selectByExample(PCollectExample example);

    PCollect selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PCollect record, @Param("example") PCollectExample example);

    int updateByExample(@Param("record") PCollect record, @Param("example") PCollectExample example);

    int updateByPrimaryKeySelective(PCollect record);

    int updateByPrimaryKey(PCollect record);
}