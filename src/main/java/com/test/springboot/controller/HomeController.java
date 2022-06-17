package com.test.springboot.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/") 
	public String home(Model model) {
		System.out.println("-------------------------------------------------------");
		//org.springframework.beans.BeanUtils.copyProperties(model, model);
		return "home";
	}
	
	@GetMapping("/jsp")
	public String jspHome(Model model) {
		System.out.println("-------------------------------------------------------");
		return "jspHome";
	}

}
