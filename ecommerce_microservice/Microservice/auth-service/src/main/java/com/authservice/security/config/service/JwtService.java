package com.authservice.security.config.service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.authservice.entity.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {
	private static final String SECRET = "!@#$FDGSDFGSGSGSGSHSHSHSSHGFFDSGSFGSSGHSDFSDFSFSFSFSDFSFSFSF";
	@Autowired
	private UserInfoService userInfoService;

	public String generateToken(String userName) {
		UserDetails userDetails = userInfoService.loadUserByUsername(userName);
		User user = userInfoService.getUserInfo(userName);

		Map<String, Object> claims = new HashMap<>();
		claims.put("roles", user.getRoles());

		return Jwts.builder().setClaims(claims).setSubject(userName).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 30))
				.signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
	}
//	public String generateToken(String userName) {
//		Map<String, Objects> claims = new HashMap<>();
//
//		return Jwts.builder().setClaims(claims).setSubject(userName).setIssuedAt(new Date(System.currentTimeMillis()))
//				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 30))
//				.signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
//
//	}

//	private Key getSignKey() {
//		byte[] keyBytes = Decoders.BASE64.decode(SECRET);
//		return Keys.hmacShaKeyFor(keyBytes);
//	}
//
//	public String extractUserName(String token) {
//		return extractClaim(token, Claims::getSubject);
//	}
//
//	public Date extractExpiration(String token) {
//		return extractClaim(token, Claims::getExpiration);
//	}
//
//	private <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
//		final Claims claims = extractAllClaims(token);
//		return claimResolver.apply(claims);
//	}
//
//	private Claims extractAllClaims(String token) {
//		return Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token).getBody();
//	}
//
//	public Boolean isTokenExpired(String token) {
//		return extractExpiration(token).before(new Date());
//	}
//
//	public Boolean validateToken(String token, UserDetails userDetails) {
//		final String userName = extractUserName(token);
//		return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
//	}

	private Key getSignKey() {
		byte[] keyBytes = Decoders.BASE64.decode(SECRET);
		return Keys.hmacShaKeyFor(keyBytes);
	}

	public String extractUserName(String token) {
		return extractClaim(token, Claims::getSubject);
	}

	public Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}

	private <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
		final Claims claims = extractAllClaims(token);
		return claimResolver.apply(claims);
	}

	private Claims extractAllClaims(String token) {
		return Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token).getBody();
	}

	public Boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}

	public Boolean validateToken(String token, UserDetails userDetails) {
		final String userName = extractUserName(token);
		return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
}
