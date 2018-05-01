package com.idp.web.cash.service;
import com.idp.web.cash.entity.CashTest;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * cashservice接口
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
public interface CashTestService{
	
 	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	分页查询
	 * </pre>
	 * 
	 * @param cashTest
	 * @param page
	 * @return
	 */
	public Page<CashTest> findByPage(CashTest cashTest,Page<CashTest> page);
	
	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	查询
	 * </pre>
	 * 
	 * @param cashTest
	 * @return
	 */
	public List<CashTest> findBySearch(CashTest cashTest);
	
	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param CashTest
	 * @return
	 */
	public CashTest getById(String id);
	
	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	新增
	 * </pre>
	 * 
	 * @param cashTest
	 */
	public void add(CashTest cashTest);
	
	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	修改
	 * </pre>
	 * 
	 * @param cashTest
	 */
	public void update(CashTest cashTest);
	
	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(String id);
}
