package com.itstep.onlinephoneshop.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityWebApplicationConfig {
	
//	@Bean
//	public InMemoryUserDetailsManager userDetailsManager () {
//		
//		UserDetails user1 =  User.builder()
//							.username("dara")
//							.password("{noop}123")
//							.roles("EMPLOYEE")
//							.build();
//		
//		UserDetails user2 =  User.builder()
//							.username("tevi")
//							.password("{noop}123")
//							.roles("EMPLOYEE")
//							.build();
//		
//		return new InMemoryUserDetailsManager(user1, user2);
//	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		return http
				.authorizeRequests(configurer->configurer.anyRequest().authenticated())
				.formLogin().permitAll()
				.and()
				.build();
	}
}
