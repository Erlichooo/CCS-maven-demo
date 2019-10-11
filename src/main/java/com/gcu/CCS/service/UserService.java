package com.gcu.CCS.service;

import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;

import com.gcu.CCS.pojos.User;

public interface UserService {
	public String login(User user, Model model, HttpSession session);
	public String addUser(User user, Model model, HttpSession session);
	public String toLogin();
	public String toRegister();
	public String toMain();
}
