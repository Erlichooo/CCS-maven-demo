package com.gcu.CCS.service;

import org.springframework.ui.Model;

import com.gcu.CCS.pojos.TravelInfo;

public interface TravelInfoService {
	public String selectTravelInfo(Model model, String act);
	public String addTravelInfo(TravelInfo travelInfo);
}
