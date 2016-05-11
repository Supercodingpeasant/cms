package com.briup.cms.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 跳转到首页
	 * */
	@Action(value="toIndex",results={
			@Result(name="success",location="/WEB-INF/jsp/index.jsp")})
	public String toIndex(){
		
		return "success";
	}
	/**
	 * 跳转到栏目页
	 * */
	@Action(value="toList",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/list.jsp")})
	public String toList(){
		
		return "success";
	}
	/**
	 * 跳转到内容页
	 * */
	@Action(value="toContent",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/content.jsp")})
	public String toContent(){
		
		return "success";
	}
}
