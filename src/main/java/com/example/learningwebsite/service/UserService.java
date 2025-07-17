package com.example.learningwebsite.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.learningwebsite.entity.User;
import com.example.learningwebsite.repository.UserRepository;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Data
public class UserService {
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	public User registerUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setRoles("ROLE_USER");
		return userRepository.save(user);
	}

	public User findByUsername(String username) {
		return userRepository.findByUsername(username).orElse(null);
	}
}
