package com.spring.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController1 {
	@RequestMapping("/student/form1")
	public String showForm() {
		return "student-form1";
	}
	@RequestMapping("/student/save1")
	public String showinfor(HttpServletRequest request,ModelMap model) {
		String name = request.getParameter("name");
		String mark = request.getParameter("mark");
		String major = request.getParameter("major");
		model.addAttribute("NAME","Ten cua ban : "+name);
		model.addAttribute("MARK","Diem trung binh : "+mark);
		model.addAttribute("MAJOR","Chuyen Nganh : "+major);
		
		return "student-infor1";
	}
}
