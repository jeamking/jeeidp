package com.idp.web.cash.service.impl;
import com.idp.web.cash.service.CashTestService;
import com.idp.web.cash.dao.CashTestDao;
import com.idp.web.cash.entity.CashTest;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.common.util.ResourceUtils;

/**
 * 
 * cashservice实现类
 * 
 * <pre>
 * 	历史记录：
 * 	2018-04-30 jinjian
 * 	新建文件
 * </pre>
 * 
 * @author 
 * <pre>
 * SD
 * 	jinjian
 * PG
 *	jinjian
 * UT
 *
 * MA
 * </pre>
 * @version $Rev$
 *
 * <p/> $Id$
 *
 */
@Service("cashTestService")
public class CashTestServiceImpl implements CashTestService {

	@Resource
	private CashTestDao cashTestDao;
	
	@Override
	public Page<CashTest> findByPage(CashTest cashTest, Page<CashTest> page) {

		page.setResult(cashTestDao.find(cashTest, page));
		
		return page;
	}
	
	@Override
	public List<CashTest> findBySearch(CashTest cashTest) {

		return cashTestDao.find(cashTest);
	}
	
	@Override
	public CashTest getById(String id) {

		return cashTestDao.getById(id);
	}

	@Override
	public void add(CashTest cashTest) {

		cashTest.setId(ResourceUtils.getUUID());
		cashTestDao.add(cashTest);
	}
	
	@Override
	public void update(CashTest cashTest) {

		cashTestDao.update(cashTest);
	}

	@Override
	public void delete(String id) {

		cashTestDao.delete(id);
	}
 	
}