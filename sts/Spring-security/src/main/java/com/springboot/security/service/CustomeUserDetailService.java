package com.springboot.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.security.entity.CustomUserDetails;
import com.springboot.security.entity.Employee;
import com.springboot.security.repository.EmpRepository;

@Service
public class CustomeUserDetailService implements UserDetailsService {
	@Autowired
	private EmpRepository empRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Employee emp = this.empRepository.findByUsername(username);
		if (emp == null) {
			throw new UsernameNotFoundException("no user found");

		}

		return new CustomUserDetails(emp);
	}

}
