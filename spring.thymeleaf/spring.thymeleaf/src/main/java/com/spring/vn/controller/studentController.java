package com.spring.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class studentController {
	@RequestMapping ("/student/form")
	public String showForm() {
		return "student-form";
	}
	@RequestMapping ("/student/save")
	public String saveData(HttpServletRequest request,ModelMap model) {
		String name = request.getParameter("name");
		String mark = request.getParameter("mark");
		String major = request.getParameter("major");
		model.addAttribute("NAME","Ho va ten : " +name);
		model.addAttribute("MARK","Diem TB : " +mark);
		model.addAttribute("MAJOR","Chuyen Nganh : "+ major);
		return "student-infor";
	}
}
