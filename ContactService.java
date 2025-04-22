//03/23/2025 Nawras Janoudi: Created ContactService class

package service;

import model.Contact;
import java.util.HashMap;
import java.util.Map;

public class ContactService {
	
	// Initialize a list to save contacts in
	private final Map<String, Contact> contacts = new HashMap<>();
	
	// Create a new contact using the default constructor
	public void addContact(String firstName, String lastName, String phoneNumber, String address) {
		String id = String.valueOf(contacts.size() + 1);
		Contact contact = new Contact(id, firstName, lastName, phoneNumber, address);
		contacts.put(id, contact);
	}
	
	// Inside getContactById()
	public Contact getContactById(String contactId) {
	    System.out.println("Retrieving contact with ID: " + contactId); // Print the ID
	    System.out.println("Map contents: " + contacts); // Print map contents
	    return contacts.get(contactId);
	}
	
	// Update first name
	public void updateFirstName(String firstName, String contactId) {
		Contact contact = getContactById(contactId);
		if (contact != null) {
			contact.setFirstName(firstName);
		}
	}
	
	// Update last name
	public void updateLastName(String lastName, String contactId) {
		Contact contact = getContactById(contactId);
		if (contact != null) {
			contact.setLastName(lastName);
		}
	}
	
	// Update phone number
	public void updatePhoneNumber(String phoneNumber, String contactId) {
		Contact contact = getContactById(contactId);
		if (contact != null) {
			contact.setPhoneNumber(phoneNumber);
		}
	}
	
	// Update address
	public void updateAddress(String address, String contactId) {
		Contact contact = getContactById(contactId);
		if (contact != null) {
			contact.setAddress(address);
		}
	}
	
	// Delete contact by ID number
	public void deleteContact(String contactId) {
		contacts.remove(contactId);
	}
	
	// Get contact list size
	public int getContactListSize() {
		return contacts.size();
	}
}


