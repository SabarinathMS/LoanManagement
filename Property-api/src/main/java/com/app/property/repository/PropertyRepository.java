/**
 * 
 */
package com.app.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.property.model.Property;

/**
 * @author karthi sabari
 *
 */
public interface PropertyRepository extends JpaRepository<Property, Long> {

}
