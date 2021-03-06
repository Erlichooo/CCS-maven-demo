package com.gcu.CCS.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.CCS.BaseTest;
import com.gcu.CCS.pojos.TravelInfo;

public class TravelInfoDaoTest extends BaseTest{
	@Autowired
	private TravelInfoDao travelInfoDao;
	
	@Test
	public void selectTravelInfo() {
		List<TravelInfo> travelInfos=travelInfoDao.selectAllTravelInfo();
		if (travelInfos==null) {
			System.out.println("nothing");
		}else {
			System.out.println(travelInfos.get(0).toString());
		}
	}
	
	@Test
	public void selectATravelInfo() {
		TravelInfo travelInfo=travelInfoDao.selectATravelInfo(3);
		System.out.println(travelInfo.toString());
	}
	
	@Test
	public void addTravelInfo() {
		TravelInfo travelInfo=new TravelInfo(0, null, null, null, "大剧院", "华广", "深圳", "广州", 30.5, 1);
		int addRows=travelInfoDao.addTravelInfo(travelInfo);
		System.out.println(addRows);
	}
	
	public static void main(String[] args) {
		TravelInfoDaoTest test=new TravelInfoDaoTest();
		/*test.addTravelInfo();*/
		test.selectTravelInfo();
		test.selectATravelInfo();
	}
}
