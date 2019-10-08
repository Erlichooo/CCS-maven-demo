package com.gcu.CCS.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.gcu.CCS.dao.OwnerDao;
import com.gcu.CCS.pojos.Owner;
import com.gcu.CCS.service.OwnerService;

@Service("ownerService")
@Transactional//使用注解配置事务
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerDao ownerDao;
	@Override
	public String login(Owner owner, Model model, HttpSession session) {
		Owner towner = null;
		List<Owner> list = ownerDao.login(owner);
		if(list.size() > 0) {//查询到结果，则获取用户信息存到towner种
			towner = list.get(0);
		}
		if(towner != null) {//判断towner，若不为空，则将用户信息存到session中
			session.setAttribute("owner", towner);
			return "succ";
		}else {//否则将登陆失败信息存到model中
			model.addAttribute("msg", "您还没有登录");
			return "e";
		}
	}

}
