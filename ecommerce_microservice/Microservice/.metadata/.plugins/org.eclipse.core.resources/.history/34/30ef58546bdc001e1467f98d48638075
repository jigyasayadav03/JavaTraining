package com.user.service.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

	private Long C_id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_cart_id")
	@JsonBackReference
	private Cart cart;

	private Long productId;
	private String productName;
	private int quantity;
	private double price;

}
