package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String HomePage() {
		System.out.println("welcome home page");
		return "Home";
	}
	
	@RequestMapping("/contact")
	public String contactPage()
		{
		System.out.println("welcome contact page");
		return "contact";
		}
	
}
