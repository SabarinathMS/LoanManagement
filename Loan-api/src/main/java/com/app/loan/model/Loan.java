/**
 * 
 */
package com.app.loan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author karthi sabari
 *
 */
@Entity
public class Loan {

	@Id
	@GeneratedValue
	private Long loadId;
	private Integer loanAmount;
	private Integer loanTerm;
	private String loanType;
	/**
	 * @return the loadId
	 */
	public Long getLoadId() {
		return loadId;
	}
	/**
	 * @param loadId the loadId to set
	 */
	public void setLoadId(Long loadId) {
		this.loadId = loadId;
	}
	/**
	 * @return the loanAmount
	 */
	public Integer getLoanAmount() {
		return loanAmount;
	}
	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(Integer loanAmount) {
		this.loanAmount = loanAmount;
	}
	/**
	 * @return the loanTerm
	 */
	public Integer getLoanTerm() {
		return loanTerm;
	}
	/**
	 * @param loanTerm the loanTerm to set
	 */
	public void setLoanTerm(Integer loanTerm) {
		this.loanTerm = loanTerm;
	}
	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loanType;
	}
	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	
}
