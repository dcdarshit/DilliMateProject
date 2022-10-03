package com.dillimate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DillimateController {
	
	// show home page
	@GetMapping("/")
	public String getHomePage() {
		return "index";
	}
    
	// show header page
	@GetMapping("/header")
	public String getHeader() {
		return "header";
	}
	
	// show footer page
	@GetMapping("/footer")
	public String getFooter() {
		return "footer";
	}
	
	// display slider
	@GetMapping("/slider")
	public String getSlider() {
		return "slider";
	}
	
	// show about page
	@GetMapping("/about")
	public String getAboutPage() {
		return "about";
	}
	
	// show contact page
	@GetMapping("/contact")
	public String getContactPage() {
		return "contact";
	}
	
	// show signup page
//	@GetMapping("/signup")
//	public String getSignupPage() {
//		return "signup";
//	}
	
	// show Login page
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	
}
