package com.briup.cms.bean;

public class Student {
	private long id;
	private String name;
	private String dept;
	public Student(){
		
	}
	public Student(long id, String name,String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
