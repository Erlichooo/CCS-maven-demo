package com.gcu.CCS.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.CCS.pojos.User;
import com.gcu.CCS.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(@ModelAttribute User user,Model model, HttpSession session) {
		return userService.login(user, model, session);
	}
	@RequestMapping("/register")
	public String register(@ModelAttribute User user, Model model, HttpSession session) {
		return userService.addUser(user, model,session);
	}
	@RequestMapping("/toRegister")
	public String toRegister() {
		return userService.toRegister();
	}
	@RequestMapping("/toLogin")
	public String toLogin() {
		return userService.toLogin();
	}
	@RequestMapping("/toMain")
	public String toMain() {
		return userService.toMain();
	}
}
