package com.idp.web.cash.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * cash实体类.
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
public class CashTest extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private String id;
	/**name*/
	private String name;
	/**age*/
	private Integer age;
	/**birthday*/
	private Date birthday;
	/**deptId*/
	private String deptId;
	/**sex*/
	private String sex;
	/**hobby*/
	private String hobby;
	/**remark*/
	private String remark;
	/**remark2*/
	private String remark2;
	
	/**age开始*/
	private Integer ageStart;
	/**age结束*/
	private Integer ageEnd;
	/**birthday开始*/
	private Date birthdayStart;
	/**birthday结束*/
	private Date birthdayEnd;
	
	/**
	 *方法: 取得String
	 *@return: String  id
	 */
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置String
	 *@param: String  id
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置String
	 *@param: String  name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  age
	 */
	public Integer getAge(){
		return this.age;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  age
	 */
	public void setAge(Integer age){
		this.age = age;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  birthday
	 */
	public Date getBirthday(){
		return this.birthday;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  birthday
	 */
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  deptId
	 */
	public String getDeptId(){
		return this.deptId;
	}

	/**
	 *方法: 设置String
	 *@param: String  deptId
	 */
	public void setDeptId(String deptId){
		this.deptId = deptId;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  sex
	 */
	public String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置String
	 *@param: String  sex
	 */
	public void setSex(String sex){
		this.sex = sex;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  hobby
	 */
	public String getHobby(){
		return this.hobby;
	}

	/**
	 *方法: 设置String
	 *@param: String  hobby
	 */
	public void setHobby(String hobby){
		this.hobby = hobby;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  remark
	 */
	public String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置String
	 *@param: String  remark
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  remark2
	 */
	public String getRemark2(){
		return this.remark2;
	}

	/**
	 *方法: 设置String
	 *@param: String  remark2
	 */
	public void setRemark2(String remark2){
		this.remark2 = remark2;
	}
	
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  age开始
	 */
	public Integer getAgeStart(){
		return this.ageStart;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  age开始
	 */
	public void setAgeStart(Integer ageStart){
		this.ageStart = ageStart;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  age结束
	 */
	public Integer getAgeEnd(){
		return this.ageEnd;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  age结束
	 */
	public void setAgeEnd(Integer ageEnd){
		this.ageEnd = ageEnd;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  birthday开始
	 */
	public Date getBirthdayStart(){
		return this.birthdayStart;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  birthday开始
	 */
	public void setBirthdayStart(Date birthdayStart){
		this.birthdayStart = birthdayStart;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  birthday结束
	 */
	public Date getBirthdayEnd(){
		return this.birthdayEnd;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  birthday结束
	 */
	public void setBirthdayEnd(Date birthdayEnd){
		this.birthdayEnd = birthdayEnd;
	}
	
}
