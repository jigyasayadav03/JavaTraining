package com.crudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = "com.crudapp")
public class CrudAppWithMongodDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppWithMongodDbApplication.class, args);
	}

}
