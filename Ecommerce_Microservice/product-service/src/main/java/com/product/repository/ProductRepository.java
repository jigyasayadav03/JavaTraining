package com.product.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	@Query("SELECT p FROM Product p WHERE p.id = :id")
	Page<Product> findProductsById(Long id, Pageable pageable);

	@Query("SELECT p FROM Product p WHERE p.name= :name")
	Page<Product> findProductByName(String name, Pageable pageable);

}
