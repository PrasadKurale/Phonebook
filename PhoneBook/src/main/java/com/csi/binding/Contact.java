package com.csi.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact_details")
public class Contact {

	@Id
	@GeneratedValue
	private Integer contactId;

	private String contactName;

	private String contactEmail;

	private Long contactNum;

	private String activeSw;

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public Integer getContactId() {
		return contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public Long getContactNum() {
		return contactNum;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public void setContactNum(Long contactNum) {
		this.contactNum = contactNum;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail=" + contactEmail
				+ ", contactNum=" + contactNum + ", activeSw=" + activeSw + "]";
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Integer contactId, String contactName, String contactEmail, Long contactNum, String activeSw) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactNum = contactNum;
		this.activeSw = activeSw;
	}

}
