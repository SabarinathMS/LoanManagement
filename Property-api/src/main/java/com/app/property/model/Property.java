/**
 * 
 */
package com.app.property.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author karthi sabari
 *
 */
public class Property {
	@Id
	@GeneratedValue
	private Long propertyId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String zipCode; //Zip Code of the property for which loan is orginated
	/**
	 * @return the propertyId
	 */
	public Long getPropertyId() {
		return propertyId;
	}
	/**
	 * @param propertyId the propertyId to set
	 */
	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
}
