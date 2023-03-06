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
	
	@GetMapping(value = "/edit_user_form")
	String editUserForm(int id, ModelMap model) {
		model.addAttribute("user", service.find(id));
		return "admin/edit_user_form";
	}
	
	@GetMapping(value = "/delete")
	String delete(int id, ModelMap model) {
		service.delete(id);
		
		model.addAttribute("users", service.getUsers());
		return "admin/list_users";
	}
	
	
	@PostMapping(value = "/create_user")
	String createUser(Users user, ModelMap model) {
		
		boolean successful = service.createUser(user);
		if (successful) {
			model.addAttribute("users", service.getUsers());
			return "admin/list_users";	
		} else {
			model.addAttribute("user", user);
			model.addAttribute("MESSAGE", "Email already exists.");
			return "admin/user_form";
		}
	}
	@PostMapping(value = "/update_user")
	String updateUser(Users user, ModelMap model) {
		
		service.updateUser(user);
		
		model.addAttribute("users", service.getUsers());
		
		return "admin/list_users";
	}
}
