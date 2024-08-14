package com.startproject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startproject.dao.UserDao;
import com.startproject.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public User saveUser(User user) {
		return userDao.save(user);
	}
	public List<User> getUserById(Long id) {
		List<User> user = userDao.findAllById(id);
		return user;
		
	}
	public List<User> getUserswithSalaryLessThan(double salary){
		return userDao.findBySalaryLessThan(salary);
		
	}
	public List<User> getAllUsers(){
		return userDao.findAll();
	}
}
