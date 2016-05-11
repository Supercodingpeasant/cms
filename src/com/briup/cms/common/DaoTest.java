package com.briup.cms.common;

import com.briup.cms.bean.Category;
import com.briup.cms.dao.CategoryDao;

 
public class DaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryDao dao=new CategoryDao();
		dao.save(new Category(null,"张三","1234"));
		System.out.println("success!");
	}

}
