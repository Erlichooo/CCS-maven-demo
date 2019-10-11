package com.gcu.CCS.service;

import org.springframework.ui.Model;

import com.gcu.CCS.pojos.TravelInfo;

public interface TravelInfoService {
	public String selectTravelInfo(Model model, String act);
	public String selectATravelInfo(Model model, Integer id);
	public String selectTravelInfoByOwnerId(Model model,Integer id);
	public String addTravelInfo(TravelInfo travelInfo);
}
