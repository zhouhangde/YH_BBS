package com.wl.dao;

import com.wl.entity.TbClass;
import java.math.BigDecimal;

public interface TbClassDao {
    int deleteByPrimaryKey(BigDecimal classId);

    int insert(TbClass record);

    int insertSelective(TbClass record);

    TbClass selectByPrimaryKey(BigDecimal classId);

    int updateByPrimaryKeySelective(TbClass record);

    int updateByPrimaryKey(TbClass record);
}