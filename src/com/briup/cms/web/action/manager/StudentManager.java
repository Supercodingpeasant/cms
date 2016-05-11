package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;

import com.briup.cms.bean.Student;
import com.briup.cms.service.IStudentService;
import com.briup.cms.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class StudentManager extends ActionSupport {

	/**
	 * 添加学生信息
	 */
	private static final long serialVersionUID = 1L;
	private Student student;
	private IStudentService studentService=new StudentServiceImpl();
	@Action(value="addstudent")
	public String addStudent(){
		studentService.add(student);
		return null;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	

}
