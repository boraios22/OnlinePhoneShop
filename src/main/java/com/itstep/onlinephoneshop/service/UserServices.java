package com.itstep.onlinephoneshop.service;

import java.util.List;

import com.itstep.onlinephoneshop.dao.UserDAO;
import com.itstep.onlinephoneshop.entity.Users;

public class UserServices {
	private UserDAO userDao;
	
	public UserServices() {
		userDao = new UserDAO();
	}
	
	public List<Users> GetUsers() {
		return userDao.listAll();
	}
	
	public void CreateUser(String fullName, String email, String password) {
		Users user = new Users(email, password, fullName);
		userDao.create(user);
	}
}
