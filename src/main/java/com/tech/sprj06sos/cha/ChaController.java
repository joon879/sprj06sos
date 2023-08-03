package com.tech.sprj06sos.cha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChaController {
	
	@RequestMapping("cha/cha1")
	public String cha1() {
		return "cha/cha1";
	}
	@RequestMapping("cha/cha2")
	public String cha2() {
		return "cha/cha2";
	}
	@RequestMapping("cha/cha3")
	public String cha3() {
		return "cha/cha3";
	}
}
