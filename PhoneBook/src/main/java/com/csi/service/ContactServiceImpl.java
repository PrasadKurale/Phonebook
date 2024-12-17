package com.csi.service;

import com.csi.binding.Contact;
import com.csi.repo.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;

	@Override
	public String saveData(Contact contact) {

		contact.setActiveSw("Y");

		contact = contactRepository.save(contact);

		if (contact.getContactId() != null) {
			return "Contact Saved";
		} else {
			return "Contact Failed to Save";
		}
	}

	@Override
	public List<Contact> getAllContacts() {
		// List<Contact> contactList= contactRepository.findAll();
		return contactRepository.findByActiveSw("Y");
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = contactRepository.findById(contactId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		if (contactRepository.existsById(contact.getContactId())) {
			contactRepository.save(contact);
			return "Updated Successfully";
		} else {
			return "No Record Found";
		}
	}

	@Override
	public String deleteContactById(Integer contactId) {
		if (contactRepository.existsById(contactId)) {
			contactRepository.deleteById(contactId);
			return "Data Deleted Successfully";
		} else {
			return "No Record Found";
		}
	}

}
