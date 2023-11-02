package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductRepo;

@RestController
public class ProductController {
	@Autowired
	ProductRepo productrepo;

	@RequestMapping(value = "/products/", method = RequestMethod.GET)
	public List<Product> getProducts() {
		return productrepo.findAll();
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public Product getProducts(@PathVariable("id") int id) {
		return productrepo.findById(id).get();
	}

	@RequestMapping(value = "/products/", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return productrepo.save(product);
	}

	@RequestMapping(value = "/products/", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return productrepo.save(product);
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public void deleteProducts(@PathVariable("id") int id) {
		productrepo.deleteById(id);
	}

}