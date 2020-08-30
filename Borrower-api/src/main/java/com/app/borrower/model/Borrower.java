package com.app.borrower.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Borrower {

	@Id
	@GeneratedValue
	private Long borrowerId;
	private String borrowerName;
	private String loanNumber;
	private String loanAmount;
	public Long getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(Long borrowerId) {
		this.borrowerId = borrowerId;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	

}
