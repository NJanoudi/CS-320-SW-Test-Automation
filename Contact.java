//03/23/2025 Nawras Janoudi: Created Contact class

package model;

public class Contact {
	// Class properties
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	
	//Constructor
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		
		//Validate and set contactId
		if (contactId == null || contactId.isEmpty() || contactId.length() > 10) {
			throw new IllegalArgumentException("Illegal ID entered");
		} else {
			this.contactId = contactId;
		}
		
		//Validate and set first name
		if (firstName == null || firstName.isEmpty() || firstName.length() > 10) {
			throw new IllegalArgumentException("Illegal first name entered");
		} else {
			this.firstName = firstName;
		}
		
		//Validate and set last name
		if (lastName == null || lastName.isEmpty() || lastName.length() > 10) {
			throw new IllegalArgumentException("Illegal last name entered");
		} else {
			this.lastName = lastName;
		}
		
		//Validate and set phone number
		if (phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Illegal phone number entered");
		} else {
			this.phoneNumber = phoneNumber;
		}
		
		//Validate and set address
		if (address == null || address.isEmpty() || address.length() > 30) {
			throw new IllegalArgumentException("Illegal address entered");
		} else {
			this.address = address;
		}
	}
	
	//Getters
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String address() {
		return address;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty() || firstName.length() > 10) {
			throw new IllegalArgumentException("Illegal first name entered");
			} else {
				this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty() || lastName.length() > 10) {
			throw new IllegalArgumentException("Illegal last name entered");
			} else {
				this.lastName = lastName;
		}
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Illegal phone number entered");
			} else {
				this.phoneNumber = phoneNumber;
			}
		}
	
	public void setAddress(String address) {
		if (address == null || address.isEmpty() || address.length() > 30) {
			throw new IllegalArgumentException("Illegal address entered");
			} else {
				this.address = address;
			}
		}
	}
	





