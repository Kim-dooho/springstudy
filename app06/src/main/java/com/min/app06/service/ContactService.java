package com.min.app06.service;

import java.util.List;

import com.min.app06.dto.ContactDTO;

public interface ContactService {
  List<ContactDTO> getContactList();
  ContactDTO getContactByNo(int contactNo);
  int tx_insertContact(ContactDTO contact);
  int tx_updateContact(ContactDTO contact);
  int tx_deleteContact(int contactNo);
  void tx_txTest();
}