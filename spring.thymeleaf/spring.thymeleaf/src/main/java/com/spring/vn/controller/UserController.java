package com.spring.vn.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@GetMapping("/")
	public String addOrEdit(ModelMap model){
		User u = new User();
		u.setUsername("NamNV");
		model.addAttribute("USER",u);
		model.addAttribute("ACTION","");
		return "register-user";
	}
	@RequestMapping("list")
	public String list() {
		return "view-user";
	}

}
