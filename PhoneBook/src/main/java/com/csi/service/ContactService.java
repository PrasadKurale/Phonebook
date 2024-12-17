package com.csi.service;


import com.csi.binding.Contact;

import java.util.List;

public interface ContactService {

public String saveData(Contact contact);

public List<Contact> getAllContacts();

public Contact getContactById(Integer contactId);

public String updateContact(Contact contact);

public String deleteContactById(Integer contactId);


}
