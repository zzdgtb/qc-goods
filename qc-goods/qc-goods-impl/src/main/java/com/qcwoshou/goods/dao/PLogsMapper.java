package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PLogs;
import com.qcwoshou.goods.model.PLogsExample;
import com.qcwoshou.goods.model.PLogsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PLogsMapper {
    int countByExample(PLogsExample example);

    int deleteByExample(PLogsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PLogsWithBLOBs record);

    int insertSelective(PLogsWithBLOBs record);

    List<PLogsWithBLOBs> selectByExampleWithBLOBs(PLogsExample example);

    List<PLogs> selectByExample(PLogsExample example);

    PLogsWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PLogsWithBLOBs record, @Param("example") PLogsExample example);

    int updateByExampleWithBLOBs(@Param("record") PLogsWithBLOBs record, @Param("example") PLogsExample example);

    int updateByExample(@Param("record") PLogs record, @Param("example") PLogsExample example);

    int updateByPrimaryKeySelective(PLogsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PLogsWithBLOBs record);

    int updateByPrimaryKey(PLogs record);
}