package com.dillimate.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.dillimate.entities.User;


public interface UserService extends UserDetailsService {

	User findByEmail(String email);
	
	Optional<User> findById(Long id);

    User save(User user);
}
