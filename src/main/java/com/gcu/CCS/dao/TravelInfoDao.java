package com.gcu.CCS.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.gcu.CCS.pojos.TravelInfo;

public interface TravelInfoDao {
	@Select("select travel_info.*,owners.name ownerName,owners.tel ownerTel from travel_info,owners where owner_id=owners.id")
	public List<TravelInfo> selectAllTravelInfo();
	
	@Insert("insert into travel_info(address,price,owner_id)"
			+ "values(#{address},#{price},#{ownerId})")
	public int addTravelInfo(TravelInfo travelInfo);
}
