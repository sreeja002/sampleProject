package com.startproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startproject.entity.User;
import com.startproject.service.UserService;

@RestController
@RequestMapping("/user")
public class UserContoller {
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		User savedUser = userService.saveUser(user);
		return ResponseEntity.ok(savedUser);
	}

	 @GetMapping("{id}")
	 public List<User> getUser(@PathVariable("id") Long id) {
		 return userService.getUserById(id);
	 }
	 
	 @GetMapping("/salary/{amount}")
	 public List<User> getUserswithSalaryLessThan(@PathVariable("amount")double amount){
		return userService.getUserswithSalaryLessThan(2000000);
	 }
	 
	 @GetMapping("/allusers")
	 public List<User> getAllUsers(){
		 return userService.getAllUsers();
	 }
	 
}


