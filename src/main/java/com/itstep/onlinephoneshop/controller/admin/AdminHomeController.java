package com.itstep.onlinephoneshop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminHomeController {
	
	@GetMapping(value = "/admin")
	@ResponseBody
	public String home() {
		
		return "Hello";
	}
	
}
