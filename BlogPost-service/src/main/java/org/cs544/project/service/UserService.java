package org.cs544.project.service;


import org.cs544.project.Repository.UserRepository;
import org.cs544.project.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	User findUserById(int id){
		return userRepository.findUserById(id);
	}
	User findUserByUsernameAndPassword(String username, String password){
		return userRepository.findUserByUsernameAndPassword(username, password);
	}
	User findUserByUsername(String username){
		return userRepository.findUserByUsername(username);
	}
	public void saveUser(User user) {

		userRepository.save(user);
	}
}
