package com.cartservice.service.impl;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartservice.entities.Cart;
import com.cartservice.entities.CartItem;
import com.cartservice.repository.CartRepository;
import com.cartservice.service.CartService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CartserviceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	@Override
	public List<Cart> getAllCarts() {
		List<Cart> c = cartRepository.findAll();
		log.info("+++++++++++++the cart are :::::::::::+++++++++", c);
		return c;
	}

	@Override
	public Cart createCart(Cart cart) {
		Cart c = cartRepository.save(cart);
		for (CartItem cartItem : cart.getCartItems()) {
			cartItem.setCart(c);
		}
		log.info("+++++++++++++++++the cart is ::::++++++++++++", cart);
		return cartRepository.save(c);
	}

	@Override
	public Cart updateCart(Long id, Cart cart) {
		Optional<Cart> optionalCart = cartRepository.findById(id);
		if (optionalCart.isPresent()) {
			Cart existingCart = optionalCart.get();
			existingCart.setUserName(cart.getUserName());
			existingCart.setPaymentType(cart.getPaymentType());
			existingCart.setLastModifiedDateTime(LocalDateTime.now());
			log.info("+++++++++++++++++++updataion++++++++++++++++=", existingCart);
			return cartRepository.save(existingCart);
		} else {
			throw new RuntimeException("Cart not found with id: " + id);
		}
	}

	@Override
	public void deleteCart(Long id) {
		Optional<Cart> optionalCart = cartRepository.findById(id);
		if (optionalCart.isPresent()) {
			log.info("++++++++++++++++++deleitng+++++++++++++++=");
			cartRepository.deleteById(id);
		} else {
			throw new RuntimeException("Cart not found with id: " + id);
		}
	}

	@Override
	public List<Cart> getCartById(Long id) {
		Optional<Cart> optionalCart = cartRepository.findById(id);
		if (optionalCart.isPresent()) {
			return Collections.singletonList(optionalCart.get());
		} else {

			throw new RuntimeException("Cart not found with id: " + id);
		}
	}

	@Override
	public List<Cart> getCartByUserId(Long userId) {
		Optional<Cart> optionalCart = cartRepository.findById(userId);
		if (optionalCart.isPresent()) {
			return Collections.singletonList(optionalCart.get());
		} else {
			throw new RuntimeException("cart not found with userid" + userId);
		}
	}

}