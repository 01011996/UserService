package com.example.userService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userService.model.User;
import com.example.userService.repository.userRepository;

@Service
public class userService {

	@Autowired
	private userRepository userRepository;

	public List<User> getAllUsers() {
		List<User> userRecords = new ArrayList<>();
		userRepository.findAll().forEach(userRecords::add);
		return userRecords;
	}

	public void addUser(User userRecord) {
		userRepository.save(userRecord);
	}

}
