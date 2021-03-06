package com.gcu.CCS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.gcu.CCS.dao.BookInfoDao;
import com.gcu.CCS.dao.TravelInfoDao;
import com.gcu.CCS.pojos.BookInfo;
import com.gcu.CCS.pojos.TravelInfo;
import com.gcu.CCS.service.BookInfoService;

@Service("bookInfoService")
@Transactional//使用注解配置事务
public class BookInfoServiceImpl implements BookInfoService {
	@Autowired
	private BookInfoDao bookInfoDao;
	@Autowired
	private TravelInfoDao travelInfoDao;
	@Override
	public String selectBookInfo(Model model, String act) {//暂时没用
		model.addAttribute("bookInfos",bookInfoDao.selectAllBookInfo());
		return "bookInfo/selectBookInfo";
	}
	@Override
	public String addBookInfo(BookInfo bookInfo) {
		bookInfoDao.addBookInfo(bookInfo);
		//JSON forward
		return "bookInfo/selectBookInfo";
	}
	@Override
	public String selectBookInfoByUserId(Model model, Integer id) {
		System.out.println(id);
/*			List<BookInfo> bookInfos=bookInfoDao.selectBookInfoByUserId(id);
			model.addAttribute("travelInfos", travelInfoDao.selectATravelInfo(b))*/
			model.addAttribute("bookInfos",bookInfoDao.selectBookInfoByUserId(id));
			return "bookInfo/selectBookInfo";
	}
	@Override
	public String toAddBookInfo(Model model,Integer travelInfoId) {
		TravelInfo travelInfo=travelInfoDao.selectATravelInfo(travelInfoId);
		model.addAttribute(travelInfo);
		model.addAttribute("bookInfo", new BookInfo()); //前台要用modelAttribute添加时必须先 new 一个该类
		return "bookInfo/addBookInfo";
	}

}
