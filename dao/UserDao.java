package com.startproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startproject.entity.User;
@Repository
public interface UserDao extends JpaRepository<User,Long>{

	List<User> findAllById(Long id);
	List<User> findBySalaryLessThan(Double salary);
	List<User> findAll();

}
