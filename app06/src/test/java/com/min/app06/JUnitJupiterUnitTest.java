package com.min.app06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.min.app06.dto.ContactDTO;
import com.min.app06.mapper.ContactMapper;

@SpringJUnitConfig(locations = {
    "file:src/main/webapp/WEB-INF/spring/root-context.xml"
  , "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})


class JUnitJupiterUnitTest {

  @Autowired
  private ContactMapper contactMapper;
  
  @Test
  void insert_test() {
    ContactDTO contact = ContactDTO.builder()
        .name("min")
        .email("min@example.com")
        .mobile("010-1111-1111")
        .build();
    
    assertEquals(1,  contactMapper.registerContact(contact));
  }

}
