package com.gcu.CCS.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.gcu.CCS.pojos.TravelInfo;

public interface TravelInfoDao {
	@Select("select * from travel_info")
	public List<TravelInfo> selectAllTravelInfo();
	
	@Insert("insert into travel_info(address,price,owner_id)"
			+ "values(#{address},#{price},#{owner_id})")
	public int addTravelInfo(TravelInfo travelInfo);
}
