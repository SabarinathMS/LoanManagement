/**
 * 
 */
package com.app.legaldocument.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.legaldocument.model.LegalDocument;
import com.app.legaldocument.repository.LegalDocumentRepository;


/**
 * @author karthi sabari
 *
 */
@RestController
public class LegalDocumentController {
	@Autowired
	LegalDocumentRepository documentRepository;
	
	@GetMapping("/legaldocuments")
	public List<LegalDocument> getAllBorrower(){
		return documentRepository.findAll();
	}
	
}
