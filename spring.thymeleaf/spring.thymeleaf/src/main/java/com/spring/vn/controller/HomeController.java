package com.spring.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@RequestMapping(value = { "/home"})//url hien thi
	public String getHomePage() {
		return "home";//file tim xong hien thi
	}
	@RequestMapping(value = { "/login" })//{"/login", "/", ""} 1 trong 3 cai co the truy cap 
	public String getLoginPage() {
		return "login";
	}
	@RequestMapping(value = { "/helloworld"})
	public String getHelloworld() {
		return "helloworld";
	}
	@GetMapping("/helloName")
	public String helloName() {
		return "helloworld";
	}
	@GetMapping("/display")
	public String displayName(HttpServletRequest request) {
		String name = request.getParameter("name");//name nay la trong the input , lay GT o in put
		System.out.println("user : "+name);//dua gt len javatype
		request.setAttribute("NAME",name);//NAME nay la de dat o the html va dc hien thi
		//gui yeu cau trao doi voi html voi gt la NAME
		return "display";
	}
	
}
