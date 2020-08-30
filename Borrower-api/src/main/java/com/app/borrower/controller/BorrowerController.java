/**
 * 
 */
package com.app.borrower.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.borrower.model.Borrower;
import com.app.borrower.repository.BorrowerRepository;

/**
 * @author karthi sabari
 *
 */
@RestController
public class BorrowerController {
	
	/*
	 * @Autowired private JwtGenerator jwtGenerator;
	 */
	@Autowired
	BorrowerRepository borrowerRepository;
	
	@GetMapping("/rest/borrowers")
	public List<Borrower> getAllBorrower(){
		return borrowerRepository.findAll();
	}
	
	/*
	 * @PostMapping("login") public String login(@RequestBody User borrower){ String
	 * result = ""; Borrower userModel =
	 * borrowerRepository.findByUserNameAndPassword(user.getUserName(),
	 * user.getPassword()); if(userModel != null) { JwtUser jwtUser = new JwtUser();
	 * jwtUser.setId(userModel.getId());
	 * jwtUser.setUserName(userModel.getUserName());
	 * jwtUser.setRole(userModel.getRole()); result =
	 * jwtGenerator.generate(jwtUser); } else { result = "Invalid credentials"; }
	 * return result; }
	 */


}
