package com.blog.dao;

import org.apache.ibatis.annotations.Param;

import com.blog.entity.Blogger;

/**
 * 博主
 * @author Administrator
 *
 */
public interface BloggerDao {

	public Blogger getByUserName(@Param("userName")String userName);
	
}
