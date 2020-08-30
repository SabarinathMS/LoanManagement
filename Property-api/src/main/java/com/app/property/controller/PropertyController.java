/**
 * 
 */
package com.app.property.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.property.model.Property;
import com.app.property.repository.PropertyRepository;

/**
 * @author karthi sabari
 *
 */
public class PropertyController {	@Autowired
	PropertyRepository propertyRepository;

	@GetMapping("/rest/properties")
	public List<Property> getAllUser(){
		return propertyRepository.findAll();
	}
}
