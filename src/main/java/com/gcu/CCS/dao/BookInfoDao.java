package com.gcu.CCS.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.gcu.CCS.pojos.BookInfo;


public interface BookInfoDao {
	@Select("select * from book_info")
	public List<BookInfo> selectAllBookInfo();
	
	@Insert("insert into book_info(name,tel,travel_info_id,user_id) values(#{name},#{tel},#{travelInfoId},#{userId})")
	public int addBookInfo(@ModelAttribute BookInfo bookInfo);
	
	@Select("select * from book_info where user_id=#{id}")
	public List<BookInfo> selectBookInfoByUserId(Integer id);
}
