package com.idp.web.cash.controller;
import com.idp.web.cash.entity.CashTest;
import com.idp.web.cash.service.CashTestService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;

import net.sf.json.JSONObject;

/**
 * 
 * cashcontroller
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
@Controller
@RequestMapping("/cashTest")
public class CashTestController extends BaseController {

	private Logger logger = Logger.getLogger(CashTestController.class);

	@Resource
	private CashTestService cashTestService;
	
	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "cash/cashTestSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	分页查询
	 * </pre>
	 * 
	 * @param cashTest
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(CashTest cashTest,Page<CashTest> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", cashTestService.findByPage(cashTest, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "cash/cashTestList";
	}

	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/cashTest")
	public String cashTest(String id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				CashTest cashTest = cashTestService.getById(id);
				request.setAttribute("cashTest", cashTest);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "cash/cashTest";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	保存
	 * </pre>
	 * 
	 * @param cashTest
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(CashTest cashTest){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(cashTest.getId())){
				
				cashTestService.update(cashTest);
			}
			// 新增
			else{
				
				cashTestService.add(cashTest);
			}
			json.put("result", "save_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "save_fail");
		}
		
		return json.toString();
	}
	
	/**
	 * 
	 * <pre>
	 * 	2018-04-30 jinjian
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(String id){
		
		JSONObject json = new JSONObject();
		
		try {
			
			cashTestService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
