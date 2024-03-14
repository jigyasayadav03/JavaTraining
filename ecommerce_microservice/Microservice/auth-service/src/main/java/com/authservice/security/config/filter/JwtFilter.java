package com.authservice.security.config.filter;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.authservice.security.config.service.JwtService;
import com.authservice.security.config.service.UserInfoService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {

	private static final Logger logger = LoggerFactory.getLogger(JwtFilter.class);

	@Autowired
	private JwtService jwtService;

	@Autowired
	private UserInfoService userInfoService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		try {
			String authHeader = request.getHeader("Authorization");
			String token = null;
			String userName = null;

			if (authHeader != null && authHeader.startsWith("Bearer")) {
				token = authHeader.substring(7);
				userName = jwtService.extractUserName(token);
			}

			if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
				UserDetails userDetails = userInfoService.loadUserByUsername(userName);
				if (jwtService.validateToken(token, userDetails)) {
					if (jwtService.isTokenExpired(token)) {
						// Handle expired token
						logger.error("JWT expired for user '{}'", userName);
						// Return appropriate response to the client or prompt user to re-authenticate
					} else {
						UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
								userDetails, null, userDetails.getAuthorities());
						authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
						SecurityContextHolder.getContext().setAuthentication(authToken);
						logger.info("User '{}' authenticated successfully", userName);
					}
				}
			}
		} catch (Exception e) {
			logger.error("Authentication error: {}", e.getMessage());
		}
		filterChain.doFilter(request, response);
	}

	public String getuname() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null && authentication.isAuthenticated()) {
			return authentication.getName(); // This returns the username
		}
		return null;
	}

//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		try {
//			String authHeader = request.getHeader("Authorization");
//			String token = null;
//			String userName = null;
//
//			if (authHeader != null && authHeader.startsWith("Bearer")) {
//				token = authHeader.substring(7);
//				userName = jwtService.extractUserName(token);
//			}
//
//			if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//				UserDetails userDetails = userInfoService.loadUserByUsername(userName);
//				if (jwtService.validateToken(token, userDetails)) {
//					UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails,
//							null, userDetails.getAuthorities());
//					authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//					SecurityContextHolder.getContext().setAuthentication(authToken);
//					logger.info("User '{}' authenticated successfully", userName);
//				}
//			}
//		} catch (Exception e) {
//			logger.error("Authentication error: {}", e.getMessage());
//		}
//		filterChain.doFilter(request, response);
//	}

}
