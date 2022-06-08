package com.yujiyamamoto64.comments1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yujiyamamoto64.comments1.domain.User;
import com.yujiyamamoto64.comments1.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
}
