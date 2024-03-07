package com.authservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authservice.entity.AuthRequest;
import com.authservice.entity.User;
import com.authservice.security.config.filter.JwtFilter;
import com.authservice.security.config.service.JwtService;
import com.authservice.security.config.service.UserInfoService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtService jwtService;
	@Autowired
	private JwtFilter filter;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Shop App !!";
	}

	@PostMapping("/addUser")
	public ResponseEntity<?> addUser(@RequestBody User userInfo) {
		if (userInfo.getPostalCode() == null || userInfo.getPostalCode().isEmpty()) {
			return ResponseEntity.badRequest().body("Postal code cannot be null or empty");
		}

		String message = userInfoService.addUser(userInfo);
		if (message.equals("User added successfully")) {
			// Generate token for the newly registered user
			final String token = jwtService.generateToken(userInfo.getUserName());
			return ResponseEntity.ok().body(token);
		} else {
			return ResponseEntity.badRequest().body(message);
		}
	}

	@PostMapping("/login")
	public String login(@RequestBody AuthRequest authRequest) {
		try {
			Authentication authenticate = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
			log.info("Authentication successful for user: {}", authRequest.getUserName());

			if (authenticate.isAuthenticated()) {
				String token = jwtService.generateToken(authRequest.getUserName());
				log.info("Token generated successfully for user: {}", authRequest.getUserName());
				return token;
			} else {
				log.error("Authentication failed for user: {}", authRequest.getUserName());
				throw new UsernameNotFoundException("Invalid user request");
			}
		} catch (AuthenticationException e) {
			log.error("Authentication failed for user: {}. Error: {}", authRequest.getUserName(), e.getMessage());
			throw new UsernameNotFoundException("Invalid credentials");
		}
	}
//
//
//	@GetMapping("/getUsers")
//	@PreAuthorize("hasAuthority('ADMIN_ROLES')")
//	public List<User> getAllUsers() {
//		return userInfoService.getAllUser();
//	}

//	@GetMapping("/getUsers/{id}")
//	// @PreAuthorize("hasAuthority('ADMIN_ROLES')")
//	public ResponseEntity<User> getUserByID(@PathVariable Integer id, Authentication authentication) {
//
//		if (authentication != null && authentication.isAuthenticated()) {
//			if (authentication.getAuthorities().stream().anyMatch(r -> r.getAuthority().equals("ADMIN_ROLES"))) {
//				return ResponseEntity.ok(userInfoService.getUser(id));
//			} else {
//				String u_name = filter.getuname();
//				User user = userInfoService.getUser(id);
//				if (u_name != null) {
//					if (u_name.equals(user.getUserName())) {
//						return ResponseEntity.ok(userInfoService.getUser(id));
//					}
//				}
//			}
//		}
//		return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//	}
}
