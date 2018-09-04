package com.wl.dao;

import com.wl.entity.TbBbs;
import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbBbsDao {
    int deleteByPrimaryKey(BigDecimal bbsId);

    int insert(TbBbs record);

    int insertSelective(TbBbs record);

    TbBbs selectByPrimaryKey(BigDecimal bbsId);

    int updateByPrimaryKeySelective(TbBbs record);

    int updateByPrimaryKey(TbBbs record);
    
    List<TbBbs> listTbBbs();
    
    public List<TbBbs> selectTbBbsByPage(@Param("startPos") Integer startPos,@Param("endPos") Integer endPos);
     
    /**
     * 用户总数
     */
    public long getTbBbsCount();
    
    public List<TbBbs> SelectTbBbsLike(@Param("TJ") String TJ,@Param("value") String value);

	List<TbBbs> SelectTbBbsOrder(TbBbs record);
}