package com.tech.sprj06sos.kim2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Kim2Controller {
	@RequestMapping("/kim2/kim2_1")
	public String kim2_1() {
		return "kim2/kim2_1";
	}
	@RequestMapping("kim2/kim2_2")
	public String kim2_2() {
		return "kim2/kim2_2";
	}
	@RequestMapping("kim2/kim2_3")
	public String kim2_3() {
		return "kim2/kim2_3";
	}

}
