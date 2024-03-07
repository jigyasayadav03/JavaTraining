package com.cartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartservice.entities.Cart;
import com.cartservice.service.impl.CartserviceImpl;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	private CartserviceImpl cartserviceImpl;

	// for Adding to cart
	@PostMapping
	public ResponseEntity<Cart> addCart(@RequestBody Cart cart) {
		Cart c = cartserviceImpl.createCart(cart);
		return new ResponseEntity<>(c, HttpStatus.CREATED);
	}

	// for getting carts
	@GetMapping
	public ResponseEntity<List<Cart>> getCarts() {
		List<Cart> c = cartserviceImpl.getAllCarts();
		return new ResponseEntity<List<Cart>>(c, HttpStatus.OK);
	}

	// fpr geting by id
	@GetMapping("/{id}")
	public ResponseEntity<List<Cart>> getCartById(@PathVariable Long id) {
		List<Cart> c = cartserviceImpl.getCartById(id);
		return new ResponseEntity<List<Cart>>(c, HttpStatus.OK);
	}

	// for updating
	@PutMapping("/{id}")
	public ResponseEntity<Cart> updateCart(@PathVariable Long id, @RequestBody Cart cart) {
		Cart c = cartserviceImpl.updateCart(id, cart);
		return new ResponseEntity<Cart>(c, HttpStatus.OK);
	}

	// for deleting
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCart(@PathVariable Long id) {
		cartserviceImpl.deleteCart(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	//for getting cart by user Id 
	@GetMapping("users/{userId}")
	public ResponseEntity<List<Cart>> getByUserId(@PathVariable Long userId) {
		List<Cart> c = cartserviceImpl.getCartByUserId(userId);
		return new ResponseEntity<List<Cart>>(c, HttpStatus.OK);
	}
}