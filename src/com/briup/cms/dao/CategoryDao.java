package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.briup.cms.bean.Category;
import com.briup.cms.common.ConnectionFactory;

/**
 * 关于栏目信息为数据库交互的类
 * 增删改查，不涉及业务逻辑处理
 * @author Justin
 * */

public class CategoryDao {
	/**
	 * 向category对象中的栏目信息保存到数据库栏目中
	 * @param 栏目对象
	 * */
	public void save(Category category){
		try {
			Connection conn=null;
			PreparedStatement pstmt=null;
			try{
				//获取连接
				conn=ConnectionFactory.getConn();
				String sql="insert into t_category(name,code) values(?,?)";
				//预处理sql
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, category.getName());
				pstmt.setString(2, category.getCode());
				//执行sql
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 查看所有栏目信息
	 * @param 包含栏目信息的集合
	 * */
	public List<Category> findAll(){
		return null;
	}
}
