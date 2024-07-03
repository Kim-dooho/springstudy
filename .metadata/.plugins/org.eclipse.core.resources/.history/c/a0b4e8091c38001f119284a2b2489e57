package com.min.app05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.min.app05.dao.ContactDAO;
import com.min.app05.dto.ContactDTO;

/* 
 * 
 */

@SpringJUnitConfig(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})

class JUnitJupiterTestCase {

  @Autowired
  private ContactDAO contactDAO;

  @Test
  void insert_test() {

    ContactDTO contact = ContactDTO.builder()
        .name("kim")
        .email("kim@korea.org")
        .mobile("010-1122-3344")
        .build();
    
    assertEquals(1, contactDAO.registerContact(contact));
    
  }
  
  @Test
  void select_one_test() {
    
    int contactNo = 1;
    
    ContactDTO contact = contactDAO.getContactByNo(contactNo);
    
    assertEquals("kim", contact.getName());
    
  }

  @Test
  void update_test() {
    
    ContactDTO contact = ContactDTO.builder()
    .name("lee")
    .email("kim@korea.org")
    .mobile("010-1122-3344")
    .contactNo(1)
    .build();
    
    assertEquals(1, contactDAO.modifyContact(contact));
    
  }
  
  @Test
  void select_list_test() {
    
    assertEquals(1, contactDAO.getContactList().size());
    
  }
  
  @Test
  void delete_test() {
    int contactNo = 1;
    assertEquals(1, contactDAO.removeContact(contactNo));
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}