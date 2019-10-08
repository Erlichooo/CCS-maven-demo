package com.gcu.CCS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.gcu.CCS.dao.TravelInfoDao;
import com.gcu.CCS.pojos.TravelInfo;
import com.gcu.CCS.service.TravelInfoService;

public class TravelInfoServiceImpl implements TravelInfoService {
	
	@Autowired
	private TravelInfoDao travelInfoDao;
	@Override
	public String selectTravelInfo(Model model,String act) {
		model.addAttribute("travelInfos",travelInfoDao.selectAllTravelInfo());
		return "travelInfo/selectTravelInfo";
	}
	@Override
	public String addTravelInfo(TravelInfo travelInfo) {
		travelInfoDao.addTravelInfo(travelInfo);
		return "travelInfo/addTravelInfo";
	}

}
