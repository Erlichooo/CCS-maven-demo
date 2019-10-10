package com.gcu.CCS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.gcu.CCS.dao.TravelInfoDao;
import com.gcu.CCS.pojos.TravelInfo;
import com.gcu.CCS.service.TravelInfoService;

@Service("travelInfoService")
@Transactional//使用注解配置事务
public class TravelInfoServiceImpl implements TravelInfoService {
	
	@Autowired
	private TravelInfoDao travelInfoDao;
	@Override
	public String selectTravelInfo(Model model,String act) {
		model.addAttribute("travelInfos",travelInfoDao.selectAllTravelInfo());
		return "travelInfo/selectTravelInfo";
	}	
	@Override
	public String selectATravelInfo(Model model, Integer id) {
		model.addAttribute("travelInfo",travelInfoDao.selectATravelInfo(id));
		return "travelInfo/selectATravelInfo";
	}
	@Override
	public String addTravelInfo(TravelInfo travelInfo) {
		travelInfoDao.addTravelInfo(travelInfo);
		return "travelInfo/addTravelInfo";
	}

}
