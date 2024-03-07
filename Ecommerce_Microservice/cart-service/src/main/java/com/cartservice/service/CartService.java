package com.cartservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cartservice.entities.Cart;

@Service
public interface CartService {
	public List<Cart> getAllCarts();

	Cart createCart(Cart cart);

	Cart updateCart(Long id, Cart cart);

	void deleteCart(Long id);

	List<Cart> getCartById(Long id);

	List<Cart> getCartByUserId(Long userId);
}
