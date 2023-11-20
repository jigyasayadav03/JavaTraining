package com.springboot.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.security.entity.Employee;
import com.springboot.security.service.EmpService;

@RestController
@RequestMapping("/employees")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class EmpController {

	@Autowired
	private EmpService empService;

	@GetMapping
	public List<Employee> getAllEmployee() {
		List<Employee> list = empService.getAllEmployee();
		return list;
	}

	@PreAuthorize("hasRole('admin')")
	@GetMapping("/{username}")
	public Employee getByUsername(@PathVariable("username") String username) {
		return empService.getEmployee(username);

	}

	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);

	}
}
