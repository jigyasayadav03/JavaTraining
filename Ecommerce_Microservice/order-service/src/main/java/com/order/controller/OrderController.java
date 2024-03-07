package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.entities.Order;
import com.order.service.OrderService;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	// @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	@PostMapping("/create")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		Order orderDTO = orderService.addOrder(order);
		return new ResponseEntity<Order>(orderDTO, HttpStatus.CREATED);
	}

	@GetMapping
	// @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<Order>> getAllOrders() {
		List<Order> OrderDTO = orderService.getAllOrder();
		return new ResponseEntity<List<Order>>(OrderDTO, HttpStatus.OK);
	}

	@GetMapping(path = "/{orderId}")
	public ResponseEntity<Order> getOrderById(@PathVariable("orderId") Long orderId) {
		Order orderDTO = orderService.getOrderById(orderId);
		return new ResponseEntity<Order>(orderDTO, HttpStatus.OK);
	}

	@GetMapping("users/{userId}")
	public ResponseEntity<List<Order>> getOrderByUserId(@PathVariable("userId") Long userId) {
		List<Order> orderDTO = orderService.getByUserId(userId);
		return new ResponseEntity<List<Order>>(orderDTO, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Order> updateOrder(@PathVariable Long id, @RequestBody Order order) {

		Order orderDTO = orderService.updateOrder(order);
		if (orderDTO != null) {
			return new ResponseEntity<Order>(orderDTO, HttpStatus.OK);
		} else {
			return new ResponseEntity<Order>(orderDTO, HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping(path = "/{orderId}")
	public ResponseEntity<Order> deleteOrderById(@PathVariable("orderId") Long orderId) {
		Order orderDTO = orderService.deleteOrder(orderId);
		return new ResponseEntity<Order>(orderDTO, HttpStatus.OK);
	}
//search api for searching order by name
	@GetMapping("/orders/search/name")
	public ResponseEntity<List<Order>> searchOrdersByName(@RequestParam("orderName") String orderName,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
		List<Order> orders =orderService.searchOrdersByName(orderName, page, size);
		if (!orders.isEmpty()) {
			return ResponseEntity.ok(orders);

		} else {
			return ResponseEntity.notFound().build();
		}
	}

}