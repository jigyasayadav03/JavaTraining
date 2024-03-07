package com.cartservice.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
	 @JsonManagedReference
	private List<CartItem> cartItems = new ArrayList<>();

	private Long userId;
	private String userName;
	private String paymentType;
	private LocalDateTime creationDateTime;
	private LocalDateTime lastModifiedDateTime;
	private boolean isCompleted;

	private String deliveryAddress;
	private String contactNumber;
	private double totalAmount;
	private boolean isExpired;
	private String couponCode;
	private String deliveryInstructions;

}
