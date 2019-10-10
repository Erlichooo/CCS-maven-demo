package com.gcu.CCS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.CCS.service.TravelInfoService;

@Controller
@RequestMapping("/travelInfo")
public class TravelInfoController {
	@Autowired
	private TravelInfoService travelInfoService;
	@RequestMapping("/selectTravelInfo")
	public String selectTravelInfo(Model model,String act) {
		return travelInfoService.selectTravelInfo(model, act);
	}
	@RequestMapping("/selectATravelInfo")
	public String selectATravelInfo(Model model,Integer id) {
		return travelInfoService.selectATravelInfo(model, id);
	}
}
