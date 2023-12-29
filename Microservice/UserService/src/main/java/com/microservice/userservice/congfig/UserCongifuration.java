package com.microservice.userservice.congfig;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UserCongifuration {
	@Bean
	//when multiple instances are there so that it will balancethe full load
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
