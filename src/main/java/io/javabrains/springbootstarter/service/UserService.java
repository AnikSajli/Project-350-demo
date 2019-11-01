package io.javabrains.springbootstarter.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.model.User;
import io.javabrains.springbootstarter.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository)
	{
		this.userRepository = userRepository; 
	}
	
	public void saveMyUser(User user)
	{
		userRepository.save(user);
	}

}
