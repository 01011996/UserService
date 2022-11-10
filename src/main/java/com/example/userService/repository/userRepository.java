package com.example.userService.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.userService.model.User;

public interface userRepository extends CrudRepository<User, Integer> {

}
