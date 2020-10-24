package com.tropoGo.repository;

import org.springframework.data.repository.CrudRepository;

import com.tropoGo.entity.User;

public interface UserRepository extends CrudRepository<User, String>{
	   public User findByUserId(String userId);
}
