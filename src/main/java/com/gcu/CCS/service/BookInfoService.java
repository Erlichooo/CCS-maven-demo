package com.gcu.CCS.service;

import org.springframework.ui.Model;

import com.gcu.CCS.pojos.BookInfo;

public interface BookInfoService {
	public String selectBookInfo(Model model,String act);
	public String addBookInfo(BookInfo bookInfo);
	public String selectBookInfoByUserId(Model model,Integer id);
	public String toAddBookInfo(Model model,Integer travelInfoId);
}
