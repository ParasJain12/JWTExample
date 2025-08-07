package com.jwt.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.test.model.User;
import com.jwt.test.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getUser() {
		System.out.println("Getting users...");
		return this.userService.getUsers();
	}
	
}
