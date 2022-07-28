package com.lnsft.SpringBootValidation.Controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lnsft.SpringBootValidation.Entity.User;
import com.lnsft.SpringBootValidation.Entity.UserDTO;
import com.lnsft.SpringBootValidation.Service.UserService;

import Exception.UserNotFoundException;

@RestController
@RequestMapping("/users")
public class UserController {



@Autowired
private UserService userservice;

@PostMapping("/newuser")
public ResponseEntity<User> saveUser(@RequestBody @Valid UserDTO userdto){
	return new ResponseEntity<>(userservice.saveUser(userdto),HttpStatus.CREATED);
}

@GetMapping("/all")
public ResponseEntity<List<User>> getAllUsers(){
return ResponseEntity.ok(userservice.getAllUsers());
}

@GetMapping("/{id}")
public ResponseEntity<User> getUser(@PathVariable int id) throws UserNotFoundException {
	return ResponseEntity.ok(userservice.getUser(id));
}
}

