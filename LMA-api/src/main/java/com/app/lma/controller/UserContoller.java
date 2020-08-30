 
/**
 * 
 */
package com.app.lma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.lma.model.JwtUser;
import com.app.lma.model.User;
import com.app.lma.repository.UserRepository;
import com.app.lma.security.JwtGenerator;

/**
 * @author karthi sabari
 *
 */
@RestController
public class UserContoller {
	
	@Autowired
	private JwtGenerator jwtGenerator;

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	@PostMapping("login")
	public String login(@RequestBody User user){
		String result = "";
		User userModel = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(userModel != null) {
			JwtUser jwtUser = new JwtUser();
			jwtUser.setId(userModel.getId());
			jwtUser.setUserName(userModel.getUserName());
			jwtUser.setRole(userModel.getRole());
			result = jwtGenerator.generate(jwtUser);
		} else {
			result = "Invalid credentials";
		}
		return result;
	}
}
