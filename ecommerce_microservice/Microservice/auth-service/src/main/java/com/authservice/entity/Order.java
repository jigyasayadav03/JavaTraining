package com.authservice.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Order {
	
	private Long orderid;

	private Long userId;
	private BigDecimal totalPrice;
	private LocalDateTime orderDate;
	private String shippingAddress;
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;

}
