package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PVideoStatistical;
import com.qcwoshou.goods.model.PVideoStatisticalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PVideoStatisticalMapper {
    int countByExample(PVideoStatisticalExample example);

    int deleteByExample(PVideoStatisticalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PVideoStatistical record);

    int insertSelective(PVideoStatistical record);

    List<PVideoStatistical> selectByExample(PVideoStatisticalExample example);

    PVideoStatistical selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PVideoStatistical record, @Param("example") PVideoStatisticalExample example);

    int updateByExample(@Param("record") PVideoStatistical record, @Param("example") PVideoStatisticalExample example);

    int updateByPrimaryKeySelective(PVideoStatistical record);

    int updateByPrimaryKey(PVideoStatistical record);
}