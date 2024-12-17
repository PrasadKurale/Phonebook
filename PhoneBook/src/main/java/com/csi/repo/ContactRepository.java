package com.csi.repo;

import com.csi.binding.Contact;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
	
	List<Contact> findByActiveSw(String status);
}