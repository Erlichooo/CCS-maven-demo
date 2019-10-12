package com.gcu.CCS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gcu.CCS.pojos.TravelInfo;
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
	@RequestMapping("/selectTravelInfoById")
	public String selectBookInfo(Model model,Integer id) {
		return travelInfoService.selectTravelInfoByOwnerId(model, id);
	}
	@RequestMapping("/selectATravelInfo")
	public String selectATravelInfo(Model model,Integer id) {
		return travelInfoService.selectATravelInfo(model, id);
	}
	@RequestMapping("/addTravelInfo")
	@ResponseBody
	public String addTravelInfo(@ModelAttribute TravelInfo travelInfo) {
		return travelInfoService.addTravelInfo(travelInfo);
	}
	
	@RequestMapping("/toAddTravelInfo")
	public String toAddBookInfo() {
		return travelInfoService.toAddTravelInfo();
	}
}
