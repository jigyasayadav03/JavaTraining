package com.microservice.userservice.service;

import java.util.List;

import com.microservice.userservice.entity.User;

public interface UserService {
	public List<User> getUser();
	public User getUserByid(String id);
	public User addUser(User user);
}
