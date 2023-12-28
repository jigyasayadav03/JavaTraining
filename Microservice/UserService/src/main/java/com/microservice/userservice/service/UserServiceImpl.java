package com.microservice.userservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.userservice.entity.User;
import com.microservice.userservice.exception.ResourceNotFoundException;
import com.microservice.userservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepository userRepository;

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		List<User> list= userRepository.findAll();
		return list;
	}


	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub\
		//generate a unique userid 
		String randomUserID= UUID.randomUUID().toString();
		user.setId(randomUserID);
		User u= userRepository.save(user);
		return u;
	}

	@Override
	public User getUserByid(String id) {
		User  u=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException ("User with given id not foundl;"));
		return u;
	}
	

}
