package com.authservice.security.config.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.authservice.entity.User;
import com.authservice.repository.UserRepository;
import com.authservice.security.config.UserInfoDetails;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UserInfoService implements UserDetailsService {
	@Autowired
	private UserRepository userInfoRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> userInfo = userInfoRepository.findByuserName(username);
		log.info("++++++++++++++++++++++++++=" + userInfo);
		return userInfo.map(UserInfoDetails::new)
				.orElseThrow(() -> new UsernameNotFoundException("User not found" + username));
	}

	public String addUser(User userInfo) {
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		log.info("++++++++++++++++++++++++++++++++", userInfo.getPassword());
		userInfoRepository.save(userInfo);
		log.info("++++++++++++++++++++++++++++++", userInfo);
		return "User added successfully";
	}

}
