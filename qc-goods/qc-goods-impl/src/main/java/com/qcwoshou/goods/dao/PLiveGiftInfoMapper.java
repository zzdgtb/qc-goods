package com.qcwoshou.goods.dao;

import com.qcwoshou.goods.model.PLiveGiftInfo;
import com.qcwoshou.goods.model.PLiveGiftInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PLiveGiftInfoMapper {
    int countByExample(PLiveGiftInfoExample example);

    int deleteByExample(PLiveGiftInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PLiveGiftInfo record);

    int insertSelective(PLiveGiftInfo record);

    List<PLiveGiftInfo> selectByExample(PLiveGiftInfoExample example);

    PLiveGiftInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PLiveGiftInfo record, @Param("example") PLiveGiftInfoExample example);

    int updateByExample(@Param("record") PLiveGiftInfo record, @Param("example") PLiveGiftInfoExample example);

    int updateByPrimaryKeySelective(PLiveGiftInfo record);

    int updateByPrimaryKey(PLiveGiftInfo record);
}