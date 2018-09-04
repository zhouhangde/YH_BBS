package com.wl.dao;

import com.wl.entity.TbBbsanswer;
import java.math.BigDecimal;

public interface TbBbsanswerDao {
    int deleteByPrimaryKey(BigDecimal bbsanswerId);

    int insert(TbBbsanswer record);

    int insertSelective(TbBbsanswer record);

    TbBbsanswer selectByPrimaryKey(BigDecimal bbsanswerId);

    int updateByPrimaryKeySelective(TbBbsanswer record);

    int updateByPrimaryKey(TbBbsanswer record);
}