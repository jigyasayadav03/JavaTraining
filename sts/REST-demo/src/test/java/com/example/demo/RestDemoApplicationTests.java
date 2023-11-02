package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Product;

@SpringBootTest
class RestDemoApplicationTests {
//
//	@Test
//	public void testGetProduct() {
//		RestTemplate rstem = new RestTemplate();
//		Product product = rstem.getForObject("http://localhost:8080/products/1", Product.class);
//		assertNotNull(product);
//		assertEquals("iphone", product.getName());
//	}
//
//	@Test
//	public void testCreateProduct() {
//		RestTemplate rstem = new RestTemplate();
//		Product product= new Product();
//		product.setDescription("best for android users");
//		product.setName("one plus");
//		product.setPrice(300000);
//		Product newproduct = rstem.postForObject("http://localhost:8080/products/", product,Product.class);
//		assertNotNull(newproduct);
//		assertNotNull(newproduct.getId());
//		
//		assertEquals("one plus", newproduct.getName());
//	}

}
