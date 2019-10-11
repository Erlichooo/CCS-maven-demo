package com.gcu.CCS.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.CCS.pojos.Owner;
import com.gcu.CCS.service.OwnerService;

@Controller
@RequestMapping("/owner")
public class OwnerController {
	@Autowired
	private OwnerService ownerService;
	@RequestMapping("/login")
	public String login(@ModelAttribute Owner owner,Model model,HttpSession session) {
		return ownerService.login(owner, model, session);
	}
	@RequestMapping("/register")
	public String register(@ModelAttribute Owner owner,Model model,HttpSession session) {
		return ownerService.addOwner(owner, model,session);
	}
	@RequestMapping("/toRegister")
	public String toRegister() {
		return ownerService.toRegister();
	}
	@RequestMapping("/toLogin")
	public String toLogin() {
		return ownerService.toLogin();
	}
	@RequestMapping("/toMain")
	public String toMain() {
		return ownerService.toMain();
	}
}
