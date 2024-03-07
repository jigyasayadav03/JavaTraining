package com.authsservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authservice.entity.User;
import com.authservice.service.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

//	@PostMapping
//	public ResponseEntity<User> createUser(@RequestBody User user) {
//		User userResponse = userService.createUser(user);
//		return new ResponseEntity<User>(userResponse, HttpStatus.CREATED);
//	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
	}

	@GetMapping(path = "/{userId}")
	public ResponseEntity<User> getUserByUserId(@PathVariable("userId") Long userId) {
		return new ResponseEntity<User>(userService.getUserByUserId(userId), HttpStatus.OK);
	}

	@DeleteMapping(path = "/{userId}")
	public ResponseEntity<User> deleteUserByUserId(@PathVariable("userId") Long userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<User>(HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User userResponse = userService.updateUser(user);
		return new ResponseEntity<User>(userResponse, HttpStatus.OK);
	}

	@GetMapping("/cart/{id}")
	public ResponseEntity<User> getUserByWithCartId(@PathVariable Long id) {
		User u = userService.getUserBywithcartInfo(id);
		return new ResponseEntity<User>(u, HttpStatus.OK);
	}
}
