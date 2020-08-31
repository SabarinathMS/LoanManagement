/**
 * 
 */
package com.app.legaldocument.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author karthi sabari
 *
 */
@Entity
public class LegalDocument {

	@Id
	@GeneratedValue
	private Long id;
	private String legalDocument;
	private String ownerName;
	private String ownerAddressLine1;
	private String ownerAddressLine2;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the legalDocument
	 */
	public String getLegalDocument() {
		return legalDocument;
	}
	/**
	 * @param legalDocument the legalDocument to set
	 */
	public void setLegalDocument(String legalDocument) {
		this.legalDocument = legalDocument;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @return the ownerAddressLine1
	 */
	public String getOwnerAddressLine1() {
		return ownerAddressLine1;
	}
	/**
	 * @param ownerAddressLine1 the ownerAddressLine1 to set
	 */
	public void setOwnerAddressLine1(String ownerAddressLine1) {
		this.ownerAddressLine1 = ownerAddressLine1;
	}
	/**
	 * @return the ownerAddressLine2
	 */
	public String getOwnerAddressLine2() {
		return ownerAddressLine2;
	}
	/**
	 * @param ownerAddressLine2 the ownerAddressLine2 to set
	 */
	public void setOwnerAddressLine2(String ownerAddressLine2) {
		this.ownerAddressLine2 = ownerAddressLine2;
	}
	
}
