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
	
	public boolean createUser(Users user) {
		
		List<Users> users = userRepo.findAllByEmail(user.getEmail());
		if(users.size() > 0) {
			return false;
		}
		
		userRepo.save(user);
		return true;
	}
	public boolean updateUser(Users user) {
		
		List<Users> users = userRepo.findAllByEmail(user.getEmail());
		boolean iAmInside = false;
		
		for(Users u : users) {
			if (u.getId() == user.getId()) {
				iAmInside = true;
			}
		}
		
		if(users.size() > 0 && !iAmInside) {
			return false;
		}
		userRepo.update(user);
		
		return true;
	}
	
	public Users find(int id) {
		return userRepo.findById(id);
	}

	public void delete(int id) {
		userRepo.delete(id);
	}
	
	
}
