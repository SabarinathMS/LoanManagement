/**
 * 
 */
package com.app.borrower.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.borrower.model.Borrower;

/**
 * @author karthi sabari
 *
 */
public interface BorrowerRepository extends JpaRepository<Borrower, Long>{

}
