package com.min.app06.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.min.app06.dto.ContactDTO;
import com.min.app06.service.ContactService;

@Controller
public class ContactController {

  // lombok's @Slf4j 로 대체할 수 있다.
  // private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
  
  private ContactService contactService;

  @Autowired
  public ContactController(ContactService contactService) {
    super();
    this.contactService = contactService;
  }
  
  @GetMapping(value = "/list.do")
  public String list(Model model) {
    model.addAttribute("contacts", contactService.getContactList());
    return "contact/list";
  }
  
  @GetMapping(value = "/write.do")
  public String write() {
    return "contact/write";
  }
  
  @GetMapping(value = "/detail.do")
  public String wp_detail(ContactDTO contact, Model model) {
    model.addAttribute("contact", contactService.getContactByNo(contact.getContactNo()));
    return "contact/detail";
  }
  
  @PostMapping(value = "/register.do")
  public String wp_insert(ContactDTO contact) {
    int result = contactService.tx_insertContact(contact);
    String redirectURL = result == 1 ? "/list.do" : "/write.do";
    return "redirect:" + redirectURL;
  }
  
  @PostMapping(value = "/modify.do")
  public String wp_update(ContactDTO contact) {
    int result = contactService.tx_updateContact(contact);
    String redirectURL = result == 1 ? "/list.do" : "/write.do";
    return "redirect:" + redirectURL;
  }
  
  
  
  
  
  @GetMapping(value = "/remove.do")
  public String wp_delete(int contactNo) {
    int result = 0;
    result = contactService.tx_deleteContact(contactNo);
    String redirectURL = result == 1 ? "/list.do" : "/write.do";
    return "redirect:" + redirectURL;
  }
  
  
  
  
  
  
  
  
}