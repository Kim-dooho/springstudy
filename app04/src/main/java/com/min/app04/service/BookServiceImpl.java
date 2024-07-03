package com.min.app04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.app04.dao.ContactDAO;
import com.min.app04.dto.ContactDTO;

@Service
public class ContactServiceImpl implements ContactService {

  private ContactDAO contactDAO;
  
  @Autowired  
  public ContactServiceImpl(ContactDAO contactDAO) {
    super();
    this.contactDAO = contactDAO;
  }

  @Override
  public List<ContactDTO> getContactList() {
    return contactDAO.getContactList();
  }

  @Override
  public ContactDTO getContactByNo(int contactNo) {
    return contactDAO.getContactByNo(contactNo);
  }

  @Override
  public int insertContact(ContactDTO contact) {
    return contactDAO.insertContact(contact);
  }

  @Override
  public int updateContact(ContactDTO contact) {
    return contactDAO.updateContact(contact);
  }

  @Override
  public int deleteContact(int contactNo) {
    return contactDAO.deleteContact(contactNo);
  }

}