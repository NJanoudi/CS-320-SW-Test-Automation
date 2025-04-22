//03/23/2025 Nawras Janoudi: Created ContactTestTest class

package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import service.ContactService;



public class ContactServiceTest {

  private ContactService contactService;

//Inside setUp()
@BeforeEach
void setUp() {
   contactService = new ContactService();
   contactService.addContact("John", "Doe", "1234567890", "123 Main St");
   System.out.println("Added contact with ID: 1"); // Print the ID

   contactService.addContact("Jane", "Smith", "9876543210", "456 Oak Ave");
   System.out.println("Added contact with ID: 2");

   contactService.addContact("Mike", "Dale", "1234567894", "13 Brass St");
   System.out.println("Added contact with ID: 3");

   contactService.addContact("Brian", "Fart", "1234555789", "40 Nuts St");
   System.out.println("Added contact with ID: 4");

   contactService.addContact("Ali", "Dubali", "1234551155", "220 Gold St");
   System.out.println("Added contact with ID: 5");
}
  
  // 1) Verify the number of contacts created
  @Test
  void addContact_ValidContact_ContactAdded() {
      assertEquals(5, contactService.getContactListSize());
  }
  
  // 2) Verify contact first name can be updated
  @Test
  void updateFirstName_ExistingId_FirstNameUpdated() {
      contactService.updateFirstName("Johnny", "1");;
      assertEquals("Johnny", contactService.getContactById("1").getFirstName());
  }
  
  //2a) Verify contact first name does not update non existent contact              
  @Test
  void updateFirstName_NonExistingId_ListUnchanged() {
      contactService.updateFirstName("Bard", "9");
      assertEquals("John", contactService.getContactById("1").getFirstName());
  }
  
  //3) Verify contact last name can be updated
  @Test
  void updateLastName_ExistingId_LastNameUpdated() {
      contactService.updateLastName("Smithy", "1");
      assertEquals("Smithy", contactService.getContactById("1").getLastName());
  }
  
  //3a) Verify contact last name does not update non existent contact
  @Test
  void updateLastName_NonExistingId_ListUnchanged() {
      contactService.updateLastName("Smithy", "7");
      assertEquals("Smith", contactService.getContactById("2").getLastName());
  }
  
  //4) Verify contact phone number can be updated
  @Test
  void updatePhoneNumber_ExistingId_PhoneNumberUpdated() {
      contactService.updatePhoneNumber("0000000000", "1");
      assertEquals("0000000000", contactService.getContactById("1").getPhoneNumber());
  }
  
  //5) Verify contact phone number does not update non existent contact
  @Test
  void updatePhoneNumber_NonExistingId_ListUnchanged() {
      contactService.updatePhoneNumber("0000000000", "10");
      assertEquals("1234567890", contactService.getContactById("1").getPhoneNumber());
  }
  
  //5) Verify contact address can be updated
  @Test
  void updateAddress_ExistingId_AddressUpdated() {
      contactService.updateAddress("789 Pine Ln", "2");
      assertEquals("789 Pine Ln", contactService.getContactById("2").address());
  }
  
//  5a) Verify contact cannot update non existent 
  @Test
  void updateAddress_NonExistingId_ListUnchanged() {
      contactService.updateAddress("789 Pine Ln", "20");
      assertEquals("456 Oak Ave", contactService.getContactById("2").address());
  }

//	6) Verify contact address can be updated
  @Test
  void deleteContact_ExistingId_ContactDeleted() {
      contactService.deleteContact("1");
      assertEquals(4, contactService.getContactListSize());
  }

//	6a) Verify contact phone number does not delete non existent contact  
  @Test
  void deleteContact_NonExistingId_ListUnchanged() {
      contactService.deleteContact("6");
      assertEquals(5, contactService.getContactListSize());
  }
 }












