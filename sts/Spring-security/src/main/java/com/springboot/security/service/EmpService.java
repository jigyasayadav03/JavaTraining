package com.springboot.security.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.security.entity.Employee;
import com.springboot.security.repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	private EmpRepository empRepository;
	
	//List<Employee> list = new ArrayList<>();

	public List<Employee> getAllEmployee() {
		List <Employee> empList=(List<Employee> )this.empRepository.findAll();
		return empList;
	}

	public Employee getEmployee(String username) {
		return empRepository.findByUsername(username);
		
	}
	public Employee addEmployee(Employee employee) {
	empRepository.save(employee);
	return employee;
	}
	
}

