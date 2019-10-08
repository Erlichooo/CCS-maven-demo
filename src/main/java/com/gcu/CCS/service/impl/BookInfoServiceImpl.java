package com.gcu.CCS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.gcu.CCS.dao.BookInfoDao;
import com.gcu.CCS.service.BookInfoService;

@Service("bookInfoService")
@Transactional//使用注解配置事务
public class BookInfoServiceImpl implements BookInfoService {
	@Autowired
	private BookInfoDao bookInfoDao;
	@Override
	public String selectBookInfo(Model model, String act) {
		model.addAttribute("bookInfos",bookInfoDao.selectAllBookInfo());
		return "bookInfo/selectBookInfo";
	}

}
