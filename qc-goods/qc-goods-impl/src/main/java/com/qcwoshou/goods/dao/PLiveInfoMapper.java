package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PLiveInfo;
import com.qcwoshou.goods.model.PLiveInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PLiveInfoMapper {
    int countByExample(PLiveInfoExample example);

    int deleteByExample(PLiveInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PLiveInfo record);

    int insertSelective(PLiveInfo record);

    List<PLiveInfo> selectByExample(PLiveInfoExample example);

    PLiveInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PLiveInfo record, @Param("example") PLiveInfoExample example);

    int updateByExample(@Param("record") PLiveInfo record, @Param("example") PLiveInfoExample example);

    int updateByPrimaryKeySelective(PLiveInfo record);

    int updateByPrimaryKey(PLiveInfo record);
}