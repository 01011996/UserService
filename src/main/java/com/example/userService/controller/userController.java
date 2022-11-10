package com.example.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userService.model.User;
import com.example.userService.service.userService;

@RestController
@RequestMapping("/api")
public class userController {

	@Autowired
	private userService userService;

	@PostMapping("/")
	public void insertUser(@RequestBody User userRecord) {

		userService.addUser(userRecord);

	}

	@GetMapping("/getUserDetails")
	public List<User> getUserDetails() {

		System.out.println("Hi");
		return userService.getAllUsers();
	}

}
