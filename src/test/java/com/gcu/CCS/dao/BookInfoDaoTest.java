package com.gcu.CCS.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.CCS.BaseTest;
import com.gcu.CCS.pojos.BookInfo;

public class BookInfoDaoTest extends BaseTest {
	@Autowired
	private BookInfoDao bookInfoDao;
	
	@Test
	public void selectAllBookInfo() {
		List<BookInfo> bookInfos=bookInfoDao.selectAllBookInfo();
		System.out.println(bookInfos.get(0).toString());
	}
	
	@Test
	public void selectBookInfoByUserId() {
		List<BookInfo> bookInfos=bookInfoDao.selectBookInfoByUserId(2);
		System.out.println(bookInfos.get(0).toString());
	}
	
	/*@Test
	public void addBookInfo() {
		BookInfo bookInfo=new BookInfo(0, "小明(自定)", "13612913645(自定)", 3, 1);
		bookInfoDao.addBookInfo(bookInfo);
	}*/
	public static void main(String[] args) {
		BookInfoDaoTest test=new BookInfoDaoTest();
		test.selectBookInfoByUserId();
		/*test.selectAllBookInfo();*/
		/*test.addBookInfo();
		test.selectAllBookInfo();*/
	}
}
