package com.gcu.CCS.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.gcu.CCS.pojos.Owner;

public interface OwnerService {
	public String login(Owner owner, Model model, HttpSession session);
	public String addOwner(Owner owner, Model model, HttpSession session);
	public String toLogin();
	public String toRegister();
	public String toMain();
}
