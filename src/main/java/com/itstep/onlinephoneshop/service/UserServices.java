package com.itstep.onlinephoneshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itstep.onlinephoneshop.entity.Users;
import com.itstep.onlinephoneshop.repo.IGenericRepo;

@Service
public class UserServices {
	@Autowired
	IGenericRepo<Users> userRepo;
	
	
	public List<Users> getUsers() {
		return userRepo.findAll();
	}
	
	public void createUser(Users user) {
		userRepo.save(user);
	}
}
