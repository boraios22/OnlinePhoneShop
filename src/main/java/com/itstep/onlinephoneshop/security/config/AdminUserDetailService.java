package com.itstep.onlinephoneshop.security.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.itstep.onlinephoneshop.entity.Users;
import com.itstep.onlinephoneshop.service.UserServices;

@Service
public class AdminUserDetailService implements UserDetailsService {
	@Autowired
	UserServices userService;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Users user = userService.checkUserByEmail(email);
		if (user == null) throw new UsernameNotFoundException("User not found");
	
		
		return new User(user.getEmail(), user.getPassword(), new ArrayList<>());
	}
}
