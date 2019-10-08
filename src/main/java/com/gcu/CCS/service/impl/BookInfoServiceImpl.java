package com.gcu.CCS.service.impl;

import org.springframework.ui.Model;

import com.gcu.CCS.dao.BookInfoDao;
import com.gcu.CCS.service.BookInfoService;

public class BookInfoServiceImpl implements BookInfoService {

	private BookInfoDao bookInfoDao;
	@Override
	public String selectAllBookInfo(Model model, String act) {
		model.addAttribute("bookInfos",bookInfoDao.selectAllBookInfo());
		return "bookInfo/selectBookInfo";
	}

}
