/**
 * 
 */
package com.app.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.loan.model.Loan;
import com.app.loan.repository.LoanRepository;

/**
 * @author karthi sabari
 *
 */
@RestController
public class LoanController {

	@Autowired
	LoanRepository loanRepository;
	
	@GetMapping("/loans")
	public List<Loan> getAllLoans() {
		return loanRepository.findAll();
	}
}
