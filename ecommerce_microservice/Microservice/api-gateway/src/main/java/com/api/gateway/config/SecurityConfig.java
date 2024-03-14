//package com.api.gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@Configuration
//@EnableWebFluxSecurity
//
//public class SecurityConfig {
//
//	@Bean
//	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//		http
//			.authorizeExchange()
//			.anyExchange()
//			.authenticated()
//			.and()
//			.oauth2Client()
//			.and()
//			.oauth2ResourceServer()
//			.jwt();
//
//		return http.build();
//	}
//}