package com.tropoGo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tropoGo.entity.User;
import com.tropoGo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User getUserById(String id) {
		User user = userRepository.findByUserId("34");
		return user;
	}
}
