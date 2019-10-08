package com.gcu.CCS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.CCS.service.BookInfoService;

@Controller
@RequestMapping("/bookInfo")
public class BookInfoController {
	
	@Autowired
	private BookInfoService bookInfoService;
	
	@RequestMapping("/selectBookInfo")
	public String selectBookInfo(Model model,String act) {
		return bookInfoService.selectBookInfo(model, act);
	}
}
