package com.tech.sprj06sos.jeon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JeonController {
	
	@RequestMapping("/jeon/jeon1")
	public String jeon1() {
		System.out.println("==== jeon1 ====");
		
		return "/jeon/jeon1";
	}
	
	@RequestMapping("/jeon/jeon2")
	public String jeon2() {
		System.out.println("==== jeon2 ====");
		
		return "/jeon/jeon2";
	}
	
	@RequestMapping("/jeon/jeon3")
	public String jeon3() {
		System.out.println("==== jeon3 ====");
		
		return "/jeon/jeon3";
	}
	
	@RequestMapping("home")
	public String home() {
		System.out.println("==== home ====");
		
		return "home";
	}

}
