package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entities.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping
	// @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		Product productEntity = productService.addProduct(product);
		return new ResponseEntity<>(productEntity, HttpStatus.CREATED);
	}

	@GetMapping
	// @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	// @PreAuthorize("hasAuthority('SCOPE_internal')")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
		Product product = productService.getProductById(id);
		if (product != null) {
			return new ResponseEntity<>(product, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/{id}")
	// @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
		Product existingProduct = productService.getProductById(id);
		if (existingProduct != null) {
			product.setId(id);
			Product updatedProduct = productService.updateProduct(product);
			return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	// @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<Void> deleteProductById(@PathVariable("id") Long id) {
		Product existingProduct = productService.getProductById(id);
		if (existingProduct != null) {
			productService.deleteProduct(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/products/search")
	public ResponseEntity<List<Product>> searchProductById(@RequestParam Long id,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
		List<Product> products = productService.searchProductById(id, page, size);
		if (!products.isEmpty()) {
			return ResponseEntity.ok(products);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/products/search/name")
	public ResponseEntity<List<Product>> searchProductByName(@RequestParam String name,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
		List<Product> products = productService.searchProductByName(name, page, size);
		if (!products.isEmpty()) {
			return ResponseEntity.ok(products);

		} else {
			return ResponseEntity.notFound().build();
		}

	}

}