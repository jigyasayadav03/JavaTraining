package com.product.service;

import java.util.List;

import com.product.entities.Product;

public interface ProductService {
	Product addProduct(Product product);

	List<Product> getAllProducts();

	Product getProductById(Long id);

	Product updateProduct(Product product);

	void deleteProduct(Long id);

	// Method to search for products by ID with pagination//
	List<Product> searchProductById(Long id, int page, int size);

	// Method to search for products by name with pagination//
	List<Product> searchProductByName(String name, int page, int size);
}