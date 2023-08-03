package com.tech.sprj06sos.lee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class leeController {

	@RequestMapping("/lee/lee1")
	public String lee1() {
	
		return "/lee/lee1";
	}
	
	@RequestMapping("/lee/lee2")
	public String lee2() {
	
		return "/lee/lee2";
	}
	
	@RequestMapping("/lee/lee3")
	public String lee3() {
	
		return "/lee/lee3";
	}
	
	
	
}
