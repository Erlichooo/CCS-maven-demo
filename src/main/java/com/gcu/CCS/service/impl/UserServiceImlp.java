package com.gcu.CCS.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.gcu.CCS.dao.UserDao;
import com.gcu.CCS.pojos.User;
import com.gcu.CCS.service.UserService;

@Service("userService")
@Transactional//使用注解配置事务
public class UserServiceImlp implements UserService {
	@Autowired//自动注入，具体作用还不清楚
	private UserDao userDao;
	@Override
	public String login(User user, Model model, HttpSession session) {
		User tuser = null;
		List<User> list = userDao.login(user);
		if(list.size() > 0) {//查询到结果，则获取用户信息存到tuser种
			tuser = list.get(0);
		}
		if(tuser != null) {//判断tuser，若不为空，则将用户信息存到session中
			session.setAttribute("user", tuser);
			return "main";
		}else {//否则将登陆失败信息存到model中
			model.addAttribute("msg", "您还没有登录");
			return "e";
		}
	}

	@Override
	public String addUser(User user, Model model, HttpSession session) {
		if(userDao.matchUser(user).size() == 0) {//如果表中不存在该用户，则注册
			userDao.register(user);
			session.setAttribute("msg", "注册成功");
			return "login";
		}
		else {
			session.setAttribute("msg", "该用户名已存在");
			return "register";
		}
		
	}

	@Override
	public String toLogin() {
		return "login";
	}

	@Override
	public String toRegister() {
		return "register";
	}

/*model.addattribute()的作用
1.往前台传数据，可以传对象，可以传List，通过el表达式 ${}可以获取到，
类似于request.setAttribute("sts",sts)效果一样。

2.@ModelAttribute("model")   注解

3.可以用EL表达式${id}获取*/
}
