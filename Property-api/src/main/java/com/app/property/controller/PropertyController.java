/**
 * 
 */
package com.app.property.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.property.model.Property;
import com.app.property.repository.PropertyRepository;

/**
 * @author karthi sabari
 *
 */
@RestController
public class PropertyController {	
	@Autowired
	PropertyRepository propertyRepository;

	@GetMapping("/properties")
	public List<Property> getAllUser(){
		return propertyRepository.findAll();
	}
}
