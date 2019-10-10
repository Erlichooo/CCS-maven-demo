package com.gcu.CCS.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.gcu.CCS.pojos.TravelInfo;

public interface TravelInfoDao {
	@Select("select travel_info.*,owners.name ownerName,owners.tel ownerTel from travel_info,owners where owner_id=owners.id")
	public List<TravelInfo> selectAllTravelInfo();
	
	@Select("select travel_info.*,owners.name ownerName,owners.tel ownerTel from travel_info,owners where travel_info.id=#{id} and owner_id=owners.id")
	public TravelInfo selectATravelInfo(Integer id);
	
	/*@Select("")
	public List<TravelInfo> selectTravelInfoInBookInfo(Integer id);*/
	
	@Insert("insert into travel_info(start,end,start_province,end_province,price,owner_id)"
			+ "values(#{start},#{end},#{startProvince},#{endProvince},#{price},#{ownerId})")
	public int addTravelInfo(@ModelAttribute TravelInfo travelInfo);
}
