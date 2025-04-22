//03/23/2025 Nawras Janoudi: Created ContactTest class

package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Contact;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

  private Contact contact;

  @BeforeEach
  void setUp() {
      contact = new Contact("0", "John", "Doe", "1234567890", "123 Main St");
  }

  @Test
  void constructor_NullId_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact(null, "John", "Doe", "1234567890", "123 Main St"));
  }
  
  @Test
  void constructor_NullFirstName_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", null, "Doe", "1234567890", "123 Main St"));
  }

  @Test
  void constructor_EmptyFirstName_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "", "Doe", "1234567890", "123 Main St"));
  }

  @Test
  void constructor_LongFirstName_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "VeryLongFirstName", "Doe", "1234567890", "123 Main St"));
  }

  @Test
  void constructor_NullLastName_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", null, "1234567890", "123 Main St"));
  }

  @Test
  void constructor_EmptyLastName_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "", "1234567890", "123 Main St"));
  }

  @Test
  void constructor_LongLastName_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "VeryLongLastName", "1234567890", "123 Main St"));
  }

  @Test
  void constructor_NullPhoneNumber_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", null, "123 Main St"));
  }

  @Test
  void constructor_EmptyPhoneNumber_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", "", "123 Main St"));
  }

  @Test
  void constructor_ShortPhoneNumber_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", "123", "123 Main St"));
  }

  @Test
  void constructor_LongPhoneNumber_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", "12345678901", "123 Main St"));
  }

  @Test
  void constructor_NullAddress_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", "1234567890", null));
  }

  @Test
  void constructor_EmptyAddress_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", "1234567890", ""));
  }

  @Test
  void constructor_LongAddress_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", "1234567890", "Very long address that exceeds the limit"));
  }

  @Test
  void setFirstName_ValidInput_SetsFirstName() {
      contact.setFirstName("Jane");
      assertEquals("Jane", contact.getFirstName());
  }

  @Test
  void setFirstName_NullInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
  }

  @Test
  void setFirstName_EmptyInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(""));
  }

  @Test
  void setFirstName_LongInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("VeryLongFirstName"));
  }

  @Test
  void setLastName_ValidInput_SetsLastName() {
      contact.setLastName("Smith");
      assertEquals("Smith", contact.getLastName());
  }

   @Test
  void setLastName_NullInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));
  }

  @Test
  void setLastName_EmptyInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setLastName(""));
  }

  @Test
  void setLastName_LongInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setLastName("VeryLongLastName"));
  }

  @Test
  void setPhoneNumber_ValidInput_SetsPhoneNumber() {
      contact.setPhoneNumber("0987654321");
      assertEquals("0987654321", contact.getPhoneNumber());
  }

  @Test
  void setPhoneNumber_NullInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNumber(null));
  }

  @Test
  void setPhoneNumber_EmptyInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNumber(""));
  }

  @Test
  void setPhoneNumber_ShortInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNumber("123"));
  }

  @Test
  void setPhoneNumber_LongInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNumber("12345678901"));
  }

  @Test
  void setAddress_ValidInput_SetsAddress() {
      contact.setAddress("456 Oak Ave");
      assertEquals("456 Oak Ave", contact.address());
  }

  @Test
  void setAddress_NullInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
  }

  @Test
  void setAddress_EmptyInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setAddress(""));
  }

  @Test
  void setAddress_LongInput_ThrowsException() {
      assertThrows(IllegalArgumentException.class, () -> contact.setAddress("Very long address that exceeds the limit"));
  }
}

