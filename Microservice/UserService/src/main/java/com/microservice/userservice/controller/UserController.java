package com.microservice.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.userservice.entity.User;
import com.microservice.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	public UserService userService;
@PostMapping
public ResponseEntity<User> addUser(@RequestBody User user){
	User u= userService.addUser(user);
	return ResponseEntity.status(HttpStatus.CREATED).body(u);
	
	
}
@GetMapping("/{id}")
public ResponseEntity<User> getUserById(@PathVariable String id){
    User u = userService.getUserByid(id);
    return ResponseEntity.ok(u);
}


//for all users

@GetMapping
public ResponseEntity<List<User>> getUser(){
	List<User> u= userService.getUser();
	return ResponseEntity.ok(u);
}






}
