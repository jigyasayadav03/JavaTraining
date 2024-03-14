package com.user.service.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.service.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	  Optional<User> findByEmail(String email);
}