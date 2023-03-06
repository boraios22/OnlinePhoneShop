package com.itstep.onlinephoneshop.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itstep.onlinephoneshop.entity.Users;
import com.itstep.onlinephoneshop.service.UserServices;

@Controller
@RequestMapping(value = "/admin")
public class UserController {
	@Autowired
	UserServices service;

	@GetMapping(value = "/list_users")
	String listUsers(ModelMap model) {
		
		model.addAttribute("users", service.getUsers());
		
		return "admin/list_users";
	}
	
	@GetMapping(value = "/user_form")
	String userForm() {
		return "admin/user_form";
	}
	
	@PostMapping(value = "/create_user")
	String createUser(Users user, ModelMap model) {
		
		service.createUser(user);
		
		model.addAttribute("users", service.getUsers());
		
		return "admin/list_users";
	}
}
