package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	 
	private static final long serialVersionUID = 1L;
	
	/**
	 * 跳转到后台首页
	 * */
	@Action(value="toIndex",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/index.jsp")})
	public String toIndex(){
		
		return "success";
	}
	/**
	 * 跳转到后台添加栏目页面
	 * */
	@Action(value="toAddCategory",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/addcategory.jsp")})
	public String toAddCategory(){
		
		return "success";
	}
	/**
	 * 跳转到后台添加学生页面
	 * */
	@Action(value="toAddStudent",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/addstudent.jsp")})
	public String toAddStudent(){
		
		return "success";
	}
	/**
	 * @author Justin
	 * 跳转到后台栏目管理页面
	 * */
	@Action(value="toCategoryManager",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/categorymanager.jsp")})
	public String toCategoryManager(){
		
		return "success";
	}
	
	

}
