//package com.authservice.service.impl;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import com.authservice.entity.Cart;
//import com.authservice.entity.Order;
//import com.authservice.entity.User;
//import com.authservice.exception.UserNotFoundException;
//import com.authservice.repository.UserRepository;
//import com.authservice.service.UserService;
//
//import lombok.extern.log4j.Log4j2;
//
//@Service
//@Log4j2
//public class UserServiceImpl implements UserService {
//
//	@Autowired
//	private UserRepository userRepository;
//	@Autowired
//	private RestTemplate restTemplate;
//
//	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
//
//	@Override
//	public User createUser(User user) {
//		if (userRepository.findByEmail(user.getEmail()).isPresent()) {
//			throw new RuntimeException("Email address already exists");
//		}
//		return userRepository.save(user);
//	}
//
//	@Override
//	public List<User> getAllUsers() {
//		// TODO Auto-generated method stub
//		log.info("+++++++++++++++++++++++++++++++", userRepository.findAll());
//		return userRepository.findAll();
//	}
//
//	@Override
//	public User getUserByUserId(Long id) {
//		// TODO Auto-generated method stub
//		User user = userRepository.findById(id)
//				.orElseThrow(() -> new UserNotFoundException("User Not Found Exception"));
//		// fecth order of specific user order/ordersid
//		// http://localhost:8083/orders/userId
////		Order[] forObject = restTemplate.getForObject("http://localhost:8084/orders/" + user.getUserId(),
////				Order[].class);
////		log.info("++++++++++++++++++++++++++++++++++" + forObject);
////		List<Order> order = Arrays.stream(forObject).toList();
////		 List<List<Order>> orderList = order.stream().map(rating -> {
////			 return order;
////		   }).collect(Collectors.toList());
////		 user.setOrder(orderList);
//		return user;
//	}
//
//	// communication of microservices
//
//	@Override
//	public User getUserOrderByUserId(Long id) {
//		// Fetch the user from the repository
//		User user = userRepository.findById(id)
//				.orElseThrow(() -> new UserNotFoundException("User Not Found Exception"));
//
//		// Fetch orders for the user from the orders service
//		Order[] ordersArray = restTemplate.getForObject("http://localhost:8084/orders/users/" + user.getUserId(),
//				Order[].class);
//		// log.info("+&&&&&&&&&&&&&&&&&&&&&&&&&&++the user list is ++++++++++++++++",
//		// user.toString());
//		log.info("{} ", ordersArray);
//		log.info("+&&&&&&&&&&&&&&&&&&&&&&&&&&++the user list is ++++++++++++++++");
//		// user.toString());
//		// Convert the array of orders to a List
//		List<Order> orderList = Arrays.asList(ordersArray);
//
//		// Set the luist of orders to the user
//		user.setOrder(orderList);
//		log.info("+&&&&&&&&&&&&&&&&&&&&&&&&&&++the user list is ++++++++++++++++", user.toString());
//
//		return user;
//	}
//
//	@Override
//	public void deleteUser(Long id) {
//		// TODO Auto-generated method stub
//		userRepository.deleteById(id);
//	}
//
//	@Override
//	public User updateUser(User user) {
//		return userRepository.save(user);
//	}
//
//	@Override
//	public User getUserBywithcartInfo(Long id) {
//		User user = userRepository.findById(id)
//				.orElseThrow(() -> new UserNotFoundException("User Not Found Exception"));
//		Cart[] cartArray = restTemplate.getForObject("http://localhost:8084/api/cart/users/" + user.getUserId(),
//				Cart[].class);
//		logger.info("{} ", cartArray);
//		List<Cart> cartList = Arrays.asList(cartArray);
//		user.setCart(cartList);
//		log.info("+&&&&&&&&&&&&&&&&&&&&&&&&&&++the user list is ++++++++++++++++", user.toString());
//
//		return user;
//	}
//
//}
