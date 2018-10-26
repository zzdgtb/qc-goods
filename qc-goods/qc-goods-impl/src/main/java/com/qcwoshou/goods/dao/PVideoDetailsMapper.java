package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PVideoDetails;
import com.qcwoshou.goods.model.PVideoDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PVideoDetailsMapper {
    int countByExample(PVideoDetailsExample example);

    int deleteByExample(PVideoDetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PVideoDetails record);

    int insertSelective(PVideoDetails record);

    List<PVideoDetails> selectByExample(PVideoDetailsExample example);

    PVideoDetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PVideoDetails record, @Param("example") PVideoDetailsExample example);

    int updateByExample(@Param("record") PVideoDetails record, @Param("example") PVideoDetailsExample example);

    int updateByPrimaryKeySelective(PVideoDetails record);

    int updateByPrimaryKey(PVideoDetails record);
}