package com.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.order.entities.Order;

@Service
public interface OrderService {

	Order addOrder(Order order);

	List<Order> getAllOrder();

	Order getOrderById(Long orderId);

	Order updateOrder(Order order);

	Order deleteOrder(Long orderId);

	List<Order> getByUserId(Long userId);
//	// Method to search for products by name with pagination//
//		List<Order> searchOrderByName(String name, int page, int size);

	List<Order>searchOrdersByName(String orderName, int page, int size);


	//Page<Order> findOrdersByOrderName(String order_name, Pageable pageable);
}
