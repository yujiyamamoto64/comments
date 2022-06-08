package com.yujiyamamoto64.comments1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yujiyamamoto64.comments1.domain.User;
import com.yujiyamamoto64.comments1.dto.UserDTO;
import com.yujiyamamoto64.comments1.repositories.UserRepository;
import com.yujiyamamoto64.comments1.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Not found object"));
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto	) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
