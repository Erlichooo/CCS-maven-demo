package com.gcu.CCS.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.gcu.CCS.pojos.BookInfo;


public interface BookInfoDao {
	@Select("selct * from book_info")
	public List<BookInfo> selectAllBookInfo();
}
