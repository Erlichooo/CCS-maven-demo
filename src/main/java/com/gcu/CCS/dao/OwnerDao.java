package com.gcu.CCS.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.gcu.CCS.pojos.Owner;

public interface OwnerDao {
	
	@Select("select * from owners where username = #{username}")
	public List<Owner> matchOwner(Owner owner);
	
	@Select("select * from owners where username =  #{username} and password = #{password}")//#{name对应的值}
	public List<Owner> login(Owner owner);
}
