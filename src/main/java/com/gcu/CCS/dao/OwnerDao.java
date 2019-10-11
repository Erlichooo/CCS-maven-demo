package com.gcu.CCS.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.gcu.CCS.pojos.Owner;

public interface OwnerDao {
	@Insert("insert into owners(username,password)"
			+ "values(#{username},#{password})")
	public int register(Owner owner);
	
	@Select("select * from owners where username = #{username}")
	public List<Owner> matchOwner(@ModelAttribute Owner owner);
	
	@Select("select * from owners where username =  #{username} and password = #{password}")//#{name对应的值}
	public List<Owner> login(@ModelAttribute Owner owner);
}
