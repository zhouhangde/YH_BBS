package com.wl.dao;

import com.wl.entity.TbBoard;
import java.math.BigDecimal;

public interface TbBoardDao {
    int deleteByPrimaryKey(BigDecimal boardId);

    int insert(TbBoard record);

    int insertSelective(TbBoard record);

    TbBoard selectByPrimaryKey(BigDecimal boardId);

    int updateByPrimaryKeySelective(TbBoard record);

    int updateByPrimaryKey(TbBoard record);
}