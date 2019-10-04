package com.gcu.CCS.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.gcu.CCS.pojos.User;

import junit.framework.Test;

public interface UserDao {
	@Insert("insert into users(username,password)"
			+ "values(#{username},#{password})")
	public int register(User user);
	
	@Select("select * from users where username = #{username}")
	public List<User> matchUser(User user);
	
	@Select("select * from users where username =  #{username} and password = #{password}")//#{name对应的值}
	public List<User> login(User user);
	
	@Select("select * from users")
	public List<User> Test();
	/*public int update(User user);*/
}
