 
/**
 * 
 */
package com.app.lma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.lma.model.User;
import com.app.lma.repository.UserRepository;

/**
 * @author karthi sabari
 *
 */
@RestController
@RequestMapping("/rest/users")
public class UserContoller {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
}
