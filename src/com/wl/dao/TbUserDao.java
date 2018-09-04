package com.wl.dao;

import com.wl.entity.TbUser;
import java.math.BigDecimal;

public interface TbUserDao {
    int deleteByPrimaryKey(BigDecimal userId);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(BigDecimal userId);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}