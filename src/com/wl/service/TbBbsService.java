package com.wl.service;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wl.dao.TbBbsDao;
import com.wl.entity.TbBbs;

/**
 * 
 * @author Administrator
 * 
 */
@Service
@Transactional
public class TbBbsService {

	@Resource
	private TbBbsDao tbBbsDao;

	public void insertTbBbs(TbBbs tbBbs) {
		tbBbsDao.insertSelective(tbBbs);
	}
    
	public void updateTbBbs(TbBbs tbBbs) {
		tbBbsDao.updateByPrimaryKey(tbBbs);
	}
	
	public TbBbs queryTbBbsById(BigDecimal bbsId) {
		return tbBbsDao.selectByPrimaryKey(bbsId);
	}
    
	public List<TbBbs> listTbBbs() {
		List<TbBbs> allTbBbs = tbBbsDao.listTbBbs();
        return allTbBbs;
	}
	
	public int deleteTbBbsByid(BigDecimal bbsId) {
		return tbBbsDao.deleteByPrimaryKey(bbsId);
	}
	
	public long getTbBbsCount() {
		long count = tbBbsDao.getTbBbsCount();
        return count;
	}
	
	public List<TbBbs> selectTbBbsByPage(Integer startPos,Integer endPos) {
		List<TbBbs> tbBbsByPage = tbBbsDao.selectTbBbsByPage(startPos,endPos);
        return tbBbsByPage;
	}
	
	public List<TbBbs> SelectTbBbsLike(String TJ,String value) {
		List<TbBbs> TbBbsLike = tbBbsDao.SelectTbBbsLike(TJ, value);
        return TbBbsLike;
	}

	public List<TbBbs> SelectTbBbsOrder(TbBbs tbBbs) {
		List<TbBbs> TbBbsOrder = tbBbsDao.SelectTbBbsOrder(tbBbs);
        return TbBbsOrder;
	}

	
}
