package com.order.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Purchase_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderid;
	private Long userId;
	private String orderName;
	private BigDecimal totalPrice;
	private LocalDateTime orderDate;
	private String shippingAddress;
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;

}