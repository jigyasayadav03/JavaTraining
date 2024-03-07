package com.order.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.order.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	List<Order> findByUserId(Long userId);

	// Page<Order> findByOrder_name(String order_name, Pageable pageable);
	// Page<Order> searchOrdersByName(String orderName, Pageable pageable);
	@Query("SELECT o FROM Order o WHERE LOWER(o.orderName) LIKE LOWER(CONCAT('%', :name, '%'))")
	Page<Order> findByOrderNameContainingIgnoreCase(String name, Pageable pageable);
//
//	Page<Order> findByorder_nameContainingIgnoreCase(String order_name, Pageable pageable);
}
