/**
 * 
 */
package com.app.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.loan.model.Loan;

/**
 * @author karthi sabari
 *
 */
public interface LoanRepository extends JpaRepository<Loan, Long>{

}
