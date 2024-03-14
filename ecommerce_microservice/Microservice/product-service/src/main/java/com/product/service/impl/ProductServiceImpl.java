package com.product.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.product.entities.Product;
import com.product.exception.ResourceNotFoundException;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		return optionalProduct.orElse(null);
	}

	@Override
	public Product updateProduct(Product product) {

		Optional<Product> optionalExistingProduct = productRepository.findById(product.getId());
		if (optionalExistingProduct.isPresent()) {

			Product existingProduct = optionalExistingProduct.get();
			existingProduct.setName(product.getName());
			existingProduct.setDescription(product.getDescription());
			existingProduct.setPrice(product.getPrice());

			return productRepository.save(existingProduct);
		} else {

			throw new ResourceNotFoundException("Product with ID " + product.getId() + " not found");
		}
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> searchProductById(Long id, int page, int size) {
		// Create pagination request
		Pageable pageable = PageRequest.of(page, size);
		// Perform search using repository method
		Page<Product> productPage = productRepository.findProductsById(id, pageable);
		// Convert Page<Product> to List<Product>
		return productPage.getContent();
	}

	@Override
	public List<Product> searchProductByName(String name, int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		Page<Product> productPage = productRepository.findProductByName(name, pageable);
		if (productPage.isEmpty()) {
			throw new ResourceNotFoundException("no product found with this name " + name);
		} else {
			return productPage.getContent();
		}

	}
}