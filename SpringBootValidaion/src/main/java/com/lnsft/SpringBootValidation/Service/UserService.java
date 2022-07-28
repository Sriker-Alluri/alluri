package com.lnsft.SpringBootValidation.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lnsft.SpringBootValidation.Entity.User;
import com.lnsft.SpringBootValidation.Entity.UserDTO;
import com.lnsft.SpringBootValidation.Repository.UserRepository;

import Exception.UserNotFoundException;
@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepository;
	
	public User saveUser(UserDTO userdto) {
		User user= User.build(0, userdto.getName(), userdto.getEmail(), userdto.getMobile(), userdto.getGender(), userdto.getAge(), userdto.getNationality());
		return userrepository.save(user);
	}
	
	public List<User> getAllUsers(){
		return userrepository.findAll();
	}
	
	public User getUser(int id) throws UserNotFoundException{
		User user= userrepository.findByUserid(id);
		if(user!=null) {
			return user;
		}else {
			throw new UserNotFoundException("user not found with id :" +id);
			
		}
		
	}
	
}
